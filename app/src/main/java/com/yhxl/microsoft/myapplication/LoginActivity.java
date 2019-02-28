package com.yhxl.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//登陆页面：需要填写邮箱和密码
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
