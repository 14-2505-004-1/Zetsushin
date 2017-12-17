package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class confusion_ver2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confusion_ver2);


        Intent intent = getIntent();

        int A_x[]={0,0,0,0,0};
        int B_x[]={0,0,0,0,0};
        int C_x[]={0,0,0,0,0};
        int D_x[]={0,0,0,0,0};
        int E_x[]={0,0,0,0,0};


        //q1
        int q1_a = intent.getIntExtra("q1_answer",0);
        int q1_1_rb_id = intent.getIntExtra("q1_1_setId",0);
        int q1_2_rb_id = intent.getIntExtra("q1_2_setId",0);
        int q1_3_rb_id = intent.getIntExtra("q1_3_setId",0);
        int q1_4_rb_id = intent.getIntExtra("q1_4_setId",0);
        int q1_5_rb_id = intent.getIntExtra("q1_5_setId",0);
        if(q1_a==q1_1_rb_id)A_x[0]++;
        else if(q1_a==q1_2_rb_id)A_x[1]++;
        else if(q1_a==q1_3_rb_id)A_x[2]++;
        else if(q1_a==q1_4_rb_id)A_x[3]++;
        else if(q1_a==q1_5_rb_id)A_x[4]++;

        //q2
        int q2_a = intent.getIntExtra("q2_answer",0);
        int q2_rb1_id = intent.getIntExtra("q2_rb1_setId",0);
        int q2_rb2_id = intent.getIntExtra("q2_rb2_setId",0);
        int q2_rb3_id = intent.getIntExtra("q2_rb3_setId",0);
        int q2_rb4_id = intent.getIntExtra("q2_rb4_setId",0);
        int q2_rb5_id = intent.getIntExtra("q2_rb5_setId",0);
        if(q2_a==q2_rb1_id)D_x[3]++;
        else if(q2_a==q2_rb2_id)D_x[2]++;
        else if(q2_a==q2_rb3_id)D_x[1]++;
        else if(q2_a==q2_rb4_id)D_x[4]++;
        else if(q2_a==q2_rb5_id)D_x[0]++;
//q3
        int q3_a = intent.getIntExtra("q3_answer",0);
        int q3_rb1_id = intent.getIntExtra("q3_rb1_setId",0);
        int q3_rb2_id = intent.getIntExtra("q3_rb2_setId",0);
        int q3_rb3_id = intent.getIntExtra("q3_rb3_setId",0);
        int q3_rb4_id = intent.getIntExtra("q3_rb4_setId",0);
        int q3_rb5_id = intent.getIntExtra("q3_rb5_setId",0);
        if(q3_a==q3_rb1_id)B_x[4]++;
        else if(q3_a==q3_rb2_id)B_x[0]++;
        else if(q3_a==q3_rb3_id)B_x[3]++;
        else if(q3_a==q3_rb4_id)B_x[1]++;
        else if(q3_a==q3_rb5_id)B_x[2]++;
//q4
        int q4_a = intent.getIntExtra("q4_answer",0);
        int q4_rb1_id = intent.getIntExtra("q4_rb1_setId",0);
        int q4_rb2_id = intent.getIntExtra("q4_rb2_setId",0);
        int q4_rb3_id = intent.getIntExtra("q4_rb3_setId",0);
        int q4_rb4_id = intent.getIntExtra("q4_rb4_setId",0);
        int q4_rb5_id = intent.getIntExtra("q4_rb5_setId",0);
        if(q4_a==q4_rb1_id)B_x[0]++;
        else if(q4_a==q4_rb2_id)B_x[1]++;
        else if(q4_a==q4_rb3_id)B_x[3]++;
        else if(q4_a==q4_rb4_id)B_x[2]++;
        else if(q4_a==q4_rb5_id)B_x[4]++;
//q5
        int q5_a = intent.getIntExtra("q5_answer",0);
        int q5_rb1_id = intent.getIntExtra("q5_rb1_setId",0);
        int q5_rb2_id = intent.getIntExtra("q5_rb2_setId",0);
        int q5_rb3_id = intent.getIntExtra("q5_rb3_setId",0);
        int q5_rb4_id = intent.getIntExtra("q5_rb4_setId",0);
        int q5_rb5_id = intent.getIntExtra("q5_rb5_setId",0);
        if(q5_a==q5_rb1_id)D_x[1]++;
        else if(q5_a==q5_rb2_id)D_x[2]++;
        else if(q5_a==q5_rb3_id)D_x[0]++;
        else if(q5_a==q5_rb4_id)D_x[3]++;
        else if(q5_a==q5_rb5_id)D_x[4]++;
//q6
        int q6_a = intent.getIntExtra("q6_answer",0);
        int q6_rb1_id = intent.getIntExtra("q6_rb1_setId",0);
        int q6_rb2_id = intent.getIntExtra("q6_rb2_setId",0);
        int q6_rb3_id = intent.getIntExtra("q6_rb3_setId",0);
        int q6_rb4_id = intent.getIntExtra("q6_rb4_setId",0);
        int q6_rb5_id = intent.getIntExtra("q6_rb5_setId",0);
        if(q6_a==q6_rb1_id)C_x[4]++;
        else if(q6_a==q6_rb2_id)C_x[3]++;
        else if(q6_a==q6_rb3_id)C_x[0]++;
        else if(q6_a==q6_rb4_id)C_x[1]++;
        else if(q6_a==q6_rb5_id)C_x[2]++;
//q7
        int q7_a = intent.getIntExtra("q7_answer",0);
        int q7_rb1_id = intent.getIntExtra("q7_rb1_setId",0);
        int q7_rb2_id = intent.getIntExtra("q7_rb2_setId",0);
        int q7_rb3_id = intent.getIntExtra("q7_rb3_setId",0);
        int q7_rb4_id = intent.getIntExtra("q7_rb4_setId",0);
        int q7_rb5_id = intent.getIntExtra("q7_rb5_setId",0);
        if(q7_a==q7_rb1_id)B_x[3]++;
        else if(q7_a==q7_rb2_id)B_x[2]++;
        else if(q7_a==q7_rb3_id)B_x[4]++;
        else if(q7_a==q7_rb4_id)B_x[0]++;
        else if(q7_a==q7_rb5_id)B_x[1]++;
//q8
        int q8_a = intent.getIntExtra("q8_answer",0);
        int q8_rb1_id = intent.getIntExtra("q8_rb1_setId",0);
        int q8_rb2_id = intent.getIntExtra("q8_rb2_setId",0);
        int q8_rb3_id = intent.getIntExtra("q8_rb3_setId",0);
        int q8_rb4_id = intent.getIntExtra("q8_rb4_setId",0);
        int q8_rb5_id = intent.getIntExtra("q8_rb5_setId",0);
        if(q8_a==q8_rb1_id)D_x[0]++;
        else if(q8_a==q8_rb2_id)D_x[1]++;
        else if(q8_a==q8_rb3_id)D_x[2]++;
        else if(q8_a==q8_rb4_id)D_x[3]++;
        else if(q8_a==q8_rb5_id)D_x[4]++;
//q9
        int q9_a = intent.getIntExtra("q9_answer",0);
        int q9_rb1_id = intent.getIntExtra("q9_rb1_setId",0);
        int q9_rb2_id = intent.getIntExtra("q9_rb2_setId",0);
        int q9_rb3_id = intent.getIntExtra("q9_rb3_setId",0);
        int q9_rb4_id = intent.getIntExtra("q9_rb4_setId",0);
        int q9_rb5_id = intent.getIntExtra("q9_rb5_setId",0);
        if(q9_a==q9_rb1_id)D_x[2]++;
        else if(q9_a==q9_rb2_id)D_x[1]++;
        else if(q9_a==q9_rb3_id)D_x[4]++;
        else if(q9_a==q9_rb4_id)D_x[0]++;
        else if(q9_a==q9_rb5_id)D_x[3]++;
//q10
        int q10_a = intent.getIntExtra("q10_answer",0);
        int q10_rb1_id = intent.getIntExtra("q10_rb1_setId",0);
        int q10_rb2_id = intent.getIntExtra("q10_rb2_setId",0);
        int q10_rb3_id = intent.getIntExtra("q10_rb3_setId",0);
        int q10_rb4_id = intent.getIntExtra("q10_rb4_setId",0);
        int q10_rb5_id = intent.getIntExtra("q10_rb5_setId",0);
        if(q10_a==q10_rb1_id)A_x[0]++;
        else if(q10_a==q10_rb2_id)A_x[3]++;
        else if(q10_a==q10_rb3_id)A_x[2]++;
        else if(q10_a==q10_rb4_id)A_x[1]++;
        else if(q10_a==q10_rb5_id)A_x[4]++;
//q11
        int q11_a = intent.getIntExtra("q11_answer",0);
        int q11_rb1_id = intent.getIntExtra("q11_rb1_setId",0);
        int q11_rb2_id = intent.getIntExtra("q11_rb2_setId",0);
        int q11_rb3_id = intent.getIntExtra("q11_rb3_setId",0);
        int q11_rb4_id = intent.getIntExtra("q11_rb4_setId",0);
        int q11_rb5_id = intent.getIntExtra("q11_rb5_setId",0);
        if(q11_a==q11_rb1_id)B_x[4]++;
        else if(q11_a==q11_rb2_id)B_x[0]++;
        else if(q11_a==q11_rb3_id)B_x[2]++;
        else if(q11_a==q11_rb4_id)B_x[1]++;
        else if(q11_a==q11_rb5_id)B_x[3]++;
//q12
        int q12_a = intent.getIntExtra("q12_answer",0);
        int q12_rb1_id = intent.getIntExtra("q12_rb1_setId",0);
        int q12_rb2_id = intent.getIntExtra("q12_rb2_setId",0);
        int q12_rb3_id = intent.getIntExtra("q12_rb3_setId",0);
        int q12_rb4_id = intent.getIntExtra("q12_rb4_setId",0);
        int q12_rb5_id = intent.getIntExtra("q12_rb5_setId",0);
        if(q12_a==q12_rb1_id)B_x[2]++;
        else if(q12_a==q12_rb2_id)B_x[0]++;
        else if(q12_a==q12_rb3_id)B_x[1]++;
        else if(q12_a==q12_rb4_id)B_x[4]++;
        else if(q12_a==q12_rb5_id)B_x[3]++;
//q13
        int q13_a = intent.getIntExtra("q13_answer",0);
        int q13_rb1_id = intent.getIntExtra("q13_rb1_setId",0);
        int q13_rb2_id = intent.getIntExtra("q13_rb2_setId",0);
        int q13_rb3_id = intent.getIntExtra("q13_rb3_setId",0);
        int q13_rb4_id = intent.getIntExtra("q13_rb4_setId",0);
        int q13_rb5_id = intent.getIntExtra("q13_rb5_setId",0);
        if(q13_a==q13_rb1_id)D_x[3]++;
        else if(q13_a==q13_rb2_id)D_x[1]++;
        else if(q13_a==q13_rb3_id)D_x[0]++;
        else if(q13_a==q13_rb4_id)D_x[4]++;
        else if(q13_a==q13_rb5_id)D_x[2]++;
//q14
        int q14_a = intent.getIntExtra("q14_answer",0);
        int q14_rb1_id = intent.getIntExtra("q14_rb1_setId",0);
        int q14_rb2_id = intent.getIntExtra("q14_rb2_setId",0);
        int q14_rb3_id = intent.getIntExtra("q14_rb3_setId",0);
        int q14_rb4_id = intent.getIntExtra("q14_rb4_setId",0);
        int q14_rb5_id = intent.getIntExtra("q14_rb5_setId",0);
        if(q14_a==q14_rb1_id)E_x[0]++;
        else if(q14_a==q14_rb2_id)E_x[4]++;
        else if(q14_a==q14_rb3_id)E_x[1]++;
        else if(q14_a==q14_rb4_id)E_x[2]++;
        else if(q14_a==q14_rb5_id)E_x[3]++;
//q15
        int q15_a = intent.getIntExtra("q15_answer",0);
        int q15_rb1_id = intent.getIntExtra("q15_rb1_setId",0);
        int q15_rb2_id = intent.getIntExtra("q15_rb2_setId",0);
        int q15_rb3_id = intent.getIntExtra("q15_rb3_setId",0);
        int q15_rb4_id = intent.getIntExtra("q15_rb4_setId",0);
        int q15_rb5_id = intent.getIntExtra("q15_rb5_setId",0);
        if(q15_a==q15_rb1_id)B_x[2]++;
        else if(q15_a==q15_rb2_id)B_x[0]++;
        else if(q15_a==q15_rb3_id)B_x[4]++;
        else if(q15_a==q15_rb4_id)B_x[1]++;
        else if(q15_a==q15_rb5_id)B_x[3]++;
//q16
        int q16_a = intent.getIntExtra("q16_answer",0);
        int q16_rb1_id = intent.getIntExtra("q16_rb1_setId",0);
        int q16_rb2_id = intent.getIntExtra("q16_rb2_setId",0);
        int q16_rb3_id = intent.getIntExtra("q16_rb3_setId",0);
        int q16_rb4_id = intent.getIntExtra("q16_rb4_setId",0);
        int q16_rb5_id = intent.getIntExtra("q16_rb5_setId",0);
        if(q16_a==q16_rb1_id)D_x[2]++;
        else if(q16_a==q16_rb2_id)D_x[1]++;
        else if(q16_a==q16_rb3_id)D_x[3]++;
        else if(q16_a==q16_rb4_id)D_x[4]++;
        else if(q16_a==q16_rb5_id)D_x[0]++;
//q17
        int q17_a = intent.getIntExtra("q17_answer",0);
        int q17_rb1_id = intent.getIntExtra("q17_rb1_setId",0);
        int q17_rb2_id = intent.getIntExtra("q17_rb2_setId",0);
        int q17_rb3_id = intent.getIntExtra("q17_rb3_setId",0);
        int q17_rb4_id = intent.getIntExtra("q17_rb4_setId",0);
        int q17_rb5_id = intent.getIntExtra("q17_rb5_setId",0);
        if(q17_a==q17_rb1_id)B_x[3]++;
        else if(q17_a==q17_rb2_id)B_x[0]++;
        else if(q17_a==q17_rb3_id)B_x[2]++;
        else if(q17_a==q17_rb4_id)B_x[4]++;
        else if(q17_a==q17_rb5_id)B_x[1]++;
//q18
        int q18_a = intent.getIntExtra("q18_answer",0);
        int q18_rb1_id = intent.getIntExtra("q18_rb1_setId",0);
        int q18_rb2_id = intent.getIntExtra("q18_rb2_setId",0);
        int q18_rb3_id = intent.getIntExtra("q18_rb3_setId",0);
        int q18_rb4_id = intent.getIntExtra("q18_rb4_setId",0);
        int q18_rb5_id = intent.getIntExtra("q18_rb5_setId",0);
        if(q18_a==q18_rb1_id)B_x[3]++;
        else if(q18_a==q18_rb2_id)B_x[2]++;
        else if(q18_a==q18_rb3_id)B_x[1]++;
        else if(q18_a==q18_rb4_id)B_x[0]++;
        else if(q18_a==q18_rb5_id)B_x[4]++;
//q19
        int q19_a = intent.getIntExtra("q19_answer",0);
        int q19_rb1_id = intent.getIntExtra("q19_rb1_setId",0);
        int q19_rb2_id = intent.getIntExtra("q19_rb2_setId",0);
        int q19_rb3_id = intent.getIntExtra("q19_rb3_setId",0);
        int q19_rb4_id = intent.getIntExtra("q19_rb4_setId",0);
        int q19_rb5_id = intent.getIntExtra("q19_rb5_setId",0);
        if(q19_a==q19_rb1_id)A_x[1]++;
        else if(q19_a==q19_rb2_id)A_x[0]++;
        else if(q19_a==q19_rb3_id)A_x[4]++;
        else if(q19_a==q19_rb4_id)A_x[3]++;
        else if(q19_a==q19_rb5_id)A_x[2]++;
//q20
        int q20_a = intent.getIntExtra("q20_answer",0);
        int q20_rb1_id = intent.getIntExtra("q20_rb1_setId",0);
        int q20_rb2_id = intent.getIntExtra("q20_rb2_setId",0);
        int q20_rb3_id = intent.getIntExtra("q20_rb3_setId",0);
        int q20_rb4_id = intent.getIntExtra("q20_rb4_setId",0);
        int q20_rb5_id = intent.getIntExtra("q20_rb5_setId",0);
        if(q20_a==q20_rb1_id)D_x[4]++;
        else if(q20_a==q20_rb2_id)D_x[0]++;
        else if(q20_a==q20_rb3_id)D_x[3]++;
        else if(q20_a==q20_rb4_id)D_x[2]++;
        else if(q20_a==q20_rb5_id)D_x[1]++;



        TextView in_vA_1 = (TextView) findViewById(R.id.vA_1);
        in_vA_1.setText(String.valueOf(A_x[0]));
        TextView in_vA_2 = (TextView) findViewById(R.id.vA_2);
        in_vA_2.setText(String.valueOf(A_x[1]));
        TextView in_vA_3 = (TextView) findViewById(R.id.vA_3);
        in_vA_3.setText(String.valueOf(A_x[2]));
        TextView in_vA_4 = (TextView) findViewById(R.id.vA_4);
        in_vA_4.setText(String.valueOf(A_x[3]));
        TextView in_vA_5 = (TextView) findViewById(R.id.vA_5);
        in_vA_5.setText(String.valueOf(A_x[4]));

        TextView in_vB_1 = (TextView) findViewById(R.id.vB_1);
        in_vB_1.setText(String.valueOf(B_x[0]));
        TextView in_vB_2 = (TextView) findViewById(R.id.vB_2);
        in_vB_2.setText(String.valueOf(B_x[1]));
        TextView in_vB_3 = (TextView) findViewById(R.id.vB_3);
        in_vB_3.setText(String.valueOf(B_x[2]));
        TextView in_vB_4 = (TextView) findViewById(R.id.vB_4);
        in_vB_4.setText(String.valueOf(B_x[3]));
        TextView in_vB_5 = (TextView) findViewById(R.id.vB_5);
        in_vB_5.setText(String.valueOf(B_x[4]));

        TextView in_vC_1 = (TextView) findViewById(R.id.vC_1);
        in_vC_1.setText(String.valueOf(C_x[0]));
        TextView in_vC_2 = (TextView) findViewById(R.id.vC_2);
        in_vC_2.setText(String.valueOf(C_x[1]));
        TextView in_vC_3 = (TextView) findViewById(R.id.vC_3);
        in_vC_3.setText(String.valueOf(C_x[2]));
        TextView in_vC_4 = (TextView) findViewById(R.id.vC_4);
        in_vC_4.setText(String.valueOf(C_x[3]));
        TextView in_vC_5 = (TextView) findViewById(R.id.vC_5);
        in_vC_5.setText(String.valueOf(C_x[4]));

        TextView in_vD_1 = (TextView) findViewById(R.id.vD_1);
        in_vD_1.setText(String.valueOf(D_x[0]));
        TextView in_vD_2 = (TextView) findViewById(R.id.vD_2);
        in_vD_2.setText(String.valueOf(D_x[1]));
        TextView in_vD_3 = (TextView) findViewById(R.id.vD_3);
        in_vD_3.setText(String.valueOf(D_x[2]));
        TextView in_vD_4 = (TextView) findViewById(R.id.vD_4);
        in_vD_4.setText(String.valueOf(D_x[3]));
        TextView in_vD_5 = (TextView) findViewById(R.id.vD_5);
        in_vD_5.setText(String.valueOf(D_x[4]));

        TextView in_vE_1 = (TextView) findViewById(R.id.vE_1);
        in_vE_1.setText(String.valueOf(E_x[0]));
        TextView in_vE_2 = (TextView) findViewById(R.id.vE_2);
        in_vE_2.setText(String.valueOf(E_x[1]));
        TextView in_vE_3 = (TextView) findViewById(R.id.vE_3);
        in_vE_3.setText(String.valueOf(E_x[2]));
        TextView in_vE_4 = (TextView) findViewById(R.id.vE_4);
        in_vE_4.setText(String.valueOf(E_x[3]));
        TextView in_vE_5 = (TextView) findViewById(R.id.vE_5);
        in_vE_5.setText(String.valueOf(E_x[4]));


        TextView in_vc_1 = (TextView) findViewById(R.id.vc_1);
        in_vc_1.setText(String.valueOf(A_x[0]*100/3));
        TextView in_vc_1_bun = (TextView) findViewById(R.id.vc_1_bun);
        in_vc_1_bun.setText("("+String.valueOf(A_x[0])+"/3)");

        TextView in_vc_2 = (TextView) findViewById(R.id.vc_2);
        in_vc_2.setText(String.valueOf(B_x[1]*100/8));
        TextView in_vc_2_bun = (TextView) findViewById(R.id.vc_2_bun);
        in_vc_2_bun.setText("("+String.valueOf(B_x[1])+"/8)");

        TextView in_vc_3 = (TextView) findViewById(R.id.vc_3);
        in_vc_3.setText(String.valueOf(C_x[2]*100));
        TextView in_vc_3_bun = (TextView) findViewById(R.id.vc_3_bun);
        in_vc_3_bun.setText("("+String.valueOf(C_x[2])+"/1)");

        TextView in_vc_4 = (TextView) findViewById(R.id.vc_4);
        in_vc_4.setText(String.valueOf(D_x[3]*100/7));
        TextView in_vc_4_bun = (TextView) findViewById(R.id.vc_4_bun);
        in_vc_4_bun.setText("("+String.valueOf(D_x[3])+"/7)");

        TextView in_vc_5 = (TextView) findViewById(R.id.vc_5);
        in_vc_5.setText(String.valueOf(E_x[4]*100));
        TextView in_vc_5_bun = (TextView) findViewById(R.id.vc_5_bun);
        in_vc_5_bun.setText("("+String.valueOf(E_x[4])+"/1)");


        TextView in_vc_t = (TextView) findViewById(R.id.vc_t);
        in_vc_t.setText(String.valueOf((A_x[0]+B_x[1]+C_x[2]+D_x[3]+E_x[4])*100/20));
        TextView in_vc_t_bun = (TextView) findViewById(R.id.vc_t_bun);
        in_vc_t_bun.setText("("+String.valueOf(A_x[0]+B_x[1]+C_x[2]+D_x[3]+E_x[4])+"/20)");

        int sum = 0;
        if(q1_a==q1_1_rb_id)    sum=sum+5;
        if(q2_a==q2_rb1_id)     sum=sum+5;
        if(q3_a==q3_rb4_id)     sum=sum+5;
        if(q4_a==q4_rb2_id)     sum=sum+5;
        if(q5_a==q5_rb4_id)     sum=sum+5;
        if(q6_a==q6_rb5_id)     sum=sum+5;
        if(q7_a==q7_rb5_id)     sum=sum+5;
        if(q8_a==q8_rb4_id)     sum=sum+5;
        if(q9_a==q9_rb5_id)     sum=sum+5;
        if(q10_a==q10_rb1_id)     sum=sum+5;
        if(q11_a==q11_rb4_id)     sum=sum+5;
        if(q12_a==q12_rb3_id)     sum=sum+5;
        if(q13_a==q13_rb1_id)     sum=sum+5;
        if(q14_a==q14_rb2_id)     sum=sum+5;
        if(q15_a==q15_rb4_id)     sum=sum+5;
        if(q16_a==q16_rb3_id)     sum=sum+5;
        if(q17_a==q17_rb5_id)     sum=sum+5;
        if(q18_a==q18_rb3_id)     sum=sum+5;
        if(q19_a==q19_rb2_id)     sum=sum+5;
        if(q20_a==q20_rb3_id)     sum=sum+5;

        TextView in_vc_score = (TextView) findViewById(R.id.score_vc);
        in_vc_score.setText(String.valueOf(sum));




    }

    public void onNextResult_confusion_Tapped(View view) {
        Intent intent_test = getIntent();
        Intent intent = new Intent(this, result_all.class);


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


/**/
        intent.putExtra("q1_answer_r",intent_test.getIntExtra("q1_answer_r",0));
        intent.putExtra("q1_rb1_setId_r",intent_test.getIntExtra("q1_1_setId_r",0));
        intent.putExtra("q1_rb2_setId_r",intent_test.getIntExtra("q1_2_setId_r",0));
        intent.putExtra("q1_rb3_setId_r",intent_test.getIntExtra("q1_3_setId_r",0));
        intent.putExtra("q1_rb4_setId_r",intent_test.getIntExtra("q1_4_setId_r",0));
        intent.putExtra("q1_rb5_setId_r",intent_test.getIntExtra("q1_5_setId_r",0));

        intent.putExtra("q2_answer_r",intent_test.getIntExtra("q2_answer_r",0));
        intent.putExtra("q2_rb1_setId_r",intent_test.getIntExtra("q2_rb1_setId_r",0));
        intent.putExtra("q2_rb2_setId_r",intent_test.getIntExtra("q2_rb2_setId_r",0));
        intent.putExtra("q2_rb3_setId_r",intent_test.getIntExtra("q2_rb3_setId_r",0));
        intent.putExtra("q2_rb4_setId_r",intent_test.getIntExtra("q2_rb4_setId_r",0));
        intent.putExtra("q2_rb5_setId_r",intent_test.getIntExtra("q2_rb5_setId_r",0));

        intent.putExtra("q3_answer_r",intent_test.getIntExtra("q3_answer_r",0));
        intent.putExtra("q3_rb1_setId_r",intent_test.getIntExtra("q3_rb1_setId_r",0));
        intent.putExtra("q3_rb2_setId_r",intent_test.getIntExtra("q3_rb2_setId_r",0));
        intent.putExtra("q3_rb3_setId_r",intent_test.getIntExtra("q3_rb3_setId_r",0));
        intent.putExtra("q3_rb4_setId_r",intent_test.getIntExtra("q3_rb4_setId_r",0));
        intent.putExtra("q3_rb5_setId_r",intent_test.getIntExtra("q3_rb5_setId_r",0));

        intent.putExtra("q4_answer_r",intent_test.getIntExtra("q4_answer_r",0));
        intent.putExtra("q4_rb1_setId_r",intent_test.getIntExtra("q4_rb1_setId_r",0));
        intent.putExtra("q4_rb2_setId_r",intent_test.getIntExtra("q4_rb2_setId_r",0));
        intent.putExtra("q4_rb3_setId_r",intent_test.getIntExtra("q4_rb3_setId_r",0));
        intent.putExtra("q4_rb4_setId_r",intent_test.getIntExtra("q4_rb4_setId_r",0));
        intent.putExtra("q4_rb5_setId_r",intent_test.getIntExtra("q4_rb5_setId_r",0));

        intent.putExtra("q5_answer_r",intent_test.getIntExtra("q5_answer_r",0));
        intent.putExtra("q5_rb1_setId_r",intent_test.getIntExtra("q5_rb1_setId_r",0));
        intent.putExtra("q5_rb2_setId_r",intent_test.getIntExtra("q5_rb2_setId_r",0));
        intent.putExtra("q5_rb3_setId_r",intent_test.getIntExtra("q5_rb3_setId_r",0));
        intent.putExtra("q5_rb4_setId_r",intent_test.getIntExtra("q5_rb4_setId_r",0));
        intent.putExtra("q5_rb5_setId_r",intent_test.getIntExtra("q5_rb5_setId_r",0));

        intent.putExtra("q6_answer_r",intent_test.getIntExtra("q6_answer_r",0));
        intent.putExtra("q6_rb1_setId_r",intent_test.getIntExtra("q6_rb1_setId_r",0));
        intent.putExtra("q6_rb2_setId_r",intent_test.getIntExtra("q6_rb2_setId_r",0));
        intent.putExtra("q6_rb3_setId_r",intent_test.getIntExtra("q6_rb3_setId_r",0));
        intent.putExtra("q6_rb4_setId_r",intent_test.getIntExtra("q6_rb4_setId_r",0));
        intent.putExtra("q6_rb5_setId_r",intent_test.getIntExtra("q6_rb5_setId_r",0));

        intent.putExtra("q7_answer_r",intent_test.getIntExtra("q7_answer_r",0));
        intent.putExtra("q7_rb1_setId_r",intent_test.getIntExtra("q7_rb1_setId_r",0));
        intent.putExtra("q7_rb2_setId_r",intent_test.getIntExtra("q7_rb2_setId_r",0));
        intent.putExtra("q7_rb3_setId_r",intent_test.getIntExtra("q7_rb3_setId_r",0));
        intent.putExtra("q7_rb4_setId_r",intent_test.getIntExtra("q7_rb4_setId_r",0));
        intent.putExtra("q7_rb5_setId_r",intent_test.getIntExtra("q7_rb5_setId_r",0));

        intent.putExtra("q8_answer_r",intent_test.getIntExtra("q8_answer_r",0));
        intent.putExtra("q8_rb1_setId_r",intent_test.getIntExtra("q8_rb1_setId_r",0));
        intent.putExtra("q8_rb2_setId_r",intent_test.getIntExtra("q8_rb2_setId_r",0));
        intent.putExtra("q8_rb3_setId_r",intent_test.getIntExtra("q8_rb3_setId_r",0));
        intent.putExtra("q8_rb4_setId_r",intent_test.getIntExtra("q8_rb4_setId_r",0));
        intent.putExtra("q8_rb5_setId_r",intent_test.getIntExtra("q8_rb5_setId_r",0));

        intent.putExtra("q9_answer_r",intent_test.getIntExtra("q9_answer_r",0));
        intent.putExtra("q9_rb1_setId_r",intent_test.getIntExtra("q9_rb1_setId_r",0));
        intent.putExtra("q9_rb2_setId_r",intent_test.getIntExtra("q9_rb2_setId_r",0));
        intent.putExtra("q9_rb3_setId_r",intent_test.getIntExtra("q9_rb3_setId_r",0));
        intent.putExtra("q9_rb4_setId_r",intent_test.getIntExtra("q9_rb4_setId_r",0));
        intent.putExtra("q9_rb5_setId_r",intent_test.getIntExtra("q9_rb5_setId_r",0));

        intent.putExtra("q10_answer_r",intent_test.getIntExtra("q10_answer_r",0));
        intent.putExtra("q10_rb1_setId_r",intent_test.getIntExtra("q10_rb1_setId_r",0));
        intent.putExtra("q10_rb2_setId_r",intent_test.getIntExtra("q10_rb2_setId_r",0));
        intent.putExtra("q10_rb3_setId_r",intent_test.getIntExtra("q10_rb3_setId_r",0));
        intent.putExtra("q10_rb4_setId_r",intent_test.getIntExtra("q10_rb4_setId_r",0));
        intent.putExtra("q10_rb5_setId_r",intent_test.getIntExtra("q10_rb5_setId_r",0));

        intent.putExtra("q11_answer_r",intent_test.getIntExtra("q11_answer_r",0));
        intent.putExtra("q11_rb1_setId_r",intent_test.getIntExtra("q11_rb1_setId_r",0));
        intent.putExtra("q11_rb2_setId_r",intent_test.getIntExtra("q11_rb2_setId_r",0));
        intent.putExtra("q11_rb3_setId_r",intent_test.getIntExtra("q11_rb3_setId_r",0));
        intent.putExtra("q11_rb4_setId_r",intent_test.getIntExtra("q11_rb4_setId_r",0));
        intent.putExtra("q11_rb5_setId_r",intent_test.getIntExtra("q11_rb5_setId_r",0));

        intent.putExtra("q12_answer_r",intent_test.getIntExtra("q12_answer_r",0));
        intent.putExtra("q12_rb1_setId_r",intent_test.getIntExtra("q12_rb1_setId_r",0));
        intent.putExtra("q12_rb2_setId_r",intent_test.getIntExtra("q12_rb2_setId_r",0));
        intent.putExtra("q12_rb3_setId_r",intent_test.getIntExtra("q12_rb3_setId_r",0));
        intent.putExtra("q12_rb4_setId_r",intent_test.getIntExtra("q12_rb4_setId_r",0));
        intent.putExtra("q12_rb5_setId_r",intent_test.getIntExtra("q12_rb5_setId_r",0));

        intent.putExtra("q13_answer_r",intent_test.getIntExtra("q13_answer_r",0));
        intent.putExtra("q13_rb1_setId_r",intent_test.getIntExtra("q13_rb1_setId_r",0));
        intent.putExtra("q13_rb2_setId_r",intent_test.getIntExtra("q13_rb2_setId_r",0));
        intent.putExtra("q13_rb3_setId_r",intent_test.getIntExtra("q13_rb3_setId_r",0));
        intent.putExtra("q13_rb4_setId_r",intent_test.getIntExtra("q13_rb4_setId_r",0));
        intent.putExtra("q13_rb5_setId_r",intent_test.getIntExtra("q13_rb5_setId_r",0));

        intent.putExtra("q14_answer_r",intent_test.getIntExtra("q14_answer_r",0));
        intent.putExtra("q14_rb1_setId_r",intent_test.getIntExtra("q14_rb1_setId_r",0));
        intent.putExtra("q14_rb2_setId_r",intent_test.getIntExtra("q14_rb2_setId_r",0));
        intent.putExtra("q14_rb3_setId_r",intent_test.getIntExtra("q14_rb3_setId_r",0));
        intent.putExtra("q14_rb4_setId_r",intent_test.getIntExtra("q14_rb4_setId_r",0));
        intent.putExtra("q14_rb5_setId_r",intent_test.getIntExtra("q14_rb5_setId_r",0));

        intent.putExtra("q15_answer_r",intent_test.getIntExtra("q15_answer_r",0));
        intent.putExtra("q15_rb1_setId_r",intent_test.getIntExtra("q15_rb1_setId_r",0));
        intent.putExtra("q15_rb2_setId_r",intent_test.getIntExtra("q15_rb2_setId_r",0));
        intent.putExtra("q15_rb3_setId_r",intent_test.getIntExtra("q15_rb3_setId_r",0));
        intent.putExtra("q15_rb4_setId_r",intent_test.getIntExtra("q15_rb4_setId_r",0));
        intent.putExtra("q15_rb5_setId_r",intent_test.getIntExtra("q15_rb5_setId_r",0));

        intent.putExtra("q16_answer_r",intent_test.getIntExtra("q16_answer_r",0));
        intent.putExtra("q16_rb1_setId_r",intent_test.getIntExtra("q16_rb1_setId_r",0));
        intent.putExtra("q16_rb2_setId_r",intent_test.getIntExtra("q16_rb2_setId_r",0));
        intent.putExtra("q16_rb3_setId_r",intent_test.getIntExtra("q16_rb3_setId_r",0));
        intent.putExtra("q16_rb4_setId_r",intent_test.getIntExtra("q16_rb4_setId_r",0));
        intent.putExtra("q16_rb5_setId_r",intent_test.getIntExtra("q16_rb5_setId_r",0));

        intent.putExtra("q17_answer_r",intent_test.getIntExtra("q17_answer_r",0));
        intent.putExtra("q17_rb1_setId_r",intent_test.getIntExtra("q17_rb1_setId_r",0));
        intent.putExtra("q17_rb2_setId_r",intent_test.getIntExtra("q17_rb2_setId_r",0));
        intent.putExtra("q17_rb3_setId_r",intent_test.getIntExtra("q17_rb3_setId_r",0));
        intent.putExtra("q17_rb4_setId_r",intent_test.getIntExtra("q17_rb4_setId_r",0));
        intent.putExtra("q17_rb5_setId_r",intent_test.getIntExtra("q17_rb5_setId_r",0));

        intent.putExtra("q18_answer_r",intent_test.getIntExtra("q18_answer_r",0));
        intent.putExtra("q18_rb1_setId_r",intent_test.getIntExtra("q18_rb1_setId_r",0));
        intent.putExtra("q18_rb2_setId_r",intent_test.getIntExtra("q18_rb2_setId_r",0));
        intent.putExtra("q18_rb3_setId_r",intent_test.getIntExtra("q18_rb3_setId_r",0));
        intent.putExtra("q18_rb4_setId_r",intent_test.getIntExtra("q18_rb4_setId_r",0));
        intent.putExtra("q18_rb5_setId_r",intent_test.getIntExtra("q18_rb5_setId_r",0));

        intent.putExtra("q19_answer_r",intent_test.getIntExtra("q19_answer_r",0));
        intent.putExtra("q19_rb1_setId_r",intent_test.getIntExtra("q19_rb1_setId_r",0));
        intent.putExtra("q19_rb2_setId_r",intent_test.getIntExtra("q19_rb2_setId_r",0));
        intent.putExtra("q19_rb3_setId_r",intent_test.getIntExtra("q19_rb3_setId_r",0));
        intent.putExtra("q19_rb4_setId_r",intent_test.getIntExtra("q19_rb4_setId_r",0));
        intent.putExtra("q19_rb5_setId_r",intent_test.getIntExtra("q19_rb5_setId_r",0));

        intent.putExtra("q20_answer_r",intent_test.getIntExtra("q20_answer_r",0));
        intent.putExtra("q20_rb1_setId_r",intent_test.getIntExtra("q20_rb1_setId_r",0));
        intent.putExtra("q20_rb2_setId_r",intent_test.getIntExtra("q20_rb2_setId_r",0));
        intent.putExtra("q20_rb3_setId_r",intent_test.getIntExtra("q20_rb3_setId_r",0));
        intent.putExtra("q20_rb4_setId_r",intent_test.getIntExtra("q20_rb4_setId_r",0));
        intent.putExtra("q20_rb5_setId_r",intent_test.getIntExtra("q20_rb5_setId_r",0));


/**/        startActivity(intent);
    }
    @Override
    public void onBackPressed(){

    }
}
