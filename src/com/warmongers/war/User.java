package com.warmongers.war;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User implements Player{

    ArrayList<Deck> userCards;

    // put constructor here that passes in collection of cards

    public User(ArrayList<Deck> userCards){
        this.userCards = userCards;
    }

    @Override
    public void flipCard() {

    }

    @Override
    public void collectCardsWon() {

    }

    @Override
    public void tieSequence() {

    }

    @Override
    public void countCards() {

    }


}