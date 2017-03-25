package com.example.mehuljain.first_app.login.home;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import com.example.mehuljain.first_app.R;
import com.example.mehuljain.first_app.login.Login;

/**
 * Created by mehul jain on 11-03-2017.
 */

public class HomeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //
        Intent intent = getIntent();
        String User_name=intent.getStringExtra(Login.USER_NAME);
        TextView textView= (TextView)findViewById(R.id.tv1);
        textView.setText(User_name);
        ProfileFragment firstFragment=new ProfileFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.profile_fragment,firstFragment).commit();



    }

}
