package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        /*

        追加

         */


        /*

        ここまで

        */

    }

    /*

    追加

     */
    public void onNextResultTapped(View view) {

        RadioGroup q1_radioGroup = (RadioGroup) findViewById(R.id.q1_rg);
        int q1_checkedId = q1_radioGroup.getCheckedRadioButtonId();
        RadioGroup q2_radioGroup = (RadioGroup) findViewById(R.id.q2_rg);
        int q2_checkedId = q2_radioGroup.getCheckedRadioButtonId();


        Intent intent = new Intent(this, result.class);
        intent.putExtra("q1_answer",q1_checkedId);
        intent.putExtra("q2_answer",q2_checkedId);
        startActivity(intent);
    }
    /*

     ここまで

     */
}
