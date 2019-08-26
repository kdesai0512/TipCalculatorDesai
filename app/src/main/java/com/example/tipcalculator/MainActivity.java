package com.example.tipcalculator;

import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

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


        Toast.makeText(this, "Please enter the bill.", Toast.LENGTH_SHORT).show();
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));
    }

    public void great(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 25;

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        percentEditText.setText("" + df.format(percent));
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));

    }

    public void good(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);
        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 20;

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        percentEditText.setText("" + percent);
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));

    }

    public void okay(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);

        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 15;

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        percentEditText.setText("" + percent);
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));

    }

    public void bad(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);

        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 10;

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        percentEditText.setText("" + percent);
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));

    }

    public void terrible(View v) {
        DecimalFormat df = new DecimalFormat("$#.00");
        EditText billEditText = (EditText) findViewById (R.id.billEditText);
        EditText percentEditText = (EditText) findViewById (R.id.percentEditText);
        TextView totalTextView = (TextView)findViewById (R.id.totalTextView);

        double bill = Double.parseDouble(billEditText.getText().toString());
        double percent = 5;

        double tip = ((percent / 100) * bill);
        double total = bill + tip;

        percentEditText.setText("" + percent);
        totalTextView.setText("Tip: " + df.format(tip) + "\nTotal Bill: " + df.format(total));

    }


}
