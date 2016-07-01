package com.example.aiowrite.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isEnglish=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeLabel(View view) {
        TextView tv= (TextView)findViewById(R.id.myText);
        tv.setText(isEnglish?  "Hello World!":"こんにちは！");
        isEnglish=!isEnglish;
    }
}
