package com.example.dincalcemptyactivity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HackInfoPopup extends AppCompatActivity {
    protected TextView xButton, typeDesc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hackinfopopup);
        xButton = (TextView) findViewById(R.id.xbutton);
        typeDesc = (TextView) findViewById(R.id.typeDesc);

        DinCalcHelpers.readFiletoTextView(this, typeDesc, "skierTypeInfo.txt");

        //hides Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
