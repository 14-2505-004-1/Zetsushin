package com.example.tene.zetsushin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

public class result extends AppCompatActivity {

    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // ラジオグループのオブジェクトを取得
        RadioGroup group1 = (RadioGroup)findViewById(R.id.q1_rg);
        // チェックされているラジオボタンの ID を取得
        int id = group1.getCheckedRadioButtonId();
/*
        TextView textView = (TextView) findViewById(R.id.score);
        if(id == 1){
            sum = 100;
            textView.setText(id);
        } else {
            sum = 50;
            textView.setText("50");
        }*/

    }

}
