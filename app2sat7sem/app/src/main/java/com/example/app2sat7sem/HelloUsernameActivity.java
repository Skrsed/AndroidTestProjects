package com.example.app2sat7sem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HelloUsernameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText;
    private TextView messageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_username);
        final View btnSubmit;
        nameEditText = findViewById(R.id.input_name);
        messageText = findViewById(R.id.message_text);
        messageText.setVisibility(View.INVISIBLE);
        btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_submit) {
            onSubmitBtnClicked();
        }
    }
    private void onSubmitBtnClicked() {
        String name = nameEditText.getText().toString();
        String message = getString(R.string.hello_username, name);
        messageText.setText(message);
        messageText.setVisibility(View.VISIBLE);
    }
}
