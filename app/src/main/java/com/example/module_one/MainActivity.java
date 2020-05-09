package com.example.module_one;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
/* Bài 1: Giới thiệu về android Studio
 * */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Khai báo biến tương ứng với view trong file xml
    Button button;
    TextView textView;
    MainActivity mainActivity = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ biến với view tương ứng trong xml - mục đích là nối biến và view với nhau
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        //Thiết lập sự kiện OnClickListener cho view button trong MainActivity
        //Phương thức setOnClickListener(đối tượng), do đó cần dùng "this" để chỉ Mainactivity là đối tượng
        button.setOnClickListener(mainActivity);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            textView.setText("Hello everybody");
        }
    }
}
