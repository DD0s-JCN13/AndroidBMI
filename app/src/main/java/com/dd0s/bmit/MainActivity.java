package com.dd0s.bmit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edWeight;
    EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
    }
    public void bmit(View v){
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Float weight = Float.parseFloat(w);
        Float height = Float.parseFloat(h);
        Float bmi = weight / (height*height);
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI_EXTRA", bmi);
        startActivity(intent);
    }
}
