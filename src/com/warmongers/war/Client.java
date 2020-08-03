package com.warmongers.war;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Game newGame = new Game();
        System.out.println("Welcome to War Mongers card game");
        System.out.println("Kindly select any of the Game plans.");
        System.out.println("\t1.  52-Cards game");
        System.out.println("\t2.  36-Cards game");
        System.out.println("\t3.  18-Cards game");
        System.out.print("\tMake selection: ");


        newGame.setupGame(newGame);
    }
}
    // should shuffle, deal cards at this point

