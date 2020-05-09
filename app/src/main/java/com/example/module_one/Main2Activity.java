package com.example.module_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
/* Bài 2: Chu trình của một ứng dụng
* */

public class Main2Activity extends AppCompatActivity {

    //Activity khởi động nhưng chưa hiện với người dùng
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("LifeCircle","onCreate");
    }

    //Hiện với người dùng nhưng chưa thể tương tác với Activity
    //Đăng kí BroadcastReceiver
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCircle","onStart");
    }

    //Activity ở foreground và sẵn sàng tương tác với người dùng
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCircle","onResume");
    }

    //Được gọi khi hệ thống chuyển điều khiển sang một Activity khác
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCircle","onPause");
    }

    //Hiện với người dùng nhưng không thể tương tác với Activity
    //Hủy BroadcastReceiver
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCircle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCircle","onDestroy");
    }
}
