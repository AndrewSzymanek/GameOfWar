package com.warmongers.war;

import java.util.ArrayList;

public class CardTable {

    Player player1;
    Player player2;



    public CardTable(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

//    public void displayScore() {
//        System.out.println("Score is: Computer - " + Computer.countCards() + ", Player 1 - " + User.countCards() + ".");
//    }

    public void compareCards() {
        int userCard = player1.flipCard().getValue();
        int computerCard = player2.flipCard().getValue();
        if (userCard > computerCard) {
            player1.count++;
        }
        else {
            player2.count++;
        }


    }



















}