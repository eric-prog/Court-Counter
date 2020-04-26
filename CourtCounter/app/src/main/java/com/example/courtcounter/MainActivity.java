package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void addThreeTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoTeamA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneTeamA(View v){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeTeamB(View v){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoTeamB(View v){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneTeamB(View v){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets Team A and B scores.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
