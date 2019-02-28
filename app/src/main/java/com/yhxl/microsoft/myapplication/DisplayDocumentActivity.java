package com.yhxl.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//显示说明书页面：
//显示相机界面，将当前物体的点云数据和服务器上记录的物体数据进行匹配
//如果匹配成功，则显示说明书
//如果匹配不成功，则弹出提示并回到前一个页面
public class DisplayDocumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_document);
    }
}
