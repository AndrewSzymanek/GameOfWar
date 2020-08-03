package com.warmongers.war;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException
    {
        Game newGame = new Game();
        System.out.println("Welcome to War Mongers card game");
        System.out.println("Kindly select any of the Game plans.");
        System.out.println("\t1.  52-Cards game");
        System.out.println("\t2.  36-Cards game");
        System.out.println("\t3.  18-Cards game");
        System.out.print("\tMake selection: ");


        char selection;
        do
        {
            Scanner s = new Scanner(System.in);
            selection = s.next().charAt(0);
            //selection = (char) System.in.read();
        } while (!newGame.setupGame(selection));

        System.out.println("\tYou have selected Game " + selection);
    }

}
    // should shuffle, deal cards at this point

