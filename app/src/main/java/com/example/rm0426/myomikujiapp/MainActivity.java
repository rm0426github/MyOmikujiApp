package com.example.rm0426.myomikujiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getOmikuji(View view) {
        // TextViewの取得.
        TextView txtView = (TextView) findViewById(R.id.myTextView);

        // 乱数の生成.
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(3);

        // 結果の表示.
        String result = Integer.toString(num);
        txtView.setText(result);
    }
}
