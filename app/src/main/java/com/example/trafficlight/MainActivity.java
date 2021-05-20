package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnRed, btnYellow,btnGreen;
    TextView textColor;
    ConstraintLayout constraintColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRed=findViewById(R.id.btnRed);
        btnYellow=findViewById(R.id.btnYellow);;
        btnGreen=findViewById(R.id.btnGreen);
        textColor=findViewById(R.id.textColor);
        constraintColor=findViewById(R.id.constrainColor);

    }
    public void onClockBtnGreen(View view) {
        textColor.setText(R.string.textGreen);
        constraintColor.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
        public void onClockBtnYellow(View view){
            textColor.setText(R.string.textYellow);
            constraintColor.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }
    public void onClockBtnRed(View view){
        textColor.setText(R.string.textRed);
        constraintColor.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

}