package com.example.mehuljain.first_app.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mehuljain.first_app.R;
import com.example.mehuljain.first_app.login.home.HomeActivity;

/**
 * Created by mehul jain on 11-03-2017.
 */

public class Login extends AppCompatActivity{
    Button login;
    EditText et1,et2;
    String str;
    public static final String USER_NAME = "com.example.mehuljain.first_app.MESSAGE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button)findViewById(R.id.bt1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"processing",Toast.LENGTH_SHORT).show();
                if(et1.getText().toString().trim().equals("mehul") && et2.getText().toString().trim().equals("1")){
                    Toast.makeText(getApplication(),"Logged in",Toast.LENGTH_SHORT).show();
                    String str="HI,"+et1.getText().toString().trim();
                    Intent intent =new Intent(Login.this,HomeActivity.class);
                    intent.putExtra(USER_NAME,str);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplication(),"Wrong Credential",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
