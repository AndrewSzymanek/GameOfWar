package com.warmongers.war;

import java.util.*;

public class Game {
    private static final int HIGH_LEVEL = 1;
    private static final int LOW_LEVEL = 3;

    public void setupGame(Game game)
    {
       int mySelection = selection(game);
        try
        {
            if (mySelection >= HIGH_LEVEL && mySelection <= LOW_LEVEL)
            {
                System.out.println("yay it works");
                User player1 = new User();
                Computer computer = new Computer();
            }
            else
            {
                System.out.print("\nSelection out of Range " +
                        "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
                setupGame(game);
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.print("\nYou have selected a non-number " +
                    "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
          setupGame(game);
        }
    }

    public int selection(Game game) {
            char selection;
            Scanner s = new Scanner(System.in);
            selection = s.next().charAt(0);
            System.out.println("\tYou have selected Game " + selection);
            return Integer.parseInt(String.valueOf(selection));
    }

    public ArrayList<Deck> cardsToList(){
        Deck [] deck = Deck.values();
        ArrayList<Deck> cards = new ArrayList<>();
        for(Deck card : deck){
            cards.add(card);
        }
        Collections.shuffle(cards);
        return cards;
    }

    public ArrayList<Deck> getCards(int selection){
        if(selection == 2){
            return new ArrayList<Deck>(cardsToList().subList(0,36));
        }
        else if(selection == 3){
            return new ArrayList<Deck>(cardsToList().subList(0,18));
        }
        return cardsToList();
    }
}