package com.bravedroid.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private EditText mReply;
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mReply = findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }


    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replayIntent = new Intent();
        replayIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replayIntent);
        Log.d(LOG_TAG, "***********End SecondActivity*****");
        finish();
    }
}
