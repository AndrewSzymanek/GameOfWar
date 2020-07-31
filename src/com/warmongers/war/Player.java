package com.warmongers.war;

public interface Player {

    int cardCount = 0;

    void flipCard();
    void collectCardsWon();
    void tieSequence();
    void countCards();
}
