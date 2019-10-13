package com.jontromanob.app.mvvm_retrofit.leaveapplication;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.adapter.LeaveApplicationDetailsAdapter;
import com.jontromanob.app.mvvm_retrofit.login.LoginViewModel;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;
import com.jontromanob.app.mvvm_retrofit.util.SaveUserInformationUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeaveApplicationListFragment extends Fragment {


    private static final String SCREEN_OPERATION = "screenOperation";
    private static final String APPLICATION_ID = "ApplicationId";


    @BindView(R.id.leaveApplicationRecycleView)
    RecyclerView mRecyclerView;
    @BindView(R.id.leave_application_not_found_txt)
    TextView mListNotFound;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    String authorization;
    LogInResponse logInResponse;
    LeaveApplicationListViewModel leaveAppListViewModel;

    private LeaveApplicationDetailsAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leave_application_list, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initializeRecyclerView();
        logInResponse = SaveUserInformationUtil.getUserInfo(getContext());
        if (logInResponse != null) {
            authorization = logInResponse.getTokenType() + " " + logInResponse.getAccessToken();
        }

        setAdapterForLeaveDetails();
        leaveAppListViewModel = ViewModelProviders.of(this).get(LeaveApplicationListViewModel.class);
        observeAllLeaveApp();
        fetchALLeaveApp(authorization);
        fab.setVisibility(View.VISIBLE);

    }

    private void initializeRecyclerView() {

        LinearLayoutManager mLayoutManager = new LinearLayoutManager (getContext ());
        mRecyclerView.setLayoutManager (mLayoutManager);
    }

    public void setAdapterForLeaveDetails() {
        mAdapter = new LeaveApplicationDetailsAdapter (getContext (), new ArrayList<LeaveApplicationDetails>(), new LeaveApplicationDetailsAdapter.OnItemButtonClicklistener () {
            @Override
            public void onClick(View view, int position, String viewEdit) {
                LeaveApplicationFragment newLeaveApplicationFragment = new LeaveApplicationFragment ();
                gotoSpecificFragment (newLeaveApplicationFragment, "Leave App");
            }
        });

        mRecyclerView.setAdapter (mAdapter);
    }

    private void observeAllLeaveApp(){

        leaveAppListViewModel.getAllLeaveApp().observe(getViewLifecycleOwner(), new Observer<List<LeaveApplicationDetails>>() {
            @Override
            public void onChanged(@Nullable List<LeaveApplicationDetails> leaveApplicationDetails) {
                mAdapter.updateDataSet(leaveApplicationDetails);
            }
        });


    }

    private void fetchALLeaveApp(String authorization){

        leaveAppListViewModel.fetchAllLeaveApp(authorization);
    }

    public void gotoSpecificFragment(Fragment fragment, String title) {


        if(getActivity() != null && !getActivity().isFinishing()){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.dashboard_container, fragment);
            fragmentTransaction.addToBackStack(title);
            fragmentTransaction.commit();
        }

    }


}
