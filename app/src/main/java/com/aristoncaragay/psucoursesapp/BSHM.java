package com.aristoncaragay.psucoursesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BSHM extends AppCompatActivity {

    int numOfUnits;
    double totalCost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bshm);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button btComputeHM = findViewById(R.id.btComputeHM);
        EditText tvUnits = findViewById(R.id.units);
        TextView tvResult = findViewById(R.id.tvResultHM);

        btComputeHM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateTuition();
            }

            private void calculateTuition() {
                numOfUnits = Integer.parseInt(tvUnits.getText().toString());
                totalCost = 500 * numOfUnits;
                DecimalFormat format = new DecimalFormat("0.00");

                if (numOfUnits > 30) {
                    Toast.makeText(BSHM.this, "Invalid", Toast.LENGTH_SHORT).show();
                } else {
                    tvResult.setText("Your tuition per semester is " + format.format(totalCost));
                }
            }

        });
    }
}
