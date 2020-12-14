package cn.edu.qlu.sn201811060006;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeMainActivity extends AppCompatActivity {
    private Button homework_btn1;
    private Button homework_btn2;
    private Button homework_btn3;
    private Button homework_btn4;
    private Button homework_btn5;
    private Button homework_btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);


        homework_btn1=findViewById(R.id.homework_btn1);
        homework_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework1.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        homework_btn2=findViewById(R.id.homework_btn2);
        homework_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework2.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        homework_btn3=findViewById(R.id.homework_btn3);
        homework_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework3.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        homework_btn4=findViewById(R.id.homework_btn4);
        homework_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework4.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        homework_btn5=findViewById(R.id.homework_btn5);
        homework_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework5.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
        homework_btn6=findViewById(R.id.homework_btn6);
        homework_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this, Homework6.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });


    }
}