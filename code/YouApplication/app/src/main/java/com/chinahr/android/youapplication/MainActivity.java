package com.chinahr.android.youapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i=0;
        i=10;
        TextView textView= (TextView) this.findViewById(R.id.text);
        textView.setText(i + "");
    }
}
