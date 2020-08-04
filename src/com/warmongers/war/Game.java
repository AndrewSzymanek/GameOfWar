package com.warmongers.war;

import java.lang.reflect.Array;
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
                System.out.println("Prepare for War");
                ArrayList<ArrayList<Deck>> deck = splitDeck(cardsToList());
                ArrayList<Deck> userCards = deck.get(0);
                User user = new User(userCards);
                ArrayList<Deck> computerCards = deck.get(1);
                Computer computer = new Computer(computerCards);
                CardTable cardTable = new CardTable(user, computer, game);
                cardTable.compareCards();
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

        System.out.println("Welcome to WarMongers card game \n Kindly select any of the Game plans.");
        System.out.println("\t1.  52-Cards game ");
        //t2.  36-Cards game t3.  18-Cards game
        System.out.print("\tMake selection: ");
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

    public ArrayList<ArrayList<Deck>> splitDeck(ArrayList<Deck> deck){
        deck = cardsToList();
        ArrayList<ArrayList<Deck>> cards = new ArrayList<>();
        ArrayList<Deck> userDeck = new ArrayList<>();
        ArrayList<Deck> computerDeck = new ArrayList<>();
        for(int i = 0; i < deck.size(); i++){
            if(i % 2 == 0){
                userDeck.add(deck.get(i));
            }
            if(i % 2 != 0){
                computerDeck.add(deck.get(i));
            }
        }
        cards.add(userDeck);
        cards.add(computerDeck);
        return cards;
    }
}