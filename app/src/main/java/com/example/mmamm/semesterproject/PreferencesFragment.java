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

public class PreferencesFragment extends Fragment implements View.OnClickListener {

    private Button btnHome;
    private Button btnStats;
    private Button btnHowToPlay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_preferences, container, false);

        Button btnHome = view.findViewById(R.id.btnHome);
        Button btnStats = view.findViewById(R.id.btnStats);
        Button btnHowToPlay = view.findViewById(R.id.btnHowToPlay);

        // Event listeners
        // buttons
        btnHome.setOnClickListener(this);
        btnStats.setOnClickListener(this);
        btnHowToPlay.setOnClickListener(this);

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
}
