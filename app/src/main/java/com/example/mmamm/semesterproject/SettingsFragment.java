package com.example.mmamm.semesterproject;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by mmamm on 4/1/2018.
 */

public class SettingsFragment extends Fragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    private Button btnHome;
    private Button btnStats;
    private Button btnHowToPlay;
    private RadioGroup RgroupTheme;
    private RadioGroup RgroupDifficulty;
    private ConstraintLayout SettingsView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_preferences, container, false);

        Button btnHome = view.findViewById(R.id.btnHome);
        Button btnStats = view.findViewById(R.id.btnStats);
        Button btnHowToPlay = view.findViewById(R.id.btnHowToPlay);
        RadioGroup RgroupTheme = view.findViewById(R.id.RgroupTheme);
        RadioGroup RgroupDifficulty = view.findViewById(R.id.RgroupDifficulty);
        ConstraintLayout SettingsView = view.findViewById(R.id.PreferencesLayout);

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
                SettingsView.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                break;
            case R.id.RbtnDark:
                SettingsView.setBackgroundColor(Color.parseColor("#1b1b1b"));
                break;
            case R.id.RbtnEasy:
                // TODO add difficulty stuff
                break;
            case R.id.RbtnMedium:
                break;
            case R.id.RbtnHard:
                break;
        }
    }
}
