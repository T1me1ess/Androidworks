package cn.edu.qlu.sn201811060006;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private EditText edt1,edt2;
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) this.findViewById(R.id.edt_test1);
        edt2 = (EditText) this.findViewById(R.id.edt_test2);
        tv1 = (TextView) this.findViewById(R.id.tv);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        //加法
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1=edt1.getText().toString();
                String inputText2=edt2.getText().toString();
                float num1=Float.valueOf(inputText1).intValue();
                float num2=Float.valueOf(inputText2).intValue();
                num1=num1+num2;
                inputText1=String.valueOf(num1);
                tv1.setText(inputText1);
            }
        });

        //减法
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText1=edt1.getText().toString();
                String inputText2=edt2.getText().toString();
                float num1=Float.valueOf(inputText1).intValue();
                float num2=Float.valueOf(inputText2).intValue();
                num1=num1-num2;
                inputText1=String.valueOf(num1);
                tv1.setText(inputText1);
            }
        });


        //乘法
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String inputText1=edt1.getText().toString();
                String inputText2=edt2.getText().toString();
                float num1=Float.valueOf(inputText1).intValue();
                float num2=Float.valueOf(inputText2).intValue();
                num1=num1*num2;
                inputText1=String.valueOf(num1);
                tv1.setText(inputText1);
            }
        });
    }

    //除法
    public void division (View view){
        String inputText1=edt1.getText().toString();
        String inputText2=edt2.getText().toString();
        float num1=Float.valueOf(inputText1).intValue();
        float num2=Float.valueOf(inputText2).intValue();
        if(num2==0){
            Toast.makeText(MainActivity.this, "除数不能为0", Toast.LENGTH_LONG).show();

        }else{
            num1=num1/num2;
            inputText1=String.valueOf(num1);
            tv1.setText(inputText1);
        }
    }

}