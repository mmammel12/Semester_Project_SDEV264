package com.example.mmamm.semesterproject;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by mmamm on 4/1/2018.
 */

public class MainFragment extends Fragment implements OnClickListener {

    private int selectedNumber = 1;
    // Row 0
    private TextView textView0_0;
    private TextView textView0_1;
    private TextView textView0_2;
    private TextView textView0_3;
    private TextView textView0_4;
    private TextView textView0_5;
    private TextView textView0_6;
    private TextView textView0_7;
    private TextView textView0_8;
    // Row 1
    private TextView textView1_0;
    private TextView textView1_1;
    private TextView textView1_2;
    private TextView textView1_3;
    private TextView textView1_4;
    private TextView textView1_5;
    private TextView textView1_6;
    private TextView textView1_7;
    private TextView textView1_8;
    // Row 2
    private TextView textView2_0;
    private TextView textView2_1;
    private TextView textView2_2;
    private TextView textView2_3;
    private TextView textView2_4;
    private TextView textView2_5;
    private TextView textView2_6;
    private TextView textView2_7;
    private TextView textView2_8;
    // Row 3
    private TextView textView3_0;
    private TextView textView3_1;
    private TextView textView3_2;
    private TextView textView3_3;
    private TextView textView3_4;
    private TextView textView3_5;
    private TextView textView3_6;
    private TextView textView3_7;
    private TextView textView3_8;
    // Row 4
    private TextView textView4_0;
    private TextView textView4_1;
    private TextView textView4_2;
    private TextView textView4_3;
    private TextView textView4_4;
    private TextView textView4_5;
    private TextView textView4_6;
    private TextView textView4_7;
    private TextView textView4_8;
    // Row 5
    private TextView textView5_0;
    private TextView textView5_1;
    private TextView textView5_2;
    private TextView textView5_3;
    private TextView textView5_4;
    private TextView textView5_5;
    private TextView textView5_6;
    private TextView textView5_7;
    private TextView textView5_8;
    // Row 6
    private TextView textView6_0;
    private TextView textView6_1;
    private TextView textView6_2;
    private TextView textView6_3;
    private TextView textView6_4;
    private TextView textView6_5;
    private TextView textView6_6;
    private TextView textView6_7;
    private TextView textView6_8;
    // Row 7
    private TextView textView7_0;
    private TextView textView7_1;
    private TextView textView7_2;
    private TextView textView7_3;
    private TextView textView7_4;
    private TextView textView7_5;
    private TextView textView7_6;
    private TextView textView7_7;
    private TextView textView7_8;
    // Row 8
    private TextView textView8_0;
    private TextView textView8_1;
    private TextView textView8_2;
    private TextView textView8_3;
    private TextView textView8_4;
    private TextView textView8_5;
    private TextView textView8_6;
    private TextView textView8_7;
    private TextView textView8_8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        /// get references to widgets
        // bottom row numbers to set current number
        TextView set1 = view.findViewById(R.id.set1);
        TextView set2 = view.findViewById(R.id.set2);
        TextView set3 = view.findViewById(R.id.set3);
        TextView set4 = view.findViewById(R.id.set4);
        TextView set5 = view.findViewById(R.id.set5);
        TextView set6 = view.findViewById(R.id.set6);
        TextView set7 = view.findViewById(R.id.set7);
        TextView set8 = view.findViewById(R.id.set8);
        TextView set9 = view.findViewById(R.id.set9);

        // sudoku cells
        // Row 0
        textView0_0 = view.findViewById(R.id.textView0_0);
        textView0_1 = view.findViewById(R.id.textView0_1);
        textView0_2 = view.findViewById(R.id.textView0_2);
        textView0_3 = view.findViewById(R.id.textView0_3);
        textView0_4 = view.findViewById(R.id.textView0_4);
        textView0_5 = view.findViewById(R.id.textView0_5);
        textView0_6 = view.findViewById(R.id.textView0_6);
        textView0_7 = view.findViewById(R.id.textView0_7);
        textView0_8 = view.findViewById(R.id.textView0_8);
        // Row 1
        textView1_0 = view.findViewById(R.id.textView1_0);
        textView1_1 = view.findViewById(R.id.textView1_1);
        textView1_2 = view.findViewById(R.id.textView1_2);
        textView1_3 = view.findViewById(R.id.textView1_3);
        textView1_4 = view.findViewById(R.id.textView1_4);
        textView1_5 = view.findViewById(R.id.textView1_5);
        textView1_6 = view.findViewById(R.id.textView1_6);
        textView1_7 = view.findViewById(R.id.textView1_7);
        textView1_8 = view.findViewById(R.id.textView1_8);
        // Row 2
        textView2_0 = view.findViewById(R.id.textView2_0);
        textView2_1 = view.findViewById(R.id.textView2_1);
        textView2_2 = view.findViewById(R.id.textView2_2);
        textView2_3 = view.findViewById(R.id.textView2_3);
        textView2_4 = view.findViewById(R.id.textView2_4);
        textView2_5 = view.findViewById(R.id.textView2_5);
        textView2_6 = view.findViewById(R.id.textView2_6);
        textView2_7 = view.findViewById(R.id.textView2_7);
        textView2_8 = view.findViewById(R.id.textView2_8);
        // Row 3
        textView3_0 = view.findViewById(R.id.textView3_0);
        textView3_1 = view.findViewById(R.id.textView3_1);
        textView3_2 = view.findViewById(R.id.textView3_2);
        textView3_3 = view.findViewById(R.id.textView3_3);
        textView3_4 = view.findViewById(R.id.textView3_4);
        textView3_5 = view.findViewById(R.id.textView3_5);
        textView3_6 = view.findViewById(R.id.textView3_6);
        textView3_7 = view.findViewById(R.id.textView3_7);
        textView3_8 = view.findViewById(R.id.textView3_8);
        // Row 4
        textView4_0 = view.findViewById(R.id.textView4_0);
        textView4_1 = view.findViewById(R.id.textView4_1);
        textView4_2 = view.findViewById(R.id.textView4_2);
        textView4_3 = view.findViewById(R.id.textView4_3);
        textView4_4 = view.findViewById(R.id.textView4_4);
        textView4_5 = view.findViewById(R.id.textView4_5);
        textView4_6 = view.findViewById(R.id.textView4_6);
        textView4_7 = view.findViewById(R.id.textView4_7);
        textView4_8 = view.findViewById(R.id.textView4_8);
        // Row 5
        textView5_0 = view.findViewById(R.id.textView5_0);
        textView5_1 = view.findViewById(R.id.textView5_1);
        textView5_2 = view.findViewById(R.id.textView5_2);
        textView5_3 = view.findViewById(R.id.textView5_3);
        textView5_4 = view.findViewById(R.id.textView5_4);
        textView5_5 = view.findViewById(R.id.textView5_5);
        textView5_6 = view.findViewById(R.id.textView5_6);
        textView5_7 = view.findViewById(R.id.textView5_7);
        textView5_8 = view.findViewById(R.id.textView5_8);
        // Row 6
        textView6_0 = view.findViewById(R.id.textView6_0);
        textView6_1 = view.findViewById(R.id.textView6_1);
        textView6_2 = view.findViewById(R.id.textView6_2);
        textView6_3 = view.findViewById(R.id.textView6_3);
        textView6_4 = view.findViewById(R.id.textView6_4);
        textView6_5 = view.findViewById(R.id.textView6_5);
        textView6_6 = view.findViewById(R.id.textView6_6);
        textView6_7 = view.findViewById(R.id.textView6_7);
        textView6_8 = view.findViewById(R.id.textView6_8);
        // Row 7
        textView7_0 = view.findViewById(R.id.textView7_0);
        textView7_1 = view.findViewById(R.id.textView7_1);
        textView7_2 = view.findViewById(R.id.textView7_2);
        textView7_3 = view.findViewById(R.id.textView7_3);
        textView7_4 = view.findViewById(R.id.textView7_4);
        textView7_5 = view.findViewById(R.id.textView7_5);
        textView7_6 = view.findViewById(R.id.textView7_6);
        textView7_7 = view.findViewById(R.id.textView7_7);
        textView7_8 = view.findViewById(R.id.textView7_8);
        // Row 8
        textView8_0 = view.findViewById(R.id.textView8_0);
        textView8_1 = view.findViewById(R.id.textView8_1);
        textView8_2 = view.findViewById(R.id.textView8_2);
        textView8_3 = view.findViewById(R.id.textView8_3);
        textView8_4 = view.findViewById(R.id.textView8_4);
        textView8_5 = view.findViewById(R.id.textView8_5);
        textView8_6 = view.findViewById(R.id.textView8_6);
        textView8_7 = view.findViewById(R.id.textView8_7);
        textView8_8 = view.findViewById(R.id.textView8_8);

        // buttons
        Button btnNewGame = view.findViewById(R.id.btnNewGame);
        Button btnPreferences = view.findViewById(R.id.btnPreferences);
        Button btnUndo = view.findViewById(R.id.btnUndo);
        Button btnHint = view.findViewById(R.id.btnHint);

        /// set event listeners
        // buttons
        btnNewGame.setOnClickListener(this);
        btnPreferences.setOnClickListener(this);
        btnUndo.setOnClickListener(this);
        btnHint.setOnClickListener(this);

        // bottom row numbers to set current number
        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
        set5.setOnClickListener(this);
        set6.setOnClickListener(this);
        set7.setOnClickListener(this);
        set8.setOnClickListener(this);
        set9.setOnClickListener(this);

        //sudoku cells
        // Row 0
        textView0_0.setOnClickListener(this);
        textView0_1.setOnClickListener(this);
        textView0_2.setOnClickListener(this);
        textView0_3.setOnClickListener(this);
        textView0_4.setOnClickListener(this);
        textView0_5.setOnClickListener(this);
        textView0_6.setOnClickListener(this);
        textView0_7.setOnClickListener(this);
        textView0_8.setOnClickListener(this);
        // Row 1
        textView1_0.setOnClickListener(this);
        textView1_1.setOnClickListener(this);
        textView1_2.setOnClickListener(this);
        textView1_3.setOnClickListener(this);
        textView1_4.setOnClickListener(this);
        textView1_5.setOnClickListener(this);
        textView1_6.setOnClickListener(this);
        textView1_7.setOnClickListener(this);
        textView1_8.setOnClickListener(this);
        // Row 2
        textView2_0.setOnClickListener(this);
        textView2_1.setOnClickListener(this);
        textView2_2.setOnClickListener(this);
        textView2_3.setOnClickListener(this);
        textView2_4.setOnClickListener(this);
        textView2_5.setOnClickListener(this);
        textView2_6.setOnClickListener(this);
        textView2_7.setOnClickListener(this);
        textView2_8.setOnClickListener(this);
        // Row 3
        textView3_0.setOnClickListener(this);
        textView3_1.setOnClickListener(this);
        textView3_2.setOnClickListener(this);
        textView3_3.setOnClickListener(this);
        textView3_4.setOnClickListener(this);
        textView3_5.setOnClickListener(this);
        textView3_6.setOnClickListener(this);
        textView3_7.setOnClickListener(this);
        textView3_8.setOnClickListener(this);
        // Row 4
        textView4_0.setOnClickListener(this);
        textView4_1.setOnClickListener(this);
        textView4_2.setOnClickListener(this);
        textView4_3.setOnClickListener(this);
        textView4_4.setOnClickListener(this);
        textView4_5.setOnClickListener(this);
        textView4_6.setOnClickListener(this);
        textView4_7.setOnClickListener(this);
        textView4_8.setOnClickListener(this);
        // Row 5
        textView5_0.setOnClickListener(this);
        textView5_1.setOnClickListener(this);
        textView5_2.setOnClickListener(this);
        textView5_3.setOnClickListener(this);
        textView5_4.setOnClickListener(this);
        textView5_5.setOnClickListener(this);
        textView5_6.setOnClickListener(this);
        textView5_7.setOnClickListener(this);
        textView5_8.setOnClickListener(this);
        // Row 6
        textView6_0.setOnClickListener(this);
        textView6_1.setOnClickListener(this);
        textView6_2.setOnClickListener(this);
        textView6_3.setOnClickListener(this);
        textView6_4.setOnClickListener(this);
        textView6_5.setOnClickListener(this);
        textView6_6.setOnClickListener(this);
        textView6_7.setOnClickListener(this);
        textView6_8.setOnClickListener(this);
        // Row 7
        textView7_0.setOnClickListener(this);
        textView7_1.setOnClickListener(this);
        textView7_2.setOnClickListener(this);
        textView7_3.setOnClickListener(this);
        textView7_4.setOnClickListener(this);
        textView7_5.setOnClickListener(this);
        textView7_6.setOnClickListener(this);
        textView7_7.setOnClickListener(this);
        textView7_8.setOnClickListener(this);
        // Row 8
        textView8_0.setOnClickListener(this);
        textView8_1.setOnClickListener(this);
        textView8_2.setOnClickListener(this);
        textView8_3.setOnClickListener(this);
        textView8_4.setOnClickListener(this);
        textView8_5.setOnClickListener(this);
        textView8_6.setOnClickListener(this);
        textView8_7.setOnClickListener(this);
        textView8_8.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Buttons
            case R.id.btnNewGame:
                // TODO new game stuff for button
                break;
            case R.id.btnPreferences:
                startActivity(new Intent(getActivity(), Preferences.class));
                break;
            case R.id.btnUndo:
                // TODO make undo button work
                break;
            case R.id.btnHint:
                // TODO make hint button work
                break;
            // bottom row numbers to set current number
            case R.id.set1:
                selectedNumber = 1;
                break;
            case R.id.set2:
                selectedNumber = 2;
                break;
            case R.id.set3:
                selectedNumber = 3;
                break;
            case R.id.set4:
                selectedNumber = 4;
                break;
            case R.id.set5:
                selectedNumber = 5;
                break;
            case R.id.set6:
                selectedNumber = 6;
                break;
            case R.id.set7:
                selectedNumber = 7;
                break;
            case R.id.set8:
                selectedNumber = 8;
                break;
            case R.id.set9:
                selectedNumber = 9;
                break; /*
            // sudoku cells
            // Row 0
            case R.id.textView0_0:
                textView0_0.setText(selectedNumber);
                break;
            case R.id.textView0_1:
                textView0_1.setText(selectedNumber);
                break;
            case R.id.textView0_2:
                textView0_2.setText(selectedNumber);
                break;
            case R.id.textView0_3:
                textView0_3.setText(selectedNumber);
                break;
            case R.id.textView0_4:
                textView0_4.setText(selectedNumber);
                break;
            case R.id.textView0_5:
                textView0_5.setText(selectedNumber);
                break;
            case R.id.textView0_6:
                textView0_6.setText(selectedNumber);
                break;
            case R.id.textView0_7:
                textView0_7.setText(selectedNumber);
                break;
            case R.id.textView0_8:
                textView0_8.setText(selectedNumber);
                break;
            // Row 1
            case R.id.textView1_0:
                textView1_0.setText(selectedNumber);
                break;
            case R.id.textView1_1:
                textView1_1.setText(selectedNumber);
                break;
            case R.id.textView1_2:
                textView1_2.setText(selectedNumber);
                break;
            case R.id.textView1_3:
                textView1_3.setText(selectedNumber);
                break;
            case R.id.textView1_4:
                textView1_4.setText(selectedNumber);
                break;
            case R.id.textView1_5:
                textView1_5.setText(selectedNumber);
                break;
            case R.id.textView1_6:
                textView1_6.setText(selectedNumber);
                break;
            case R.id.textView1_7:
                textView1_7.setText(selectedNumber);
                break;
            case R.id.textView1_8:
                textView1_8.setText(selectedNumber);
                break;
            // Row 2
            case R.id.textView2_0:
                textView2_0.setText(selectedNumber);
                break;
            case R.id.textView2_1:
                textView2_1.setText(selectedNumber);
                break;
            case R.id.textView2_2:
                textView2_2.setText(selectedNumber);
                break;
            case R.id.textView2_3:
                textView2_3.setText(selectedNumber);
                break;
            case R.id.textView2_4:
                textView2_4.setText(selectedNumber);
                break;
            case R.id.textView2_5:
                textView2_5.setText(selectedNumber);
                break;
            case R.id.textView2_6:
                textView2_6.setText(selectedNumber);
                break;
            case R.id.textView2_7:
                textView2_7.setText(selectedNumber);
                break;
            case R.id.textView2_8:
                textView2_8.setText(selectedNumber);
                break;
            // Row 3
            case R.id.textView3_0:
                textView3_0.setText(selectedNumber);
                break;
            case R.id.textView3_1:
                textView3_1.setText(selectedNumber);
                break;
            case R.id.textView3_2:
                textView3_2.setText(selectedNumber);
                break;
            case R.id.textView3_3:
                textView3_3.setText(selectedNumber);
                break;
            case R.id.textView3_4:
                textView3_4.setText(selectedNumber);
                break;
            case R.id.textView3_5:
                textView3_5.setText(selectedNumber);
                break;
            case R.id.textView3_6:
                textView3_6.setText(selectedNumber);
                break;
            case R.id.textView3_7:
                textView3_7.setText(selectedNumber);
                break;
            case R.id.textView3_8:
                textView3_8.setText(selectedNumber);
                break;
            // Row 4
            case R.id.textView4_0:
                textView4_0.setText(selectedNumber);
                break;
            case R.id.textView4_1:
                textView4_1.setText(selectedNumber);
                break;
            case R.id.textView4_2:
                textView4_2.setText(selectedNumber);
                break;
            case R.id.textView4_3:
                textView4_3.setText(selectedNumber);
                break;
            case R.id.textView4_4:
                textView4_4.setText(selectedNumber);
                break;
            case R.id.textView4_5:
                textView4_5.setText(selectedNumber);
                break;
            case R.id.textView4_6:
                textView4_6.setText(selectedNumber);
                break;
            case R.id.textView4_7:
                textView4_7.setText(selectedNumber);
                break;
            case R.id.textView4_8:
                textView4_8.setText(selectedNumber);
                break;
            // Row 5
            case R.id.textView5_0:
                textView5_0.setText(selectedNumber);
                break;
            case R.id.textView5_1:
                textView5_1.setText(selectedNumber);
                break;
            case R.id.textView5_2:
                textView5_2.setText(selectedNumber);
                break;
            case R.id.textView5_3:
                textView5_3.setText(selectedNumber);
                break;
            case R.id.textView5_4:
                textView5_4.setText(selectedNumber);
                break;
            case R.id.textView5_5:
                textView5_5.setText(selectedNumber);
                break;
            case R.id.textView5_6:
                textView5_6.setText(selectedNumber);
                break;
            case R.id.textView5_7:
                textView5_7.setText(selectedNumber);
                break;
            case R.id.textView5_8:
                textView5_8.setText(selectedNumber);
                break;
            // Row 6
            case R.id.textView6_0:
                textView6_0.setText(selectedNumber);
                break;
            case R.id.textView6_1:
                textView6_1.setText(selectedNumber);
                break;
            case R.id.textView6_2:
                textView6_2.setText(selectedNumber);
                break;
            case R.id.textView6_3:
                textView6_3.setText(selectedNumber);
                break;
            case R.id.textView6_4:
                textView6_4.setText(selectedNumber);
                break;
            case R.id.textView6_5:
                textView6_5.setText(selectedNumber);
                break;
            case R.id.textView6_6:
                textView6_6.setText(selectedNumber);
                break;
            case R.id.textView6_7:
                textView6_7.setText(selectedNumber);
                break;
            case R.id.textView6_8:
                textView6_8.setText(selectedNumber);
                break;
            // Row 7
            case R.id.textView7_0:
                textView7_0.setText(selectedNumber);
                break;
            case R.id.textView7_1:
                textView7_1.setText(selectedNumber);
                break;
            case R.id.textView7_2:
                textView7_2.setText(selectedNumber);
                break;
            case R.id.textView7_3:
                textView7_3.setText(selectedNumber);
                break;
            case R.id.textView7_4:
                textView7_4.setText(selectedNumber);
                break;
            case R.id.textView7_5:
                textView7_5.setText(selectedNumber);
                break;
            case R.id.textView7_6:
                textView7_6.setText(selectedNumber);
                break;
            case R.id.textView7_7:
                textView7_7.setText(selectedNumber);
                break;
            case R.id.textView7_8:
                textView7_8.setText(selectedNumber);
                break;
            // Row 8
            case R.id.textView8_0:
                textView8_0.setText(selectedNumber);
                break;
            case R.id.textView8_1:
                textView8_1.setText(selectedNumber);
                break;
            case R.id.textView8_2:
                textView8_2.setText(selectedNumber);
                break;
            case R.id.textView8_3:
                textView8_3.setText(selectedNumber);
                break;
            case R.id.textView8_4:
                textView8_4.setText(selectedNumber);
                break;
            case R.id.textView8_5:
                textView8_5.setText(selectedNumber);
                break;
            case R.id.textView8_6:
                textView8_6.setText(selectedNumber);
                break;
            case R.id.textView8_7:
                textView8_7.setText(selectedNumber);
                break;
            case R.id.textView8_8:
                textView8_8.setText(selectedNumber);
                break; */
        }
    }

}

