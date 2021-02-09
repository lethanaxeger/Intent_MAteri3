package com.example.intent_materi3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = (TextView) findViewById(R.id.textView);

        //get data
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(IntentActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}