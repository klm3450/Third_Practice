package com.example.third_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick_toast(View v){
        Toast toast_01 = Toast.makeText(this, "안녕하새오", Toast.LENGTH_SHORT);
        toast_01.setGravity(Gravity.CENTER, 50, 50);
        toast_01.show();
    }
}
