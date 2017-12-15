package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class result_all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_all);

        Intent intent = getIntent();

int sum = 0;
int sum_r = 0;

        int q1_a = intent.getIntExtra("q1_answer",0);
        int q1_1_rb_id = intent.getIntExtra("q1_1_setId",0);
        int q1_2_rb_id = intent.getIntExtra("q1_2_setId",0);
        int q1_3_rb_id = intent.getIntExtra("q1_3_setId",0);
        int q1_4_rb_id = intent.getIntExtra("q1_4_setId",0);
        int q1_5_rb_id = intent.getIntExtra("q1_5_setId",0);

        RadioGroup rg_q1_r=(RadioGroup) findViewById(R.id.q1_rg_r);
        rg_q1_r.check(q1_a);
        RadioButton rb_q1_1 = (RadioButton)findViewById(R.id.radioButton);
        RadioButton rb_q1_2 = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton rb_q1_3 = (RadioButton)findViewById(R.id.radioButton3);
        RadioButton rb_q1_4 = (RadioButton)findViewById(R.id.radioButton4);
        RadioButton rb_q1_5 = (RadioButton)findViewById(R.id.radioButton5);
        if(q1_a==q1_1_rb_id) {
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_2_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_3_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_4.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_4_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_5.setEnabled(false);
        }else if(q1_a==q1_5_rb_id){
            rb_q1_1.setEnabled(false);
            rb_q1_2.setEnabled(false);
            rb_q1_3.setEnabled(false);
            rb_q1_4.setEnabled(false);
        }
        int q5_a_r = intent.getIntExtra("q5_answer_r",0);
        int q5_rb1_id_r = intent.getIntExtra("q5_rb1_setId_r",0);
        int q5_rb2_id_r = intent.getIntExtra("q5_rb2_setId_r",0);
        int q5_rb3_id_r = intent.getIntExtra("q5_rb3_setId_r",0);
        int q5_rb4_id_r = intent.getIntExtra("q5_rb4_setId_r",0);
        int q5_rb5_id_r = intent.getIntExtra("q5_rb5_setId_r",0);
        RadioGroup rg_q5_r1=(RadioGroup) findViewById(R.id.q1_rg_r1);
/*^^;q1→r5*/        rg_q5_r1.check(q5_a_r);
        RadioButton rb_q5_1_r = (RadioButton)findViewById(R.id.radioButton_r);
        RadioButton rb_q5_2_r = (RadioButton)findViewById(R.id.radioButton2_r);
        RadioButton rb_q5_3_r = (RadioButton)findViewById(R.id.radioButton3_r);
        RadioButton rb_q5_4_r = (RadioButton)findViewById(R.id.radioButton4_r);
        RadioButton rb_q5_5_r = (RadioButton)findViewById(R.id.radioButton5_r);
        if(q5_a_r==q5_rb1_id_r) {
            rg_q5_r1.check(R.id.radioButton_r);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb2_id_r){
            rb_q5_1_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton2_r);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb3_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton3_r);
            rb_q5_4_r.setEnabled(false);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb4_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton4_r);
            rb_q5_5_r.setEnabled(false);
        }else if(q5_a_r==q5_rb5_id_r){
            rb_q5_1_r.setEnabled(false);
            rb_q5_2_r.setEnabled(false);
            rb_q5_3_r.setEnabled(false);
            rb_q5_4_r.setEnabled(false);
            rg_q5_r1.check(R.id.radioButton5_r);
        }

        if(q1_a==q1_2_rb_id && q5_a_r==q5_rb1_id_r
                || q1_a==q1_3_rb_id && q5_a_r==q5_rb2_id_r
                || q1_a==q1_4_rb_id && q5_a_r==q5_rb4_id_r
                || q1_a==q1_5_rb_id && q5_a_r==q5_rb5_id_r){
            ConstraintLayout layout_q1 = (ConstraintLayout) findViewById(R.id.q1_back);
            layout_q1.setBackgroundResource(R.color.not_not);
        }

        if(q1_a==q1_1_rb_id)    sum=sum+5;if(q5_a_r==q5_rb3_id_r)    sum_r=sum_r+5;

        int q2_a = intent.getIntExtra("q2_answer",0);
        int q2_rb1_id = intent.getIntExtra("q2_rb1_setId",0);
        int q2_rb2_id = intent.getIntExtra("q2_rb2_setId",0);
        int q2_rb3_id = intent.getIntExtra("q2_rb3_setId",0);
        int q2_rb4_id = intent.getIntExtra("q2_rb4_setId",0);
        int q2_rb5_id = intent.getIntExtra("q2_rb5_setId",0);

        RadioGroup rg_q2_r=(RadioGroup) findViewById(R.id.q2_rg_r);

        RadioButton rb_q2_1 = (RadioButton)findViewById(R.id.radioButton_q2);
        RadioButton rb_q2_2 = (RadioButton)findViewById(R.id.radioButton2_q2);
        RadioButton rb_q2_3 = (RadioButton)findViewById(R.id.radioButton3_q2);
        RadioButton rb_q2_4 = (RadioButton)findViewById(R.id.radioButton4_q2);
        RadioButton rb_q2_5 = (RadioButton)findViewById(R.id.radioButton5_q2);
        if(q2_a==q2_rb1_id) {
            rg_q2_r.check(R.id.radioButton_q2);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb2_id){
            rb_q2_1.setEnabled(false);
            rg_q2_r.check(R.id.radioButton2_q2);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb3_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rg_q2_r.check(R.id.radioButton3_q2);
            rb_q2_4.setEnabled(false);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb4_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rg_q2_r.check(R.id.radioButton4_q2);
            rb_q2_5.setEnabled(false);
        }else if(q2_a==q2_rb5_id){
            rb_q2_1.setEnabled(false);
            rb_q2_2.setEnabled(false);
            rb_q2_3.setEnabled(false);
            rb_q2_4.setEnabled(false);
            rg_q2_r.check(R.id.radioButton5_q2);
        }
        int q11_a_r = intent.getIntExtra("q11_answer_r",0);
        int q11_rb1_id_r = intent.getIntExtra("q11_rb1_setId_r",0);
        int q11_rb2_id_r = intent.getIntExtra("q11_rb2_setId_r",0);
        int q11_rb3_id_r = intent.getIntExtra("q11_rb3_setId_r",0);
        int q11_rb4_id_r = intent.getIntExtra("q11_rb4_setId_r",0);
        int q11_rb5_id_r = intent.getIntExtra("q11_rb5_setId_r",0);
        RadioGroup rg_q11_r1=(RadioGroup) findViewById(R.id.q2_rg_r1);
/*^^;q2→r11*/        rg_q11_r1.check(q11_a_r);
        RadioButton rb_q11_1_r = (RadioButton)findViewById(R.id.radioButton_r_q2);
        RadioButton rb_q11_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q2);
        RadioButton rb_q11_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q2);
        RadioButton rb_q11_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q2);
        RadioButton rb_q11_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q2);
        if(q11_a_r==q11_rb1_id_r) {
            rg_q11_r1.check(R.id.radioButton_r_q2);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb2_id_r){
            rb_q11_1_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton2_r_q2);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb3_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton3_r_q2);
            rb_q11_4_r.setEnabled(false);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb4_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton4_r_q2);
            rb_q11_5_r.setEnabled(false);
        }else if(q11_a_r==q11_rb5_id_r){
            rb_q11_1_r.setEnabled(false);
            rb_q11_2_r.setEnabled(false);
            rb_q11_3_r.setEnabled(false);
            rb_q11_4_r.setEnabled(false);
            rg_q11_r1.check(R.id.radioButton5_r_q2);
        }

        if(q2_a==q2_rb2_id && q11_a_r==q11_rb3_id_r
                || q2_a==q2_rb3_id && q11_a_r==q11_rb4_id_r
                || q2_a==q2_rb4_id && q11_a_r==q11_rb1_id_r
                || q2_a==q2_rb5_id && q11_a_r==q11_rb4_id_r){
            ConstraintLayout layout_q2 = (ConstraintLayout) findViewById(R.id.q2_back);
            layout_q2.setBackgroundResource(R.color.not_not);
        }

        if(q2_a==q2_rb1_id)    sum=sum+5;if(q11_a_r==q11_rb5_id_r)    sum_r=sum_r+5;

        int q3_a = intent.getIntExtra("q3_answer",0);
        int q3_rb1_id = intent.getIntExtra("q3_rb1_setId",0);
        int q3_rb2_id = intent.getIntExtra("q3_rb2_setId",0);
        int q3_rb3_id = intent.getIntExtra("q3_rb3_setId",0);
        int q3_rb4_id = intent.getIntExtra("q3_rb4_setId",0);
        int q3_rb5_id = intent.getIntExtra("q3_rb5_setId",0);

        RadioGroup rg_q3_r=(RadioGroup) findViewById(R.id.q3_rg_r);

        RadioButton rb_q3_1 = (RadioButton)findViewById(R.id.radioButton_q3);
        RadioButton rb_q3_2 = (RadioButton)findViewById(R.id.radioButton2_q3);
        RadioButton rb_q3_3 = (RadioButton)findViewById(R.id.radioButton3_q3);
        RadioButton rb_q3_4 = (RadioButton)findViewById(R.id.radioButton4_q3);
        RadioButton rb_q3_5 = (RadioButton)findViewById(R.id.radioButton5_q3);
        if(q3_a==q3_rb1_id) {
            rg_q3_r.check(R.id.radioButton_q3);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb2_id){
            rb_q3_1.setEnabled(false);
            rg_q3_r.check(R.id.radioButton2_q3);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb3_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rg_q3_r.check(R.id.radioButton3_q3);
            rb_q3_4.setEnabled(false);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb4_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rg_q3_r.check(R.id.radioButton4_q3);
            rb_q3_5.setEnabled(false);
        }else if(q3_a==q3_rb5_id){
            rb_q3_1.setEnabled(false);
            rb_q3_2.setEnabled(false);
            rb_q3_3.setEnabled(false);
            rb_q3_4.setEnabled(false);
            rg_q3_r.check(R.id.radioButton5_q3);
        }
        int q4_a_r = intent.getIntExtra("q4_answer_r",0);
        int q4_rb1_id_r = intent.getIntExtra("q4_rb1_setId_r",0);
        int q4_rb2_id_r = intent.getIntExtra("q4_rb2_setId_r",0);
        int q4_rb3_id_r = intent.getIntExtra("q4_rb3_setId_r",0);
        int q4_rb4_id_r = intent.getIntExtra("q4_rb4_setId_r",0);
        int q4_rb5_id_r = intent.getIntExtra("q4_rb5_setId_r",0);
        RadioGroup rg_q4_r1=(RadioGroup) findViewById(R.id.q3_rg_r1);
/*^^;q3→r11*/        rg_q4_r1.check(q4_a_r);
        RadioButton rb_q4_1_r = (RadioButton)findViewById(R.id.radioButton_r_q3);
        RadioButton rb_q4_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q3);
        RadioButton rb_q4_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q3);
        RadioButton rb_q4_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q3);
        RadioButton rb_q4_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q3);
        if(q4_a_r==q4_rb1_id_r) {
            rg_q4_r1.check(R.id.radioButton_r_q3);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb2_id_r){
            rb_q4_1_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton2_r_q3);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb3_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton3_r_q3);
            rb_q4_4_r.setEnabled(false);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb4_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton4_r_q3);
            rb_q4_5_r.setEnabled(false);
        }else if(q4_a_r==q4_rb5_id_r){
            rb_q4_1_r.setEnabled(false);
            rb_q4_2_r.setEnabled(false);
            rb_q4_3_r.setEnabled(false);
            rb_q4_4_r.setEnabled(false);
            rg_q4_r1.check(R.id.radioButton5_r_q3);
        }

        if(q3_a==q3_rb1_id && q4_a_r==q4_rb5_id_r
                || q3_a==q3_rb2_id && q4_a_r==q4_rb1_id_r
                || q3_a==q3_rb3_id && q4_a_r==q4_rb3_id_r
                || q3_a==q3_rb5_id && q4_a_r==q4_rb4_id_r){
            ConstraintLayout layout_q3 = (ConstraintLayout) findViewById(R.id.q3_back);
            layout_q3.setBackgroundResource(R.color.not_not);
        }

        if(q3_a==q3_rb4_id)    sum=sum+5;if(q4_a_r==q4_rb2_id_r)    sum_r=sum_r+5;


        int q4_a = intent.getIntExtra("q4_answer",0);
        int q4_rb1_id = intent.getIntExtra("q4_rb1_setId",0);
        int q4_rb2_id = intent.getIntExtra("q4_rb2_setId",0);
        int q4_rb3_id = intent.getIntExtra("q4_rb3_setId",0);
        int q4_rb4_id = intent.getIntExtra("q4_rb4_setId",0);
        int q4_rb5_id = intent.getIntExtra("q4_rb5_setId",0);

        RadioGroup rg_q4_r=(RadioGroup) findViewById(R.id.q4_rg_r);

        RadioButton rb_q4_1 = (RadioButton)findViewById(R.id.radioButton_q4);
        RadioButton rb_q4_2 = (RadioButton)findViewById(R.id.radioButton2_q4);
        RadioButton rb_q4_3 = (RadioButton)findViewById(R.id.radioButton3_q4);
        RadioButton rb_q4_4 = (RadioButton)findViewById(R.id.radioButton4_q4);
        RadioButton rb_q4_5 = (RadioButton)findViewById(R.id.radioButton5_q4);
        if(q4_a==q4_rb1_id) {
            rg_q4_r.check(R.id.radioButton_q4);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb2_id){
            rb_q4_1.setEnabled(false);
            rg_q4_r.check(R.id.radioButton2_q4);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb3_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rg_q4_r.check(R.id.radioButton3_q4);
            rb_q4_4.setEnabled(false);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb4_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rg_q4_r.check(R.id.radioButton4_q4);
            rb_q4_5.setEnabled(false);
        }else if(q4_a==q4_rb5_id){
            rb_q4_1.setEnabled(false);
            rb_q4_2.setEnabled(false);
            rb_q4_3.setEnabled(false);
            rb_q4_4.setEnabled(false);
            rg_q4_r.check(R.id.radioButton5_q4);
        }
        int q9_a_r = intent.getIntExtra("q9_answer_r",0);
        int q9_rb1_id_r = intent.getIntExtra("q9_rb1_setId_r",0);
        int q9_rb2_id_r = intent.getIntExtra("q9_rb2_setId_r",0);
        int q9_rb3_id_r = intent.getIntExtra("q9_rb3_setId_r",0);
        int q9_rb4_id_r = intent.getIntExtra("q9_rb4_setId_r",0);
        int q9_rb5_id_r = intent.getIntExtra("q9_rb5_setId_r",0);
        RadioGroup rg_q9_r1=(RadioGroup) findViewById(R.id.q4_rg_r1);
/*^^;q4→r11*/        rg_q9_r1.check(q9_a_r);
        RadioButton rb_q9_1_r = (RadioButton)findViewById(R.id.radioButton_r_q4);
        RadioButton rb_q9_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q4);
        RadioButton rb_q9_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q4);
        RadioButton rb_q9_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q4);
        RadioButton rb_q9_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q4);
        if(q9_a_r==q9_rb1_id_r) {
            rg_q9_r1.check(R.id.radioButton_r_q4);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb2_id_r){
            rb_q9_1_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton2_r_q4);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb3_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton3_r_q4);
            rb_q9_4_r.setEnabled(false);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb4_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton4_r_q4);
            rb_q9_5_r.setEnabled(false);
        }else if(q9_a_r==q9_rb5_id_r){
            rb_q9_1_r.setEnabled(false);
            rb_q9_2_r.setEnabled(false);
            rb_q9_3_r.setEnabled(false);
            rb_q9_4_r.setEnabled(false);
            rg_q9_r1.check(R.id.radioButton5_r_q4);
        }

        if(q4_a==q4_rb1_id && q9_a_r==q9_rb4_id_r
                || q4_a==q4_rb3_id && q9_a_r==q9_rb5_id_r
                || q4_a==q4_rb4_id && q9_a_r==q9_rb1_id_r
                || q4_a==q4_rb5_id && q9_a_r==q9_rb3_id_r){
            ConstraintLayout layout_q4 = (ConstraintLayout) findViewById(R.id.q4_back);
            layout_q4.setBackgroundResource(R.color.not_not);
        }

        if(q4_a==q4_rb2_id)    sum=sum+5;if(q9_a_r==q9_rb2_id_r)    sum_r=sum_r+5;

        int q5_a = intent.getIntExtra("q5_answer",0);
        int q5_rb1_id = intent.getIntExtra("q5_rb1_setId",0);
        int q5_rb2_id = intent.getIntExtra("q5_rb2_setId",0);
        int q5_rb3_id = intent.getIntExtra("q5_rb3_setId",0);
        int q5_rb4_id = intent.getIntExtra("q5_rb4_setId",0);
        int q5_rb5_id = intent.getIntExtra("q5_rb5_setId",0);

        RadioGroup rg_q5_r=(RadioGroup) findViewById(R.id.q5_rg_r);

        RadioButton rb_q5_1 = (RadioButton)findViewById(R.id.radioButton_q5);
        RadioButton rb_q5_2 = (RadioButton)findViewById(R.id.radioButton2_q5);
        RadioButton rb_q5_3 = (RadioButton)findViewById(R.id.radioButton3_q5);
        RadioButton rb_q5_4 = (RadioButton)findViewById(R.id.radioButton4_q5);
        RadioButton rb_q5_5 = (RadioButton)findViewById(R.id.radioButton5_q5);
        if(q5_a==q5_rb1_id) {
            rg_q5_r.check(R.id.radioButton_q5);
            rb_q5_2.setEnabled(false);
            rb_q5_3.setEnabled(false);
            rb_q5_4.setEnabled(false);
            rb_q5_5.setEnabled(false);
        }else if(q5_a==q5_rb2_id){
            rb_q5_1.setEnabled(false);
            rg_q5_r.check(R.id.radioButton2_q5);
            rb_q5_3.setEnabled(false);
            rb_q5_4.setEnabled(false);
            rb_q5_5.setEnabled(false);
        }else if(q5_a==q5_rb3_id){
            rb_q5_1.setEnabled(false);
            rb_q5_2.setEnabled(false);
            rg_q5_r.check(R.id.radioButton3_q5);
            rb_q5_4.setEnabled(false);
            rb_q5_5.setEnabled(false);
        }else if(q5_a==q5_rb4_id){
            rb_q5_1.setEnabled(false);
            rb_q5_2.setEnabled(false);
            rb_q5_3.setEnabled(false);
            rg_q5_r.check(R.id.radioButton4_q5);
            rb_q5_5.setEnabled(false);
        }else if(q5_a==q5_rb5_id){
            rb_q5_1.setEnabled(false);
            rb_q5_2.setEnabled(false);
            rb_q5_3.setEnabled(false);
            rb_q5_4.setEnabled(false);
            rg_q5_r.check(R.id.radioButton5_q5);
        }
        int q15_a_r = intent.getIntExtra("q15_answer_r",0);
        int q15_rb1_id_r = intent.getIntExtra("q15_rb1_setId_r",0);
        int q15_rb2_id_r = intent.getIntExtra("q15_rb2_setId_r",0);
        int q15_rb3_id_r = intent.getIntExtra("q15_rb3_setId_r",0);
        int q15_rb4_id_r = intent.getIntExtra("q15_rb4_setId_r",0);
        int q15_rb5_id_r = intent.getIntExtra("q15_rb5_setId_r",0);
        RadioGroup rg_q15_r1=(RadioGroup) findViewById(R.id.q5_rg_r1);
/*^^;q5→r11*/        rg_q15_r1.check(q15_a_r);
        RadioButton rb_q15_1_r = (RadioButton)findViewById(R.id.radioButton_r_q5);
        RadioButton rb_q15_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q5);
        RadioButton rb_q15_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q5);
        RadioButton rb_q15_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q5);
        RadioButton rb_q15_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q5);
        if(q15_a_r==q15_rb1_id_r) {
            rg_q15_r1.check(R.id.radioButton_r_q5);
            rb_q15_2_r.setEnabled(false);
            rb_q15_3_r.setEnabled(false);
            rb_q15_4_r.setEnabled(false);
            rb_q15_5_r.setEnabled(false);
        }else if(q15_a_r==q15_rb2_id_r){
            rb_q15_1_r.setEnabled(false);
            rg_q15_r1.check(R.id.radioButton2_r_q5);
            rb_q15_3_r.setEnabled(false);
            rb_q15_4_r.setEnabled(false);
            rb_q15_5_r.setEnabled(false);
        }else if(q15_a_r==q15_rb3_id_r){
            rb_q15_1_r.setEnabled(false);
            rb_q15_2_r.setEnabled(false);
            rg_q15_r1.check(R.id.radioButton3_r_q5);
            rb_q15_4_r.setEnabled(false);
            rb_q15_5_r.setEnabled(false);
        }else if(q15_a_r==q15_rb4_id_r){
            rb_q15_1_r.setEnabled(false);
            rb_q15_2_r.setEnabled(false);
            rb_q15_3_r.setEnabled(false);
            rg_q15_r1.check(R.id.radioButton4_r_q5);
            rb_q15_5_r.setEnabled(false);
        }else if(q15_a_r==q15_rb5_id_r){
            rb_q15_1_r.setEnabled(false);
            rb_q15_2_r.setEnabled(false);
            rb_q15_3_r.setEnabled(false);
            rb_q15_4_r.setEnabled(false);
            rg_q15_r1.check(R.id.radioButton5_r_q5);
        }

        if(q5_a==q5_rb1_id && q15_a_r==q15_rb4_id_r
                || q5_a==q5_rb2_id && q15_a_r==q15_rb1_id_r
                || q5_a==q5_rb3_id && q15_a_r==q15_rb2_id_r
                || q5_a==q5_rb5_id && q15_a_r==q15_rb3_id_r){
            ConstraintLayout layout_q5 = (ConstraintLayout) findViewById(R.id.q5_back);
            layout_q5.setBackgroundResource(R.color.not_not);
        }

        if(q5_a==q5_rb4_id)    sum=sum+5;if(q15_a_r==q15_rb5_id_r)    sum_r=sum_r+5;

        int q6_a = intent.getIntExtra("q6_answer",0);
        int q6_rb1_id = intent.getIntExtra("q6_rb1_setId",0);
        int q6_rb2_id = intent.getIntExtra("q6_rb2_setId",0);
        int q6_rb3_id = intent.getIntExtra("q6_rb3_setId",0);
        int q6_rb4_id = intent.getIntExtra("q6_rb4_setId",0);
        int q6_rb5_id = intent.getIntExtra("q6_rb5_setId",0);

        RadioGroup rg_q6_r=(RadioGroup) findViewById(R.id.q6_rg_r);

        RadioButton rb_q6_1 = (RadioButton)findViewById(R.id.radioButton_q6);
        RadioButton rb_q6_2 = (RadioButton)findViewById(R.id.radioButton2_q6);
        RadioButton rb_q6_3 = (RadioButton)findViewById(R.id.radioButton3_q6);
        RadioButton rb_q6_4 = (RadioButton)findViewById(R.id.radioButton4_q6);
        RadioButton rb_q6_5 = (RadioButton)findViewById(R.id.radioButton5_q6);
        if(q6_a==q6_rb1_id) {
            rg_q6_r.check(R.id.radioButton_q6);
            rb_q6_2.setEnabled(false);
            rb_q6_3.setEnabled(false);
            rb_q6_4.setEnabled(false);
            rb_q6_5.setEnabled(false);
        }else if(q6_a==q6_rb2_id){
            rb_q6_1.setEnabled(false);
            rg_q6_r.check(R.id.radioButton2_q6);
            rb_q6_3.setEnabled(false);
            rb_q6_4.setEnabled(false);
            rb_q6_5.setEnabled(false);
        }else if(q6_a==q6_rb3_id){
            rb_q6_1.setEnabled(false);
            rb_q6_2.setEnabled(false);
            rg_q6_r.check(R.id.radioButton3_q6);
            rb_q6_4.setEnabled(false);
            rb_q6_5.setEnabled(false);
        }else if(q6_a==q6_rb4_id){
            rb_q6_1.setEnabled(false);
            rb_q6_2.setEnabled(false);
            rb_q6_3.setEnabled(false);
            rg_q6_r.check(R.id.radioButton4_q6);
            rb_q6_5.setEnabled(false);
        }else if(q6_a==q6_rb5_id){
            rb_q6_1.setEnabled(false);
            rb_q6_2.setEnabled(false);
            rb_q6_3.setEnabled(false);
            rb_q6_4.setEnabled(false);
            rg_q6_r.check(R.id.radioButton5_q6);
        }
        int q18_a_r = intent.getIntExtra("q18_answer_r",0);
        int q18_rb1_id_r = intent.getIntExtra("q18_rb1_setId_r",0);
        int q18_rb2_id_r = intent.getIntExtra("q18_rb2_setId_r",0);
        int q18_rb3_id_r = intent.getIntExtra("q18_rb3_setId_r",0);
        int q18_rb4_id_r = intent.getIntExtra("q18_rb4_setId_r",0);
        int q18_rb5_id_r = intent.getIntExtra("q18_rb5_setId_r",0);
        RadioGroup rg_q18_r1=(RadioGroup) findViewById(R.id.q6_rg_r1);
/*^^;q6→r11*/        rg_q18_r1.check(q18_a_r);
        RadioButton rb_q18_1_r = (RadioButton)findViewById(R.id.radioButton_r_q6);
        RadioButton rb_q18_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q6);
        RadioButton rb_q18_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q6);
        RadioButton rb_q18_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q6);
        RadioButton rb_q18_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q6);
        if(q18_a_r==q18_rb1_id_r) {
            rg_q18_r1.check(R.id.radioButton_r_q6);
            rb_q18_2_r.setEnabled(false);
            rb_q18_3_r.setEnabled(false);
            rb_q18_4_r.setEnabled(false);
            rb_q18_5_r.setEnabled(false);
        }else if(q18_a_r==q18_rb2_id_r){
            rb_q18_1_r.setEnabled(false);
            rg_q18_r1.check(R.id.radioButton2_r_q6);
            rb_q18_3_r.setEnabled(false);
            rb_q18_4_r.setEnabled(false);
            rb_q18_5_r.setEnabled(false);
        }else if(q18_a_r==q18_rb3_id_r){
            rb_q18_1_r.setEnabled(false);
            rb_q18_2_r.setEnabled(false);
            rg_q18_r1.check(R.id.radioButton3_r_q6);
            rb_q18_4_r.setEnabled(false);
            rb_q18_5_r.setEnabled(false);
        }else if(q18_a_r==q18_rb4_id_r){
            rb_q18_1_r.setEnabled(false);
            rb_q18_2_r.setEnabled(false);
            rb_q18_3_r.setEnabled(false);
            rg_q18_r1.check(R.id.radioButton4_r_q6);
            rb_q18_5_r.setEnabled(false);
        }else if(q18_a_r==q18_rb5_id_r){
            rb_q18_1_r.setEnabled(false);
            rb_q18_2_r.setEnabled(false);
            rb_q18_3_r.setEnabled(false);
            rb_q18_4_r.setEnabled(false);
            rg_q18_r1.check(R.id.radioButton5_r_q6);
        }

        if(q6_a==q6_rb1_id && q18_a_r==q18_rb5_id_r
                || q6_a==q6_rb2_id && q18_a_r==q18_rb1_id_r
                || q6_a==q6_rb3_id && q18_a_r==q18_rb4_id_r
                || q6_a==q6_rb4_id && q18_a_r==q18_rb3_id_r){
            ConstraintLayout layout_q6 = (ConstraintLayout) findViewById(R.id.q6_back);
            layout_q6.setBackgroundResource(R.color.not_not);
        }

        if(q6_a==q6_rb5_id)    sum=sum+5;if(q18_a_r==q18_rb2_id_r)    sum_r=sum_r+5;

        int q7_a = intent.getIntExtra("q7_answer",0);
        int q7_rb1_id = intent.getIntExtra("q7_rb1_setId",0);
        int q7_rb2_id = intent.getIntExtra("q7_rb2_setId",0);
        int q7_rb3_id = intent.getIntExtra("q7_rb3_setId",0);
        int q7_rb4_id = intent.getIntExtra("q7_rb4_setId",0);
        int q7_rb5_id = intent.getIntExtra("q7_rb5_setId",0);

        RadioGroup rg_q7_r=(RadioGroup) findViewById(R.id.q7_rg_r);

        RadioButton rb_q7_1 = (RadioButton)findViewById(R.id.radioButton_q7);
        RadioButton rb_q7_2 = (RadioButton)findViewById(R.id.radioButton2_q7);
        RadioButton rb_q7_3 = (RadioButton)findViewById(R.id.radioButton3_q7);
        RadioButton rb_q7_4 = (RadioButton)findViewById(R.id.radioButton4_q7);
        RadioButton rb_q7_5 = (RadioButton)findViewById(R.id.radioButton5_q7);
        if(q7_a==q7_rb1_id) {
            rg_q7_r.check(R.id.radioButton_q7);
            rb_q7_2.setEnabled(false);
            rb_q7_3.setEnabled(false);
            rb_q7_4.setEnabled(false);
            rb_q7_5.setEnabled(false);
        }else if(q7_a==q7_rb2_id){
            rb_q7_1.setEnabled(false);
            rg_q7_r.check(R.id.radioButton2_q7);
            rb_q7_3.setEnabled(false);
            rb_q7_4.setEnabled(false);
            rb_q7_5.setEnabled(false);
        }else if(q7_a==q7_rb3_id){
            rb_q7_1.setEnabled(false);
            rb_q7_2.setEnabled(false);
            rg_q7_r.check(R.id.radioButton3_q7);
            rb_q7_4.setEnabled(false);
            rb_q7_5.setEnabled(false);
        }else if(q7_a==q7_rb4_id){
            rb_q7_1.setEnabled(false);
            rb_q7_2.setEnabled(false);
            rb_q7_3.setEnabled(false);
            rg_q7_r.check(R.id.radioButton4_q7);
            rb_q7_5.setEnabled(false);
        }else if(q7_a==q7_rb5_id){
            rb_q7_1.setEnabled(false);
            rb_q7_2.setEnabled(false);
            rb_q7_3.setEnabled(false);
            rb_q7_4.setEnabled(false);
            rg_q7_r.check(R.id.radioButton5_q7);
        }
        int q8_a_r = intent.getIntExtra("q8_answer_r",0);
        int q8_rb1_id_r = intent.getIntExtra("q8_rb1_setId_r",0);
        int q8_rb2_id_r = intent.getIntExtra("q8_rb2_setId_r",0);
        int q8_rb3_id_r = intent.getIntExtra("q8_rb3_setId_r",0);
        int q8_rb4_id_r = intent.getIntExtra("q8_rb4_setId_r",0);
        int q8_rb5_id_r = intent.getIntExtra("q8_rb5_setId_r",0);
        RadioGroup rg_q8_r1=(RadioGroup) findViewById(R.id.q7_rg_r1);
/*^^;q7→r11*/        rg_q8_r1.check(q8_a_r);
        RadioButton rb_q8_1_r = (RadioButton)findViewById(R.id.radioButton_r_q7);
        RadioButton rb_q8_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q7);
        RadioButton rb_q8_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q7);
        RadioButton rb_q8_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q7);
        RadioButton rb_q8_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q7);
        if(q8_a_r==q8_rb1_id_r) {
            rg_q8_r1.check(R.id.radioButton_r_q7);
            rb_q8_2_r.setEnabled(false);
            rb_q8_3_r.setEnabled(false);
            rb_q8_4_r.setEnabled(false);
            rb_q8_5_r.setEnabled(false);
        }else if(q8_a_r==q8_rb2_id_r){
            rb_q8_1_r.setEnabled(false);
            rg_q8_r1.check(R.id.radioButton2_r_q7);
            rb_q8_3_r.setEnabled(false);
            rb_q8_4_r.setEnabled(false);
            rb_q8_5_r.setEnabled(false);
        }else if(q8_a_r==q8_rb3_id_r){
            rb_q8_1_r.setEnabled(false);
            rb_q8_2_r.setEnabled(false);
            rg_q8_r1.check(R.id.radioButton3_r_q7);
            rb_q8_4_r.setEnabled(false);
            rb_q8_5_r.setEnabled(false);
        }else if(q8_a_r==q8_rb4_id_r){
            rb_q8_1_r.setEnabled(false);
            rb_q8_2_r.setEnabled(false);
            rb_q8_3_r.setEnabled(false);
            rg_q8_r1.check(R.id.radioButton4_r_q7);
            rb_q8_5_r.setEnabled(false);
        }else if(q8_a_r==q8_rb5_id_r){
            rb_q8_1_r.setEnabled(false);
            rb_q8_2_r.setEnabled(false);
            rb_q8_3_r.setEnabled(false);
            rb_q8_4_r.setEnabled(false);
            rg_q8_r1.check(R.id.radioButton5_r_q7);
        }

        if(q7_a==q7_rb1_id && q8_a_r==q8_rb4_id_r
                || q7_a==q7_rb2_id && q8_a_r==q8_rb3_id_r
                || q7_a==q7_rb3_id && q8_a_r==q8_rb5_id_r
                || q7_a==q7_rb4_id && q8_a_r==q8_rb1_id_r){
            ConstraintLayout layout_q7 = (ConstraintLayout) findViewById(R.id.q7_back);
            layout_q7.setBackgroundResource(R.color.not_not);
        }

        if(q7_a==q7_rb5_id)    sum=sum+5;if(q8_a_r==q8_rb2_id_r)    sum_r=sum_r+5;

        int q8_a = intent.getIntExtra("q8_answer",0);
        int q8_rb1_id = intent.getIntExtra("q8_rb1_setId",0);
        int q8_rb2_id = intent.getIntExtra("q8_rb2_setId",0);
        int q8_rb3_id = intent.getIntExtra("q8_rb3_setId",0);
        int q8_rb4_id = intent.getIntExtra("q8_rb4_setId",0);
        int q8_rb5_id = intent.getIntExtra("q8_rb5_setId",0);

        RadioGroup rg_q8_r=(RadioGroup) findViewById(R.id.q8_rg_r);

        RadioButton rb_q8_1 = (RadioButton)findViewById(R.id.radioButton_q8);
        RadioButton rb_q8_2 = (RadioButton)findViewById(R.id.radioButton2_q8);
        RadioButton rb_q8_3 = (RadioButton)findViewById(R.id.radioButton3_q8);
        RadioButton rb_q8_4 = (RadioButton)findViewById(R.id.radioButton4_q8);
        RadioButton rb_q8_5 = (RadioButton)findViewById(R.id.radioButton5_q8);
        if(q8_a==q8_rb1_id) {
            rg_q8_r.check(R.id.radioButton_q8);
            rb_q8_2.setEnabled(false);
            rb_q8_3.setEnabled(false);
            rb_q8_4.setEnabled(false);
            rb_q8_5.setEnabled(false);
        }else if(q8_a==q8_rb2_id){
            rb_q8_1.setEnabled(false);
            rg_q8_r.check(R.id.radioButton2_q8);
            rb_q8_3.setEnabled(false);
            rb_q8_4.setEnabled(false);
            rb_q8_5.setEnabled(false);
        }else if(q8_a==q8_rb3_id){
            rb_q8_1.setEnabled(false);
            rb_q8_2.setEnabled(false);
            rg_q8_r.check(R.id.radioButton3_q8);
            rb_q8_4.setEnabled(false);
            rb_q8_5.setEnabled(false);
        }else if(q8_a==q8_rb4_id){
            rb_q8_1.setEnabled(false);
            rb_q8_2.setEnabled(false);
            rb_q8_3.setEnabled(false);
            rg_q8_r.check(R.id.radioButton4_q8);
            rb_q8_5.setEnabled(false);
        }else if(q8_a==q8_rb5_id){
            rb_q8_1.setEnabled(false);
            rb_q8_2.setEnabled(false);
            rb_q8_3.setEnabled(false);
            rb_q8_4.setEnabled(false);
            rg_q8_r.check(R.id.radioButton5_q8);
        }
        int q17_a_r = intent.getIntExtra("q17_answer_r",0);
        int q17_rb1_id_r = intent.getIntExtra("q17_rb1_setId_r",0);
        int q17_rb2_id_r = intent.getIntExtra("q17_rb2_setId_r",0);
        int q17_rb3_id_r = intent.getIntExtra("q17_rb3_setId_r",0);
        int q17_rb4_id_r = intent.getIntExtra("q17_rb4_setId_r",0);
        int q17_rb5_id_r = intent.getIntExtra("q17_rb5_setId_r",0);
        RadioGroup rg_q17_r1=(RadioGroup) findViewById(R.id.q8_rg_r1);
/*^^;q8→r11*/        rg_q17_r1.check(q17_a_r);
        RadioButton rb_q17_1_r = (RadioButton)findViewById(R.id.radioButton_r_q8);
        RadioButton rb_q17_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q8);
        RadioButton rb_q17_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q8);
        RadioButton rb_q17_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q8);
        RadioButton rb_q17_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q8);
        if(q17_a_r==q17_rb1_id_r) {
            rg_q17_r1.check(R.id.radioButton_r_q8);
            rb_q17_2_r.setEnabled(false);
            rb_q17_3_r.setEnabled(false);
            rb_q17_4_r.setEnabled(false);
            rb_q17_5_r.setEnabled(false);
        }else if(q17_a_r==q17_rb2_id_r){
            rb_q17_1_r.setEnabled(false);
            rg_q17_r1.check(R.id.radioButton2_r_q8);
            rb_q17_3_r.setEnabled(false);
            rb_q17_4_r.setEnabled(false);
            rb_q17_5_r.setEnabled(false);
        }else if(q17_a_r==q17_rb3_id_r){
            rb_q17_1_r.setEnabled(false);
            rb_q17_2_r.setEnabled(false);
            rg_q17_r1.check(R.id.radioButton3_r_q8);
            rb_q17_4_r.setEnabled(false);
            rb_q17_5_r.setEnabled(false);
        }else if(q17_a_r==q17_rb4_id_r){
            rb_q17_1_r.setEnabled(false);
            rb_q17_2_r.setEnabled(false);
            rb_q17_3_r.setEnabled(false);
            rg_q17_r1.check(R.id.radioButton4_r_q8);
            rb_q17_5_r.setEnabled(false);
        }else if(q17_a_r==q17_rb5_id_r){
            rb_q17_1_r.setEnabled(false);
            rb_q17_2_r.setEnabled(false);
            rb_q17_3_r.setEnabled(false);
            rb_q17_4_r.setEnabled(false);
            rg_q17_r1.check(R.id.radioButton5_r_q8);
        }

        if(q8_a==q8_rb1_id && q17_a_r==q17_rb2_id_r
                || q8_a==q8_rb2_id && q17_a_r==q17_rb5_id_r
                || q8_a==q8_rb3_id && q17_a_r==q17_rb3_id_r
                || q8_a==q8_rb5_id && q17_a_r==q17_rb4_id_r){
            ConstraintLayout layout_q8 = (ConstraintLayout) findViewById(R.id.q8_back);
            layout_q8.setBackgroundResource(R.color.not_not);
        }

        if(q8_a==q8_rb5_id)    sum=sum+5;if(q17_a_r==q17_rb1_id_r)    sum_r=sum_r+5;

        int q9_a = intent.getIntExtra("q9_answer",0);
        int q9_rb1_id = intent.getIntExtra("q9_rb1_setId",0);
        int q9_rb2_id = intent.getIntExtra("q9_rb2_setId",0);
        int q9_rb3_id = intent.getIntExtra("q9_rb3_setId",0);
        int q9_rb4_id = intent.getIntExtra("q9_rb4_setId",0);
        int q9_rb5_id = intent.getIntExtra("q9_rb5_setId",0);

        RadioGroup rg_q9_r=(RadioGroup) findViewById(R.id.q9_rg_r);

        RadioButton rb_q9_1 = (RadioButton)findViewById(R.id.radioButton_q9);
        RadioButton rb_q9_2 = (RadioButton)findViewById(R.id.radioButton2_q9);
        RadioButton rb_q9_3 = (RadioButton)findViewById(R.id.radioButton3_q9);
        RadioButton rb_q9_4 = (RadioButton)findViewById(R.id.radioButton4_q9);
        RadioButton rb_q9_5 = (RadioButton)findViewById(R.id.radioButton5_q9);
        if(q9_a==q9_rb1_id) {
            rg_q9_r.check(R.id.radioButton_q9);
            rb_q9_2.setEnabled(false);
            rb_q9_3.setEnabled(false);
            rb_q9_4.setEnabled(false);
            rb_q9_5.setEnabled(false);
        }else if(q9_a==q9_rb2_id){
            rb_q9_1.setEnabled(false);
            rg_q9_r.check(R.id.radioButton2_q9);
            rb_q9_3.setEnabled(false);
            rb_q9_4.setEnabled(false);
            rb_q9_5.setEnabled(false);
        }else if(q9_a==q9_rb3_id){
            rb_q9_1.setEnabled(false);
            rb_q9_2.setEnabled(false);
            rg_q9_r.check(R.id.radioButton3_q9);
            rb_q9_4.setEnabled(false);
            rb_q9_5.setEnabled(false);
        }else if(q9_a==q9_rb4_id){
            rb_q9_1.setEnabled(false);
            rb_q9_2.setEnabled(false);
            rb_q9_3.setEnabled(false);
            rg_q9_r.check(R.id.radioButton4_q9);
            rb_q9_5.setEnabled(false);
        }else if(q9_a==q9_rb5_id){
            rb_q9_1.setEnabled(false);
            rb_q9_2.setEnabled(false);
            rb_q9_3.setEnabled(false);
            rb_q9_4.setEnabled(false);
            rg_q9_r.check(R.id.radioButton5_q9);
        }
        int q19_a_r = intent.getIntExtra("q19_answer_r",0);
        int q19_rb1_id_r = intent.getIntExtra("q19_rb1_setId_r",0);
        int q19_rb2_id_r = intent.getIntExtra("q19_rb2_setId_r",0);
        int q19_rb3_id_r = intent.getIntExtra("q19_rb3_setId_r",0);
        int q19_rb4_id_r = intent.getIntExtra("q19_rb4_setId_r",0);
        int q19_rb5_id_r = intent.getIntExtra("q19_rb5_setId_r",0);
        RadioGroup rg_q19_r1=(RadioGroup) findViewById(R.id.q9_rg_r1);
/*^^;q9→r11*/        rg_q19_r1.check(q19_a_r);
        RadioButton rb_q19_1_r = (RadioButton)findViewById(R.id.radioButton_r_q9);
        RadioButton rb_q19_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q9);
        RadioButton rb_q19_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q9);
        RadioButton rb_q19_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q9);
        RadioButton rb_q19_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q9);
        if(q19_a_r==q19_rb1_id_r) {
            rg_q19_r1.check(R.id.radioButton_r_q9);
            rb_q19_2_r.setEnabled(false);
            rb_q19_3_r.setEnabled(false);
            rb_q19_4_r.setEnabled(false);
            rb_q19_5_r.setEnabled(false);
        }else if(q19_a_r==q19_rb2_id_r){
            rb_q19_1_r.setEnabled(false);
            rg_q19_r1.check(R.id.radioButton2_r_q9);
            rb_q19_3_r.setEnabled(false);
            rb_q19_4_r.setEnabled(false);
            rb_q19_5_r.setEnabled(false);
        }else if(q19_a_r==q19_rb3_id_r){
            rb_q19_1_r.setEnabled(false);
            rb_q19_2_r.setEnabled(false);
            rg_q19_r1.check(R.id.radioButton3_r_q9);
            rb_q19_4_r.setEnabled(false);
            rb_q19_5_r.setEnabled(false);
        }else if(q19_a_r==q19_rb4_id_r){
            rb_q19_1_r.setEnabled(false);
            rb_q19_2_r.setEnabled(false);
            rb_q19_3_r.setEnabled(false);
            rg_q19_r1.check(R.id.radioButton4_r_q9);
            rb_q19_5_r.setEnabled(false);
        }else if(q19_a_r==q19_rb5_id_r){
            rb_q19_1_r.setEnabled(false);
            rb_q19_2_r.setEnabled(false);
            rb_q19_3_r.setEnabled(false);
            rb_q19_4_r.setEnabled(false);
            rg_q19_r1.check(R.id.radioButton5_r_q9);
        }

        if(q9_a==q9_rb1_id && q19_a_r==q19_rb5_id_r
                || q9_a==q9_rb2_id && q19_a_r==q19_rb1_id_r
                || q9_a==q9_rb3_id && q19_a_r==q19_rb3_id_r
                || q9_a==q9_rb4_id && q19_a_r==q19_rb2_id_r){
            ConstraintLayout layout_q9 = (ConstraintLayout) findViewById(R.id.q9_back);
            layout_q9.setBackgroundResource(R.color.not_not);
        }

        if(q9_a==q9_rb5_id)    sum=sum+5;if(q19_a_r==q19_rb4_id_r)    sum_r=sum_r+5;

        int q10_a = intent.getIntExtra("q10_answer",0);
        int q10_rb1_id = intent.getIntExtra("q10_rb1_setId",0);
        int q10_rb2_id = intent.getIntExtra("q10_rb2_setId",0);
        int q10_rb3_id = intent.getIntExtra("q10_rb3_setId",0);
        int q10_rb4_id = intent.getIntExtra("q10_rb4_setId",0);
        int q10_rb5_id = intent.getIntExtra("q10_rb5_setId",0);

        RadioGroup rg_q10_r=(RadioGroup) findViewById(R.id.q10_rg_r);

        RadioButton rb_q10_1 = (RadioButton)findViewById(R.id.radioButton_q10);
        RadioButton rb_q10_2 = (RadioButton)findViewById(R.id.radioButton2_q10);
        RadioButton rb_q10_3 = (RadioButton)findViewById(R.id.radioButton3_q10);
        RadioButton rb_q10_4 = (RadioButton)findViewById(R.id.radioButton4_q10);
        RadioButton rb_q10_5 = (RadioButton)findViewById(R.id.radioButton5_q10);
        if(q10_a==q10_rb1_id) {
            rg_q10_r.check(R.id.radioButton_q10);
            rb_q10_2.setEnabled(false);
            rb_q10_3.setEnabled(false);
            rb_q10_4.setEnabled(false);
            rb_q10_5.setEnabled(false);
        }else if(q10_a==q10_rb2_id){
            rb_q10_1.setEnabled(false);
            rg_q10_r.check(R.id.radioButton2_q10);
            rb_q10_3.setEnabled(false);
            rb_q10_4.setEnabled(false);
            rb_q10_5.setEnabled(false);
        }else if(q10_a==q10_rb3_id){
            rb_q10_1.setEnabled(false);
            rb_q10_2.setEnabled(false);
            rg_q10_r.check(R.id.radioButton3_q10);
            rb_q10_4.setEnabled(false);
            rb_q10_5.setEnabled(false);
        }else if(q10_a==q10_rb4_id){
            rb_q10_1.setEnabled(false);
            rb_q10_2.setEnabled(false);
            rb_q10_3.setEnabled(false);
            rg_q10_r.check(R.id.radioButton4_q10);
            rb_q10_5.setEnabled(false);
        }else if(q10_a==q10_rb5_id){
            rb_q10_1.setEnabled(false);
            rb_q10_2.setEnabled(false);
            rb_q10_3.setEnabled(false);
            rb_q10_4.setEnabled(false);
            rg_q10_r.check(R.id.radioButton5_q10);
        }
        int q1_a_r = intent.getIntExtra("q1_answer_r",0);
        int q1_rb1_id_r = intent.getIntExtra("q1_1_setId_r",0);
        int q1_rb2_id_r = intent.getIntExtra("q1_2_setId_r",0);
        int q1_rb3_id_r = intent.getIntExtra("q1_3_setId_r",0);
        int q1_rb4_id_r = intent.getIntExtra("q1_4_setId_r",0);
        int q1_rb5_id_r = intent.getIntExtra("q1_5_setId_r",0);
        RadioGroup rg_q1_r1=(RadioGroup) findViewById(R.id.q10_rg_r1);
/*^^;q10→r11*/        rg_q1_r1.check(q1_a_r);
        RadioButton rb_q1_1_r = (RadioButton)findViewById(R.id.radioButton_r_q10);
        RadioButton rb_q1_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q10);
        RadioButton rb_q1_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q10);
        RadioButton rb_q1_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q10);
        RadioButton rb_q1_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q10);
        if(q1_a_r==q1_rb1_id_r) {
            rg_q1_r1.check(R.id.radioButton_r_q10);
            rb_q1_2_r.setEnabled(false);
            rb_q1_3_r.setEnabled(false);
            rb_q1_4_r.setEnabled(false);
            rb_q1_5_r.setEnabled(false);
        }else if(q1_a_r==q1_rb2_id_r){
            rb_q1_1_r.setEnabled(false);
            rg_q1_r1.check(R.id.radioButton2_r_q10);
            rb_q1_3_r.setEnabled(false);
            rb_q1_4_r.setEnabled(false);
            rb_q1_5_r.setEnabled(false);
        }else if(q1_a_r==q1_rb3_id_r){
            rb_q1_1_r.setEnabled(false);
            rb_q1_2_r.setEnabled(false);
            rg_q1_r1.check(R.id.radioButton3_r_q10);
            rb_q1_4_r.setEnabled(false);
            rb_q1_5_r.setEnabled(false);
        }else if(q1_a_r==q1_rb4_id_r){
            rb_q1_1_r.setEnabled(false);
            rb_q1_2_r.setEnabled(false);
            rb_q1_3_r.setEnabled(false);
            rg_q1_r1.check(R.id.radioButton4_r_q10);
            rb_q1_5_r.setEnabled(false);
        }else if(q1_a_r==q1_rb5_id_r){
            rb_q1_1_r.setEnabled(false);
            rb_q1_2_r.setEnabled(false);
            rb_q1_3_r.setEnabled(false);
            rb_q1_4_r.setEnabled(false);
            rg_q1_r1.check(R.id.radioButton5_r_q10);
        }

        if(q10_a==q10_rb5_id && q1_a_r==q1_rb5_id_r
                || q10_a==q10_rb2_id && q1_a_r==q1_rb4_id_r
                || q10_a==q10_rb3_id && q1_a_r==q1_rb3_id_r
                || q10_a==q10_rb4_id && q1_a_r==q1_rb2_id_r){
            ConstraintLayout layout_q10 = (ConstraintLayout) findViewById(R.id.q10_back);
            layout_q10.setBackgroundResource(R.color.not_not);
        }

        if(q10_a==q10_rb1_id)    sum=sum+5;if(q1_a_r==q1_rb1_id_r)    sum_r=sum_r+5;

        int q11_a = intent.getIntExtra("q11_answer",0);
        int q11_rb1_id = intent.getIntExtra("q11_rb1_setId",0);
        int q11_rb2_id = intent.getIntExtra("q11_rb2_setId",0);
        int q11_rb3_id = intent.getIntExtra("q11_rb3_setId",0);
        int q11_rb4_id = intent.getIntExtra("q11_rb4_setId",0);
        int q11_rb5_id = intent.getIntExtra("q11_rb5_setId",0);

        RadioGroup rg_q11_r=(RadioGroup) findViewById(R.id.q11_rg_r);

        RadioButton rb_q11_1 = (RadioButton)findViewById(R.id.radioButton_q11);
        RadioButton rb_q11_2 = (RadioButton)findViewById(R.id.radioButton2_q11);
        RadioButton rb_q11_3 = (RadioButton)findViewById(R.id.radioButton3_q11);
        RadioButton rb_q11_4 = (RadioButton)findViewById(R.id.radioButton4_q11);
        RadioButton rb_q11_5 = (RadioButton)findViewById(R.id.radioButton5_q11);
        if(q11_a==q11_rb1_id) {
            rg_q11_r.check(R.id.radioButton_q11);
            rb_q11_2.setEnabled(false);
            rb_q11_3.setEnabled(false);
            rb_q11_4.setEnabled(false);
            rb_q11_5.setEnabled(false);
        }else if(q11_a==q11_rb2_id){
            rb_q11_1.setEnabled(false);
            rg_q11_r.check(R.id.radioButton2_q11);
            rb_q11_3.setEnabled(false);
            rb_q11_4.setEnabled(false);
            rb_q11_5.setEnabled(false);
        }else if(q11_a==q11_rb3_id){
            rb_q11_1.setEnabled(false);
            rb_q11_2.setEnabled(false);
            rg_q11_r.check(R.id.radioButton3_q11);
            rb_q11_4.setEnabled(false);
            rb_q11_5.setEnabled(false);
        }else if(q11_a==q11_rb4_id){
            rb_q11_1.setEnabled(false);
            rb_q11_2.setEnabled(false);
            rb_q11_3.setEnabled(false);
            rg_q11_r.check(R.id.radioButton4_q11);
            rb_q11_5.setEnabled(false);
        }else if(q11_a==q11_rb5_id){
            rb_q11_1.setEnabled(false);
            rb_q11_2.setEnabled(false);
            rb_q11_3.setEnabled(false);
            rb_q11_4.setEnabled(false);
            rg_q11_r.check(R.id.radioButton5_q11);
        }
        int q10_a_r = intent.getIntExtra("q10_answer_r",0);
        int q10_rb1_id_r = intent.getIntExtra("q10_rb1_setId_r",0);
        int q10_rb2_id_r = intent.getIntExtra("q10_rb2_setId_r",0);
        int q10_rb3_id_r = intent.getIntExtra("q10_rb3_setId_r",0);
        int q10_rb4_id_r = intent.getIntExtra("q10_rb4_setId_r",0);
        int q10_rb5_id_r = intent.getIntExtra("q10_rb5_setId_r",0);
        RadioGroup rg_q10_r1=(RadioGroup) findViewById(R.id.q11_rg_r1);
/*^^;q11→r11*/        rg_q10_r1.check(q1_a_r);
        RadioButton rb_q10_1_r = (RadioButton)findViewById(R.id.radioButton_r_q11);
        RadioButton rb_q10_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q11);
        RadioButton rb_q10_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q11);
        RadioButton rb_q10_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q11);
        RadioButton rb_q10_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q11);
        if(q10_a_r==q10_rb1_id_r) {
            rg_q10_r1.check(R.id.radioButton_r_q11);
            rb_q10_2_r.setEnabled(false);
            rb_q10_3_r.setEnabled(false);
            rb_q10_4_r.setEnabled(false);
            rb_q10_5_r.setEnabled(false);
        }else if(q10_a_r==q10_rb2_id_r){
            rb_q10_1_r.setEnabled(false);
            rg_q10_r1.check(R.id.radioButton2_r_q11);
            rb_q10_3_r.setEnabled(false);
            rb_q10_4_r.setEnabled(false);
            rb_q10_5_r.setEnabled(false);
        }else if(q10_a_r==q10_rb3_id_r){
            rb_q10_1_r.setEnabled(false);
            rb_q10_2_r.setEnabled(false);
            rg_q10_r1.check(R.id.radioButton3_r_q11);
            rb_q10_4_r.setEnabled(false);
            rb_q10_5_r.setEnabled(false);
        }else if(q10_a_r==q10_rb4_id_r){
            rb_q10_1_r.setEnabled(false);
            rb_q10_2_r.setEnabled(false);
            rb_q10_3_r.setEnabled(false);
            rg_q10_r1.check(R.id.radioButton4_r_q11);
            rb_q10_5_r.setEnabled(false);
        }else if(q10_a_r==q10_rb5_id_r){
            rb_q10_1_r.setEnabled(false);
            rb_q10_2_r.setEnabled(false);
            rb_q10_3_r.setEnabled(false);
            rb_q10_4_r.setEnabled(false);
            rg_q10_r1.check(R.id.radioButton5_r_q11);
        }

        if(q11_a==q11_rb1_id && q1_a_r==q10_rb5_id_r
                || q11_a==q11_rb2_id && q10_a_r==q10_rb1_id_r
                || q11_a==q11_rb3_id && q10_a_r==q10_rb3_id_r
                || q11_a==q11_rb5_id && q10_a_r==q10_rb2_id_r){
            ConstraintLayout layout_q11 = (ConstraintLayout) findViewById(R.id.q11_back);
            layout_q11.setBackgroundResource(R.color.not_not);
        }

        if(q11_a==q11_rb4_id)    sum=sum+5;if(q10_a_r==q10_rb4_id_r)    sum_r=sum_r+5;

        int q12_a = intent.getIntExtra("q12_answer",0);
        int q12_rb1_id = intent.getIntExtra("q12_rb1_setId",0);
        int q12_rb2_id = intent.getIntExtra("q12_rb2_setId",0);
        int q12_rb3_id = intent.getIntExtra("q12_rb3_setId",0);
        int q12_rb4_id = intent.getIntExtra("q12_rb4_setId",0);
        int q12_rb5_id = intent.getIntExtra("q12_rb5_setId",0);

        RadioGroup rg_q12_r=(RadioGroup) findViewById(R.id.q12_rg_r);

        RadioButton rb_q12_1 = (RadioButton)findViewById(R.id.radioButton_q12);
        RadioButton rb_q12_2 = (RadioButton)findViewById(R.id.radioButton2_q12);
        RadioButton rb_q12_3 = (RadioButton)findViewById(R.id.radioButton3_q12);
        RadioButton rb_q12_4 = (RadioButton)findViewById(R.id.radioButton4_q12);
        RadioButton rb_q12_5 = (RadioButton)findViewById(R.id.radioButton5_q12);
        if(q12_a==q12_rb1_id) {
            rg_q12_r.check(R.id.radioButton_q12);
            rb_q12_2.setEnabled(false);
            rb_q12_3.setEnabled(false);
            rb_q12_4.setEnabled(false);
            rb_q12_5.setEnabled(false);
        }else if(q12_a==q12_rb2_id){
            rb_q12_1.setEnabled(false);
            rg_q12_r.check(R.id.radioButton2_q12);
            rb_q12_3.setEnabled(false);
            rb_q12_4.setEnabled(false);
            rb_q12_5.setEnabled(false);
        }else if(q12_a==q12_rb3_id){
            rb_q12_1.setEnabled(false);
            rb_q12_2.setEnabled(false);
            rg_q12_r.check(R.id.radioButton3_q12);
            rb_q12_4.setEnabled(false);
            rb_q12_5.setEnabled(false);
        }else if(q12_a==q12_rb4_id){
            rb_q12_1.setEnabled(false);
            rb_q12_2.setEnabled(false);
            rb_q12_3.setEnabled(false);
            rg_q12_r.check(R.id.radioButton4_q12);
            rb_q12_5.setEnabled(false);
        }else if(q12_a==q12_rb5_id){
            rb_q12_1.setEnabled(false);
            rb_q12_2.setEnabled(false);
            rb_q12_3.setEnabled(false);
            rb_q12_4.setEnabled(false);
            rg_q12_r.check(R.id.radioButton5_q12);
        }
        int q2_a_r = intent.getIntExtra("q2_answer_r",0);
        int q2_rb1_id_r = intent.getIntExtra("q2_rb1_setId_r",0);
        int q2_rb2_id_r = intent.getIntExtra("q2_rb2_setId_r",0);
        int q2_rb3_id_r = intent.getIntExtra("q2_rb3_setId_r",0);
        int q2_rb4_id_r = intent.getIntExtra("q2_rb4_setId_r",0);
        int q2_rb5_id_r = intent.getIntExtra("q2_rb5_setId_r",0);
        RadioGroup rg_q2_r1=(RadioGroup) findViewById(R.id.q12_rg_r1);
/*^^;q12→r11*/        rg_q2_r1.check(q2_a_r);
        RadioButton rb_q2_1_r = (RadioButton)findViewById(R.id.radioButton_r_q12);
        RadioButton rb_q2_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q12);
        RadioButton rb_q2_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q12);
        RadioButton rb_q2_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q12);
        RadioButton rb_q2_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q12);
        if(q2_a_r==q2_rb1_id_r) {
            rg_q2_r1.check(R.id.radioButton_r_q12);
            rb_q2_2_r.setEnabled(false);
            rb_q2_3_r.setEnabled(false);
            rb_q2_4_r.setEnabled(false);
            rb_q2_5_r.setEnabled(false);
        }else if(q2_a_r==q2_rb2_id_r){
            rb_q2_1_r.setEnabled(false);
            rg_q2_r1.check(R.id.radioButton2_r_q12);
            rb_q2_3_r.setEnabled(false);
            rb_q2_4_r.setEnabled(false);
            rb_q2_5_r.setEnabled(false);
        }else if(q2_a_r==q2_rb3_id_r){
            rb_q2_1_r.setEnabled(false);
            rb_q2_2_r.setEnabled(false);
            rg_q2_r1.check(R.id.radioButton3_r_q12);
            rb_q2_4_r.setEnabled(false);
            rb_q2_5_r.setEnabled(false);
        }else if(q2_a_r==q2_rb4_id_r){
            rb_q2_1_r.setEnabled(false);
            rb_q2_2_r.setEnabled(false);
            rb_q2_3_r.setEnabled(false);
            rg_q2_r1.check(R.id.radioButton4_r_q12);
            rb_q2_5_r.setEnabled(false);
        }else if(q2_a_r==q2_rb5_id_r){
            rb_q2_1_r.setEnabled(false);
            rb_q2_2_r.setEnabled(false);
            rb_q2_3_r.setEnabled(false);
            rb_q2_4_r.setEnabled(false);
            rg_q2_r1.check(R.id.radioButton5_r_q12);
        }

        if(q12_a==q12_rb1_id && q2_a_r==q2_rb2_id_r
                || q12_a==q12_rb2_id && q2_a_r==q2_rb5_id_r
                || q12_a==q12_rb5_id && q2_a_r==q2_rb1_id_r
                || q12_a==q12_rb4_id && q2_a_r==q2_rb4_id_r){
            ConstraintLayout layout_q12 = (ConstraintLayout) findViewById(R.id.q12_back);
            layout_q12.setBackgroundResource(R.color.not_not);
        }

        if(q12_a==q12_rb3_id)    sum=sum+5;if(q2_a_r==q2_rb3_id_r)    sum_r=sum_r+5;

        int q13_a = intent.getIntExtra("q13_answer",0);
        int q13_rb1_id = intent.getIntExtra("q13_rb1_setId",0);
        int q13_rb2_id = intent.getIntExtra("q13_rb2_setId",0);
        int q13_rb3_id = intent.getIntExtra("q13_rb3_setId",0);
        int q13_rb4_id = intent.getIntExtra("q13_rb4_setId",0);
        int q13_rb5_id = intent.getIntExtra("q13_rb5_setId",0);

        RadioGroup rg_q13_r=(RadioGroup) findViewById(R.id.q13_rg_r);

        RadioButton rb_q13_1 = (RadioButton)findViewById(R.id.radioButton_q13);
        RadioButton rb_q13_2 = (RadioButton)findViewById(R.id.radioButton2_q13);
        RadioButton rb_q13_3 = (RadioButton)findViewById(R.id.radioButton3_q13);
        RadioButton rb_q13_4 = (RadioButton)findViewById(R.id.radioButton4_q13);
        RadioButton rb_q13_5 = (RadioButton)findViewById(R.id.radioButton5_q13);
        if(q13_a==q13_rb1_id) {
            rg_q13_r.check(R.id.radioButton_q13);
            rb_q13_2.setEnabled(false);
            rb_q13_3.setEnabled(false);
            rb_q13_4.setEnabled(false);
            rb_q13_5.setEnabled(false);
        }else if(q13_a==q13_rb2_id){
            rb_q13_1.setEnabled(false);
            rg_q13_r.check(R.id.radioButton2_q13);
            rb_q13_3.setEnabled(false);
            rb_q13_4.setEnabled(false);
            rb_q13_5.setEnabled(false);
        }else if(q13_a==q13_rb3_id){
            rb_q13_1.setEnabled(false);
            rb_q13_2.setEnabled(false);
            rg_q13_r.check(R.id.radioButton3_q13);
            rb_q13_4.setEnabled(false);
            rb_q13_5.setEnabled(false);
        }else if(q13_a==q13_rb4_id){
            rb_q13_1.setEnabled(false);
            rb_q13_2.setEnabled(false);
            rb_q13_3.setEnabled(false);
            rg_q13_r.check(R.id.radioButton4_q13);
            rb_q13_5.setEnabled(false);
        }else if(q13_a==q13_rb5_id){
            rb_q13_1.setEnabled(false);
            rb_q13_2.setEnabled(false);
            rb_q13_3.setEnabled(false);
            rb_q13_4.setEnabled(false);
            rg_q13_r.check(R.id.radioButton5_q13);
        }
        int q16_a_r = intent.getIntExtra("q16_answer_r",0);
        int q16_rb1_id_r = intent.getIntExtra("q16_rb1_setId_r",0);
        int q16_rb2_id_r = intent.getIntExtra("q16_rb2_setId_r",0);
        int q16_rb3_id_r = intent.getIntExtra("q16_rb3_setId_r",0);
        int q16_rb4_id_r = intent.getIntExtra("q16_rb4_setId_r",0);
        int q16_rb5_id_r = intent.getIntExtra("q16_rb5_setId_r",0);
        RadioGroup rg_q16_r1=(RadioGroup) findViewById(R.id.q13_rg_r1);
/*^^;q13→r11*/        rg_q16_r1.check(q16_a_r);
        RadioButton rb_q16_1_r = (RadioButton)findViewById(R.id.radioButton_r_q13);
        RadioButton rb_q16_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q13);
        RadioButton rb_q16_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q13);
        RadioButton rb_q16_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q13);
        RadioButton rb_q16_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q13);
        if(q16_a_r==q16_rb1_id_r) {
            rg_q16_r1.check(R.id.radioButton_r_q13);
            rb_q16_2_r.setEnabled(false);
            rb_q16_3_r.setEnabled(false);
            rb_q16_4_r.setEnabled(false);
            rb_q16_5_r.setEnabled(false);
        }else if(q16_a_r==q16_rb2_id_r){
            rb_q16_1_r.setEnabled(false);
            rg_q16_r1.check(R.id.radioButton2_r_q13);
            rb_q16_3_r.setEnabled(false);
            rb_q16_4_r.setEnabled(false);
            rb_q16_5_r.setEnabled(false);
        }else if(q16_a_r==q16_rb3_id_r){
            rb_q16_1_r.setEnabled(false);
            rb_q16_2_r.setEnabled(false);
            rg_q16_r1.check(R.id.radioButton3_r_q13);
            rb_q16_4_r.setEnabled(false);
            rb_q16_5_r.setEnabled(false);
        }else if(q16_a_r==q16_rb4_id_r){
            rb_q16_1_r.setEnabled(false);
            rb_q16_2_r.setEnabled(false);
            rb_q16_3_r.setEnabled(false);
            rg_q16_r1.check(R.id.radioButton4_r_q13);
            rb_q16_5_r.setEnabled(false);
        }else if(q16_a_r==q16_rb5_id_r){
            rb_q16_1_r.setEnabled(false);
            rb_q16_2_r.setEnabled(false);
            rb_q16_3_r.setEnabled(false);
            rb_q16_4_r.setEnabled(false);
            rg_q16_r1.check(R.id.radioButton5_r_q13);
        }

        if(q13_a==q13_rb3_id && q16_a_r==q16_rb5_id_r
                || q13_a==q13_rb2_id && q16_a_r==q16_rb2_id_r
                || q13_a==q13_rb5_id && q16_a_r==q16_rb1_id_r
                || q13_a==q13_rb4_id && q16_a_r==q16_rb4_id_r){
            ConstraintLayout layout_q13 = (ConstraintLayout) findViewById(R.id.q13_back);
            layout_q13.setBackgroundResource(R.color.not_not);
        }

        if(q13_a==q13_rb1_id)    sum=sum+5;if(q16_a_r==q16_rb3_id_r)    sum_r=sum_r+5;

        int q14_a = intent.getIntExtra("q14_answer",0);
        int q14_rb1_id = intent.getIntExtra("q14_rb1_setId",0);
        int q14_rb2_id = intent.getIntExtra("q14_rb2_setId",0);
        int q14_rb3_id = intent.getIntExtra("q14_rb3_setId",0);
        int q14_rb4_id = intent.getIntExtra("q14_rb4_setId",0);
        int q14_rb5_id = intent.getIntExtra("q14_rb5_setId",0);

        RadioGroup rg_q14_r=(RadioGroup) findViewById(R.id.q14_rg_r);

        RadioButton rb_q14_1 = (RadioButton)findViewById(R.id.radioButton_q14);
        RadioButton rb_q14_2 = (RadioButton)findViewById(R.id.radioButton2_q14);
        RadioButton rb_q14_3 = (RadioButton)findViewById(R.id.radioButton3_q14);
        RadioButton rb_q14_4 = (RadioButton)findViewById(R.id.radioButton4_q14);
        RadioButton rb_q14_5 = (RadioButton)findViewById(R.id.radioButton5_q14);
        if(q14_a==q14_rb1_id) {
            rg_q14_r.check(R.id.radioButton_q14);
            rb_q14_2.setEnabled(false);
            rb_q14_3.setEnabled(false);
            rb_q14_4.setEnabled(false);
            rb_q14_5.setEnabled(false);
        }else if(q14_a==q14_rb2_id){
            rb_q14_1.setEnabled(false);
            rg_q14_r.check(R.id.radioButton2_q14);
            rb_q14_3.setEnabled(false);
            rb_q14_4.setEnabled(false);
            rb_q14_5.setEnabled(false);
        }else if(q14_a==q14_rb3_id){
            rb_q14_1.setEnabled(false);
            rb_q14_2.setEnabled(false);
            rg_q14_r.check(R.id.radioButton3_q14);
            rb_q14_4.setEnabled(false);
            rb_q14_5.setEnabled(false);
        }else if(q14_a==q14_rb4_id){
            rb_q14_1.setEnabled(false);
            rb_q14_2.setEnabled(false);
            rb_q14_3.setEnabled(false);
            rg_q14_r.check(R.id.radioButton4_q14);
            rb_q14_5.setEnabled(false);
        }else if(q14_a==q14_rb5_id){
            rb_q14_1.setEnabled(false);
            rb_q14_2.setEnabled(false);
            rb_q14_3.setEnabled(false);
            rb_q14_4.setEnabled(false);
            rg_q14_r.check(R.id.radioButton5_q14);
        }
        int q7_a_r = intent.getIntExtra("q7_answer_r",0);
        int q7_rb1_id_r = intent.getIntExtra("q7_rb1_setId_r",0);
        int q7_rb2_id_r = intent.getIntExtra("q7_rb2_setId_r",0);
        int q7_rb3_id_r = intent.getIntExtra("q7_rb3_setId_r",0);
        int q7_rb4_id_r = intent.getIntExtra("q7_rb4_setId_r",0);
        int q7_rb5_id_r = intent.getIntExtra("q7_rb5_setId_r",0);
        RadioGroup rg_q7_r1=(RadioGroup) findViewById(R.id.q14_rg_r1);
/*^^;q14→r11*/        rg_q7_r1.check(q7_a_r);
        RadioButton rb_q7_1_r = (RadioButton)findViewById(R.id.radioButton_r_q14);
        RadioButton rb_q7_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q14);
        RadioButton rb_q7_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q14);
        RadioButton rb_q7_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q14);
        RadioButton rb_q7_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q14);
        if(q7_a_r==q7_rb1_id_r) {
            rg_q7_r1.check(R.id.radioButton_r_q14);
            rb_q7_2_r.setEnabled(false);
            rb_q7_3_r.setEnabled(false);
            rb_q7_4_r.setEnabled(false);
            rb_q7_5_r.setEnabled(false);
        }else if(q7_a_r==q7_rb2_id_r){
            rb_q7_1_r.setEnabled(false);
            rg_q7_r1.check(R.id.radioButton2_r_q14);
            rb_q7_3_r.setEnabled(false);
            rb_q7_4_r.setEnabled(false);
            rb_q7_5_r.setEnabled(false);
        }else if(q7_a_r==q7_rb3_id_r){
            rb_q7_1_r.setEnabled(false);
            rb_q7_2_r.setEnabled(false);
            rg_q7_r1.check(R.id.radioButton3_r_q14);
            rb_q7_4_r.setEnabled(false);
            rb_q7_5_r.setEnabled(false);
        }else if(q7_a_r==q7_rb4_id_r){
            rb_q7_1_r.setEnabled(false);
            rb_q7_2_r.setEnabled(false);
            rb_q7_3_r.setEnabled(false);
            rg_q7_r1.check(R.id.radioButton4_r_q14);
            rb_q7_5_r.setEnabled(false);
        }else if(q7_a_r==q7_rb5_id_r){
            rb_q7_1_r.setEnabled(false);
            rb_q7_2_r.setEnabled(false);
            rb_q7_3_r.setEnabled(false);
            rb_q7_4_r.setEnabled(false);
            rg_q7_r1.check(R.id.radioButton5_r_q14);
        }

        if(q14_a==q14_rb1_id && q7_a_r==q7_rb4_id_r
                || q14_a==q14_rb3_id && q7_a_r==q7_rb5_id_r
                || q14_a==q14_rb5_id && q7_a_r==q7_rb1_id_r
                || q14_a==q14_rb4_id && q7_a_r==q7_rb2_id_r){
            ConstraintLayout layout_q14 = (ConstraintLayout) findViewById(R.id.q14_back);
            layout_q14.setBackgroundResource(R.color.not_not);
        }

        if(q14_a==q14_rb2_id)    sum=sum+5;if(q7_a_r==q7_rb3_id_r)    sum_r=sum_r+5;

        int q15_a = intent.getIntExtra("q15_answer",0);
        int q15_rb1_id = intent.getIntExtra("q15_rb1_setId",0);
        int q15_rb2_id = intent.getIntExtra("q15_rb2_setId",0);
        int q15_rb3_id = intent.getIntExtra("q15_rb3_setId",0);
        int q15_rb4_id = intent.getIntExtra("q15_rb4_setId",0);
        int q15_rb5_id = intent.getIntExtra("q15_rb5_setId",0);

        RadioGroup rg_q15_r=(RadioGroup) findViewById(R.id.q15_rg_r);

        RadioButton rb_q15_1 = (RadioButton)findViewById(R.id.radioButton_q15);
        RadioButton rb_q15_2 = (RadioButton)findViewById(R.id.radioButton2_q15);
        RadioButton rb_q15_3 = (RadioButton)findViewById(R.id.radioButton3_q15);
        RadioButton rb_q15_4 = (RadioButton)findViewById(R.id.radioButton4_q15);
        RadioButton rb_q15_5 = (RadioButton)findViewById(R.id.radioButton5_q15);
        if(q15_a==q15_rb1_id) {
            rg_q15_r.check(R.id.radioButton_q15);
            rb_q15_2.setEnabled(false);
            rb_q15_3.setEnabled(false);
            rb_q15_4.setEnabled(false);
            rb_q15_5.setEnabled(false);
        }else if(q15_a==q15_rb2_id){
            rb_q15_1.setEnabled(false);
            rg_q15_r.check(R.id.radioButton2_q15);
            rb_q15_3.setEnabled(false);
            rb_q15_4.setEnabled(false);
            rb_q15_5.setEnabled(false);
        }else if(q15_a==q15_rb3_id){
            rb_q15_1.setEnabled(false);
            rb_q15_2.setEnabled(false);
            rg_q15_r.check(R.id.radioButton3_q15);
            rb_q15_4.setEnabled(false);
            rb_q15_5.setEnabled(false);
        }else if(q15_a==q15_rb4_id){
            rb_q15_1.setEnabled(false);
            rb_q15_2.setEnabled(false);
            rb_q15_3.setEnabled(false);
            rg_q15_r.check(R.id.radioButton4_q15);
            rb_q15_5.setEnabled(false);
        }else if(q15_a==q15_rb5_id){
            rb_q15_1.setEnabled(false);
            rb_q15_2.setEnabled(false);
            rb_q15_3.setEnabled(false);
            rb_q15_4.setEnabled(false);
            rg_q15_r.check(R.id.radioButton5_q15);
        }
        int q14_a_r = intent.getIntExtra("q14_answer_r",0);
        int q14_rb1_id_r = intent.getIntExtra("q14_rb1_setId_r",0);
        int q14_rb2_id_r = intent.getIntExtra("q14_rb2_setId_r",0);
        int q14_rb3_id_r = intent.getIntExtra("q14_rb3_setId_r",0);
        int q14_rb4_id_r = intent.getIntExtra("q14_rb4_setId_r",0);
        int q14_rb5_id_r = intent.getIntExtra("q14_rb5_setId_r",0);
        RadioGroup rg_q14_r1=(RadioGroup) findViewById(R.id.q15_rg_r1);
/*^^;q15→r11*/        rg_q14_r1.check(q14_a_r);
        RadioButton rb_q14_1_r = (RadioButton)findViewById(R.id.radioButton_r_q15);
        RadioButton rb_q14_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q15);
        RadioButton rb_q14_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q15);
        RadioButton rb_q14_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q15);
        RadioButton rb_q14_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q15);
        if(q14_a_r==q14_rb1_id_r) {
            rg_q14_r1.check(R.id.radioButton_r_q15);
            rb_q14_2_r.setEnabled(false);
            rb_q14_3_r.setEnabled(false);
            rb_q14_4_r.setEnabled(false);
            rb_q14_5_r.setEnabled(false);
        }else if(q14_a_r==q14_rb2_id_r){
            rb_q14_1_r.setEnabled(false);
            rg_q14_r1.check(R.id.radioButton2_r_q15);
            rb_q14_3_r.setEnabled(false);
            rb_q14_4_r.setEnabled(false);
            rb_q14_5_r.setEnabled(false);
        }else if(q14_a_r==q14_rb3_id_r){
            rb_q14_1_r.setEnabled(false);
            rb_q14_2_r.setEnabled(false);
            rg_q14_r1.check(R.id.radioButton3_r_q15);
            rb_q14_4_r.setEnabled(false);
            rb_q14_5_r.setEnabled(false);
        }else if(q14_a_r==q14_rb4_id_r){
            rb_q14_1_r.setEnabled(false);
            rb_q14_2_r.setEnabled(false);
            rb_q14_3_r.setEnabled(false);
            rg_q14_r1.check(R.id.radioButton4_r_q15);
            rb_q14_5_r.setEnabled(false);
        }else if(q14_a_r==q14_rb5_id_r){
            rb_q14_1_r.setEnabled(false);
            rb_q14_2_r.setEnabled(false);
            rb_q14_3_r.setEnabled(false);
            rb_q14_4_r.setEnabled(false);
            rg_q14_r1.check(R.id.radioButton5_r_q15);
        }

        if(q15_a==q15_rb1_id && q14_a_r==q14_rb4_id_r
                || q15_a==q15_rb2_id && q14_a_r==q14_rb1_id_r
                || q15_a==q15_rb3_id && q14_a_r==q14_rb2_id_r
                || q15_a==q15_rb5_id && q14_a_r==q14_rb5_id_r){
            ConstraintLayout layout_q15 = (ConstraintLayout) findViewById(R.id.q15_back);
            layout_q15.setBackgroundResource(R.color.not_not);
        }

        if(q15_a==q15_rb4_id)    sum=sum+5;if(q14_a_r==q14_rb3_id_r)    sum_r=sum_r+5;


        int q16_a = intent.getIntExtra("q16_answer",0);
        int q16_rb1_id = intent.getIntExtra("q16_rb1_setId",0);
        int q16_rb2_id = intent.getIntExtra("q16_rb2_setId",0);
        int q16_rb3_id = intent.getIntExtra("q16_rb3_setId",0);
        int q16_rb4_id = intent.getIntExtra("q16_rb4_setId",0);
        int q16_rb5_id = intent.getIntExtra("q16_rb5_setId",0);

        RadioGroup rg_q16_r=(RadioGroup) findViewById(R.id.q16_rg_r);

        RadioButton rb_q16_1 = (RadioButton)findViewById(R.id.radioButton_q16);
        RadioButton rb_q16_2 = (RadioButton)findViewById(R.id.radioButton2_q16);
        RadioButton rb_q16_3 = (RadioButton)findViewById(R.id.radioButton3_q16);
        RadioButton rb_q16_4 = (RadioButton)findViewById(R.id.radioButton4_q16);
        RadioButton rb_q16_5 = (RadioButton)findViewById(R.id.radioButton5_q16);
        if(q16_a==q16_rb1_id) {
            rg_q16_r.check(R.id.radioButton_q16);
            rb_q16_2.setEnabled(false);
            rb_q16_3.setEnabled(false);
            rb_q16_4.setEnabled(false);
            rb_q16_5.setEnabled(false);
        }else if(q16_a==q16_rb2_id){
            rb_q16_1.setEnabled(false);
            rg_q16_r.check(R.id.radioButton2_q16);
            rb_q16_3.setEnabled(false);
            rb_q16_4.setEnabled(false);
            rb_q16_5.setEnabled(false);
        }else if(q16_a==q16_rb3_id){
            rb_q16_1.setEnabled(false);
            rb_q16_2.setEnabled(false);
            rg_q16_r.check(R.id.radioButton3_q16);
            rb_q16_4.setEnabled(false);
            rb_q16_5.setEnabled(false);
        }else if(q16_a==q16_rb4_id){
            rb_q16_1.setEnabled(false);
            rb_q16_2.setEnabled(false);
            rb_q16_3.setEnabled(false);
            rg_q16_r.check(R.id.radioButton4_q16);
            rb_q16_5.setEnabled(false);
        }else if(q16_a==q16_rb5_id){
            rb_q16_1.setEnabled(false);
            rb_q16_2.setEnabled(false);
            rb_q16_3.setEnabled(false);
            rb_q16_4.setEnabled(false);
            rg_q16_r.check(R.id.radioButton5_q16);
        }
        int q20_a_r = intent.getIntExtra("q20_answer_r",0);
        int q20_rb1_id_r = intent.getIntExtra("q20_rb1_setId_r",0);
        int q20_rb2_id_r = intent.getIntExtra("q20_rb2_setId_r",0);
        int q20_rb3_id_r = intent.getIntExtra("q20_rb3_setId_r",0);
        int q20_rb4_id_r = intent.getIntExtra("q20_rb4_setId_r",0);
        int q20_rb5_id_r = intent.getIntExtra("q20_rb5_setId_r",0);
        RadioGroup rg_q20_r1=(RadioGroup) findViewById(R.id.q16_rg_r1);
/*^^;q16→r11*/        rg_q20_r1.check(q20_a_r);
        RadioButton rb_q20_1_r = (RadioButton)findViewById(R.id.radioButton_r_q16);
        RadioButton rb_q20_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q16);
        RadioButton rb_q20_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q16);
        RadioButton rb_q20_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q16);
        RadioButton rb_q20_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q16);
        if(q20_a_r==q20_rb1_id_r) {
            rg_q20_r1.check(R.id.radioButton_r_q16);
            rb_q20_2_r.setEnabled(false);
            rb_q20_3_r.setEnabled(false);
            rb_q20_4_r.setEnabled(false);
            rb_q20_5_r.setEnabled(false);
        }else if(q20_a_r==q20_rb2_id_r){
            rb_q20_1_r.setEnabled(false);
            rg_q20_r1.check(R.id.radioButton2_r_q16);
            rb_q20_3_r.setEnabled(false);
            rb_q20_4_r.setEnabled(false);
            rb_q20_5_r.setEnabled(false);
        }else if(q20_a_r==q20_rb3_id_r){
            rb_q20_1_r.setEnabled(false);
            rb_q20_2_r.setEnabled(false);
            rg_q20_r1.check(R.id.radioButton3_r_q16);
            rb_q20_4_r.setEnabled(false);
            rb_q20_5_r.setEnabled(false);
        }else if(q20_a_r==q20_rb4_id_r){
            rb_q20_1_r.setEnabled(false);
            rb_q20_2_r.setEnabled(false);
            rb_q20_3_r.setEnabled(false);
            rg_q20_r1.check(R.id.radioButton4_r_q16);
            rb_q20_5_r.setEnabled(false);
        }else if(q20_a_r==q20_rb5_id_r){
            rb_q20_1_r.setEnabled(false);
            rb_q20_2_r.setEnabled(false);
            rb_q20_3_r.setEnabled(false);
            rb_q20_4_r.setEnabled(false);
            rg_q20_r1.check(R.id.radioButton5_r_q16);
        }

        if(q16_a==q16_rb1_id && q20_a_r==q20_rb4_id_r
                || q16_a==q16_rb2_id && q20_a_r==q20_rb5_id_r
                || q16_a==q16_rb4_id && q20_a_r==q20_rb1_id_r
                || q16_a==q16_rb5_id && q20_a_r==q20_rb2_id_r){
            ConstraintLayout layout_q16 = (ConstraintLayout) findViewById(R.id.q16_back);
            layout_q16.setBackgroundResource(R.color.not_not);
        }

        if(q16_a==q16_rb3_id)    sum=sum+5;if(q20_a_r==q20_rb3_id_r)    sum_r=sum_r+5;


        int q17_a = intent.getIntExtra("q17_answer",0);
        int q17_rb1_id = intent.getIntExtra("q17_rb1_setId",0);
        int q17_rb2_id = intent.getIntExtra("q17_rb2_setId",0);
        int q17_rb3_id = intent.getIntExtra("q17_rb3_setId",0);
        int q17_rb4_id = intent.getIntExtra("q17_rb4_setId",0);
        int q17_rb5_id = intent.getIntExtra("q17_rb5_setId",0);

        RadioGroup rg_q17_r=(RadioGroup) findViewById(R.id.q17_rg_r);

        RadioButton rb_q17_1 = (RadioButton)findViewById(R.id.radioButton_q17);
        RadioButton rb_q17_2 = (RadioButton)findViewById(R.id.radioButton2_q17);
        RadioButton rb_q17_3 = (RadioButton)findViewById(R.id.radioButton3_q17);
        RadioButton rb_q17_4 = (RadioButton)findViewById(R.id.radioButton4_q17);
        RadioButton rb_q17_5 = (RadioButton)findViewById(R.id.radioButton5_q17);
        if(q17_a==q17_rb1_id) {
            rg_q17_r.check(R.id.radioButton_q17);
            rb_q17_2.setEnabled(false);
            rb_q17_3.setEnabled(false);
            rb_q17_4.setEnabled(false);
            rb_q17_5.setEnabled(false);
        }else if(q17_a==q17_rb2_id){
            rb_q17_1.setEnabled(false);
            rg_q17_r.check(R.id.radioButton2_q17);
            rb_q17_3.setEnabled(false);
            rb_q17_4.setEnabled(false);
            rb_q17_5.setEnabled(false);
        }else if(q17_a==q17_rb3_id){
            rb_q17_1.setEnabled(false);
            rb_q17_2.setEnabled(false);
            rg_q17_r.check(R.id.radioButton3_q17);
            rb_q17_4.setEnabled(false);
            rb_q17_5.setEnabled(false);
        }else if(q17_a==q17_rb4_id){
            rb_q17_1.setEnabled(false);
            rb_q17_2.setEnabled(false);
            rb_q17_3.setEnabled(false);
            rg_q17_r.check(R.id.radioButton4_q17);
            rb_q17_5.setEnabled(false);
        }else if(q17_a==q17_rb5_id){
            rb_q17_1.setEnabled(false);
            rb_q17_2.setEnabled(false);
            rb_q17_3.setEnabled(false);
            rb_q17_4.setEnabled(false);
            rg_q17_r.check(R.id.radioButton5_q17);
        }
        int q13_a_r = intent.getIntExtra("q13_answer_r",0);
        int q13_rb1_id_r = intent.getIntExtra("q13_rb1_setId_r",0);
        int q13_rb2_id_r = intent.getIntExtra("q13_rb2_setId_r",0);
        int q13_rb3_id_r = intent.getIntExtra("q13_rb3_setId_r",0);
        int q13_rb4_id_r = intent.getIntExtra("q13_rb4_setId_r",0);
        int q13_rb5_id_r = intent.getIntExtra("q13_rb5_setId_r",0);
        RadioGroup rg_q13_r1=(RadioGroup) findViewById(R.id.q17_rg_r1);
/*^^;q17→r11*/        rg_q13_r1.check(q13_a_r);
        RadioButton rb_q13_1_r = (RadioButton)findViewById(R.id.radioButton_r_q17);
        RadioButton rb_q13_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q17);
        RadioButton rb_q13_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q17);
        RadioButton rb_q13_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q17);
        RadioButton rb_q13_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q17);
        if(q13_a_r==q13_rb1_id_r) {
            rg_q13_r1.check(R.id.radioButton_r_q17);
            rb_q13_2_r.setEnabled(false);
            rb_q13_3_r.setEnabled(false);
            rb_q13_4_r.setEnabled(false);
            rb_q13_5_r.setEnabled(false);
        }else if(q13_a_r==q13_rb2_id_r){
            rb_q13_1_r.setEnabled(false);
            rg_q13_r1.check(R.id.radioButton2_r_q17);
            rb_q13_3_r.setEnabled(false);
            rb_q13_4_r.setEnabled(false);
            rb_q13_5_r.setEnabled(false);
        }else if(q13_a_r==q13_rb3_id_r){
            rb_q13_1_r.setEnabled(false);
            rb_q13_2_r.setEnabled(false);
            rg_q13_r1.check(R.id.radioButton3_r_q17);
            rb_q13_4_r.setEnabled(false);
            rb_q13_5_r.setEnabled(false);
        }else if(q13_a_r==q13_rb4_id_r){
            rb_q13_1_r.setEnabled(false);
            rb_q13_2_r.setEnabled(false);
            rb_q13_3_r.setEnabled(false);
            rg_q13_r1.check(R.id.radioButton4_r_q17);
            rb_q13_5_r.setEnabled(false);
        }else if(q13_a_r==q13_rb5_id_r){
            rb_q13_1_r.setEnabled(false);
            rb_q13_2_r.setEnabled(false);
            rb_q13_3_r.setEnabled(false);
            rb_q13_4_r.setEnabled(false);
            rg_q13_r1.check(R.id.radioButton5_r_q17);
        }

        if(q17_a==q17_rb1_id && q13_a_r==q13_rb1_id_r
                || q17_a==q17_rb2_id && q13_a_r==q13_rb3_id_r
                || q17_a==q17_rb3_id && q13_a_r==q13_rb5_id_r
                || q17_a==q17_rb4_id && q13_a_r==q13_rb4_id_r){
            ConstraintLayout layout_q17 = (ConstraintLayout) findViewById(R.id.q17_back);
            layout_q17.setBackgroundResource(R.color.not_not);
        }

        if(q17_a==q17_rb5_id)    sum=sum+5;if(q13_a_r==q13_rb2_id_r)    sum_r=sum_r+5;


        int q18_a = intent.getIntExtra("q18_answer",0);
        int q18_rb1_id = intent.getIntExtra("q18_rb1_setId",0);
        int q18_rb2_id = intent.getIntExtra("q18_rb2_setId",0);
        int q18_rb3_id = intent.getIntExtra("q18_rb3_setId",0);
        int q18_rb4_id = intent.getIntExtra("q18_rb4_setId",0);
        int q18_rb5_id = intent.getIntExtra("q18_rb5_setId",0);

        RadioGroup rg_q18_r=(RadioGroup) findViewById(R.id.q18_rg_r);

        RadioButton rb_q18_1 = (RadioButton)findViewById(R.id.radioButton_q18);
        RadioButton rb_q18_2 = (RadioButton)findViewById(R.id.radioButton2_q18);
        RadioButton rb_q18_3 = (RadioButton)findViewById(R.id.radioButton3_q18);
        RadioButton rb_q18_4 = (RadioButton)findViewById(R.id.radioButton4_q18);
        RadioButton rb_q18_5 = (RadioButton)findViewById(R.id.radioButton5_q18);
        if(q18_a==q18_rb1_id) {
            rg_q18_r.check(R.id.radioButton_q18);
            rb_q18_2.setEnabled(false);
            rb_q18_3.setEnabled(false);
            rb_q18_4.setEnabled(false);
            rb_q18_5.setEnabled(false);
        }else if(q18_a==q18_rb2_id){
            rb_q18_1.setEnabled(false);
            rg_q18_r.check(R.id.radioButton2_q18);
            rb_q18_3.setEnabled(false);
            rb_q18_4.setEnabled(false);
            rb_q18_5.setEnabled(false);
        }else if(q18_a==q18_rb3_id){
            rb_q18_1.setEnabled(false);
            rb_q18_2.setEnabled(false);
            rg_q18_r.check(R.id.radioButton3_q18);
            rb_q18_4.setEnabled(false);
            rb_q18_5.setEnabled(false);
        }else if(q18_a==q18_rb4_id){
            rb_q18_1.setEnabled(false);
            rb_q18_2.setEnabled(false);
            rb_q18_3.setEnabled(false);
            rg_q18_r.check(R.id.radioButton4_q18);
            rb_q18_5.setEnabled(false);
        }else if(q18_a==q18_rb5_id){
            rb_q18_1.setEnabled(false);
            rb_q18_2.setEnabled(false);
            rb_q18_3.setEnabled(false);
            rb_q18_4.setEnabled(false);
            rg_q18_r.check(R.id.radioButton5_q18);
        }
        int q12_a_r = intent.getIntExtra("q12_answer_r",0);
        int q12_rb1_id_r = intent.getIntExtra("q12_rb1_setId_r",0);
        int q12_rb2_id_r = intent.getIntExtra("q12_rb2_setId_r",0);
        int q12_rb3_id_r = intent.getIntExtra("q12_rb3_setId_r",0);
        int q12_rb4_id_r = intent.getIntExtra("q12_rb4_setId_r",0);
        int q12_rb5_id_r = intent.getIntExtra("q12_rb5_setId_r",0);
        RadioGroup rg_q12_r1=(RadioGroup) findViewById(R.id.q18_rg_r1);
/*^^;q18→r11*/        rg_q12_r1.check(q12_a_r);
        RadioButton rb_q12_1_r = (RadioButton)findViewById(R.id.radioButton_r_q18);
        RadioButton rb_q12_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q18);
        RadioButton rb_q12_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q18);
        RadioButton rb_q12_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q18);
        RadioButton rb_q12_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q18);
        if(q12_a_r==q12_rb1_id_r) {
            rg_q12_r1.check(R.id.radioButton_r_q18);
            rb_q12_2_r.setEnabled(false);
            rb_q12_3_r.setEnabled(false);
            rb_q12_4_r.setEnabled(false);
            rb_q12_5_r.setEnabled(false);
        }else if(q12_a_r==q12_rb2_id_r){
            rb_q12_1_r.setEnabled(false);
            rg_q12_r1.check(R.id.radioButton2_r_q18);
            rb_q12_3_r.setEnabled(false);
            rb_q12_4_r.setEnabled(false);
            rb_q12_5_r.setEnabled(false);
        }else if(q12_a_r==q12_rb3_id_r){
            rb_q12_1_r.setEnabled(false);
            rb_q12_2_r.setEnabled(false);
            rg_q12_r1.check(R.id.radioButton3_r_q18);
            rb_q12_4_r.setEnabled(false);
            rb_q12_5_r.setEnabled(false);
        }else if(q12_a_r==q12_rb4_id_r){
            rb_q12_1_r.setEnabled(false);
            rb_q12_2_r.setEnabled(false);
            rb_q12_3_r.setEnabled(false);
            rg_q12_r1.check(R.id.radioButton4_r_q18);
            rb_q12_5_r.setEnabled(false);
        }else if(q12_a_r==q12_rb5_id_r){
            rb_q12_1_r.setEnabled(false);
            rb_q12_2_r.setEnabled(false);
            rb_q12_3_r.setEnabled(false);
            rb_q12_4_r.setEnabled(false);
            rg_q12_r1.check(R.id.radioButton5_r_q18);
        }

        if(q18_a==q18_rb1_id && q12_a_r==q12_rb5_id_r
                || q18_a==q18_rb2_id && q12_a_r==q12_rb1_id_r
                || q18_a==q18_rb5_id && q12_a_r==q12_rb4_id_r
                || q18_a==q18_rb4_id && q12_a_r==q12_rb2_id_r){
            ConstraintLayout layout_q18 = (ConstraintLayout) findViewById(R.id.q18_back);
            layout_q18.setBackgroundResource(R.color.not_not);
        }

        if(q18_a==q18_rb3_id)    sum=sum+5;if(q12_a_r==q12_rb3_id_r)    sum_r=sum_r+5;

        int q19_a = intent.getIntExtra("q19_answer",0);
        int q19_rb1_id = intent.getIntExtra("q19_rb1_setId",0);
        int q19_rb2_id = intent.getIntExtra("q19_rb2_setId",0);
        int q19_rb3_id = intent.getIntExtra("q19_rb3_setId",0);
        int q19_rb4_id = intent.getIntExtra("q19_rb4_setId",0);
        int q19_rb5_id = intent.getIntExtra("q19_rb5_setId",0);

        RadioGroup rg_q19_r=(RadioGroup) findViewById(R.id.q19_rg_r);

        RadioButton rb_q19_1 = (RadioButton)findViewById(R.id.radioButton_q19);
        RadioButton rb_q19_2 = (RadioButton)findViewById(R.id.radioButton2_q19);
        RadioButton rb_q19_3 = (RadioButton)findViewById(R.id.radioButton3_q19);
        RadioButton rb_q19_4 = (RadioButton)findViewById(R.id.radioButton4_q19);
        RadioButton rb_q19_5 = (RadioButton)findViewById(R.id.radioButton5_q19);
        if(q19_a==q19_rb1_id) {
            rg_q19_r.check(R.id.radioButton_q19);
            rb_q19_2.setEnabled(false);
            rb_q19_3.setEnabled(false);
            rb_q19_4.setEnabled(false);
            rb_q19_5.setEnabled(false);
        }else if(q19_a==q19_rb2_id){
            rb_q19_1.setEnabled(false);
            rg_q19_r.check(R.id.radioButton2_q19);
            rb_q19_3.setEnabled(false);
            rb_q19_4.setEnabled(false);
            rb_q19_5.setEnabled(false);
        }else if(q19_a==q19_rb3_id){
            rb_q19_1.setEnabled(false);
            rb_q19_2.setEnabled(false);
            rg_q19_r.check(R.id.radioButton3_q19);
            rb_q19_4.setEnabled(false);
            rb_q19_5.setEnabled(false);
        }else if(q19_a==q19_rb4_id){
            rb_q19_1.setEnabled(false);
            rb_q19_2.setEnabled(false);
            rb_q19_3.setEnabled(false);
            rg_q19_r.check(R.id.radioButton4_q19);
            rb_q19_5.setEnabled(false);
        }else if(q19_a==q19_rb5_id){
            rb_q19_1.setEnabled(false);
            rb_q19_2.setEnabled(false);
            rb_q19_3.setEnabled(false);
            rb_q19_4.setEnabled(false);
            rg_q19_r.check(R.id.radioButton5_q19);
        }
        int q3_a_r = intent.getIntExtra("q3_answer_r",0);
        int q3_rb1_id_r = intent.getIntExtra("q3_rb1_setId_r",0);
        int q3_rb2_id_r = intent.getIntExtra("q3_rb2_setId_r",0);
        int q3_rb3_id_r = intent.getIntExtra("q3_rb3_setId_r",0);
        int q3_rb4_id_r = intent.getIntExtra("q3_rb4_setId_r",0);
        int q3_rb5_id_r = intent.getIntExtra("q3_rb5_setId_r",0);
        RadioGroup rg_q3_r1=(RadioGroup) findViewById(R.id.q19_rg_r1);
/*^^;q19→r11*/        rg_q3_r1.check(q3_a_r);
        RadioButton rb_q3_1_r = (RadioButton)findViewById(R.id.radioButton_r_q19);
        RadioButton rb_q3_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q19);
        RadioButton rb_q3_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q19);
        RadioButton rb_q3_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q19);
        RadioButton rb_q3_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q19);
        if(q3_a_r==q3_rb1_id_r) {
            rg_q3_r1.check(R.id.radioButton_r_q19);
            rb_q3_2_r.setEnabled(false);
            rb_q3_3_r.setEnabled(false);
            rb_q3_4_r.setEnabled(false);
            rb_q3_5_r.setEnabled(false);
        }else if(q3_a_r==q3_rb2_id_r){
            rb_q3_1_r.setEnabled(false);
            rg_q3_r1.check(R.id.radioButton2_r_q19);
            rb_q3_3_r.setEnabled(false);
            rb_q3_4_r.setEnabled(false);
            rb_q3_5_r.setEnabled(false);
        }else if(q3_a_r==q3_rb3_id_r){
            rb_q3_1_r.setEnabled(false);
            rb_q3_2_r.setEnabled(false);
            rg_q3_r1.check(R.id.radioButton3_r_q19);
            rb_q3_4_r.setEnabled(false);
            rb_q3_5_r.setEnabled(false);
        }else if(q3_a_r==q3_rb4_id_r){
            rb_q3_1_r.setEnabled(false);
            rb_q3_2_r.setEnabled(false);
            rb_q3_3_r.setEnabled(false);
            rg_q3_r1.check(R.id.radioButton4_r_q19);
            rb_q3_5_r.setEnabled(false);
        }else if(q3_a_r==q3_rb5_id_r){
            rb_q3_1_r.setEnabled(false);
            rb_q3_2_r.setEnabled(false);
            rb_q3_3_r.setEnabled(false);
            rb_q3_4_r.setEnabled(false);
            rg_q3_r1.check(R.id.radioButton5_r_q19);
        }

        if(q19_a==q19_rb1_id && q3_a_r==q3_rb4_id_r
                || q19_a==q19_rb3_id && q3_a_r==q3_rb1_id_r
                || q19_a==q19_rb5_id && q3_a_r==q3_rb5_id_r
                || q19_a==q19_rb4_id && q3_a_r==q3_rb3_id_r){
            ConstraintLayout layout_q19 = (ConstraintLayout) findViewById(R.id.q19_back);
            layout_q19.setBackgroundResource(R.color.not_not);
        }

        if(q19_a==q19_rb2_id)    sum=sum+5;if(q3_a_r==q3_rb2_id_r)    sum_r=sum_r+5;

        int q20_a = intent.getIntExtra("q20_answer",0);
        int q20_rb1_id = intent.getIntExtra("q20_rb1_setId",0);
        int q20_rb2_id = intent.getIntExtra("q20_rb2_setId",0);
        int q20_rb3_id = intent.getIntExtra("q20_rb3_setId",0);
        int q20_rb4_id = intent.getIntExtra("q20_rb4_setId",0);
        int q20_rb5_id = intent.getIntExtra("q20_rb5_setId",0);

        RadioGroup rg_q20_r=(RadioGroup) findViewById(R.id.q20_rg_r);

        RadioButton rb_q20_1 = (RadioButton)findViewById(R.id.radioButton_q20);
        RadioButton rb_q20_2 = (RadioButton)findViewById(R.id.radioButton2_q20);
        RadioButton rb_q20_3 = (RadioButton)findViewById(R.id.radioButton3_q20);
        RadioButton rb_q20_4 = (RadioButton)findViewById(R.id.radioButton4_q20);
        RadioButton rb_q20_5 = (RadioButton)findViewById(R.id.radioButton5_q20);
        if(q20_a==q20_rb1_id) {
            rg_q20_r.check(R.id.radioButton_q20);
            rb_q20_2.setEnabled(false);
            rb_q20_3.setEnabled(false);
            rb_q20_4.setEnabled(false);
            rb_q20_5.setEnabled(false);
        }else if(q20_a==q20_rb2_id){
            rb_q20_1.setEnabled(false);
            rg_q20_r.check(R.id.radioButton2_q20);
            rb_q20_3.setEnabled(false);
            rb_q20_4.setEnabled(false);
            rb_q20_5.setEnabled(false);
        }else if(q20_a==q20_rb3_id){
            rb_q20_1.setEnabled(false);
            rb_q20_2.setEnabled(false);
            rg_q20_r.check(R.id.radioButton3_q20);
            rb_q20_4.setEnabled(false);
            rb_q20_5.setEnabled(false);
        }else if(q20_a==q20_rb4_id){
            rb_q20_1.setEnabled(false);
            rb_q20_2.setEnabled(false);
            rb_q20_3.setEnabled(false);
            rg_q20_r.check(R.id.radioButton4_q20);
            rb_q20_5.setEnabled(false);
        }else if(q20_a==q20_rb5_id){
            rb_q20_1.setEnabled(false);
            rb_q20_2.setEnabled(false);
            rb_q20_3.setEnabled(false);
            rb_q20_4.setEnabled(false);
            rg_q20_r.check(R.id.radioButton5_q20);
        }
        int q6_a_r = intent.getIntExtra("q6_answer_r",0);
        int q6_rb1_id_r = intent.getIntExtra("q6_rb1_setId_r",0);
        int q6_rb2_id_r = intent.getIntExtra("q6_rb2_setId_r",0);
        int q6_rb3_id_r = intent.getIntExtra("q6_rb3_setId_r",0);
        int q6_rb4_id_r = intent.getIntExtra("q6_rb4_setId_r",0);
        int q6_rb5_id_r = intent.getIntExtra("q6_rb5_setId_r",0);
        RadioGroup rg_q6_r1=(RadioGroup) findViewById(R.id.q20_rg_r1);
/*^^;q20→r11*/        rg_q6_r1.check(q6_a_r);
        RadioButton rb_q6_1_r = (RadioButton)findViewById(R.id.radioButton_r_q20);
        RadioButton rb_q6_2_r = (RadioButton)findViewById(R.id.radioButton2_r_q20);
        RadioButton rb_q6_3_r = (RadioButton)findViewById(R.id.radioButton3_r_q20);
        RadioButton rb_q6_4_r = (RadioButton)findViewById(R.id.radioButton4_r_q20);
        RadioButton rb_q6_5_r = (RadioButton)findViewById(R.id.radioButton5_r_q20);
        if(q6_a_r==q6_rb1_id_r) {
            rg_q6_r1.check(R.id.radioButton_r_q20);
            rb_q6_2_r.setEnabled(false);
            rb_q6_3_r.setEnabled(false);
            rb_q6_4_r.setEnabled(false);
            rb_q6_5_r.setEnabled(false);
        }else if(q6_a_r==q6_rb2_id_r){
            rb_q6_1_r.setEnabled(false);
            rg_q6_r1.check(R.id.radioButton2_r_q20);
            rb_q6_3_r.setEnabled(false);
            rb_q6_4_r.setEnabled(false);
            rb_q6_5_r.setEnabled(false);
        }else if(q6_a_r==q6_rb3_id_r){
            rb_q6_1_r.setEnabled(false);
            rb_q6_2_r.setEnabled(false);
            rg_q6_r1.check(R.id.radioButton3_r_q20);
            rb_q6_4_r.setEnabled(false);
            rb_q6_5_r.setEnabled(false);
        }else if(q6_a_r==q6_rb4_id_r){
            rb_q6_1_r.setEnabled(false);
            rb_q6_2_r.setEnabled(false);
            rb_q6_3_r.setEnabled(false);
            rg_q6_r1.check(R.id.radioButton4_r_q20);
            rb_q6_5_r.setEnabled(false);
        }else if(q6_a_r==q6_rb5_id_r){
            rb_q6_1_r.setEnabled(false);
            rb_q6_2_r.setEnabled(false);
            rb_q6_3_r.setEnabled(false);
            rb_q6_4_r.setEnabled(false);
            rg_q6_r1.check(R.id.radioButton5_r_q20);
        }

        if(q20_a==q20_rb1_id && q6_a_r==q6_rb1_id_r
                || q20_a==q20_rb2_id && q6_a_r==q6_rb3_id_r
                || q20_a==q20_rb5_id && q6_a_r==q6_rb4_id_r
                || q20_a==q20_rb4_id && q6_a_r==q6_rb5_id_r){
            ConstraintLayout layout_q20 = (ConstraintLayout) findViewById(R.id.q20_back);
            layout_q20.setBackgroundResource(R.color.not_not);
        }

        if(q20_a==q20_rb3_id)    sum=sum+5;if(q6_a_r==q6_rb2_id_r)    sum_r=sum_r+5;




        TextView ScoreView = (TextView) findViewById(R.id.score_r);
        ScoreView.setText(String.valueOf(sum));
        TextView ScoreView_2 = (TextView) findViewById(R.id.score_r_2);
        ScoreView_2.setText(String.valueOf(sum_r));

    }
    @Override
    public void onBackPressed(){

    }
}
