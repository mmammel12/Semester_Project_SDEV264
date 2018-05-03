package com.example.mmamm.semesterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private String selectedNumber = "1";
    private TextView lastChange;
    private String beforeText;
    private int[][] rows = new int[9][9];
    private Generator generator;

    private TextView tv0_0;
    private TextView tv0_1;
    private TextView tv0_2;
    private TextView tv0_3;
    private TextView tv0_4;
    private TextView tv0_5;
    private TextView tv0_6;
    private TextView tv0_7;
    private TextView tv0_8;

    private TextView tv1_0;
    private TextView tv1_1;
    private TextView tv1_2;
    private TextView tv1_3;
    private TextView tv1_4;
    private TextView tv1_5;
    private TextView tv1_6;
    private TextView tv1_7;
    private TextView tv1_8;

    private TextView tv2_0;
    private TextView tv2_1;
    private TextView tv2_2;
    private TextView tv2_3;
    private TextView tv2_4;
    private TextView tv2_5;
    private TextView tv2_6;
    private TextView tv2_7;
    private TextView tv2_8;

    private TextView tv3_0;
    private TextView tv3_1;
    private TextView tv3_2;
    private TextView tv3_3;
    private TextView tv3_4;
    private TextView tv3_5;
    private TextView tv3_6;
    private TextView tv3_7;
    private TextView tv3_8;

    private TextView tv4_0;
    private TextView tv4_1;
    private TextView tv4_2;
    private TextView tv4_3;
    private TextView tv4_4;
    private TextView tv4_5;
    private TextView tv4_6;
    private TextView tv4_7;
    private TextView tv4_8;

    private TextView tv5_0;
    private TextView tv5_1;
    private TextView tv5_2;
    private TextView tv5_3;
    private TextView tv5_4;
    private TextView tv5_5;
    private TextView tv5_6;
    private TextView tv5_7;
    private TextView tv5_8;

    private TextView tv6_0;
    private TextView tv6_1;
    private TextView tv6_2;
    private TextView tv6_3;
    private TextView tv6_4;
    private TextView tv6_5;
    private TextView tv6_6;
    private TextView tv6_7;
    private TextView tv6_8;

    private TextView tv7_0;
    private TextView tv7_1;
    private TextView tv7_2;
    private TextView tv7_3;
    private TextView tv7_4;
    private TextView tv7_5;
    private TextView tv7_6;
    private TextView tv7_7;
    private TextView tv7_8;

    private TextView tv8_0;
    private TextView tv8_1;
    private TextView tv8_2;
    private TextView tv8_3;
    private TextView tv8_4;
    private TextView tv8_5;
    private TextView tv8_6;
    private TextView tv8_7;
    private TextView tv8_8;

    private TextView[][] gridArray = new TextView[][] {{tv0_0, tv0_1, tv0_2, tv0_3, tv0_4, tv0_5, tv0_6, tv0_7, tv0_8},
                                                       {tv1_0, tv1_1, tv1_2, tv1_3, tv1_4, tv1_5, tv1_6, tv1_7, tv1_8},
                                                       {tv2_0, tv2_1, tv2_2, tv2_3, tv2_4, tv2_5, tv2_6, tv2_7, tv2_8},
                                                       {tv3_0, tv3_1, tv3_2, tv3_3, tv3_4, tv3_5, tv3_6, tv3_7, tv3_8},
                                                       {tv4_0, tv4_1, tv4_2, tv4_3, tv4_4, tv4_5, tv4_6, tv4_7, tv4_8},
                                                       {tv5_0, tv5_1, tv5_2, tv5_3, tv5_4, tv5_5, tv5_6, tv5_7, tv5_8},
                                                       {tv6_0, tv6_1, tv6_2, tv6_3, tv6_4, tv6_5, tv6_6, tv6_7, tv6_8},
                                                       {tv7_0, tv7_1, tv7_2, tv7_3, tv7_4, tv7_5, tv7_6, tv7_7, tv7_8},
                                                       {tv8_0, tv8_1, tv8_2, tv8_3, tv8_4, tv8_5, tv8_6, tv8_7, tv8_8}};

    public MainActivity() {
        this.generator = new Generator();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastChange = findViewById(R.id.textView0_0);
        beforeText = "";

        tv0_0 = findViewById(R.id.textView0_0);
        tv0_1 = findViewById(R.id.textView0_1);
        tv0_2 = findViewById(R.id.textView0_2);
        tv0_3 = findViewById(R.id.textView0_3);
        tv0_4 = findViewById(R.id.textView0_4);
        tv0_5 = findViewById(R.id.textView0_5);
        tv0_6 = findViewById(R.id.textView0_6);
        tv0_7 = findViewById(R.id.textView0_7);
        tv0_8 = findViewById(R.id.textView0_8);

        tv1_0 = findViewById(R.id.textView1_0);
        tv1_1 = findViewById(R.id.textView1_1);
        tv1_2 = findViewById(R.id.textView1_2);
        tv1_3 = findViewById(R.id.textView1_3);
        tv1_4 = findViewById(R.id.textView1_4);
        tv1_5 = findViewById(R.id.textView1_5);
        tv1_6 = findViewById(R.id.textView1_6);
        tv1_7 = findViewById(R.id.textView1_7);
        tv1_8 = findViewById(R.id.textView1_8);

        tv2_0 = findViewById(R.id.textView2_0);
        tv2_1 = findViewById(R.id.textView2_1);
        tv2_2 = findViewById(R.id.textView2_2);
        tv2_3 = findViewById(R.id.textView2_3);
        tv2_4 = findViewById(R.id.textView2_4);
        tv2_5 = findViewById(R.id.textView2_5);
        tv2_6 = findViewById(R.id.textView2_6);
        tv2_7 = findViewById(R.id.textView2_7);
        tv2_8 = findViewById(R.id.textView2_8);

        tv3_0 = findViewById(R.id.textView3_0);
        tv3_1 = findViewById(R.id.textView3_1);
        tv3_2 = findViewById(R.id.textView3_2);
        tv3_3 = findViewById(R.id.textView3_3);
        tv3_4 = findViewById(R.id.textView3_4);
        tv3_5 = findViewById(R.id.textView3_5);
        tv3_6 = findViewById(R.id.textView3_6);
        tv3_7 = findViewById(R.id.textView3_7);
        tv3_8 = findViewById(R.id.textView3_8);

        tv4_0 = findViewById(R.id.textView4_0);
        tv4_1 = findViewById(R.id.textView4_1);
        tv4_2 = findViewById(R.id.textView4_2);
        tv4_3 = findViewById(R.id.textView4_3);
        tv4_4 = findViewById(R.id.textView4_4);
        tv4_5 = findViewById(R.id.textView4_5);
        tv4_6 = findViewById(R.id.textView4_6);
        tv4_7 = findViewById(R.id.textView4_7);
        tv4_8 = findViewById(R.id.textView4_8);

        tv5_0 = findViewById(R.id.textView5_0);
        tv5_1 = findViewById(R.id.textView5_1);
        tv5_2 = findViewById(R.id.textView5_2);
        tv5_3 = findViewById(R.id.textView5_3);
        tv5_4 = findViewById(R.id.textView5_4);
        tv5_5 = findViewById(R.id.textView5_5);
        tv5_6 = findViewById(R.id.textView5_6);
        tv5_7 = findViewById(R.id.textView5_7);
        tv5_8 = findViewById(R.id.textView5_8);

        tv6_0 = findViewById(R.id.textView6_0);
        tv6_1 = findViewById(R.id.textView6_1);
        tv6_2 = findViewById(R.id.textView6_2);
        tv6_3 = findViewById(R.id.textView6_3);
        tv6_4 = findViewById(R.id.textView6_4);
        tv6_5 = findViewById(R.id.textView6_5);
        tv6_6 = findViewById(R.id.textView6_6);
        tv6_7 = findViewById(R.id.textView6_7);
        tv6_8 = findViewById(R.id.textView6_8);

        tv7_0 = findViewById(R.id.textView7_0);
        tv7_1 = findViewById(R.id.textView7_1);
        tv7_2 = findViewById(R.id.textView7_2);
        tv7_3 = findViewById(R.id.textView7_3);
        tv7_4 = findViewById(R.id.textView7_4);
        tv7_5 = findViewById(R.id.textView7_5);
        tv7_6 = findViewById(R.id.textView7_6);
        tv7_7 = findViewById(R.id.textView7_7);
        tv7_8 = findViewById(R.id.textView7_8);

        tv8_0 = findViewById(R.id.textView8_0);
        tv8_1 = findViewById(R.id.textView8_1);
        tv8_2 = findViewById(R.id.textView8_2);
        tv8_3 = findViewById(R.id.textView8_3);
        tv8_4 = findViewById(R.id.textView8_4);
        tv8_5 = findViewById(R.id.textView8_5);
        tv8_6 = findViewById(R.id.textView8_6);
        tv8_7 = findViewById(R.id.textView8_7);
        tv8_8 = findViewById(R.id.textView8_8);

        gridArray = new TextView[][] {{tv0_0, tv0_1, tv0_2, tv0_3, tv0_4, tv0_5, tv0_6, tv0_7, tv0_8},
                                      {tv1_0, tv1_1, tv1_2, tv1_3, tv1_4, tv1_5, tv1_6, tv1_7, tv1_8},
                                      {tv2_0, tv2_1, tv2_2, tv2_3, tv2_4, tv2_5, tv2_6, tv2_7, tv2_8},
                                      {tv3_0, tv3_1, tv3_2, tv3_3, tv3_4, tv3_5, tv3_6, tv3_7, tv3_8},
                                      {tv4_0, tv4_1, tv4_2, tv4_3, tv4_4, tv4_5, tv4_6, tv4_7, tv4_8},
                                      {tv5_0, tv5_1, tv5_2, tv5_3, tv5_4, tv5_5, tv5_6, tv5_7, tv5_8},
                                      {tv6_0, tv6_1, tv6_2, tv6_3, tv6_4, tv6_5, tv6_6, tv6_7, tv6_8},
                                      {tv7_0, tv7_1, tv7_2, tv7_3, tv7_4, tv7_5, tv7_6, tv7_7, tv7_8},
                                      {tv8_0, tv8_1, tv8_2, tv8_3, tv8_4, tv8_5, tv8_6, tv8_7, tv8_8}};
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

    public void newGame(View v) {
        generator.populateArrays();
        rows = generator.getRows();
        setupGrid();
    }

    public void setupGrid() {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                gridArray[i][j].setText(Integer.toString(rows[i][j]));
            }
        }

    }
}
