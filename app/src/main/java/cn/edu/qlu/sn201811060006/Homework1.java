package cn.edu.qlu.sn201811060006;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Homework1 extends AppCompatActivity  implements View.OnClickListener{
    EditText num1,num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework1);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.result);
        //加法按钮添加监听器
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int _num1_,_num2_;
                try{
                    _num1_ = Integer.parseInt(num1.getText().toString());
                    _num2_ = Integer.parseInt(num2.getText().toString());
                }
                catch (Exception e){
                    result.setText("请输入数字");
                    return;
                }
                result.setText(( _num1_ + _num2_ ) + "");
            }
        });
        //减法添加监听器
        findViewById(R.id.sub).setOnClickListener(new SubOnClickListener());
        //乘法添加监听器
        findViewById(R.id.mut).setOnClickListener(this);
    }

    public void onClick(View v){
        int _num1_,_num2_;
        try{
            _num1_ = Integer.parseInt(num1.getText().toString());
            _num2_ = Integer.parseInt(num2.getText().toString());
        }
        catch (Exception e){
            result.setText("请输入数字");
            return;
        }
        result.setText(( _num1_ * _num2_ ) + "");
    }

    public void onDivClick(View v){
        int _num1_,_num2_;
        try{
            _num1_ = Integer.parseInt(num1.getText().toString());
            _num2_ = Integer.parseInt(num2.getText().toString());
            if(_num2_ == 0){
                result.setText("无法除零");
                return;
            }
        }
        catch (Exception e){
            result.setText("请输入数字");
            return;
        }
        result.setText(( _num1_ / _num2_ ) + "");
    }

    private class SubOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            int _num1_,_num2_;
            try{
                _num1_ = Integer.parseInt(num1.getText().toString());
                _num2_ = Integer.parseInt(num2.getText().toString());
            }
            catch (Exception e){
                result.setText("请输入数字");
                return;
            }
            result.setText(( _num1_ - _num2_ ) + "");
        }

    }
}
