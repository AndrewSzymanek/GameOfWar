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
        System.out.println("Press Enter to Flip a Card");
        try{System.in.read();}
        catch (Exception e){}
        return this.playerCards.get(0);
    }









}