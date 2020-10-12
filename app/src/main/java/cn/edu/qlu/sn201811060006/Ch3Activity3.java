package cn.edu.qlu.sn201811060006;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class Ch3Activity3 extends Activity {
    /** Called when the activity is first created. */
    private CheckBox ch1,ch2,ch3,ch4,ch5;
    private Button mybutton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch3_3);

        mybutton = (Button)findViewById(R.id.mybutton);
        ch1 = (CheckBox)findViewById(R.id.check1);
        ch2 = (CheckBox)findViewById(R.id.check2);
        ch3 = (CheckBox)findViewById(R.id.check3);
        ch4 = (CheckBox)findViewById(R.id.check4);
        ch5 = (CheckBox)findViewById(R.id.check5);

        ch1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                if(ch1.isChecked())
                {
                    showMessage("你选择了"+ch1.getText());
                }
            }

        });
        ch2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                if(ch3.isChecked())
                {
                    showMessage("你选择了"+ch2.getText());
                }
            }

        });
        ch3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                if(ch3.isChecked())
                {
                    showMessage("你选择了"+ch3.getText());
                }
            }

        });
        ch4.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                if(ch4.isChecked())
                {
                    showMessage("你选择了"+ch4.getText());
                }
            }

        });
        ch5.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener()
        {

            @Override
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                // TODO Auto-generated method stub
                if(ch5.isChecked())
                {
                    showMessage("你选择了"+ch5.getText());
                }
            }

        });

        mybutton.setOnClickListener(new Button.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                int num = 0;
                if(ch1.isChecked())
                {
                    num++;
                }
                if(ch2.isChecked())
                {
                    num++;
                }
                if(ch3.isChecked())
                {
                    num++;
                }
                if(ch4.isChecked())
                {
                    num++;
                }
                if(ch5.isChecked())
                {
                    num++;
                }

                showMessage("谢谢参与，您一共选择了"+num+"项");

            }

        });
    }



    public void showMessage(String str)
    {
        Toast toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 220);
        toast.show();
    }
}
