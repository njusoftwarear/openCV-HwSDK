package com.yhxl.microsoft.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity  implements
        View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.btn_camera:{
//
//
//            }
//            case R.id.btn_search:{
//
//            }
//            case R.id.btn_add_document:{
//
//            }
        }
    }

    //点击扫码
    private void jump2Camera() {

    }

    //在上方的搜索框中点击搜索
    private void search() {

    }

    //点击登陆
    private void jump2Login() {

    }

    //点击下方列表中的某一个，看到相应的说明书要求
    private void getDocument() {

    }



//下方的不要看



//    //最大
//    private double max_size = 1024;
//    //回调
//    private int PICK_IMAGE_REQUEST = 1;
//    //原图、处理后的图片
//    private ImageView mImgOriginal;
//    //原始Bitmap、处理后的Bitmap
//    private Bitmap mOriginalBitmap,mDealBitmap;
//    //选择图片、处理
//    private Button mBtnChoose, mBtnDeals;
//
//    // Used to load the 'native-lib' library on application startup.
////    static {
////        System.loadLibrary("native-lib");
////    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        iniLoadOpenCV();
//        initView();
//        // Example of a call to a native method
//        /*TextView tv = (TextView) findViewById(R.id.sample_text);
//        tv.setText(stringFromJNI());*/
//
//    }
//    /**
//     * 初始化
//     */
//    private void initView() {
//        mBtnDeals = findViewById(R.id.process_btn);
//        mBtnDeals.setOnClickListener(this);
//    }
//    @Override
//    public void onClick(View view) {
//        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher);
//        Mat src = new Mat();
//        Mat dst = new Mat();
//        Utils.bitmapToMat(bitmap, src);
//        Imgproc.cvtColor(src, dst, Imgproc.COLOR_BGRA2GRAY);
//        Utils.matToBitmap(dst, bitmap);
//        ImageView iv = (ImageView) this.findViewById(R.id.sample_img);
//        iv.setImageBitmap(bitmap);
//        src.release();
//        dst.release();
//
//    }
//
//    /**
//     * OpenCV库静态加载并初始化
//     */
//    private void iniLoadOpenCV() {
//        boolean load = OpenCVLoader.initDebug();
//        if (load) {
//            Log.i("CV", "Open CV Libraries loaded...");
//        }else {
//            Toast.makeText(this.getApplicationContext(), "Warning:could notload", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    /**
//     * 选择图片
//     */
//    private void selectImage() {
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);
//        startActivityForResult(Intent.createChooser(intent, "选择图像"), PICK_IMAGE_REQUEST);
//    }
//
//    /**
//     * 转换
//     */
////    private void convertGray(){
////        Mat src = new Mat();
////        Mat temp = new Mat();
////        Mat dst = new Mat();
////        Utils.bitmapToMat(mDealBitmap, src);
////        Imgproc.cvtColor(src, temp, Imgproc.COLOR_BGRA2BGR);
////        Imgproc.cvtColor(temp, dst, Imgproc.COLOR_BGR2GRAY);
////        Utils.matToBitmap(dst, mDealBitmap);
////        mImgDeals.setImageBitmap(mDealBitmap);
////    }
//
//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    //public native String stringFromJNI();
}
