package com.example.myapp;

    import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ans;
    Button zr,cc,on,tw,th,fr,fv,sx,svn,eght,nn,pls,mns,tms,dvn,equ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans = (EditText) findViewById(R.id.edit1);
        pls = (Button) findViewById(R.id.add);
        mns = (Button) findViewById(R.id.decrease);
        tms = (Button) findViewById(R.id.star);
        dvn = (Button) findViewById(R.id.slash);
        zr = (Button) findViewById(R.id.z);
        cc = (Button) findViewById(R.id.c1);
        on = (Button) findViewById(R.id.btn1);
        tw = (Button) findViewById(R.id.btn2);
        th = (Button) findViewById(R.id.btn3);
        fr = (Button) findViewById(R.id.btn4);
        fv = (Button) findViewById(R.id.btn5);
        sx = (Button) findViewById(R.id.btn6);
        svn = (Button) findViewById(R.id.btn7);
        eght = (Button) findViewById(R.id.btn8);
        nn = (Button) findViewById(R.id.btn9);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "1");






































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "2");

            }
        });
        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "3");

            }
        });
        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "4");

            }
        });
        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "5");

            }
        });
        sx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "6");

            }
        });
        svn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "7");

            }
        });
        eght.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "8");

            }
        });
        nn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "9");

            }
        });
        zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText() + "0");

            }
        });
        int jibu = 0;

        pls.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int jibu = val1 + val2;
                                       ans.setText(Integer.toString(jibu));


                                   }
                               }
        );
        mns.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int jibu = val1 - val2;
                                       ans.setText(Integer.toString(jibu));
                                   }
                               }
        );
        tms.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int val1 = Integer.parseInt(ans.getText().toString());
                                       int val2 = Integer.parseInt(ans.getText().toString());
                                       int jibu = val1 * val2;
                                       ans.setText(Integer.toString(jibu));
                                   }
                               }
        );

        dvn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(ans.getText().toString());
                int val2 = Integer.parseInt(ans.getText().toString());
                int jibu = val1 / val2;
                ans.setText(Integer.toString(jibu));
            }
        });
        cc.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      int val1 = Integer.parseInt(ans.getText().toString());
                                      int val2 = Integer.parseInt(ans.getText().toString());
                                      ans.setText(Integer.toString(0));
                                  }


                              }
        );
    }}


