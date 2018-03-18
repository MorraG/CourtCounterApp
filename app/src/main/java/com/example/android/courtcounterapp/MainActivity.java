package com.example.android.courtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounterapp.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int blueCardA = 0;
    int blueCardB = 0;
    int redCardA = 0;
    int redCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
// Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
// Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

    }

    /**
     * Increase score for Team A of 10 pt.
     */
    public void addTenForTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase score for Team A of 30 pt.
     */
    public void addThirtyForTeamA(View view) {
        scoreTeamA = scoreTeamA + 30;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase blue card for Team A of 1.
     */
    public void addOneBlueForTeamA(View view) {
        blueCardA = blueCardA + 1;
        displayBlueForTeamA(blueCardA);
    }

    /**
     * Increase yellow card for Team A of 1.
     */
    public void addOneYellowForTeamA(View view) {
        yellowCardA = yellowCardA + 1;
        displayYellowForTeamA(yellowCardA);
    }

    /**
     * Increase red card for Team A of 1.
     */
    public void addOneRedForTeamA(View view) {
        redCardA = redCardA + 1;
        displayRedForTeamA(redCardA);
    }

    /**
     * Increase score for Team B of 10 pt.
     */
    public void addTenForTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase score for Team B of 30 pt.
     */
    public void addThirtyForTeamB(View view) {
        scoreTeamB = scoreTeamB + 30;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase blue card for Team B of 1.
     */
    public void addOneBlueForTeamB(View view) {
        blueCardB = blueCardB + 1;
        displayBlueForTeamB(blueCardB);
    }

    /**
     * Increase yellow card for Team B of 1.
     */
    public void addOneYellowForTeamB(View view) {
        yellowCardB = yellowCardB + 1;
        displayYellowForTeamB(yellowCardB);
    }

    /**
     * Increase red card for Team B of 1.
     */
    public void addOneRedForTeamB(View view) {
        redCardB = redCardB + 1;
        displayRedForTeamB(redCardB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red for Team A.
     */
    public void displayRedForTeamA(int redCardA) {
        TextView redView = (TextView) findViewById(R.id.redcard_team_a);
        redView.setText(String.valueOf(redCardA));
    }

    /**
     * Displays the given yellow for Team A.
     */
    public void displayYellowForTeamA(int yellowCardA) {
        TextView yellowView = (TextView) findViewById(R.id.yellowcard_team_a);
        yellowView.setText(String.valueOf(yellowCardA));
    }

    /**
     * Displays the given blue for Team A.
     */
    public void displayBlueForTeamA(int blueCardA) {
        TextView blueView = (TextView) findViewById(R.id.bluecard_team_a);
        blueView.setText(String.valueOf(blueCardA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red for Team B.
     */
    public void displayRedForTeamB(int redCardB) {
        TextView redView = (TextView) findViewById(R.id.redcard_team_b);
        redView.setText(String.valueOf(redCardB));
    }

    /**
     * Displays the given yellow for Team B.
     */
    public void displayYellowForTeamB(int yellowCardB) {
        TextView yellowView = (TextView) findViewById(R.id.yellowcard_team_b);
        yellowView.setText(String.valueOf(yellowCardB));
    }

    /**
     * Displays the given blue for Team B.
     */
    public void displayBlueForTeamB(int blueCardB) {
        TextView blueView = (TextView) findViewById(R.id.bluecard_team_b);
        blueView.setText(String.valueOf(blueCardB));
    }

    public void resetScore(View View) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardA = 0;
        redCardB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        blueCardA = 0;
        blueCardB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayBlueForTeamA(blueCardA);
        displayBlueForTeamB(blueCardB);
        displayYellowForTeamA(yellowCardA);
        displayYellowForTeamB(yellowCardB);
        displayRedForTeamA(redCardA);
        displayRedForTeamB(redCardB);
    }

}