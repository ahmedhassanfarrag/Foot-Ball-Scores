package com.example.android.footballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorebarcelona = 0 ;
    int faullbarcelona = 0 ;
    int redCardForBarcelona = 0 ;
    int yellowCardForBarcelona = 0 ;
    int cornerForBarcelona = 0 ;
    int belantyForBarcelona = 0 ;
    int scoreliverpool = 0 ;
    int faullliverpool = 0 ;
    int redCardForliverpool = 0 ;
    int yellowCardForliverpool = 0 ;
    int cornerForliverpool = 0 ;
    int belantyForliverpool = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * increase the score for barcelona by one point.
     */
    public void goal(View v){
        scorebarcelona = scorebarcelona + 1 ;
        displayForbarcelona(scorebarcelona);
    }
    /**
     * increase the score for barcelona Faull by one point.
     */
    public void faull(View v){
        faullbarcelona = faullbarcelona + 1 ;
        displayForBarcelonaFaull(faullbarcelona);
    }
    /**
     * increase the score for barcelona red card by one point.
     */
    public void redCard (View v){
        redCardForBarcelona = redCardForBarcelona + 1 ;
        displayForBarcelonaRedCard(redCardForBarcelona);
    }
    /**
     * increase the score for barcelona yellow card by one point.
     */
    public void yellowCard (View v){
        yellowCardForBarcelona = yellowCardForBarcelona + 1 ;
        displayForBarcelonayellowCard(yellowCardForBarcelona);
    }
    /**
     * increase the score for barcelona corner button by one point.
     */
    public void corner (View v){
        cornerForBarcelona = cornerForBarcelona + 1 ;
        displayForBarcelonacorner(cornerForBarcelona);
    }
    /**
     * increase the score for barcelona belanty button by one point.
     */
    public void belanty (View v){
        belantyForBarcelona = belantyForBarcelona + 1 ;
        displayForBarcelonabelanty(belantyForBarcelona);
    }
    /**
     * increase the score for liverpool goal button by one point.
     */
    public void goalForLiverpool (View v){
        scoreliverpool = scoreliverpool + 1 ;
        displayForliverpool(scoreliverpool);
    }
    /**
     * increase the score for Liverpool faull button by one point.
     */
    public void faullForLiverpool (View v){
        faullliverpool = faullliverpool + 1 ;
        displayForliverpoolFaull(faullliverpool);
    }
    /**
     * increase the score for liverpool RedCard button by one point.
     */
    public void redCardForLiverpool (View v){
        redCardForliverpool = redCardForliverpool + 1 ;
        displayForliverpoolRedCard(redCardForliverpool);
    }
    /**
     * increase the score for liverpool yellowCard button by one point.
     */
    public void yellowCardForLiverpool (View v){
        yellowCardForliverpool = yellowCardForliverpool + 1 ;
        displayForliverpoolyellowCard(yellowCardForliverpool);
    }
    /**
     * increase the score for liverpool corner button by one point.
     */
    public void cornerForLiverpool (View v){
        cornerForliverpool = cornerForliverpool + 1 ;
        displayForliverpoolcorner(cornerForliverpool);
    }
    /**
     * increase the score for liverpool belanty button by one point.
     */
    public void belantyForLIverpool (View v){
        belantyForliverpool = belantyForliverpool + 1 ;
        displayForliverpoolbelanty(belantyForliverpool);
    }
    /**
     * Reset the score for all.
     */
    public void resetScore(View v) {
        scorebarcelona = 0;
        faullbarcelona = 0;
        redCardForBarcelona = 0;
        yellowCardForBarcelona = 0;
        cornerForBarcelona = 0;
        belantyForBarcelona = 0;
        scoreliverpool = 0;
        faullliverpool = 0;
        redCardForliverpool = 0;
        yellowCardForliverpool = 0;
        cornerForliverpool = 0;
        belantyForliverpool = 0;
        displayForbarcelona(scorebarcelona);
        displayForBarcelonaFaull(faullbarcelona);
        displayForBarcelonaRedCard(redCardForBarcelona);
        displayForBarcelonayellowCard(yellowCardForBarcelona);
        displayForBarcelonacorner(cornerForBarcelona);
        displayForBarcelonabelanty(belantyForBarcelona);
        displayForliverpool(scoreliverpool);
        displayForliverpoolFaull(faullliverpool);
        displayForliverpoolRedCard(redCardForliverpool);
        displayForliverpoolyellowCard(yellowCardForliverpool);
        displayForliverpoolcorner(cornerForliverpool);
        displayForliverpoolbelanty(belantyForliverpool);

    }



    public void displayForbarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelonaFaull(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelonafaull_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelonaRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelonaredcard_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelonayellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelonayellowcard_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelonacorner(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelonacorner_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelonabelanty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelonabelanty_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForliverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForliverpoolFaull(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpoolfaull_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForliverpoolRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpoolredcard_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForliverpoolyellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpoolyellowcard_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForliverpoolcorner(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpoolcorner_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForliverpoolbelanty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpoolbelanty_score);
        scoreView.setText(String.valueOf(score));
    }
}