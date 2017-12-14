package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String out_id = intent.getStringExtra("InputID");
        TextView IdView = (TextView) findViewById(R.id.output_id);
        IdView.setText(out_id);
    }

    /*

    追加

     */
    public void onStartButtonTapped(View view) {
        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){

    }
    /*

     ここまで

     */
}
