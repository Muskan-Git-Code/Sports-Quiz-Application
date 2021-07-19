package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Intent i;
    String name;

    EditText ed1;
    TextView tv1,tv2,tv3,tv4;
    RadioButton a,b,c,d;
    Button bt;
    RadioGroup rg;
    int q=0,s=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //intent
        i=getIntent();
        name=i.getStringExtra("name");
        tv1=(TextView) findViewById(R.id.name);


        //program
        tv2=(TextView)findViewById(R.id.ques);
        tv3=(TextView)findViewById(R.id.response);
        tv4=(TextView)findViewById(R.id.score);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        a=(RadioButton)findViewById(R.id.radioButton1);
        b=(RadioButton)findViewById(R.id.radioButton2);
        c=(RadioButton)findViewById(R.id.radioButton3);
        d=(RadioButton)findViewById(R.id.radioButton4);
        bt=(Button)findViewById(R.id.next);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (q){
                    case 0:
                    {
                       // rg.setVisibility(View.VISIBLE);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        a.setEnabled(true);
                        b.setEnabled(true);
                        c.setEnabled(true);
                        d.setEnabled(true);


                        bt.setText("Next");
                        tv1.setText("Hello "+name);

                        tv2.setText("1.When were the first recorded olympiad held ?");
                        a.setText("825 BC");
                        b.setText("776 BC");
                        c.setText("320 BC");
                        d.setText("80 BC");
                        q=1;

                        tv4.setText(" ");
                        break;
                    }
                    case 1:
                    {

                        tv2.setText("2.Who won the first silver medal for an indivisual event at the olympics for India?");
                        a.setText("Maharaja Kami Singh");
                        b.setText("Wilson Jones");
                        c.setText("Major R.S. Rathore");
                        d.setText("Leander paes");

                        if (b.isChecked()){
                            tv3.setText("Right Answer");
                            s=s+10;
                        }
                        else
                        {
                            tv3.setText("Wrong Answer   B was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        q=q+1;
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);
                        break;
                    }
                    case 2:
                    {
                        tv2.setText("3.FIFA World Cup would be held in ?");
                        a.setText("Russia");
                        b.setText("Qatar");
                        c.setText("France");
                        d.setText("Netherlands");
                        if (c.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");

                        }
                        else
                        {
                            tv3.setText("Wrong Answer   C was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        q=q+1;
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);
                        break;
                    }
                    case 3:
                    {

                        tv2.setText("4.The first common wealth games were held in the year 1930 at?");
                        a.setText("London (UK)");
                        b.setText("Sydney (Australia)");
                        c.setText("Hamliton (Canada)");
                        d.setText("Auckland (New Zealand)");
                        if (a.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  A was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        q=q+1;
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);
                        break;
                    }
                    case 4:
                    {
                        tv2.setText("5.The number of players side in Water Polo is ?");
                        a.setText("7");
                        b.setText("9");
                        c.setText("5");
                        d.setText("4");
                        if (c.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  C was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 5:
                    {
                        tv2.setText("6. What does the Olympic flame symbolize? ");
                        a.setText("zeal to play sports");
                        b.setText("Challenge");
                        c.setText("Continuity");
                        d.setText("Integrity");
                        if (a.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  A was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 6:
                    {
                        tv2.setText("7.Which among the following is the National Sports of USA? ?");
                        a.setText("Bowling");
                        b.setText("Baseball");
                        c.setText("Table Tennis");
                        d.setText("Rugby");
                        if (c.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  C was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 7:
                    {
                        tv2.setText("8.Who among the following is the First Indian Women to get an Olympic Medal ?");
                        a.setText("Anju Bobby Georage");
                        b.setText("Karnam Malleshwari");
                        c.setText("P T Usha");
                        d.setText("Nameirakpam Kunjarani");
                        if (b.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  B was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 8:
                    {
                        tv2.setText("9.Major Dhyanchand's birthday is celebrated as National Sports Day in among the following dates ?");
                        a.setText("July 29th");
                        b.setText("August29th");
                        c.setText("March29th");
                        d.setText("April 29th");
                        if (b.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  B was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 9:
                    {
                        tv2.setText("10.Whose team win first world cup of cricket ?");
                        a.setText("India");
                        b.setText("West Indies");
                        c.setText("Austrailia");
                        d.setText("South Africa");
                        if (b.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  B was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 10:
                    {
                        tv2.setText("11. After how many years the ASIAD is held ?");
                        a.setText("6 years");
                        b.setText("5 years");
                        c.setText("4 years");
                        d.setText("3 years");
                        if (b.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {

                            tv3.setText("Wrong Answer  B was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 11:
                    {
                        tv2.setText("12.India played its first one day international with which country and in which year ?");
                        a.setText("England 1975");
                        b.setText("Australia 1976");
                        c.setText("New Zealand 1975");
                        d.setText("England 1978");
                        if (c.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  C was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;
                        //bt.setText("Finish");
                        break;
                    }

                    case 12:
                    {
                        tv2.setText("13.Which chess computer built by IBM defeated world chess champion Garry Kasparov ?");
                        a.setText("Deep blue");
                        b.setText("Deep move");
                        c.setText("Deep view");
                        d.setText("Deep street");
                        if (a.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  A was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;

                        break;
                    }

                    case 13:
                    {
                        tv2.setText("14.Which of these awards is the highest sporting honour of India ?");
                        a.setText("Arjuna award");
                        b.setText("Dronacharya Award");
                        c.setText("Rajiv Gandhi Khel Ratna Award");
                        d.setText("Rashtriya Khel Protsahan Puraskar");
                        if (a.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  A was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;

                        break;
                    }

                    case 14:
                    {
                        tv2.setText("15. who was the first indian in independent India to have won a gold medal in an indivisual olympic event?");
                        a.setText("Dhyanchand");
                        b.setText("K D Jadhav");
                        c.setText("Prithipal Singh");
                        d.setText("Harishchandra Birajdar");
                        if (c.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  C was Right Answer");
                        }
                        tv4.setText("score is "+s);
                        a.setChecked(false);
                        b.setChecked(false);
                        c.setChecked(false);
                        d.setChecked(false);

                        q=q+1;

                        break;
                    }

                    case 15:
                    {
                        a.setEnabled(false);
                        b.setEnabled(false);
                        c.setEnabled(false);
                        d.setEnabled(false);
                        if (b.isChecked()){
                            s=s+10;
                            tv3.setText("Right Answer");
                        }
                        else
                        {
                            tv3.setText("Wrong Answer  B was Right Answer");
                        }
                        tv4.setText("final score is "+s);
                        bt.setText("Restart");
                        q=0;
                        s=0;
                        break;
                    }
                }

            }
        });
    }


}
