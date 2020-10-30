package com.hdjtdxwt.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        textView = findViewById(R.id.text);
        textView.setOnClickListener(this);
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
            case R.id.text:{
                Toast.makeText(this, "要删除的文本textView", Toast.LENGTH_SHORT).show();
            }break;

        }
    }
}