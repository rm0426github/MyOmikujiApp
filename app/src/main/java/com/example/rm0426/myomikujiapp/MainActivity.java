package com.example.rm0426.myomikujiapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static String[] results = {
            "大吉",
            "吉",
            "凶"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // TODO setOnClickListenerを使っても書いてみる.
    public void getOmikuji(View view) {
        // TextViewの取得.
        TextView txtView = (TextView) findViewById(R.id.myTextView);

        // 乱数の生成.
        Random randomGenerator = new Random();
        int num = randomGenerator.nextInt(results.length);

        // 結果の表示.
        String result = results[num];
        txtView.setText(result);

        // 大吉の時は赤、それ以外は黒にする.
        if(num == 0) {
            txtView.setTextColor(Color.RED);
        }
        else {
            txtView.setTextColor(Color.rgb(0, 0, 0));
        }
    }
}
