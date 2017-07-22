package com.nmerrill.sample;

import com.nmerrill.kothcomm.game.games.AbstractGame;
import com.nmerrill.kothcomm.game.scoring.Scoreboard;

public class SampleGame extends AbstractGame<SamplePlayer> {
    @Override
    protected void setup() {
        // Called once before the game starts to allow you to initialize any variables
        // The variables `random` and `players` have been provided to you
    }

    @Override
    protected void step() {
        // Called repeatedly until finished() returns true
    }

    @Override
    public boolean finished() {
        // Return true when the game is finished
        return true;
    }

    @Override
    public Scoreboard<SamplePlayer> getScores() {
        // Called at the end of the game to get the results.  Could be called at any time if you are using the GUI
        return new Scoreboard<>();
    }
}
