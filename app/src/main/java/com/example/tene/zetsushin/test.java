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
        int q1_2_rb_id = q1_2_id.getId();
        int q1_3_rb_id = q1_3_id.getId();
        int q1_4_rb_id = q1_4_id.getId();
        int q1_5_rb_id = q1_5_id.getId();



        RadioGroup q2_radioGroup = (RadioGroup) findViewById(R.id.q2_rg);
        int q2_checkedId = q2_radioGroup.getCheckedRadioButtonId();
        RadioButton q2_r1_id = (RadioButton)findViewById(R.id.radioButton_2);
        RadioButton q2_r2_id = (RadioButton)findViewById(R.id.radioButton2_2);
        RadioButton q2_r3_id = (RadioButton)findViewById(R.id.radioButton3_2);
        RadioButton q2_r4_id = (RadioButton)findViewById(R.id.radioButton4_2);
        RadioButton q2_r5_id = (RadioButton)findViewById(R.id.radioButton5_2);
        int q2_rb1_id = q2_r1_id.getId();
        int q2_rb2_id = q2_r2_id.getId();
        int q2_rb3_id = q2_r3_id.getId();
        int q2_rb4_id = q2_r4_id.getId();
        int q2_rb5_id = q2_r5_id.getId();

        RadioGroup q3_radioGroup = (RadioGroup) findViewById(R.id.q3_rg);
        int q3_checkedId = q3_radioGroup.getCheckedRadioButtonId();
        RadioButton q3_r1_id = (RadioButton)findViewById(R.id.radioButton_3);
        RadioButton q3_r2_id = (RadioButton)findViewById(R.id.radioButton2_3);
        RadioButton q3_r3_id = (RadioButton)findViewById(R.id.radioButton3_3);
        RadioButton q3_r4_id = (RadioButton)findViewById(R.id.radioButton4_3);
        RadioButton q3_r5_id = (RadioButton)findViewById(R.id.radioButton5_3);
        int q3_rb1_id = q3_r1_id.getId();
        int q3_rb2_id = q3_r2_id.getId();
        int q3_rb3_id = q3_r3_id.getId();
        int q3_rb4_id = q3_r4_id.getId();
        int q3_rb5_id = q3_r5_id.getId();

        RadioGroup q4_radioGroup = (RadioGroup) findViewById(R.id.q4_rg);
        int q4_checkedId = q4_radioGroup.getCheckedRadioButtonId();
        RadioButton q4_r1_id = (RadioButton)findViewById(R.id.radioButton_4);
        RadioButton q4_r2_id = (RadioButton)findViewById(R.id.radioButton2_4);
        RadioButton q4_r3_id = (RadioButton)findViewById(R.id.radioButton3_4);
        RadioButton q4_r4_id = (RadioButton)findViewById(R.id.radioButton4_4);
        RadioButton q4_r5_id = (RadioButton)findViewById(R.id.radioButton5_4);
        int q4_rb1_id = q4_r1_id.getId();
        int q4_rb2_id = q4_r2_id.getId();
        int q4_rb3_id = q4_r3_id.getId();
        int q4_rb4_id = q4_r4_id.getId();
        int q4_rb5_id = q4_r5_id.getId();

        RadioGroup q5_radioGroup = (RadioGroup) findViewById(R.id.q5_rg);
        int q5_checkedId = q5_radioGroup.getCheckedRadioButtonId();
        RadioButton q5_r1_id = (RadioButton)findViewById(R.id.radioButton_5);
        RadioButton q5_r2_id = (RadioButton)findViewById(R.id.radioButton2_5);
        RadioButton q5_r3_id = (RadioButton)findViewById(R.id.radioButton3_5);
        RadioButton q5_r4_id = (RadioButton)findViewById(R.id.radioButton4_5);
        RadioButton q5_r5_id = (RadioButton)findViewById(R.id.radioButton5_5);
        int q5_rb1_id = q5_r1_id.getId();
        int q5_rb2_id = q5_r2_id.getId();
        int q5_rb3_id = q5_r3_id.getId();
        int q5_rb4_id = q5_r4_id.getId();
        int q5_rb5_id = q5_r5_id.getId();

        RadioGroup q6_radioGroup = (RadioGroup) findViewById(R.id.q6_rg);
        int q6_checkedId = q6_radioGroup.getCheckedRadioButtonId();
        RadioButton q6_r1_id = (RadioButton)findViewById(R.id.radioButton_6);
        RadioButton q6_r2_id = (RadioButton)findViewById(R.id.radioButton2_6);
        RadioButton q6_r3_id = (RadioButton)findViewById(R.id.radioButton3_6);
        RadioButton q6_r4_id = (RadioButton)findViewById(R.id.radioButton4_6);
        RadioButton q6_r5_id = (RadioButton)findViewById(R.id.radioButton5_6);
        int q6_rb1_id = q6_r1_id.getId();
        int q6_rb2_id = q6_r2_id.getId();
        int q6_rb3_id = q6_r3_id.getId();
        int q6_rb4_id = q6_r4_id.getId();
        int q6_rb5_id = q6_r5_id.getId();

        RadioGroup q7_radioGroup = (RadioGroup) findViewById(R.id.q7_rg);
        int q7_checkedId = q7_radioGroup.getCheckedRadioButtonId();
        RadioButton q7_r1_id = (RadioButton)findViewById(R.id.radioButton_7);
        RadioButton q7_r2_id = (RadioButton)findViewById(R.id.radioButton2_7);
        RadioButton q7_r3_id = (RadioButton)findViewById(R.id.radioButton3_7);
        RadioButton q7_r4_id = (RadioButton)findViewById(R.id.radioButton4_7);
        RadioButton q7_r5_id = (RadioButton)findViewById(R.id.radioButton5_7);
        int q7_rb1_id = q7_r1_id.getId();
        int q7_rb2_id = q7_r2_id.getId();
        int q7_rb3_id = q7_r3_id.getId();
        int q7_rb4_id = q7_r4_id.getId();
        int q7_rb5_id = q7_r5_id.getId();


        RadioGroup q8_radioGroup = (RadioGroup) findViewById(R.id.q8_rg);
        int q8_checkedId = q8_radioGroup.getCheckedRadioButtonId();
        RadioButton q8_r1_id = (RadioButton)findViewById(R.id.radioButton_8);
        RadioButton q8_r2_id = (RadioButton)findViewById(R.id.radioButton2_8);
        RadioButton q8_r3_id = (RadioButton)findViewById(R.id.radioButton3_8);
        RadioButton q8_r4_id = (RadioButton)findViewById(R.id.radioButton4_8);
        RadioButton q8_r5_id = (RadioButton)findViewById(R.id.radioButton5_8);
        int q8_rb1_id = q8_r1_id.getId();
        int q8_rb2_id = q8_r2_id.getId();
        int q8_rb3_id = q8_r3_id.getId();
        int q8_rb4_id = q8_r4_id.getId();
        int q8_rb5_id = q8_r5_id.getId();

        RadioGroup q9_radioGroup = (RadioGroup) findViewById(R.id.q9_rg);
        int q9_checkedId = q9_radioGroup.getCheckedRadioButtonId();
        RadioButton q9_r1_id = (RadioButton)findViewById(R.id.radioButton_9);
        RadioButton q9_r2_id = (RadioButton)findViewById(R.id.radioButton2_9);
        RadioButton q9_r3_id = (RadioButton)findViewById(R.id.radioButton3_9);
        RadioButton q9_r4_id = (RadioButton)findViewById(R.id.radioButton4_9);
        RadioButton q9_r5_id = (RadioButton)findViewById(R.id.radioButton5_9);
        int q9_rb1_id = q9_r1_id.getId();
        int q9_rb2_id = q9_r2_id.getId();
        int q9_rb3_id = q9_r3_id.getId();
        int q9_rb4_id = q9_r4_id.getId();
        int q9_rb5_id = q9_r5_id.getId();

        RadioGroup q10_radioGroup = (RadioGroup) findViewById(R.id.q10_rg);
        int q10_checkedId = q10_radioGroup.getCheckedRadioButtonId();
        RadioButton q10_r1_id = (RadioButton)findViewById(R.id.radioButton_10);
        RadioButton q10_r2_id = (RadioButton)findViewById(R.id.radioButton2_10);
        RadioButton q10_r3_id = (RadioButton)findViewById(R.id.radioButton3_10);
        RadioButton q10_r4_id = (RadioButton)findViewById(R.id.radioButton4_10);
        RadioButton q10_r5_id = (RadioButton)findViewById(R.id.radioButton5_10);
        int q10_rb1_id = q10_r1_id.getId();
        int q10_rb2_id = q10_r2_id.getId();
        int q10_rb3_id = q10_r3_id.getId();
        int q10_rb4_id = q10_r4_id.getId();
        int q10_rb5_id = q10_r5_id.getId();

        RadioGroup q11_radioGroup = (RadioGroup) findViewById(R.id.q11_rg);
        int q11_checkedId = q11_radioGroup.getCheckedRadioButtonId();
        RadioButton q11_r1_id = (RadioButton)findViewById(R.id.radioButton_11);
        RadioButton q11_r2_id = (RadioButton)findViewById(R.id.radioButton2_11);
        RadioButton q11_r3_id = (RadioButton)findViewById(R.id.radioButton3_11);
        RadioButton q11_r4_id = (RadioButton)findViewById(R.id.radioButton4_11);
        RadioButton q11_r5_id = (RadioButton)findViewById(R.id.radioButton5_11);
        int q11_rb1_id = q11_r1_id.getId();
        int q11_rb2_id = q11_r2_id.getId();
        int q11_rb3_id = q11_r3_id.getId();
        int q11_rb4_id = q11_r4_id.getId();
        int q11_rb5_id = q11_r5_id.getId();

        RadioGroup q12_radioGroup = (RadioGroup) findViewById(R.id.q12_rg);
        int q12_checkedId = q12_radioGroup.getCheckedRadioButtonId();
        RadioButton q12_r1_id = (RadioButton)findViewById(R.id.radioButton_12);
        RadioButton q12_r2_id = (RadioButton)findViewById(R.id.radioButton2_12);
        RadioButton q12_r3_id = (RadioButton)findViewById(R.id.radioButton3_12);
        RadioButton q12_r4_id = (RadioButton)findViewById(R.id.radioButton4_12);
        RadioButton q12_r5_id = (RadioButton)findViewById(R.id.radioButton5_12);
        int q12_rb1_id = q12_r1_id.getId();
        int q12_rb2_id = q12_r2_id.getId();
        int q12_rb3_id = q12_r3_id.getId();
        int q12_rb4_id = q12_r4_id.getId();
        int q12_rb5_id = q12_r5_id.getId();

        RadioGroup q13_radioGroup = (RadioGroup) findViewById(R.id.q13_rg);
        int q13_checkedId = q13_radioGroup.getCheckedRadioButtonId();
        RadioButton q13_r1_id = (RadioButton)findViewById(R.id.radioButton_13);
        RadioButton q13_r2_id = (RadioButton)findViewById(R.id.radioButton2_13);
        RadioButton q13_r3_id = (RadioButton)findViewById(R.id.radioButton3_13);
        RadioButton q13_r4_id = (RadioButton)findViewById(R.id.radioButton4_13);
        RadioButton q13_r5_id = (RadioButton)findViewById(R.id.radioButton5_13);
        int q13_rb1_id = q13_r1_id.getId();
        int q13_rb2_id = q13_r2_id.getId();
        int q13_rb3_id = q13_r3_id.getId();
        int q13_rb4_id = q13_r4_id.getId();
        int q13_rb5_id = q13_r5_id.getId();

        RadioGroup q14_radioGroup = (RadioGroup) findViewById(R.id.q14_rg);
        int q14_checkedId = q14_radioGroup.getCheckedRadioButtonId();
        RadioButton q14_r1_id = (RadioButton)findViewById(R.id.radioButton_14);
        RadioButton q14_r2_id = (RadioButton)findViewById(R.id.radioButton2_14);
        RadioButton q14_r3_id = (RadioButton)findViewById(R.id.radioButton3_14);
        RadioButton q14_r4_id = (RadioButton)findViewById(R.id.radioButton4_14);
        RadioButton q14_r5_id = (RadioButton)findViewById(R.id.radioButton5_14);
        int q14_rb1_id = q14_r1_id.getId();
        int q14_rb2_id = q14_r2_id.getId();
        int q14_rb3_id = q14_r3_id.getId();
        int q14_rb4_id = q14_r4_id.getId();
        int q14_rb5_id = q14_r5_id.getId();

        RadioGroup q15_radioGroup = (RadioGroup) findViewById(R.id.q15_rg);
        int q15_checkedId = q15_radioGroup.getCheckedRadioButtonId();
        RadioButton q15_r1_id = (RadioButton)findViewById(R.id.radioButton_15);
        RadioButton q15_r2_id = (RadioButton)findViewById(R.id.radioButton2_15);
        RadioButton q15_r3_id = (RadioButton)findViewById(R.id.radioButton3_15);
        RadioButton q15_r4_id = (RadioButton)findViewById(R.id.radioButton4_15);
        RadioButton q15_r5_id = (RadioButton)findViewById(R.id.radioButton5_15);
        int q15_rb1_id = q15_r1_id.getId();
        int q15_rb2_id = q15_r2_id.getId();
        int q15_rb3_id = q15_r3_id.getId();
        int q15_rb4_id = q15_r4_id.getId();
        int q15_rb5_id = q15_r5_id.getId();

        RadioGroup q16_radioGroup = (RadioGroup) findViewById(R.id.q16_rg);
        int q16_checkedId = q16_radioGroup.getCheckedRadioButtonId();
        RadioButton q16_r1_id = (RadioButton)findViewById(R.id.radioButton_16);
        RadioButton q16_r2_id = (RadioButton)findViewById(R.id.radioButton2_16);
        RadioButton q16_r3_id = (RadioButton)findViewById(R.id.radioButton3_16);
        RadioButton q16_r4_id = (RadioButton)findViewById(R.id.radioButton4_16);
        RadioButton q16_r5_id = (RadioButton)findViewById(R.id.radioButton5_16);
        int q16_rb1_id = q16_r1_id.getId();
        int q16_rb2_id = q16_r2_id.getId();
        int q16_rb3_id = q16_r3_id.getId();
        int q16_rb4_id = q16_r4_id.getId();
        int q16_rb5_id = q16_r5_id.getId();

        RadioGroup q17_radioGroup = (RadioGroup) findViewById(R.id.q17_rg);
        int q17_checkedId = q17_radioGroup.getCheckedRadioButtonId();
        RadioButton q17_r1_id = (RadioButton)findViewById(R.id.radioButton_17);
        RadioButton q17_r2_id = (RadioButton)findViewById(R.id.radioButton2_17);
        RadioButton q17_r3_id = (RadioButton)findViewById(R.id.radioButton3_17);
        RadioButton q17_r4_id = (RadioButton)findViewById(R.id.radioButton4_17);
        RadioButton q17_r5_id = (RadioButton)findViewById(R.id.radioButton5_17);
        int q17_rb1_id = q17_r1_id.getId();
        int q17_rb2_id = q17_r2_id.getId();
        int q17_rb3_id = q17_r3_id.getId();
        int q17_rb4_id = q17_r4_id.getId();
        int q17_rb5_id = q17_r5_id.getId();

        RadioGroup q18_radioGroup = (RadioGroup) findViewById(R.id.q18_rg);
        int q18_checkedId = q18_radioGroup.getCheckedRadioButtonId();
        RadioButton q18_r1_id = (RadioButton)findViewById(R.id.radioButton_18);
        RadioButton q18_r2_id = (RadioButton)findViewById(R.id.radioButton2_18);
        RadioButton q18_r3_id = (RadioButton)findViewById(R.id.radioButton3_18);
        RadioButton q18_r4_id = (RadioButton)findViewById(R.id.radioButton4_18);
        RadioButton q18_r5_id = (RadioButton)findViewById(R.id.radioButton5_18);
        int q18_rb1_id = q18_r1_id.getId();
        int q18_rb2_id = q18_r2_id.getId();
        int q18_rb3_id = q18_r3_id.getId();
        int q18_rb4_id = q18_r4_id.getId();
        int q18_rb5_id = q18_r5_id.getId();

        RadioGroup q19_radioGroup = (RadioGroup) findViewById(R.id.q19_rg);
        int q19_checkedId = q19_radioGroup.getCheckedRadioButtonId();
        RadioButton q19_r1_id = (RadioButton)findViewById(R.id.radioButton_19);
        RadioButton q19_r2_id = (RadioButton)findViewById(R.id.radioButton2_19);
        RadioButton q19_r3_id = (RadioButton)findViewById(R.id.radioButton3_19);
        RadioButton q19_r4_id = (RadioButton)findViewById(R.id.radioButton4_19);
        RadioButton q19_r5_id = (RadioButton)findViewById(R.id.radioButton5_19);
        int q19_rb1_id = q19_r1_id.getId();
        int q19_rb2_id = q19_r2_id.getId();
        int q19_rb3_id = q19_r3_id.getId();
        int q19_rb4_id = q19_r4_id.getId();
        int q19_rb5_id = q19_r5_id.getId();

        RadioGroup q20_radioGroup = (RadioGroup) findViewById(R.id.q20_rg);
        int q20_checkedId = q20_radioGroup.getCheckedRadioButtonId();
        RadioButton q20_r1_id = (RadioButton)findViewById(R.id.radioButton_20);
        RadioButton q20_r2_id = (RadioButton)findViewById(R.id.radioButton2_20);
        RadioButton q20_r3_id = (RadioButton)findViewById(R.id.radioButton3_20);
        RadioButton q20_r4_id = (RadioButton)findViewById(R.id.radioButton4_20);
        RadioButton q20_r5_id = (RadioButton)findViewById(R.id.radioButton5_20);
        int q20_rb1_id = q20_r1_id.getId();
        int q20_rb2_id = q20_r2_id.getId();
        int q20_rb3_id = q20_r3_id.getId();
        int q20_rb4_id = q20_r4_id.getId();
        int q20_rb5_id = q20_r5_id.getId();




        Intent intent = new Intent(this, test_r.class);

        intent.putExtra("q1_answer",q1_checkedId);
        intent.putExtra("q1_1_setId",q1_1_rb_id);
        intent.putExtra("q1_2_setId",q1_2_rb_id);
        intent.putExtra("q1_3_setId",q1_3_rb_id);
        intent.putExtra("q1_4_setId",q1_4_rb_id);
        intent.putExtra("q1_5_setId",q1_5_rb_id);

        intent.putExtra("q2_answer",q2_checkedId);
        intent.putExtra("q2_rb1_setId",q2_rb1_id);
        intent.putExtra("q2_rb2_setId",q2_rb2_id);
        intent.putExtra("q2_rb3_setId",q2_rb3_id);
        intent.putExtra("q2_rb4_setId",q2_rb4_id);
        intent.putExtra("q2_rb5_setId",q2_rb5_id);

        intent.putExtra("q3_answer",q3_checkedId);
        intent.putExtra("q3_rb1_setId",q3_rb1_id);
        intent.putExtra("q3_rb2_setId",q3_rb2_id);
        intent.putExtra("q3_rb3_setId",q3_rb3_id);
        intent.putExtra("q3_rb4_setId",q3_rb4_id);
        intent.putExtra("q3_rb5_setId",q3_rb5_id);

        intent.putExtra("q4_answer",q4_checkedId);
        intent.putExtra("q4_rb1_setId",q4_rb1_id);
        intent.putExtra("q4_rb2_setId",q4_rb2_id);
        intent.putExtra("q4_rb3_setId",q4_rb3_id);
        intent.putExtra("q4_rb4_setId",q4_rb4_id);
        intent.putExtra("q4_rb5_setId",q4_rb5_id);

        intent.putExtra("q5_answer",q5_checkedId);
        intent.putExtra("q5_rb1_setId",q5_rb1_id);
        intent.putExtra("q5_rb2_setId",q5_rb2_id);
        intent.putExtra("q5_rb3_setId",q5_rb3_id);
        intent.putExtra("q5_rb4_setId",q5_rb4_id);
        intent.putExtra("q5_rb5_setId",q5_rb5_id);

        intent.putExtra("q6_answer",q6_checkedId);
        intent.putExtra("q6_rb1_setId",q6_rb1_id);
        intent.putExtra("q6_rb2_setId",q6_rb2_id);
        intent.putExtra("q6_rb3_setId",q6_rb3_id);
        intent.putExtra("q6_rb4_setId",q6_rb4_id);
        intent.putExtra("q6_rb5_setId",q6_rb5_id);

        intent.putExtra("q7_answer",q7_checkedId);
        intent.putExtra("q7_rb1_setId",q7_rb1_id);
        intent.putExtra("q7_rb2_setId",q7_rb2_id);
        intent.putExtra("q7_rb3_setId",q7_rb3_id);
        intent.putExtra("q7_rb4_setId",q7_rb4_id);
        intent.putExtra("q7_rb5_setId",q7_rb5_id);


        intent.putExtra("q8_answer",q8_checkedId);
        intent.putExtra("q8_rb1_setId",q8_rb1_id);
        intent.putExtra("q8_rb2_setId",q8_rb2_id);
        intent.putExtra("q8_rb3_setId",q8_rb3_id);
        intent.putExtra("q8_rb4_setId",q8_rb4_id);
        intent.putExtra("q8_rb5_setId",q8_rb5_id);


        intent.putExtra("q9_answer",q9_checkedId);
        intent.putExtra("q9_rb1_setId",q9_rb1_id);
        intent.putExtra("q9_rb2_setId",q9_rb2_id);
        intent.putExtra("q9_rb3_setId",q9_rb3_id);
        intent.putExtra("q9_rb4_setId",q9_rb4_id);
        intent.putExtra("q9_rb5_setId",q9_rb5_id);

        intent.putExtra("q10_answer",q10_checkedId);
        intent.putExtra("q10_rb1_setId",q10_rb1_id);
        intent.putExtra("q10_rb2_setId",q10_rb2_id);
        intent.putExtra("q10_rb3_setId",q10_rb3_id);
        intent.putExtra("q10_rb4_setId",q10_rb4_id);
        intent.putExtra("q10_rb5_setId",q10_rb5_id);

        intent.putExtra("q11_answer",q11_checkedId);
        intent.putExtra("q11_rb1_setId",q11_rb1_id);
        intent.putExtra("q11_rb2_setId",q11_rb2_id);
        intent.putExtra("q11_rb3_setId",q11_rb3_id);
        intent.putExtra("q11_rb4_setId",q11_rb4_id);
        intent.putExtra("q11_rb5_setId",q11_rb5_id);


        intent.putExtra("q12_answer",q12_checkedId);
        intent.putExtra("q12_rb1_setId",q12_rb1_id);
        intent.putExtra("q12_rb2_setId",q12_rb2_id);
        intent.putExtra("q12_rb3_setId",q12_rb3_id);
        intent.putExtra("q12_rb4_setId",q12_rb4_id);
        intent.putExtra("q12_rb5_setId",q12_rb5_id);

        intent.putExtra("q13_answer",q13_checkedId);
        intent.putExtra("q13_rb1_setId",q13_rb1_id);
        intent.putExtra("q13_rb2_setId",q13_rb2_id);
        intent.putExtra("q13_rb3_setId",q13_rb3_id);
        intent.putExtra("q13_rb4_setId",q13_rb4_id);
        intent.putExtra("q13_rb5_setId",q13_rb5_id);

        intent.putExtra("q14_answer",q14_checkedId);
        intent.putExtra("q14_rb1_setId",q14_rb1_id);
        intent.putExtra("q14_rb2_setId",q14_rb2_id);
        intent.putExtra("q14_rb3_setId",q14_rb3_id);
        intent.putExtra("q14_rb4_setId",q14_rb4_id);
        intent.putExtra("q14_rb5_setId",q14_rb5_id);

        intent.putExtra("q15_answer",q15_checkedId);
        intent.putExtra("q15_rb1_setId",q15_rb1_id);
        intent.putExtra("q15_rb2_setId",q15_rb2_id);
        intent.putExtra("q15_rb3_setId",q15_rb3_id);
        intent.putExtra("q15_rb4_setId",q15_rb4_id);
        intent.putExtra("q15_rb5_setId",q15_rb5_id);

        intent.putExtra("q16_answer",q16_checkedId);
        intent.putExtra("q16_rb1_setId",q16_rb1_id);
        intent.putExtra("q16_rb2_setId",q16_rb2_id);
        intent.putExtra("q16_rb3_setId",q16_rb3_id);
        intent.putExtra("q16_rb4_setId",q16_rb4_id);
        intent.putExtra("q16_rb5_setId",q16_rb5_id);

        intent.putExtra("q17_answer",q17_checkedId);
        intent.putExtra("q17_rb1_setId",q17_rb1_id);
        intent.putExtra("q17_rb2_setId",q17_rb2_id);
        intent.putExtra("q17_rb3_setId",q17_rb3_id);
        intent.putExtra("q17_rb4_setId",q17_rb4_id);
        intent.putExtra("q17_rb5_setId",q17_rb5_id);

        intent.putExtra("q18_answer",q18_checkedId);
        intent.putExtra("q18_rb1_setId",q18_rb1_id);
        intent.putExtra("q18_rb2_setId",q18_rb2_id);
        intent.putExtra("q18_rb3_setId",q18_rb3_id);
        intent.putExtra("q18_rb4_setId",q18_rb4_id);
        intent.putExtra("q18_rb5_setId",q18_rb5_id);

        intent.putExtra("q19_answer",q19_checkedId);
        intent.putExtra("q19_rb1_setId",q19_rb1_id);
        intent.putExtra("q19_rb2_setId",q19_rb2_id);
        intent.putExtra("q19_rb3_setId",q19_rb3_id);
        intent.putExtra("q19_rb4_setId",q19_rb4_id);
        intent.putExtra("q19_rb5_setId",q19_rb5_id);


        intent.putExtra("q20_answer",q20_checkedId);
        intent.putExtra("q20_rb1_setId",q20_rb1_id);
        intent.putExtra("q20_rb2_setId",q20_rb2_id);
        intent.putExtra("q20_rb3_setId",q20_rb3_id);
        intent.putExtra("q20_rb4_setId",q20_rb4_id);
        intent.putExtra("q20_rb5_setId",q20_rb5_id);


        startActivity(intent);
    }
    /*

     ここまで

     */
}
