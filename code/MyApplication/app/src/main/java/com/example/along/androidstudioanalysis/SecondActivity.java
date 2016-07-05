package com.example.along.androidstudioanalysis;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

/**
 * Created by long on 2016/7/4.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        Log.e("longtianlove","SecondActivity---onCreate");
        dosomething();
    }
    public void dosomething(){
        Log.e("longtianlove","SecondActivity--dosomething--11");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("longtianlove","SecondActivity---onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("longtianlove","SecondActivity---onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("longtianlove","SecondActivity---onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("longtianlove","SecondActivity---onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("longtianlove","SecondActivity---onDestroy");
    }
}
