package cn.edu.qlu.sn201811060006;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Homework5 extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    /*private TextView viewText;*/
    private Button buttonCal0;
    private Button buttonCal1;
    private Button buttonCal2;
    private Button buttonCal3;
    private Button buttonCal4;
    private Button buttonCal5;
    private Button buttonCal6;
    private Button buttonCal7;
    private Button buttonCal8;
    private Button buttonCal9;
    private Button buttonClearMemory;
    private Button buttonAddToMemory;
    private Button buttonSubtractFromMemory;
    private Button buttonRecallMemory;
    private Button buttonClear;
    private Button buttonToggleSign;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonSubtract;
    private Button buttonAdd;
    private Button buttonDecimalPoint;
    private Button buttonEquals;
    boolean clear_flag;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework5);

        editText = (EditText) findViewById(R.id.textEdit1);
        buttonCal0 = (Button)findViewById(R.id.buttonCal0);
        buttonCal1 = (Button)findViewById(R.id.buttonCal1);
        buttonCal2 = (Button)findViewById(R.id.buttonCal2);
        buttonCal3 = (Button)findViewById(R.id.buttonCal3);
        buttonCal4 = (Button)findViewById(R.id.buttonCal4);
        buttonCal5 = (Button)findViewById(R.id.buttonCal5);
        buttonCal6 = (Button)findViewById(R.id.buttonCal6);
        buttonCal7 = (Button)findViewById(R.id.buttonCal7);
        buttonCal8 = (Button)findViewById(R.id.buttonCal8);
        buttonCal9 = (Button)findViewById(R.id.buttonCal9);
        buttonClearMemory = (Button)findViewById(R.id.buttonClearMemory);
        buttonAddToMemory = (Button)findViewById(R.id.buttonAddToMemory);
        buttonSubtractFromMemory = (Button)findViewById(R.id.buttonSubtractFromMemory);
        buttonRecallMemory = (Button)findViewById(R.id.buttonRecallMemory);
        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonToggleSign = (Button)findViewById(R.id.buttonToggleSign);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        buttonSubtract = (Button)findViewById(R.id.buttonSubtract);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonDecimalPoint = (Button)findViewById(R.id.buttonDecimalPoint);
        buttonEquals =(Button)findViewById(R.id.buttonEquals);


        editText.setOnClickListener(this);
        buttonCal0.setOnClickListener(this);
        buttonCal1.setOnClickListener(this);
        buttonCal2.setOnClickListener(this);
        buttonCal3.setOnClickListener(this);
        buttonCal4.setOnClickListener(this);
        buttonCal5.setOnClickListener(this);
        buttonCal6.setOnClickListener(this);
        buttonCal7.setOnClickListener(this);
        buttonCal8.setOnClickListener(this);
        buttonCal9.setOnClickListener(this);
        buttonClearMemory.setOnClickListener(this);
        buttonAddToMemory.setOnClickListener(this);
        buttonSubtractFromMemory.setOnClickListener(this);
        buttonRecallMemory.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonToggleSign.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonDecimalPoint.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
    }

    private String lastresult;
    private boolean now;

    @Override
    public void onClick(View view) {
      String input = editText.getText().toString();
        switch (view.getId()){
            case R.id.buttonCal0:
            case R.id.buttonCal1:
            case R.id.buttonCal2:
            case R.id.buttonCal3:
            case R.id.buttonCal4:
            case R.id.buttonCal5:
            case R.id.buttonCal6:
            case R.id.buttonCal7:
            case R.id.buttonCal8:
            case R.id.buttonCal9:
                if(clear_flag){
                    clear_flag = false;
                    editText.setText("");
                }
                editText.setText(input + ((Button)view).getText());
                break;
            case R.id.buttonAdd:
            case R.id.buttonSubtract:
            case R.id.buttonMultiply:
            case R.id.buttonDivide:
                if(clear_flag){
                    clear_flag = false;
                    input = "";
                    editText.setText("");
                }
                editText.setText(input + " " + ((Button)view).getText() + " ");
                break;
            case R.id.buttonClear:
                if(clear_flag){
                    clear_flag = false;
                    input = "";
                    editText.setText("");
                }else if(input != null || !input.equals("")) {//如果获取到的内容为空
                    editText.setText(input.substring(0, input.length() - 1));//结果集为空
                }
                break;
            case R.id.buttonEquals://运算结果  =
                getResult();//调用处理结果集的方法
                break;
            }
        }

    private void getResult() {
        String exp = editText.getText().toString();//获取文本框的内容
        if(exp==null||exp.equals("")){
            return;
        }
        if(!exp.contains(" ")){
            return;
        }
        if(clear_flag){
            clear_flag = false;
            return;
        }
        clear_flag = true;
        double result = 0;

        //进行截取
        //运算符前的数字
        String s1 = exp.substring(0,exp.indexOf(" "));
        //运算符
        String op = exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2);
        //运算符后的数字
        String s2 = exp.substring(exp.indexOf(" ")+3);

        if(!s1.equals("")&&!s2.equals("")) {//如果包含小数点的运算
            double d1 = Double.parseDouble(s1);//则数字都是double类型
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {//如果是 +
                result = d1 + d2;
            } else if (op.equals("-")) {
                result = d1 - d2;
            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                if (d2 == 0) { //如果被除数是0
                    result = 0; //则结果是0
                }
                else {//否则执行正常是除法运算
                    result = d1 / d2;
                }
            }

            if (!s1.contains(".") && !s2.contains(".") && !op.equals("/")) {//如果是整数类型
                int r = (int) result; //都是整形
                editText.setText(r + "");
            } else{
                editText.setText(result + "");
            }
        }else if(!s1.equals("") && s2.equals("")){//如果是只输入运算符前的数
            editText.setText(exp);//直接返回当前文本框的内容
        }else if(s1.equals("") && !s2.equals("")){//如果是只输入运算符后面的数
            double d2 = Double.parseDouble(s2);

            //运算符前没有输入数字
            if (op.equals("+")) {
                result = 0 + d2;
            } else if (op.equals("-")) {
                result = 0 - d2;
            } else if (op.equals("*")) {
                result = 0;
            } else if (op.equals("/")) {
                result = 0;
            }

            if (!s1.contains(".") && !s2.contains(".")) {
                int r = (int) result;
                editText.setText(r + "");
            } else{
                editText.setText(result + "");
            }
        }else {
            editText.setText("");
        }

    }
}

