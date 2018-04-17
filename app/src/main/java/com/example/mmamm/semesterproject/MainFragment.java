package com.example.mmamm.semesterproject;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mmamm on 4/1/2018.
 */

public class MainFragment extends Fragment implements OnClickListener {

    public TextView textView0_0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        /// get references to widgets
        // buttons
        Button btnNewGame = view.findViewById(R.id.btnNewGame);
        Button btnPreferences = view.findViewById(R.id.btnPreferences);
        Button btnUndo = view.findViewById(R.id.btnUndo);
        Button btnHint = view.findViewById(R.id.btnHint);

        textView0_0 = view.findViewById(R.id.textView0_0);

        /// set event listeners
        // buttons
        btnNewGame.setOnClickListener(this);
        btnPreferences.setOnClickListener(this);
        btnUndo.setOnClickListener(this);
        btnHint.setOnClickListener(this);

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
        }
    }
}

