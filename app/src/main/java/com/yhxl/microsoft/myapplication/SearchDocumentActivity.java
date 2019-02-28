package com.yhxl.microsoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//查找说明书页面：
//上方有一个搜索框、有一个“扫一扫”图标
//下面是一个按字母顺序的说明书列表
//搜索框是搜下方的说明书的
//扫一扫是扫物体上的二维码
//说明书对应着服务器上的物体点云数据等，找到目标说明书后，跳转到DisplayDocumentActivity
public class SearchDocumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_document);
    }
}
