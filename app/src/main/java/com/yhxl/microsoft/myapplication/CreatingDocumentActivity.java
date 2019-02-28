package com.yhxl.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//创建说明书页面：
//先扫描物体，获取点云，显示出来
//异步上传该物体的点云数据到服务器
//显示出操作框（见one note上的手绘图）
public class CreatingDocumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_document);
    }
}
