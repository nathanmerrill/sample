package com.nmerrill.sample;

import com.nmerrill.kothcomm.game.KotHComm;

public class Main {
    public static void main(String[] args){
        KotHComm<com.nmerrill.sample.SamplePlayer, com.nmerrill.sample.SampleGame> kotHComm = new KotHComm<>(com.nmerrill.sample.SampleGame::new);
        kotHComm.run(args);
    }
}
