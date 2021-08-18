package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView edtText;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button slash;
    private Button multi;
    private Button minus;
    private Button plus;
    private Button reset;
    private Button equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String viewText = edtText.getText().toString();

                switch (view.getId()) {
                    case R.id.one :
                        Log.d("calculator", "1 작동" + R.id.one);

                        edtText.setText(viewText+ 1);


                        break;

                    case R.id.two :
                        Log.d("calculator", "2 작동" + R.id.two);

                        edtText.setText(viewText+ 2);

                        break;

                    case R.id.three :
                        Log.d("calculator", "3 작동" + R.id.three);

                        edtText.setText(viewText+ 3);

                        break;

                    case R.id.four :
                        Log.d("calculator", "4 작동" + R.id.four);

                        edtText.setText(viewText+ 4);

                        break;

                    case R.id.five :
                        Log.d("calculator", "5 작동" + R.id.five);

                        edtText.setText(viewText+ 5);

                        break;

                    case R.id.six :
                        Log.d("calculator", "6 작동" + R.id.six);

                        edtText.setText(viewText+ 6);

                        break;

                    case R.id.seven :
                        Log.d("calculator", "7 작동" + R.id.seven);

                        edtText.setText(viewText+ 7);

                        break;

                    case R.id.eight :
                        Log.d("calculator", "8 작동" + R.id.eight);

                        edtText.setText(viewText+ 8);

                        break;

                    case R.id.nine :
                        Log.d("calculator", "9 작동" + R.id.nine);

                        edtText.setText(viewText+ 9);

                        break;

                    case R.id.zero :
                        Log.d("calculator", "0 작동" + R.id.zero);

                        edtText.setText(viewText+ 0);

                        break;

                    case R.id.slash :
                        Log.d("calculator", "/ 작동" + R.id.slash);

                        edtText.setText(viewText+ "/");

                        break;

                    case R.id.multi :
                        Log.d("calculator", "X 작동" + R.id.multi);

                        edtText.setText(viewText+ "*");

                        break;

                    case R.id.minus :
                        Log.d("calculator", "- 작동" + R.id.minus);

                        edtText.setText(viewText+ "-");

                        break;

                    case R.id.plus :
                        Log.d("calculator", "+ 작동" + R.id.minus);

                        edtText.setText(viewText+ "+");

                        break;

                    case R.id.reset :
                        Log.d("calculator", "CE 작동" + R.id.reset);

                        edtText.setText("");
                        break;

                    case R.id.equal :
                        Log.d("calculator", "= 작동" + R.id.equal);

                        double result = 0.0;

                        if(viewText.contains("/")) {
                            Log.d("calculator", "/ 작동");
                            String[] str = viewText.split("/");
                            result = Double.parseDouble(str[0]) / Double.parseDouble((str[1]));

                        } else if(viewText.contains("*")) {
                            Log.d("calculator", "* 작동");
                            String[] str = viewText.split("\\*");
                            result = Double.parseDouble(str[0]) * Double.parseDouble((str[1]));

                        } else if(viewText.contains("-")) {
                            Log.d("calculator", "* 작동");
                            String[] str = viewText.split("-");
                            result = Double.parseDouble(str[0]) - Double.parseDouble((str[1]));

                        } else if(viewText.contains("+")) {
                            Log.d("calculator", "+ 작동");
                            String[] str = viewText.split("\\+");
                            result = Double.parseDouble(str[0]) + Double.parseDouble((str[1]));
                        }

                        edtText.setText(equal.getText().toString() + result);

                        break;


                }

            }
        };

        edtText = (TextView) findViewById(R.id.edtText);

        one = (Button)findViewById(R.id.one);
        one.setOnClickListener(listener);

        two = (Button)findViewById(R.id.two);
        two.setOnClickListener(listener);

        three = (Button)findViewById(R.id.three);
        three.setOnClickListener(listener);

        four = (Button)findViewById(R.id.four);
        four.setOnClickListener(listener);

        five = (Button)findViewById(R.id.five);
        five.setOnClickListener(listener);

        six = (Button)findViewById(R.id.six);
        six.setOnClickListener(listener);

        seven = (Button)findViewById(R.id.seven);
        seven.setOnClickListener(listener);

        eight = (Button)findViewById(R.id.eight);
        eight.setOnClickListener(listener);

        nine = (Button)findViewById(R.id.nine);
        nine.setOnClickListener(listener);

        zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(listener);

        slash = (Button)findViewById(R.id.slash);
        slash.setOnClickListener(listener);

        multi = (Button)findViewById(R.id.multi);
        multi.setOnClickListener(listener);

        minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(listener);

        plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(listener);

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(listener);

        equal = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(listener);




    }
}