package com.example.gascalculator;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtGasoline;
    private EditText edtEthanol;
    private Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGasoline = findViewById(R.id.edtGasoline);
        edtEthanol = findViewById(R.id.edtEthanol);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double gasValue = Double.valueOf(edtGasoline.getText().toString());
                double ethanolValue = Double.valueOf(edtEthanol.getText().toString());
                double rate = (ethanolValue / gasValue);
                if (rate > 0.7) {
                    Toast.makeText(getApplicationContext(), "Gasoline is the best choice",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Ethanol is the best choice",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
