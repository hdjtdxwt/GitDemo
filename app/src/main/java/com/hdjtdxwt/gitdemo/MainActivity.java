package com.hdjtdxwt.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn2:{
                Toast.makeText(this, "测试2", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn3:{
                Toast.makeText(this, "测试3", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn4:{
                Toast.makeText(this, "新加的btn4按钮", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.btn5:{
                Toast.makeText(this, "新加的btn5按钮，后一个btn提交", Toast.LENGTH_SHORT).show();
            }
        }
    }
}