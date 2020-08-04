package com.warmongers.war;

import java.util.ArrayList;

public class CardTable {

    Player player1;
    Player player2;

    public CardTable(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

   public void displayScore() {
       System.out.println("Score is: Computer - " + player2.score + ", User - " + player1.score + ".");
   }

    public void compareCards() {
        if
           (player1.playerCards.size() == 0 || player2.playerCards.size() == 0) {
            System.out.println("Game Over");
        } else {
            Deck userCard = player1.flipCard();
            Deck computerCard = player2.flipCard();
            int userCardValue = userCard.getValue();
            int computerCardValue = computerCard.getValue();
            if (userCardValue == computerCardValue) {
                player1.playerCards.remove(userCard);
                player2.playerCards.remove(computerCard);
                compareCards();
            } else if (userCardValue > computerCardValue) {
                player1.score++;
                player1.playerCards.remove(userCard);
                player2.playerCards.remove(computerCard);
            } else {
                player2.score++;
                player1.playerCards.remove(userCard);
                player2.playerCards.remove(computerCard);
            }
        }
            displayScore();
    }
}
















