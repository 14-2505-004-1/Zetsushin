package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
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

    @Override
    public void onBackPressed(){

    }

    /*

    追加

     */
    public void onNextResultTapped(View view) {

        RadioGroup q1_radioGroup = (RadioGroup) findViewById(R.id.q1_rg);
        int q1_checkedId = q1_radioGroup.getCheckedRadioButtonId();

        RadioButton q1_1_id = (RadioButton)findViewById(R.id.radioButton);
        RadioButton q1_2_id = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton q1_3_id = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton q1_4_id = (RadioButton)findViewById(R.id.radioButton4);
        RadioButton q1_5_id = (RadioButton)findViewById(R.id.radioButton5);
        int q1_1_rb_id = q1_1_id.getId();
        int q1_2_rb_id = q1_1_id.getId();
        int q1_3_rb_id = q1_1_id.getId();
        int q1_4_rb_id = q1_1_id.getId();
        int q1_5_rb_id = q1_1_id.getId();



        RadioGroup q2_radioGroup = (RadioGroup) findViewById(R.id.q2_rg);
        int q2_checkedId = q2_radioGroup.getCheckedRadioButtonId();


        Intent intent = new Intent(this, result.class);
        intent.putExtra("q1_answer",q1_checkedId);
        intent.putExtra("q1_1_setId",q1_1_rb_id);
        intent.putExtra("q1_2_setId",q1_2_rb_id);
        intent.putExtra("q1_3_setId",q1_3_rb_id);
        intent.putExtra("q1_4_setId",q1_4_rb_id);
        intent.putExtra("q1_5_setId",q1_5_rb_id);

        intent.putExtra("q2_answer",q2_checkedId);
        startActivity(intent);
    }
    /*

     ここまで

     */
}
