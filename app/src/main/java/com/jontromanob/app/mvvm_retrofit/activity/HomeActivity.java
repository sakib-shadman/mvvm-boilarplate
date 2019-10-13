package com.jontromanob.app.mvvm_retrofit.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.fragment.DashBoardFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        showFragment(new DashBoardFragment(),"Home");
    }

    private void showFragment(Fragment fragment, String title) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.dashboard_container, fragment, title)
                .commit();
    }
}
