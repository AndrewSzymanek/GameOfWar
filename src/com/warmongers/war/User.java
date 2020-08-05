package com.warmongers.war;

import org.w3c.dom.ls.LSOutput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User extends Player  {

    public User(ArrayList<Deck> userCards){
        this.playerCards = userCards;
    }

    public Deck flipCard() throws IOException {
        System.out.println("Press Enter to Flip a Card");
        System.in.read();
        return this.playerCards.get(0);
    }
}