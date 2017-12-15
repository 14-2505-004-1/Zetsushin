package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class test_r extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_r);
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
        Intent intent_test = getIntent();


        RadioGroup q1_radioGroup_r = (RadioGroup) findViewById(R.id.q1_rg_r);
        int q1_checkedId_r = q1_radioGroup_r.getCheckedRadioButtonId();

        RadioButton q1_1_id_r = (RadioButton)findViewById(R.id.radioButton_r);
        RadioButton q1_2_id_r = (RadioButton)findViewById(R.id.radioButton2_r);
        RadioButton q1_3_id_r = (RadioButton)findViewById(R.id.radioButton3_r);
        RadioButton q1_4_id_r = (RadioButton)findViewById(R.id.radioButton4_r);
        RadioButton q1_5_id_r = (RadioButton)findViewById(R.id.radioButton5_r);
        int q1_1_rb_id_r = q1_1_id_r.getId();
        int q1_2_rb_id_r = q1_2_id_r.getId();
        int q1_3_rb_id_r = q1_3_id_r.getId();
        int q1_4_rb_id_r = q1_4_id_r.getId();
        int q1_5_rb_id_r = q1_5_id_r.getId();



        RadioGroup q2_radioGroup_r = (RadioGroup) findViewById(R.id.q2_rg_r);
        int q2_checkedId_r = q2_radioGroup_r.getCheckedRadioButtonId();
        RadioButton q2_r1_id_r = (RadioButton)findViewById(R.id.radioButton_2_r);
        RadioButton q2_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_2_r);
        RadioButton q2_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_2_r);
        RadioButton q2_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_2_r);
        RadioButton q2_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_2_r);
        int q2_rb1_id_r = q2_r1_id_r.getId();
        int q2_rb2_id_r = q2_r2_id_r.getId();
        int q2_rb3_id_r = q2_r3_id_r.getId();
        int q2_rb4_id_r= q2_r4_id_r.getId();
        int q2_rb5_id_r = q2_r5_id_r.getId();

        RadioGroup q3_radioGroup_r = (RadioGroup) findViewById(R.id.q3_rg_r);
        int q3_checkedId_r = q3_radioGroup_r.getCheckedRadioButtonId();
        RadioButton q3_r1_id_r = (RadioButton)findViewById(R.id.radioButton_3_r);
        RadioButton q3_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_3_r);
        RadioButton q3_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_3_r);
        RadioButton q3_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_3_r);
        RadioButton q3_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_3_r);
        int q3_rb1_id_r = q3_r1_id_r.getId();
        int q3_rb2_id_r = q3_r2_id_r.getId();
        int q3_rb3_id_r = q3_r3_id_r.getId();
        int q3_rb4_id_r = q3_r4_id_r.getId();
        int q3_rb5_id_r = q3_r5_id_r.getId();

        RadioGroup q4_radioGroup_r = (RadioGroup) findViewById(R.id.q4_rg_r);
        int q4_checkedId_r = q4_radioGroup_r.getCheckedRadioButtonId();
        RadioButton q4_r1_id_r = (RadioButton)findViewById(R.id.radioButton_4_r);
        RadioButton q4_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_4_r);
        RadioButton q4_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_4_r);
        RadioButton q4_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_4_r);
        RadioButton q4_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_4_r);
        int q4_rb1_id_r = q4_r1_id_r.getId();
        int q4_rb2_id_r = q4_r2_id_r.getId();
        int q4_rb3_id_r = q4_r3_id_r.getId();
        int q4_rb4_id_r = q4_r4_id_r.getId();
        int q4_rb5_id_r = q4_r5_id_r.getId();

        RadioGroup q5_radioGroup_r = (RadioGroup) findViewById(R.id.q5_rg_r);
        int q5_checkedId_r = q5_radioGroup_r.getCheckedRadioButtonId();
        RadioButton q5_r1_id_r = (RadioButton)findViewById(R.id.radioButton_5_r);
        RadioButton q5_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_5_r);
        RadioButton q5_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_5_r);
        RadioButton q5_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_5_r);
        RadioButton q5_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_5_r);
        int q5_rb1_id_r = q5_r1_id_r.getId();
        int q5_rb2_id_r = q5_r2_id_r.getId();
        int q5_rb3_id_r = q5_r3_id_r.getId();
        int q5_rb4_id_r = q5_r4_id_r.getId();
        int q5_rb5_id_r = q5_r5_id_r.getId();

        RadioGroup q6_radioGroup_r = (RadioGroup) findViewById(R.id.q6_rg_r);
        int q6_checkedId_r = q6_radioGroup_r.getCheckedRadioButtonId();
        RadioButton q6_r1_id = (RadioButton)findViewById(R.id.radioButton_6_r);
        RadioButton q6_r2_id = (RadioButton)findViewById(R.id.radioButton2_6_r);
        RadioButton q6_r3_id = (RadioButton)findViewById(R.id.radioButton3_6_r);
        RadioButton q6_r4_id = (RadioButton)findViewById(R.id.radioButton4_6_r);
        RadioButton q6_r5_id = (RadioButton)findViewById(R.id.radioButton5_6_r);
        int q6_rb1_id = q6_r1_id.getId();
        int q6_rb2_id = q6_r2_id.getId();
        int q6_rb3_id = q6_r3_id.getId();
        int q6_rb4_id = q6_r4_id.getId();
        int q6_rb5_id = q6_r5_id.getId();

        RadioGroup q7_radioGroup = (RadioGroup) findViewById(R.id.q7_rg_r);
        int q7_checkedId_r = q7_radioGroup.getCheckedRadioButtonId();
        RadioButton q7_r1_id_r = (RadioButton)findViewById(R.id.radioButton_7_r);
        RadioButton q7_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_7_r);
        RadioButton q7_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_7_r);
        RadioButton q7_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_7_r);
        RadioButton q7_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_7_r);
        int q7_rb1_id_r = q7_r1_id_r.getId();
        int q7_rb2_id_r = q7_r2_id_r.getId();
        int q7_rb3_id_r = q7_r3_id_r.getId();
        int q7_rb4_id_r = q7_r4_id_r.getId();
        int q7_rb5_id_r = q7_r5_id_r.getId();


        RadioGroup q8_radioGroup = (RadioGroup) findViewById(R.id.q8_rg_r);
        int q8_checkedId_r = q8_radioGroup.getCheckedRadioButtonId();
        RadioButton q8_r1_id_r= (RadioButton)findViewById(R.id.radioButton_8_r);
        RadioButton q8_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_8_r);
        RadioButton q8_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_8_r);
        RadioButton q8_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_8_r);
        RadioButton q8_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_8_r);
        int q8_rb1_id_r = q8_r1_id_r.getId();
        int q8_rb2_id_r = q8_r2_id_r.getId();
        int q8_rb3_id_r = q8_r3_id_r.getId();
        int q8_rb4_id_r = q8_r4_id_r.getId();
        int q8_rb5_id_r = q8_r5_id_r.getId();

        RadioGroup q9_radioGroup = (RadioGroup) findViewById(R.id.q9_rg_r);
        int q9_checkedId_r = q9_radioGroup.getCheckedRadioButtonId();
        RadioButton q9_r1_id_r = (RadioButton)findViewById(R.id.radioButton_9_r);
        RadioButton q9_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_9_r);
        RadioButton q9_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_9_r);
        RadioButton q9_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_9_r);
        RadioButton q9_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_9_r);
        int q9_rb1_id_r = q9_r1_id_r.getId();
        int q9_rb2_id_r = q9_r2_id_r.getId();
        int q9_rb3_id_r = q9_r3_id_r.getId();
        int q9_rb4_id_r = q9_r4_id_r.getId();
        int q9_rb5_id_r = q9_r5_id_r.getId();

        RadioGroup q10_radioGroup = (RadioGroup) findViewById(R.id.q10_rg_r);
        int q10_checkedId_r = q10_radioGroup.getCheckedRadioButtonId();
        RadioButton q10_r1_id_r = (RadioButton)findViewById(R.id.radioButton_10_r);
        RadioButton q10_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_10_r);
        RadioButton q10_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_10_r);
        RadioButton q10_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_10_r);
        RadioButton q10_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_10_r);
        int q10_rb1_id_r = q10_r1_id_r.getId();
        int q10_rb2_id_r = q10_r2_id_r.getId();
        int q10_rb3_id_r = q10_r3_id_r.getId();
        int q10_rb4_id_r = q10_r4_id_r.getId();
        int q10_rb5_id_r = q10_r5_id_r.getId();

        RadioGroup q11_radioGroup = (RadioGroup) findViewById(R.id.q11_rg_r);
        int q11_checkedId_r = q11_radioGroup.getCheckedRadioButtonId();
        RadioButton q11_r1_id_r = (RadioButton)findViewById(R.id.radioButton_11_r);
        RadioButton q11_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_11_r);
        RadioButton q11_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_11_r);
        RadioButton q11_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_11_r);
        RadioButton q11_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_11_r);
        int q11_rb1_id_r = q11_r1_id_r.getId();
        int q11_rb2_id_r = q11_r2_id_r.getId();
        int q11_rb3_id_r = q11_r3_id_r.getId();
        int q11_rb4_id_r = q11_r4_id_r.getId();
        int q11_rb5_id_r = q11_r5_id_r.getId();

        RadioGroup q12_radioGroup = (RadioGroup) findViewById(R.id.q12_rg_r);
        int q12_checkedId_r = q12_radioGroup.getCheckedRadioButtonId();
        RadioButton q12_r1_id_r = (RadioButton)findViewById(R.id.radioButton_12_r);
        RadioButton q12_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_12_r);
        RadioButton q12_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_12_r);
        RadioButton q12_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_12_r);
        RadioButton q12_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_12_r);
        int q12_rb1_id_r = q12_r1_id_r.getId();
        int q12_rb2_id_r = q12_r2_id_r.getId();
        int q12_rb3_id_r = q12_r3_id_r.getId();
        int q12_rb4_id_r = q12_r4_id_r.getId();
        int q12_rb5_id_r = q12_r5_id_r.getId();

        RadioGroup q13_radioGroup = (RadioGroup) findViewById(R.id.q13_rg_r);
        int q13_checkedId_r = q13_radioGroup.getCheckedRadioButtonId();
        RadioButton q13_r1_id_r = (RadioButton)findViewById(R.id.radioButton_13_r);
        RadioButton q13_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_13_r);
        RadioButton q13_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_13_r);
        RadioButton q13_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_13_r);
        RadioButton q13_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_13_r);
        int q13_rb1_id_r = q13_r1_id_r.getId();
        int q13_rb2_id_r = q13_r2_id_r.getId();
        int q13_rb3_id_r = q13_r3_id_r.getId();
        int q13_rb4_id_r = q13_r4_id_r.getId();
        int q13_rb5_id_r = q13_r5_id_r.getId();

        RadioGroup q14_radioGroup = (RadioGroup) findViewById(R.id.q14_rg_r);
        int q14_checkedId_r = q14_radioGroup.getCheckedRadioButtonId();
        RadioButton q14_r1_id_r = (RadioButton)findViewById(R.id.radioButton_14_r);
        RadioButton q14_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_14_r);
        RadioButton q14_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_14_r);
        RadioButton q14_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_14_r);
        RadioButton q14_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_14_r);
        int q14_rb1_id_r = q14_r1_id_r.getId();
        int q14_rb2_id_r = q14_r2_id_r.getId();
        int q14_rb3_id_r = q14_r3_id_r.getId();
        int q14_rb4_id_r = q14_r4_id_r.getId();
        int q14_rb5_id_r = q14_r5_id_r.getId();

        RadioGroup q15_radioGroup = (RadioGroup) findViewById(R.id.q15_rg_r);
        int q15_checkedId_r = q15_radioGroup.getCheckedRadioButtonId();
        RadioButton q15_r1_id_r = (RadioButton)findViewById(R.id.radioButton_15_r);
        RadioButton q15_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_15_r);
        RadioButton q15_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_15_r);
        RadioButton q15_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_15_r);
        RadioButton q15_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_15_r);
        int q15_rb1_id_r = q15_r1_id_r.getId();
        int q15_rb2_id_r = q15_r2_id_r.getId();
        int q15_rb3_id_r = q15_r3_id_r.getId();
        int q15_rb4_id_r = q15_r4_id_r.getId();
        int q15_rb5_id_r = q15_r5_id_r.getId();

        RadioGroup q16_radioGroup = (RadioGroup) findViewById(R.id.q16_rg_r);
        int q16_checkedId_r = q16_radioGroup.getCheckedRadioButtonId();
        RadioButton q16_r1_id_r = (RadioButton)findViewById(R.id.radioButton_16_r);
        RadioButton q16_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_16_r);
        RadioButton q16_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_16_r);
        RadioButton q16_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_16_r);
        RadioButton q16_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_16_r);
        int q16_rb1_id_r = q16_r1_id_r.getId();
        int q16_rb2_id_r = q16_r2_id_r.getId();
        int q16_rb3_id_r = q16_r3_id_r.getId();
        int q16_rb4_id_r = q16_r4_id_r.getId();
        int q16_rb5_id_r = q16_r5_id_r.getId();

        RadioGroup q17_radioGroup = (RadioGroup) findViewById(R.id.q17_rg_r);
        int q17_checkedId_r = q17_radioGroup.getCheckedRadioButtonId();
        RadioButton q17_r1_id_r = (RadioButton)findViewById(R.id.radioButton_17_r);
        RadioButton q17_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_17_r);
        RadioButton q17_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_17_r);
        RadioButton q17_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_17_r);
        RadioButton q17_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_17_r);
        int q17_rb1_id_r = q17_r1_id_r.getId();
        int q17_rb2_id_r = q17_r2_id_r.getId();
        int q17_rb3_id_r = q17_r3_id_r.getId();
        int q17_rb4_id_r = q17_r4_id_r.getId();
        int q17_rb5_id_r = q17_r5_id_r.getId();

        RadioGroup q18_radioGroup = (RadioGroup) findViewById(R.id.q18_rg_r);
        int q18_checkedId_r = q18_radioGroup.getCheckedRadioButtonId();
        RadioButton q18_r1_id_r = (RadioButton)findViewById(R.id.radioButton_18_r);
        RadioButton q18_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_18_r);
        RadioButton q18_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_18_r);
        RadioButton q18_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_18_r);
        RadioButton q18_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_18_r);
        int q18_rb1_id_r = q18_r1_id_r.getId();
        int q18_rb2_id_r = q18_r2_id_r.getId();
        int q18_rb3_id_r = q18_r3_id_r.getId();
        int q18_rb4_id_r = q18_r4_id_r.getId();
        int q18_rb5_id_r = q18_r5_id_r.getId();

        RadioGroup q19_radioGroup = (RadioGroup) findViewById(R.id.q19_rg_r);
        int q19_checkedId_r = q19_radioGroup.getCheckedRadioButtonId();
        RadioButton q19_r1_id_r = (RadioButton)findViewById(R.id.radioButton_19_r);
        RadioButton q19_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_19_r);
        RadioButton q19_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_19_r);
        RadioButton q19_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_19_r);
        RadioButton q19_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_19_r);
        int q19_rb1_id_r = q19_r1_id_r.getId();
        int q19_rb2_id_r = q19_r2_id_r.getId();
        int q19_rb3_id_r = q19_r3_id_r.getId();
        int q19_rb4_id_r = q19_r4_id_r.getId();
        int q19_rb5_id_r = q19_r5_id_r.getId();

        RadioGroup q20_radioGroup = (RadioGroup) findViewById(R.id.q20_rg_r);
        int q20_checkedId_r = q20_radioGroup.getCheckedRadioButtonId();
        RadioButton q20_r1_id_r = (RadioButton)findViewById(R.id.radioButton_20_r);
        RadioButton q20_r2_id_r = (RadioButton)findViewById(R.id.radioButton2_20_r);
        RadioButton q20_r3_id_r = (RadioButton)findViewById(R.id.radioButton3_20_r);
        RadioButton q20_r4_id_r = (RadioButton)findViewById(R.id.radioButton4_20_r);
        RadioButton q20_r5_id_r = (RadioButton)findViewById(R.id.radioButton5_20_r);
        int q20_rb1_id_r = q20_r1_id_r.getId();
        int q20_rb2_id_r = q20_r2_id_r.getId();
        int q20_rb3_id_r = q20_r3_id_r.getId();
        int q20_rb4_id_r = q20_r4_id_r.getId();
        int q20_rb5_id_r = q20_r5_id_r.getId();




        Intent intent = new Intent(this, confusion_ver2.class);

        intent.putExtra("q1_answer_r",q1_checkedId_r);
        intent.putExtra("q1_1_setId_r",q1_1_rb_id_r);
        intent.putExtra("q1_2_setId_r",q1_2_rb_id_r);
        intent.putExtra("q1_3_setId_r",q1_3_rb_id_r);
        intent.putExtra("q1_4_setId_r",q1_4_rb_id_r);
        intent.putExtra("q1_5_setId_r",q1_5_rb_id_r);

        intent.putExtra("q2_answer_r",q2_checkedId_r);
        intent.putExtra("q2_rb1_setId_r",q2_rb1_id_r);
        intent.putExtra("q2_rb2_setId_r",q2_rb2_id_r);
        intent.putExtra("q2_rb3_setId_r",q2_rb3_id_r);
        intent.putExtra("q2_rb4_setId_r",q2_rb4_id_r);
        intent.putExtra("q2_rb5_setId_r",q2_rb5_id_r);

        intent.putExtra("q3_answer_r",q3_checkedId_r);
        intent.putExtra("q3_rb1_setId_r",q3_rb1_id_r);
        intent.putExtra("q3_rb2_setId_r",q3_rb2_id_r);
        intent.putExtra("q3_rb3_setId_r",q3_rb3_id_r);
        intent.putExtra("q3_rb4_setId_r",q3_rb4_id_r);
        intent.putExtra("q3_rb5_setId_r",q3_rb5_id_r);

        intent.putExtra("q4_answer_r",q4_checkedId_r);
        intent.putExtra("q4_rb1_setId_r",q4_rb1_id_r);
        intent.putExtra("q4_rb2_setId_r",q4_rb2_id_r);
        intent.putExtra("q4_rb3_setId_r",q4_rb3_id_r);
        intent.putExtra("q4_rb4_setId_r",q4_rb4_id_r);
        intent.putExtra("q4_rb5_setId_r",q4_rb5_id_r);

        intent.putExtra("q5_answer_r",q5_checkedId_r);
        intent.putExtra("q5_rb1_setId_r",q5_rb1_id_r);
        intent.putExtra("q5_rb2_setId_r",q5_rb2_id_r);
        intent.putExtra("q5_rb3_setId_r",q5_rb3_id_r);
        intent.putExtra("q5_rb4_setId_r",q5_rb4_id_r);
        intent.putExtra("q5_rb5_setId_r",q5_rb5_id_r);

        intent.putExtra("q6_answer_r",q6_checkedId_r);
        intent.putExtra("q6_rb1_setId_r",q6_rb1_id);
        intent.putExtra("q6_rb2_setId_r",q6_rb2_id);
        intent.putExtra("q6_rb3_setId_r",q6_rb3_id);
        intent.putExtra("q6_rb4_setId_r",q6_rb4_id);
        intent.putExtra("q6_rb5_setId_r",q6_rb5_id);

        intent.putExtra("q7_answer_r",q7_checkedId_r);
        intent.putExtra("q7_rb1_setId_r",q7_rb1_id_r);
        intent.putExtra("q7_rb2_setId_r",q7_rb2_id_r);
        intent.putExtra("q7_rb3_setId_r",q7_rb3_id_r);
        intent.putExtra("q7_rb4_setId_r",q7_rb4_id_r);
        intent.putExtra("q7_rb5_setId_r",q7_rb5_id_r);


        intent.putExtra("q8_answer_r",q8_checkedId_r);
        intent.putExtra("q8_rb1_setId_r",q8_rb1_id_r);
        intent.putExtra("q8_rb2_setId_r",q8_rb2_id_r);
        intent.putExtra("q8_rb3_setId_r",q8_rb3_id_r);
        intent.putExtra("q8_rb4_setId_r",q8_rb4_id_r);
        intent.putExtra("q8_rb5_setId_r",q8_rb5_id_r);


        intent.putExtra("q9_answer_r",q9_checkedId_r);
        intent.putExtra("q9_rb1_setId_r",q9_rb1_id_r);
        intent.putExtra("q9_rb2_setId_r",q9_rb2_id_r);
        intent.putExtra("q9_rb3_setId_r",q9_rb3_id_r);
        intent.putExtra("q9_rb4_setId_r",q9_rb4_id_r);
        intent.putExtra("q9_rb5_setId_r",q9_rb5_id_r);

        intent.putExtra("q10_answer_r",q10_checkedId_r);
        intent.putExtra("q10_rb1_setId_r",q10_rb1_id_r);
        intent.putExtra("q10_rb2_setId_r",q10_rb2_id_r);
        intent.putExtra("q10_rb3_setId_r",q10_rb3_id_r);
        intent.putExtra("q10_rb4_setId_r",q10_rb4_id_r);
        intent.putExtra("q10_rb5_setId_r",q10_rb5_id_r);

        intent.putExtra("q11_answer_r",q11_checkedId_r);
        intent.putExtra("q11_rb1_setId_r",q11_rb1_id_r);
        intent.putExtra("q11_rb2_setId_r",q11_rb2_id_r);
        intent.putExtra("q11_rb3_setId_r",q11_rb3_id_r);
        intent.putExtra("q11_rb4_setId_r",q11_rb4_id_r);
        intent.putExtra("q11_rb5_setId_r",q11_rb5_id_r);


        intent.putExtra("q12_answer_r",q12_checkedId_r);
        intent.putExtra("q12_rb1_setId_r",q12_rb1_id_r);
        intent.putExtra("q12_rb2_setId_r",q12_rb2_id_r);
        intent.putExtra("q12_rb3_setId_r",q12_rb3_id_r);
        intent.putExtra("q12_rb4_setId_r",q12_rb4_id_r);
        intent.putExtra("q12_rb5_setId_r",q12_rb5_id_r);

        intent.putExtra("q13_answer_r",q13_checkedId_r);
        intent.putExtra("q13_rb1_setId_r",q13_rb1_id_r);
        intent.putExtra("q13_rb2_setId_r",q13_rb2_id_r);
        intent.putExtra("q13_rb3_setId_r",q13_rb3_id_r);
        intent.putExtra("q13_rb4_setId_r",q13_rb4_id_r);
        intent.putExtra("q13_rb5_setId_r",q13_rb5_id_r);

        intent.putExtra("q14_answer_r",q14_checkedId_r);
        intent.putExtra("q14_rb1_setId_r",q14_rb1_id_r);
        intent.putExtra("q14_rb2_setId_r",q14_rb2_id_r);
        intent.putExtra("q14_rb3_setId_r",q14_rb3_id_r);
        intent.putExtra("q14_rb4_setId_r",q14_rb4_id_r);
        intent.putExtra("q14_rb5_setId_r",q14_rb5_id_r);

        intent.putExtra("q15_answer_r",q15_checkedId_r);
        intent.putExtra("q15_rb1_setId_r",q15_rb1_id_r);
        intent.putExtra("q15_rb2_setId_r",q15_rb2_id_r);
        intent.putExtra("q15_rb3_setId_r",q15_rb3_id_r);
        intent.putExtra("q15_rb4_setId_r",q15_rb4_id_r);
        intent.putExtra("q15_rb5_setId_r",q15_rb5_id_r);

        intent.putExtra("q16_answer_r",q16_checkedId_r);
        intent.putExtra("q16_rb1_setId_r",q16_rb1_id_r);
        intent.putExtra("q16_rb2_setId_r",q16_rb2_id_r);
        intent.putExtra("q16_rb3_setId_r",q16_rb3_id_r);
        intent.putExtra("q16_rb4_setId_r",q16_rb4_id_r);
        intent.putExtra("q16_rb5_setId_r",q16_rb5_id_r);

        intent.putExtra("q17_answer_r",q17_checkedId_r);
        intent.putExtra("q17_rb1_setId_r",q17_rb1_id_r);
        intent.putExtra("q17_rb2_setId_r",q17_rb2_id_r);
        intent.putExtra("q17_rb3_setId_r",q17_rb3_id_r);
        intent.putExtra("q17_rb4_setId_r",q17_rb4_id_r);
        intent.putExtra("q17_rb5_setId_r",q17_rb5_id_r);

        intent.putExtra("q18_answer_r",q18_checkedId_r);
        intent.putExtra("q18_rb1_setId_r",q18_rb1_id_r);
        intent.putExtra("q18_rb2_setId_r",q18_rb2_id_r);
        intent.putExtra("q18_rb3_setId_r",q18_rb3_id_r);
        intent.putExtra("q18_rb4_setId_r",q18_rb4_id_r);
        intent.putExtra("q18_rb5_setId_r",q18_rb5_id_r);

        intent.putExtra("q19_answer_r",q19_checkedId_r);
        intent.putExtra("q19_rb1_setId_r",q19_rb1_id_r);
        intent.putExtra("q19_rb2_setId_r",q19_rb2_id_r);
        intent.putExtra("q19_rb3_setId_r",q19_rb3_id_r);
        intent.putExtra("q19_rb4_setId_r",q19_rb4_id_r);
        intent.putExtra("q19_rb5_setId_r",q19_rb5_id_r);


        intent.putExtra("q20_answer_r",q20_checkedId_r);
        intent.putExtra("q20_rb1_setId_r",q20_rb1_id_r);
        intent.putExtra("q20_rb2_setId_r",q20_rb2_id_r);
        intent.putExtra("q20_rb3_setId_r",q20_rb3_id_r);
        intent.putExtra("q20_rb4_setId_r",q20_rb4_id_r);
        intent.putExtra("q20_rb5_setId_r",q20_rb5_id_r);


        /**/

        intent.putExtra("q1_answer",intent_test.getIntExtra("q1_answer",0));
        intent.putExtra("q1_1_setId",intent_test.getIntExtra("q1_1_setId",0));
        intent.putExtra("q1_2_setId",intent_test.getIntExtra("q1_2_setId",0));
        intent.putExtra("q1_3_setId",intent_test.getIntExtra("q1_3_setId",0));
        intent.putExtra("q1_4_setId",intent_test.getIntExtra("q1_4_setId",0));
        intent.putExtra("q1_5_setId",intent_test.getIntExtra("q1_5_setId",0));

        intent.putExtra("q2_answer",intent_test.getIntExtra("q2_answer",0));
        intent.putExtra("q2_rb1_setId",intent_test.getIntExtra("q2_rb1_setId",0));
        intent.putExtra("q2_rb2_setId",intent_test.getIntExtra("q2_rb2_setId",0));
        intent.putExtra("q2_rb3_setId",intent_test.getIntExtra("q2_rb3_setId",0));
        intent.putExtra("q2_rb4_setId",intent_test.getIntExtra("q2_rb4_setId",0));
        intent.putExtra("q2_rb5_setId",intent_test.getIntExtra("q2_rb5_setId",0));

        intent.putExtra("q3_answer",intent_test.getIntExtra("q3_answer",0));
        intent.putExtra("q3_rb1_setId",intent_test.getIntExtra("q3_rb1_setId",0));
        intent.putExtra("q3_rb2_setId",intent_test.getIntExtra("q3_rb2_setId",0));
        intent.putExtra("q3_rb3_setId",intent_test.getIntExtra("q3_rb3_setId",0));
        intent.putExtra("q3_rb4_setId",intent_test.getIntExtra("q3_rb4_setId",0));
        intent.putExtra("q3_rb5_setId",intent_test.getIntExtra("q3_rb5_setId",0));

        intent.putExtra("q4_answer",intent_test.getIntExtra("q4_answer",0));
        intent.putExtra("q4_rb1_setId",intent_test.getIntExtra("q4_rb1_setId",0));
        intent.putExtra("q4_rb2_setId",intent_test.getIntExtra("q4_rb2_setId",0));
        intent.putExtra("q4_rb3_setId",intent_test.getIntExtra("q4_rb3_setId",0));
        intent.putExtra("q4_rb4_setId",intent_test.getIntExtra("q4_rb4_setId",0));
        intent.putExtra("q4_rb5_setId",intent_test.getIntExtra("q4_rb5_setId",0));

        intent.putExtra("q5_answer",intent_test.getIntExtra("q5_answer",0));
        intent.putExtra("q5_rb1_setId",intent_test.getIntExtra("q5_rb1_setId",0));
        intent.putExtra("q5_rb2_setId",intent_test.getIntExtra("q5_rb2_setId",0));
        intent.putExtra("q5_rb3_setId",intent_test.getIntExtra("q5_rb3_setId",0));
        intent.putExtra("q5_rb4_setId",intent_test.getIntExtra("q5_rb4_setId",0));
        intent.putExtra("q5_rb5_setId",intent_test.getIntExtra("q5_rb5_setId",0));

        intent.putExtra("q6_answer",intent_test.getIntExtra("q6_answer",0));
        intent.putExtra("q6_rb1_setId",intent_test.getIntExtra("q6_rb1_setId",0));
        intent.putExtra("q6_rb2_setId",intent_test.getIntExtra("q6_rb2_setId",0));
        intent.putExtra("q6_rb3_setId",intent_test.getIntExtra("q6_rb3_setId",0));
        intent.putExtra("q6_rb4_setId",intent_test.getIntExtra("q6_rb4_setId",0));
        intent.putExtra("q6_rb5_setId",intent_test.getIntExtra("q6_rb5_setId",0));

        intent.putExtra("q7_answer",intent_test.getIntExtra("q7_answer",0));
        intent.putExtra("q7_rb1_setId",intent_test.getIntExtra("q7_rb1_setId",0));
        intent.putExtra("q7_rb2_setId",intent_test.getIntExtra("q7_rb2_setId",0));
        intent.putExtra("q7_rb3_setId",intent_test.getIntExtra("q7_rb3_setId",0));
        intent.putExtra("q7_rb4_setId",intent_test.getIntExtra("q7_rb4_setId",0));
        intent.putExtra("q7_rb5_setId",intent_test.getIntExtra("q7_rb5_setId",0));


        intent.putExtra("q8_answer",intent_test.getIntExtra("q8_answer",0));
        intent.putExtra("q8_rb1_setId",intent_test.getIntExtra("q8_rb1_setId",0));
        intent.putExtra("q8_rb2_setId",intent_test.getIntExtra("q8_rb2_setId",0));
        intent.putExtra("q8_rb3_setId",intent_test.getIntExtra("q8_rb3_setId",0));
        intent.putExtra("q8_rb4_setId",intent_test.getIntExtra("q8_rb4_setId",0));
        intent.putExtra("q8_rb5_setId",intent_test.getIntExtra("q8_rb5_setId",0));

        intent.putExtra("q9_answer",intent_test.getIntExtra("q9_answer",0));
        intent.putExtra("q9_rb1_setId",intent_test.getIntExtra("q9_rb1_setId",0));
        intent.putExtra("q9_rb2_setId",intent_test.getIntExtra("q9_rb2_setId",0));
        intent.putExtra("q9_rb3_setId",intent_test.getIntExtra("q9_rb3_setId",0));
        intent.putExtra("q9_rb4_setId",intent_test.getIntExtra("q9_rb4_setId",0));
        intent.putExtra("q9_rb5_setId",intent_test.getIntExtra("q9_rb5_setId",0));

        intent.putExtra("q10_answer",intent_test.getIntExtra("q10_answer",0));
        intent.putExtra("q10_rb1_setId",intent_test.getIntExtra("q10_rb1_setId",0));
        intent.putExtra("q10_rb2_setId",intent_test.getIntExtra("q10_rb2_setId",0));
        intent.putExtra("q10_rb3_setId",intent_test.getIntExtra("q10_rb3_setId",0));
        intent.putExtra("q10_rb4_setId",intent_test.getIntExtra("q10_rb4setId",0));
        intent.putExtra("q10_rb5_setId",intent_test.getIntExtra("q10_rb5setId",0));

        intent.putExtra("q11_answer",intent_test.getIntExtra("q11_answer",0));
        intent.putExtra("q11_rb1_setId",intent_test.getIntExtra("q11_rb1_setId",0));
        intent.putExtra("q11_rb2_setId",intent_test.getIntExtra("q11_rb2_setId",0));
        intent.putExtra("q11_rb3_setId",intent_test.getIntExtra("q11_rb3_setId",0));
        intent.putExtra("q11_rb4_setId",intent_test.getIntExtra("q11_rb4_setId",0));
        intent.putExtra("q11_rb5_setId",intent_test.getIntExtra("q11_rb5_setId",0));

        intent.putExtra("q12_answer",intent_test.getIntExtra("q12_answer",0));
        intent.putExtra("q12_rb1_setId",intent_test.getIntExtra("q12_rb1_setId",0));
        intent.putExtra("q12_rb2_setId",intent_test.getIntExtra("q12_rb2_setId",0));
        intent.putExtra("q12_rb3_setId",intent_test.getIntExtra("q12_rb3_setId",0));
        intent.putExtra("q12_rb4_setId",intent_test.getIntExtra("q12_rb4_setId",0));
        intent.putExtra("q12_rb5_setId",intent_test.getIntExtra("q12_rb5_setId",0));

        intent.putExtra("q13_answer",intent_test.getIntExtra("q13_answer",0));
        intent.putExtra("q13_rb1_setId",intent_test.getIntExtra("q13_rb1_setId",0));
        intent.putExtra("q13_rb2_setId",intent_test.getIntExtra("q13_rb2_setId",0));
        intent.putExtra("q13_rb3_setId",intent_test.getIntExtra("q13_rb3_setId",0));
        intent.putExtra("q13_rb4_setId",intent_test.getIntExtra("q13_rb4_setId",0));
        intent.putExtra("q13_rb5_setId",intent_test.getIntExtra("q13_rb5_setId",0));

        intent.putExtra("q14_answer",intent_test.getIntExtra("q14_answer",0));
        intent.putExtra("q14_rb1_setId",intent_test.getIntExtra("q14_rb1_setId",0));
        intent.putExtra("q14_rb2_setId",intent_test.getIntExtra("q14_rb2_setId",0));
        intent.putExtra("q14_rb3_setId",intent_test.getIntExtra("q14_rb3_setId",0));
        intent.putExtra("q14_rb4_setId",intent_test.getIntExtra("q14_rb4_setId",0));
        intent.putExtra("q14_rb5_setId",intent_test.getIntExtra("q14_rb5_setId",0));

        intent.putExtra("q15_answer",intent_test.getIntExtra("q15_answer",0));
        intent.putExtra("q15_rb1_setId",intent_test.getIntExtra("q15_rb1_setId",0));
        intent.putExtra("q15_rb2_setId",intent_test.getIntExtra("q15_rb2_setId",0));
        intent.putExtra("q15_rb3_setId",intent_test.getIntExtra("q15_rb3_setId",0));
        intent.putExtra("q15_rb4_setId",intent_test.getIntExtra("q15_rb4_setId",0));
        intent.putExtra("q15_rb5_setId",intent_test.getIntExtra("q15_rb5_setId",0));

        intent.putExtra("q16_answer",intent_test.getIntExtra("q16_answer",0));
        intent.putExtra("q16_rb1_setId",intent_test.getIntExtra("q16_rb1_setId",0));
        intent.putExtra("q16_rb2_setId",intent_test.getIntExtra("q16_rb2_setId",0));
        intent.putExtra("q16_rb3_setId",intent_test.getIntExtra("q16_rb3_setId",0));
        intent.putExtra("q16_rb4_setId",intent_test.getIntExtra("q16_rb4_setId",0));
        intent.putExtra("q16_rb5_setId",intent_test.getIntExtra("q16_rb5_setId",0));

        intent.putExtra("q17_answer",intent_test.getIntExtra("q17_answer",0));
        intent.putExtra("q17_rb1_setId",intent_test.getIntExtra("q17_rb1_setId",0));
        intent.putExtra("q17_rb2_setId",intent_test.getIntExtra("q17_rb2_setId",0));
        intent.putExtra("q17_rb3_setId",intent_test.getIntExtra("q17_rb3_setId",0));
        intent.putExtra("q17_rb4_setId",intent_test.getIntExtra("q17_rb4_setId",0));
        intent.putExtra("q17_rb5_setId",intent_test.getIntExtra("q17_rb5_setId",0));

        intent.putExtra("q18_answer",intent_test.getIntExtra("q18_answer",0));
        intent.putExtra("q18_rb1_setId",intent_test.getIntExtra("q18_rb1_setId",0));
        intent.putExtra("q18_rb2_setId",intent_test.getIntExtra("q18_rb2_setId",0));
        intent.putExtra("q18_rb3_setId",intent_test.getIntExtra("q18_rb3_setId",0));
        intent.putExtra("q18_rb4_setId",intent_test.getIntExtra("q18_rb4_setId",0));
        intent.putExtra("q18_rb5_setId",intent_test.getIntExtra("q18_rb5_setId",0));

        intent.putExtra("q19_answer",intent_test.getIntExtra("q19_answer",0));
        intent.putExtra("q19_rb1_setId",intent_test.getIntExtra("q19_rb1_setId",0));
        intent.putExtra("q19_rb2_setId",intent_test.getIntExtra("q19_rb2_setId",0));
        intent.putExtra("q19_rb3_setId",intent_test.getIntExtra("q19_rb3_setId",0));
        intent.putExtra("q19_rb4_setId",intent_test.getIntExtra("q19_rb4_setId",0));
        intent.putExtra("q19_rb5_setId",intent_test.getIntExtra("q19_rb5_setId",0));

        intent.putExtra("q20_answer",intent_test.getIntExtra("q20_answer",0));
        intent.putExtra("q20_rb1_setId",intent_test.getIntExtra("q20_rb1_setId",0));
        intent.putExtra("q20_rb2_setId",intent_test.getIntExtra("q20_rb2_setId",0));
        intent.putExtra("q20_rb3_setId",intent_test.getIntExtra("q20_rb3_setId",0));
        intent.putExtra("q20_rb4_setId",intent_test.getIntExtra("q20_rb4_setId",0));
        intent.putExtra("q20_rb5_setId",intent_test.getIntExtra("q20_rb5_setId",0));

        startActivity(intent);
    }
    /*

     ここまで

     */
    @Override
    public void onBackPressed(){

    }
}
