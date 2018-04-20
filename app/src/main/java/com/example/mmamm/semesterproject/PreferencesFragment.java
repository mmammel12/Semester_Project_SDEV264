package com.example.mmamm.semesterproject;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by mmamm on 4/1/2018.
 */

public class PreferencesFragment extends Fragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private Button btnHome;
    private Button btnStats;
    private Button btnHowToPlay;
    private RadioGroup RgroupTheme;
    private RadioGroup RgroupDifficulty;
    private int myTheme;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_preferences, container, false);

        Button btnHome = view.findViewById(R.id.btnHome);
        Button btnStats = view.findViewById(R.id.btnStats);
        Button btnHowToPlay = view.findViewById(R.id.btnHowToPlay);
        RadioGroup RgroupTheme = view.findViewById(R.id.RgroupTheme);
        RadioGroup RgroupDifficulty = view.findViewById(R.id.RgroupDifficulty);

        // Event listeners
        // buttons
        btnHome.setOnClickListener(this);
        btnStats.setOnClickListener(this);
        btnHowToPlay.setOnClickListener(this);
        // radio groups
        RgroupTheme.setOnCheckedChangeListener(this);
        RgroupDifficulty.setOnCheckedChangeListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHome:
                startActivity(new Intent(getActivity(), MainActivity.class));
                break;
            case R.id.btnStats:
                startActivity(new Intent(getActivity(), Statistics.class));
                break;
            case R.id.btnHowToPlay:
                startActivity(new Intent(getActivity(), HowToPlay.class));
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.RbtnLight:
                Log.d("activity:", getActivity().toString());
                myTheme = R.style.SemesterProjectLight;
                getActivity().setTheme(myTheme);
                break;
            case R.id.RbtnDark:
                Log.d("activity:", getActivity().toString());
                myTheme = R.style.SemesterProjectDark;
                getActivity().setTheme(myTheme);
                break;
            case R.id.RbtnEasy:
                // TODO add difficulty stuff
                break;
            case R.id.RbtnMedium:
                // TODO
                break;
            case R.id.RbtnHard:
                // TODO
                break;
        }
    }
}