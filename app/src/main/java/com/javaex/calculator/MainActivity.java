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


                switch (view.getId()) {
                    case R.id.one :
                        Log.d("calculator", "1 작동" + R.id.one);

                        edtText.setText(one.getText().toString());


                        break;

                    case R.id.two :
                        Log.d("calculator", "2 작동" + R.id.two);

                        edtText.setText(two.getText().toString());

                        break;

                    case R.id.three :
                        Log.d("calculator", "3 작동" + R.id.three);

                        edtText.setText(three.getText().toString());

                        break;

                    case R.id.four :
                        Log.d("calculator", "4 작동" + R.id.four);

                        edtText.setText(four.getText().toString());

                        break;

                    case R.id.five :
                        Log.d("calculator", "5 작동" + R.id.five);

                        edtText.setText(five.getText().toString());

                        break;

                    case R.id.six :
                        Log.d("calculator", "6 작동" + R.id.six);

                        edtText.setText(six.getText().toString());

                        break;

                    case R.id.seven :
                        Log.d("calculator", "7 작동" + R.id.seven);

                        edtText.setText(seven.getText().toString());

                        break;

                    case R.id.eight :
                        Log.d("calculator", "8 작동" + R.id.eight);

                        edtText.setText(eight.getText().toString());

                        break;

                    case R.id.nine :
                        Log.d("calculator", "9 작동" + R.id.nine);

                        edtText.setText(nine.getText().toString());

                        break;

                    case R.id.zero :
                        Log.d("calculator", "0 작동" + R.id.zero);

                        edtText.setText(zero.getText().toString());

                        break;

                    case R.id.slash :
                        Log.d("calculator", "/ 작동" + R.id.slash);

                        edtText.setText(slash.getText().toString());

                        break;

                    case R.id.multi :
                        Log.d("calculator", "X 작동" + R.id.multi);

                        edtText.setText(multi.getText().toString());

                        break;

                    case R.id.minus :
                        Log.d("calculator", "- 작동" + R.id.minus);

                        edtText.setText(minus.getText().toString());

                        break;

                    case R.id.plus :

                        edtText.setText(plus.getText().toString());

                        break;

                    case R.id.reset :
                        Log.d("calculator", "CE 작동" + R.id.reset);

                        edtText.setText("");
                        break;

                    case R.id.equal :
                        Log.d("calculator", "= 작동" + R.id.equal);


                        /*
                        String sign = edtText.getText().toString();

                        int result = 0;

                        if(sign.contains("+")) {
                            String[] num = (edtText.getText().toString()).split("\\+");
                            result = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
                        }

                        edtText.setText(equal.getText().toString()+ result);
                        */
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