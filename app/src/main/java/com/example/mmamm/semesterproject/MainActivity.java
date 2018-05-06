package com.example.mmamm.semesterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;


public class MainActivity extends AppCompatActivity {

    private String selectedNumber = "1";
    private TextView lastChange;
    private String beforeText;
    private int[][] rows = new int[9][9];
    private Generator generator;
    private Preferences prefs;
    private Statistics stats;
    private Random random;

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

    private TextView[][] gridArray;

    public MainActivity() {
        this.generator = new Generator();
        this.prefs = new Preferences();
        this.stats = new Statistics();
        random = new Random();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        lastChange = tv0_0;
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
        // TODO add hint logic
    }

    public void newGame(View v) {
        int difficulty = prefs.getDifficulty();
        stats.updatePlayed(difficulty);
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
        setupBlanks();
    }

    public void setupBlanks() {
        int blanks = 0;
        HashSet<Integer> blankSpots = new HashSet<>();

        switch (prefs.getDifficulty()) {
            case 0:
                blanks = 30;
                break;
            case 1:
                blanks = 45;
                break;
            case 2:
                blanks = 60;
                break;
        }

        while (blankSpots.size() != blanks) {
            blankSpots.add(random.nextInt(81));
        }

        Iterator<Integer> blankIterate = blankSpots.iterator();
        while (blankIterate.hasNext()) {
            switch (blankIterate.next()) {
                case 0:
                    gridArray[0][0].setText("");
                    break;
                case 1:
                    gridArray[0][1].setText("");
                    break;
                case 2:
                    gridArray[0][2].setText("");
                    break;
                case 3:
                    gridArray[0][3].setText("");
                    break;
                case 4:
                    gridArray[0][4].setText("");
                    break;
                case 5:
                    gridArray[0][5].setText("");
                    break;
                case 6:
                    gridArray[0][6].setText("");
                    break;
                case 7:
                    gridArray[0][7].setText("");
                    break;
                case 8:
                    gridArray[0][8].setText("");
                    break;

                case 9:
                    gridArray[1][0].setText("");
                    break;
                case 10:
                    gridArray[1][1].setText("");
                    break;
                case 11:
                    gridArray[1][2].setText("");
                    break;
                case 12:
                    gridArray[1][3].setText("");
                    break;
                case 13:
                    gridArray[1][4].setText("");
                    break;
                case 14:
                    gridArray[1][5].setText("");
                    break;
                case 15:
                    gridArray[1][6].setText("");
                    break;
                case 16:
                    gridArray[1][7].setText("");
                    break;
                case 17:
                    gridArray[1][8].setText("");
                    break;

                case 18:
                    gridArray[2][0].setText("");
                    break;
                case 19:
                    gridArray[2][1].setText("");
                    break;
                case 20:
                    gridArray[2][2].setText("");
                    break;
                case 21:
                    gridArray[2][3].setText("");
                    break;
                case 22:
                    gridArray[2][4].setText("");
                    break;
                case 23:
                    gridArray[2][5].setText("");
                    break;
                case 24:
                    gridArray[2][6].setText("");
                    break;
                case 25:
                    gridArray[2][7].setText("");
                    break;
                case 26:
                    gridArray[2][8].setText("");
                    break;

                case 27:
                    gridArray[3][0].setText("");
                    break;
                case 28:
                    gridArray[3][1].setText("");
                    break;
                case 29:
                    gridArray[3][2].setText("");
                    break;
                case 30:
                    gridArray[3][3].setText("");
                    break;
                case 31:
                    gridArray[3][4].setText("");
                    break;
                case 32:
                    gridArray[3][5].setText("");
                    break;
                case 33:
                    gridArray[3][6].setText("");
                    break;
                case 34:
                    gridArray[3][7].setText("");
                    break;
                case 35:
                    gridArray[3][8].setText("");
                    break;

                case 36:
                    gridArray[4][0].setText("");
                    break;
                case 37:
                    gridArray[4][1].setText("");
                    break;
                case 38:
                    gridArray[4][2].setText("");
                    break;
                case 39:
                    gridArray[4][3].setText("");
                    break;
                case 40:
                    gridArray[4][4].setText("");
                    break;
                case 41:
                    gridArray[4][5].setText("");
                    break;
                case 42:
                    gridArray[4][6].setText("");
                    break;
                case 43:
                    gridArray[4][7].setText("");
                    break;
                case 44:
                    gridArray[4][8].setText("");
                    break;

                case 45:
                    gridArray[5][0].setText("");
                    break;
                case 46:
                    gridArray[5][1].setText("");
                    break;
                case 47:
                    gridArray[5][2].setText("");
                    break;
                case 48:
                    gridArray[5][3].setText("");
                    break;
                case 49:
                    gridArray[5][4].setText("");
                    break;
                case 50:
                    gridArray[5][5].setText("");
                    break;
                case 51:
                    gridArray[5][6].setText("");
                    break;
                case 52:
                    gridArray[5][7].setText("");
                    break;
                case 53:
                    gridArray[5][8].setText("");
                    break;

                case 54:
                    gridArray[6][0].setText("");
                    break;
                case 55:
                    gridArray[6][1].setText("");
                    break;
                case 56:
                    gridArray[6][2].setText("");
                    break;
                case 57:
                    gridArray[6][3].setText("");
                    break;
                case 58:
                    gridArray[6][4].setText("");
                    break;
                case 59:
                    gridArray[6][5].setText("");
                    break;
                case 60:
                    gridArray[6][6].setText("");
                    break;
                case 61:
                    gridArray[6][7].setText("");
                    break;
                case 62:
                    gridArray[6][8].setText("");
                    break;

                case 63:
                    gridArray[7][0].setText("");
                    break;
                case 64:
                    gridArray[7][1].setText("");
                    break;
                case 65:
                    gridArray[7][2].setText("");
                    break;
                case 66:
                    gridArray[7][3].setText("");
                    break;
                case 67:
                    gridArray[7][4].setText("");
                    break;
                case 68:
                    gridArray[7][5].setText("");
                    break;
                case 69:
                    gridArray[7][6].setText("");
                    break;
                case 70:
                    gridArray[7][7].setText("");
                    break;
                case 71:
                    gridArray[7][8].setText("");
                    break;

                case 72:
                    gridArray[8][0].setText("");
                    break;
                case 73:
                    gridArray[8][1].setText("");
                    break;
                case 74:
                    gridArray[8][2].setText("");
                    break;
                case 75:
                    gridArray[8][3].setText("");
                    break;
                case 76:
                    gridArray[8][4].setText("");
                    break;
                case 77:
                    gridArray[8][5].setText("");
                    break;
                case 78:
                    gridArray[8][6].setText("");
                    break;
                case 79:
                    gridArray[8][7].setText("");
                    break;
                case 80:
                    gridArray[8][8].setText("");
                    break;
            }
        }
    }
}
