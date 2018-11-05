package com.dd0s.bmit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        Float bmi = intent.getFloatExtra("BMI_EXTRA", 0);
        TextView txtView = findViewById(R.id.text_result);
        txtView.setText("您的BMI為：" + bmi);
    }
}
