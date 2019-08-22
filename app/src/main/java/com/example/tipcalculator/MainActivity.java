package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);

        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = Double.parseDouble(percentEditText.getText().toString());

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        totalTextView.setText("Tip: " + df.format(tip) + "\n\nTotal Bill: " + df.format(total));
    }




}
