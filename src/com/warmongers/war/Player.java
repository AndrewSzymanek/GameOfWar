package com.warmongers.war;

import java.util.ArrayList;

public abstract class Player {



    public int score = 0;

    public ArrayList<Deck> playerCards;


    public Deck flipCard() {
        return playerCards.get(0);
    }//default= flip top card



    public void tieSequence() {

    }

    public int getCount() {
        return score;
    }

    public void setCount(int count) {
        this.score = count;
    }
}
