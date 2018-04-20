package com.example.mmamm.semesterproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private String selectedNumber = "1";
    private TextView lastChange;
    private String beforeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastChange = findViewById(R.id.textView0_0);
        beforeText = "";
    }

    public void setTextView(View v) {
        TextView tv = findViewById(v.getId());
        beforeText = tv.getText().toString();
        tv.setText(selectedNumber);
        lastChange = tv;
    }

    public void setSelectedNumber(View v) {
        TextView tv = findViewById(v.getId());
        selectedNumber = tv.getText().toString();
    }

    public void undo(View v) {
        lastChange.setText(beforeText);
    }

    public void hint(View v) {
        // TODO create hint button logic
    }
}
