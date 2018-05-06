package com.example.mmamm.semesterproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Statistics extends Activity implements View.OnClickListener {

    TextView easyPlayed;
    TextView easyWon;
    TextView easyStreak;
    TextView mediumPlayed;
    TextView mediumWon;
    TextView mediumStreak;
    TextView hardPlayed;
    TextView hardWon;
    TextView hardStreak;

    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        Button btnHome = findViewById(R.id.btnHome);
        btnHome.setOnClickListener(this);

        easyPlayed = findViewById(R.id.txtEasyGamesPlayedCount);
        easyWon = findViewById(R.id.txtEasyGamesWonCount);
        easyStreak = findViewById(R.id.txtEasyWinStreakCount);
        mediumPlayed = findViewById(R.id.txtMediumGamesPlayedCount);
        mediumWon = findViewById(R.id.txtMediumGamesWonCount);
        mediumStreak = findViewById(R.id.txtMediumWinStreakCount);
        hardPlayed = findViewById(R.id.txtHardGamesPlayedCount);
        hardWon = findViewById(R.id.txtHardGamesWonCount);
        hardStreak = findViewById(R.id.txtHardWinStreakCount);
    }

    public void resetStats(View v) {
        easyPlayed.setText("0");
        easyWon.setText("0");
        easyStreak.setText("0");
        mediumPlayed.setText("0");
        mediumWon.setText("0");
        mediumStreak.setText("0");
        hardPlayed.setText("0");
        hardWon.setText("0");
        hardStreak.setText("0");
    }

    public void updatePlayed(int difficulty) {
        int updateNum;
        switch (difficulty) {
            case 0:
                CharSequence csEasyPlayed = easyPlayed.getText();
                updateNum = Integer.parseInt(csEasyPlayed.toString()) + 1;
                easyPlayed.setText(Integer.toString(updateNum));
                break;
            case 1:
                CharSequence csMediumPlayed = easyPlayed.getText();
                updateNum = Integer.parseInt(csMediumPlayed.toString()) + 1;
                mediumPlayed.setText(Integer.toString(updateNum));
                break;
            case 2:
                CharSequence csHardPlayed = easyPlayed.getText();
                updateNum = Integer.parseInt(csHardPlayed.toString()) + 1;
                hardPlayed.setText(Integer.toString(updateNum));
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHome:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}
