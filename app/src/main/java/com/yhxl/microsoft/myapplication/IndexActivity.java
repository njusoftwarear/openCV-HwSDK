package com.yhxl.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//真-主页
//主要是两个按钮，分别是导向制作说明书页面以及扫描物体页面
//右上角有登陆按钮
// 导向制作说明书页面时，如果未登录，则跳转到登陆页面
public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
}
