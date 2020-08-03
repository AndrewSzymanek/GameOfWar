package com.warmongers.war;

public enum Deck {

    ACE_SPADES(11),
    TWO_SPADES(2),
    THREE_SPADES(3),
    FOUR_SPADES(4),
    FIVE_SPADES(5),
    SIX_SPADES(6),
    SEVEN_SPADES(7),



    KING_HEARTS(10);


    //variables
    private int value;


    // ctor
    private Deck(int value){
        this.value = value;
    }


    // Collections.shuffle()

    //getter/accessor
    public int getValue() {
        return this.value;
    }

}