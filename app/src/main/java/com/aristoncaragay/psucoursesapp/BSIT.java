package com.aristoncaragay.psucoursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BSIT extends AppCompatActivity {

    int numOfUnits;
    double totalCost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsit);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button btComputeIT = findViewById(R.id.btcomputeIT);
        EditText tvUnits = findViewById(R.id.units);
        TextView tvResult = findViewById(R.id.tvResult);

        btComputeIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTuition();
            }

            private void calculateTuition() {
                numOfUnits = Integer.parseInt(tvUnits.getText().toString());
                totalCost = 500 * numOfUnits;
                DecimalFormat format = new DecimalFormat("0.00");
                if (numOfUnits > 30) {
                    Toast.makeText(BSIT.this, "Invalid!", Toast.LENGTH_SHORT).show();
                } else {
                    tvResult.setText("Your tuition per semester is " + format.format(totalCost));
                }
            }

        });
    }
}