package com.example.along.androidstudioanalysis;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public String s="1";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i=0;
        i=10;
         textView= (TextView) this.findViewById(R.id.text);
        button= (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        textView.setText(i+"1111");
        Log.e("longtianlove","MainActivity---onCreate--1");
        dosomething();
    }
    public void dosomething(){
        Log.e("longtianlove","MainActivity");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("longtianlove","MainActivity---onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("longtianlove","MainActivity---onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("longtianlove","MainActivity---onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("longtianlove","MainActivity---onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("longtianlove","MainActivity---onDestroy");
    }
}
