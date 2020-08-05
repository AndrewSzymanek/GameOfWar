package com.warmongers.war;

import java.util.ArrayList;
import java.util.Collection;

public class Computer extends Player{

    public Computer(ArrayList<Deck> computerCards){
        this.playerCards = computerCards;
    }
}