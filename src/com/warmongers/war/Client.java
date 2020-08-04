package com.warmongers.war;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Game newGame = new Game();
        newGame.setupGame(newGame);
    }
}