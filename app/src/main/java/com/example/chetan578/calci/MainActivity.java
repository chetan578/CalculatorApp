package com.example.chetan578.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button button1,button0,button2,button3,button4,button5,button6,button7,button8,button9,subbtn,addbtn,mulbtn,divbtn,clearbtn,equalbtn,dot;
   TextView result;
double num1,num2;
boolean add,mul,div,sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button0 = findViewById(R.id.btn0);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4= findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6= findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8= findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        addbtn = findViewById(R.id.btnadd);
        subbtn = findViewById(R.id.btnsub);
        mulbtn = findViewById(R.id.btnmul);
        divbtn = findViewById(R.id.btndivide);
        equalbtn = findViewById(R.id.btnequal);
        result=findViewById(R.id.result);
        dot=findViewById(R.id.dot);
        clearbtn=findViewById(R.id.btnclear);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + ".");
            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString() == "") {
                    Toast.makeText(MainActivity.this, "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Double.parseDouble(result.getText().toString() + "");
                    add = true;
                    result.setText(null);
                }
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString() == "") {
                    Toast.makeText(MainActivity.this, "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Double.parseDouble(result.getText().toString() + "");
                    sub = true;
                    result.setText(null);
                }
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString() == "") {
                    Toast.makeText(MainActivity.this, "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Double.parseDouble(result.getText().toString() + "");
                    mul = true;
                    result.setText(null);
                }
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString() == "") {
                    Toast.makeText(MainActivity.this, "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Double.parseDouble(result.getText().toString() + "");
                    div = true;
                    result.setText(null);
                }
            }
        });

        equalbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String input=result.getText().toString();
       if(input==".." || input=="..."||input=="...."|| input==".....")
       {
           Toast.makeText(MainActivity.this, "Enter a valid number!", Toast.LENGTH_SHORT).show();
       }
        else if (result.getText().toString() == "") {
            Toast.makeText(MainActivity.this, "Enter a value", Toast.LENGTH_SHORT).show();
        }
        else {
            num2 = Double.parseDouble(result.getText().toString() + "");
            if (add) {
                result.setText(num1 + num2 + "");
                add = false;
            }
            if (sub) {
                result.setText(num1 - num2 + "");
                sub = false;
            }
            if (mul) {
                result.setText(num1 * num2 + "");
                mul = false;
            }
            if (div) {
                try {
                    result.setText(String.format("%.2f", num1 / num2) + "");
                } catch (ArithmeticException e) {
                    result.setText("Division by zero error!");
                }
                div = false;
            }
        }
    }
    });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(null);
            }
        });
    }
}

