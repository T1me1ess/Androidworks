package cn.edu.qlu.sn201811060006;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class HomeMainActivity extends AppCompatActivity {
    private Button homework_btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);


        homework_btn1=findViewById(R.id.homework_btn1);
        homework_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeMainActivity.this,MainActivity.class);
                startActivity(intent);
                //Intent intent = new Intent(HomeMainActivity.this,MainActivity.class);
                //startActivity(intent);
            }
        });
    }
}