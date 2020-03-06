package com.example.app2sat7sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static com.example.app2sat7sem.BuildConfig.LOG;
import static com.example.app2sat7sem.BuildConfig.LOG_TAG;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
    @Override
    protected void onStart() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onStart");
        super.onStart();
    }
    @Override
    protected void onStop() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onStop");
        super.onStop();
    }
    @Override
    protected void onResume() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onResume");
        super.onResume();
    }
    @Override
    protected void onPause() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onPause");
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onDestroy");
        super.onDestroy();
    }
}
