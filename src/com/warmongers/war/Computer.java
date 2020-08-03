package com.warmongers.war;

import java.util.ArrayList;
import java.util.Collection;

public class Computer implements Player {

    ArrayList<Deck> computerCards;

    // put constructor here that passes in collection of cards

    public Computer(ArrayList<Deck> computerCards){
        this.computerCards = computerCards;
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