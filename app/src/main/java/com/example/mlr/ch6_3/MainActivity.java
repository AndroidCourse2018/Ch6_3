package com.example.mlr.ch6_3;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int num1, num2; //用private宣告num1、num2為整數變數(private私有成員只能在自身類別中使用)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用亂數取得數字
        num1 = (int) (Math.random()*12) + 1; //Math.random()*12的值為0~12，加1後為1~13
        num2 = (int) (Math.random()*12) + 1; //Math.random()*12的值為0~12，加1後為1~13
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1listener);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2listener);
    }

    View.OnClickListener btn1listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, Integer.toString(num1) , Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener btn2listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, Integer.toString(num2) , Toast.LENGTH_SHORT).show();
        }
    };
}
