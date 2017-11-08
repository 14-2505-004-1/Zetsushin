package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    /*

    追加

     */
    public void onNextResultTapped(View view) {
        Intent intent = new Intent(this, result.class);
        startActivity(intent);
    }
    /*

     ここまで

     */
}
