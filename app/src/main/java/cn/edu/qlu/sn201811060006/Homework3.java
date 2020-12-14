package cn.edu.qlu.sn201811060006;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Homework3 extends AppCompatActivity {
    private RadioGroup radioGroup;
    private ArrayList ques;
    private TextView textView;
    private TextView questionTextView;
    private String[] question;
    private int[] anw;
    private int index=-1;
    private int[] radioIds={R.id.test_rb1,R.id.test_rb2,R.id.test_rb3,R.id.test_rb4};

    private int rightNum;
    private int wronnNum;
    private long seconds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources resources=getResources();
        anw=resources.getIntArray(R.array.anwser);
        question=resources.getStringArray(R.array.testTitle);
        TypedArray typedArray=resources.obtainTypedArray(R.array.testOptionAll);
        ques=new ArrayList();
        for(int i=0;i<question.length;i++){
            CharSequence [] arr=typedArray.getTextArray(i);
            ques.add(arr);
        }

        setContentView(R.layout.layout_homework3);
        textView=(TextView)findViewById(R.id.test_tv);
        questionTextView=(TextView) findViewById(R.id.test_question);
        radioGroup=(RadioGroup) findViewById(R.id.test_rg);
        radioGroup.setVisibility(View.INVISIBLE);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
                if (id==-1 || index==-1){
                    return;
                }
                int correctId=anw[index];
                int i=0;
                for(;i<4;i++){
                    if(radioIds[i]==id){
                        break;
                    }
                }
                if(correctId==i+1){
                    rightNum++;
                }else {
                    wronnNum++;
                }
                showText();
                if(index+1==ques.size()){
                    radioGroup.setVisibility(View.INVISIBLE);
                    long duration=System.currentTimeMillis()-seconds;
                    Toast.makeText(Homework3.this,"您答对了"+rightNum+"个题，答错"+wronnNum+"题,耗时："+(duration/1000)+"秒",Toast.LENGTH_LONG).show();

                }else {

                    refreshNext();
                    radioGroup.clearCheck();
                }
            }
        });
    }
    private void showText(){
        textView.setText("您当前已答"+(rightNum+wronnNum)+",还剩"+(anw.length-rightNum-wronnNum)+"题");
    }
    public void begin(View v){
        index=-1;
        radioGroup.setVisibility(View.VISIBLE);

        radioGroup.clearCheck();
        refreshNext();

        rightNum=0;
        wronnNum=0;
        showText();
        seconds=System.currentTimeMillis();
    }
    private void refreshNext(){
        index++;
        for(int i=0;i<4;i++){
            RadioButton radioButton=(RadioButton)findViewById(radioIds[i]);
            radioButton.setText(((CharSequence[]) ques.get(index))[i]);
        }
        questionTextView.setText(question[index]);

    }
}
