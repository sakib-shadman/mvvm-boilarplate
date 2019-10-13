package com.jontromanob.app.mvvm_retrofit.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.leaveapplication.LeaveApplicationFragment;
import com.jontromanob.app.mvvm_retrofit.leaveapplication.LeaveApplicationListFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashBoardFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate (R.layout.fragment_dash_board, container, false);
        ButterKnife.bind (this, view);
        return view;
    }

    @OnClick(R.id.btnLeave)
    public void onClickLeave(){

        gotoSpecificFragment(new LeaveApplicationListFragment(),"Leave App");
    }


    public void gotoSpecificFragment(Fragment fragment, String title) {


        if(getActivity() != null && !getActivity().isFinishing()){
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.dashboard_container, fragment);
            fragmentTransaction.addToBackStack(getString(R.string.leave_application));
            fragmentTransaction.commit();
        }


    }


}
