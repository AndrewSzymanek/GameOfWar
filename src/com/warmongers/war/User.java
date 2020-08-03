package com.warmongers.war;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User extends Player  {




    // put constructor here that passes in collection of cards

    public User(ArrayList<Deck> userCards){
        this.playerCards = userCards;
    }

    public Deck flipCard() {


        return this.playerCards.get(0);
    }









}