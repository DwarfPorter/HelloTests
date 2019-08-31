package ru.geekbrains.hellotests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText arg2;
    private EditText arg1;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initCalc();
    }

    private void initView() {
        arg1 = findViewById(R.id.number1);
        arg2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
    }

    private void initCalc() {
        findViewById(R.id.addition).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate(new Addition());
            }
        });
        findViewById(R.id.division).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate(new Division());
            }
        });
        findViewById(R.id.multiplication).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate(new Multiplication());
            }
        });
        findViewById(R.id.substraction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate(new Subsctraction());
            }
        });
    }

    private void calculate(Operation operation) {
        int res = new Calculation(operation)
                .setArg1(getArg1())
                .setArg2(getArg2())
                .calculate();
        result.setText(Integer.toString(res));
    }

    private int getArg1(){
        return Integer.valueOf(arg1.getText().toString());
    }

    private int getArg2(){
        return Integer.valueOf(arg2.getText().toString());
    }


}
