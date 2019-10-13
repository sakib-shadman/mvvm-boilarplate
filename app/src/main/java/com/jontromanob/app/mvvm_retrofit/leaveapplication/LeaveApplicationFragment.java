package com.jontromanob.app.mvvm_retrofit.leaveapplication;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationPolicy;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveType;
import com.jontromanob.app.mvvm_retrofit.util.SaveUserInformationUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class LeaveApplicationFragment extends Fragment {

    @BindView(R.id.txtFromDate)
    TextView txtFromDate;
    @BindView(R.id.txtToDate)
    TextView txtToDate;
    @BindView(R.id.spinnerLeaveType)
    Spinner spinnerLeaveType;
    @BindView(R.id.txtLeavePurpose)
    TextView txtLeavePurpose;
    @BindView(R.id.btnLeaveApplication)
    Button btnLeaveApplication;
    @BindView(R.id.fromDateRoster)
    RadioGroup fromDateRoster;
    @BindView(R.id.toDateRoster)
    RadioGroup toDateRoster;
    @BindView(R.id.rdoFromDateFirstHalf)
    RadioButton rdoFromDateFirstHalf;
    @BindView(R.id.rdoFromDateSecondHalf)
    RadioButton rdoFromDateSecondHalf;
    @BindView(R.id.rdoToDateFirstHalf)
    RadioButton rdoToDateFirstHalf;
    @BindView(R.id.rdoToDateSecondHalf)
    RadioButton rdoToDateSecondHalf;
    @BindView(R.id.autoCompleteTextView)
    AutoCompleteTextView autoCompleteTextView;
    @BindView(R.id.viewEmployee)
    RelativeLayout viewEmployee;
    @BindView(R.id.txtViewReliever)
    TextView txtViewReliever;
    @BindView(R.id.imgSelected)
    ImageView imgSelected;
    @BindView(R.id.viewImgSelection)
    LinearLayout viewImgSelection;
    @BindView(R.id.viewNotImgSelection)
    LinearLayout viewNotImgSelection;
    @BindView(R.id.btnChooseFileWithoutImage)
    ImageView btnChooseFileWithoutImage;
    @BindView(R.id.txtChooseFileWithoutImage)
    TextView txtChooseFileWithoutImage;
    @BindView(R.id.leaveDocument)
    LinearLayout leaveDocument;
    @BindView(R.id.txtChooseFile)
    TextView txtChooseFile;
    @BindView(R.id.leaveDocumentInfoView)
    LinearLayout leaveDocumentInfoView;
    @BindView(R.id.txtFileName)
    TextView txtFileName;
    @BindView(R.id.imgCross)
    ImageView imgCross;
    @BindView(R.id.txtAttachDocument)
    TextView txtAttachDocument;


    List<LeaveType> mLeaveTypeList = new ArrayList<LeaveType>();
    String authorization;
    private LeaveApplicationViewModel leaveApplicationViewModel;
    private LeaveApplicationPolicy mLeaveApplicationPolicy;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.fragment_leave_application, container, false);
        ButterKnife.bind (this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getAuthorization();
        leaveApplicationViewModel = ViewModelProviders.of(this).get(LeaveApplicationViewModel.class);
        observeLeaveTypes();
        observeLeaveAppPolicy();
        fetchLeaveTypes(authorization);
    }

    private void observeLeaveTypes(){
        leaveApplicationViewModel.getLeaveType().observe(getViewLifecycleOwner(), new Observer<List<LeaveType>>() {
            @Override
            public void onChanged(@Nullable List<LeaveType> leaveTypes) {
                mLeaveTypeList.addAll(leaveTypes);
                loadLeaveTypeSpinner();
                selectLeaveType();
            }
        });
    }

    private void observeLeaveAppPolicy(){

       leaveApplicationViewModel.getLeaveApplicationPolicy().observe(getViewLifecycleOwner(), new Observer<LeaveApplicationPolicy>() {
           @Override
           public void onChanged(@Nullable LeaveApplicationPolicy leaveApplicationPolicy) {
               mLeaveApplicationPolicy = leaveApplicationPolicy;
           }
       });
    }

    private void fetchLeaveTypes(String authorization){
        leaveApplicationViewModel.fetchLeaveTypes(authorization);
    }

    private void fetchLeaveAppPolicy(String authorization,Integer leaveTypeId){
        leaveApplicationViewModel.fetchLeaveAppPolicy(authorization,leaveTypeId);
    }


    private void getAuthorization(){

        authorization = SaveUserInformationUtil.getUserInfo(getContext()).getTokenType()+" "+SaveUserInformationUtil.getUserInfo(getContext()).getAccessToken();
    }


    private void selectLeaveType(){

        spinnerLeaveType.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position > 0){
                    fetchLeaveAppPolicy(authorization,2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void loadLeaveTypeSpinner() {
        if (mLeaveTypeList != null) {
            List<String> stringList = new ArrayList<String>();
            for (LeaveType leaveType : mLeaveTypeList) {
                stringList.add (leaveType.getText ());
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getContext (), R.layout.support_simple_spinner_dropdown_item, stringList);
            arrayAdapter.setDropDownViewResource (R.layout.support_simple_spinner_dropdown_item);
            spinnerLeaveType.setAdapter (arrayAdapter);
        }
    }





}
