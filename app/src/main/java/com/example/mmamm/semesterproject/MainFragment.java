package com.example.mmamm.semesterproject;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
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

        Button btnPreferences = view.findViewById(R.id.btnPreferences);

        btnPreferences.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getActivity(), Preferences.class));
    }
}

