package com.example.app2sat7sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static com.example.app2sat7sem.BuildConfig.LOG;
import static com.example.app2sat7sem.BuildConfig.LOG_TAG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (LOG) Log.d(LOG_TAG, getClass().getSimpleName() + ".onCreate");
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_hello_world).setOnClickListener(this);
        findViewById(R.id.btn_hello_user).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hello_user) {
            startActivity(new Intent(this, HelloUsernameActivity.class));
        } else if (v.getId() == R.id.btn_hello_world) {
            startActivity(new Intent(this, HelloWorldActivity.class));
        }
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
