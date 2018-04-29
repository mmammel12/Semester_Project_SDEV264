package com.example.mmamm.semesterproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Preferences extends Activity {

    private int myTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.SemesterProjectLight);
        setContentView(R.layout.activity_preferences);
    }

    public void setDarkTheme(View v) {
        myTheme = R.style.SemesterProjectDark;
        getApplication().setTheme(R.style.SemesterProjectDark);
    }

    public void setLightTheme(View v) {
        myTheme = R.style.SemesterProjectLight;
        getApplication().setTheme(R.style.SemesterProjectLight);
    }
}
