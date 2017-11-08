package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*

    追加

     */
    public void onStartButtonTapped(View view) {
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }
    /*

     ここまで

     */
}
