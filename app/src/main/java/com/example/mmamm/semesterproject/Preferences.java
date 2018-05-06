package com.example.mmamm.semesterproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Preferences extends Activity {

    private int myTheme;
    private int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.SemesterProjectLight);
        setContentView(R.layout.activity_preferences);

        difficulty = 0;
    }

    public void setDarkTheme(View v) {
        myTheme = R.style.SemesterProjectDark;
        getApplication().setTheme(R.style.SemesterProjectDark);
    }

    public void setLightTheme(View v) {
        myTheme = R.style.SemesterProjectLight;
        getApplication().setTheme(R.style.SemesterProjectLight);
    }

    public void setDifficulty(View v) {
        switch (v.getId()) {
            case R.id.RbtnEasy:
                difficulty = 0;
                break;
            case R.id.RbtnMedium:
                difficulty = 1;
                break;
            case R.id.RbtnHard:
                difficulty = 2;
                break;
            default:
                difficulty = 0;
                break;
        }
    }

    public int getDifficulty() { return difficulty; }
}
