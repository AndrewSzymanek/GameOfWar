package com.warmongers.war;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("warmonger_banner.txt"));
            Stream<String> lines = reader.lines();
            lines.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader !=null) {
                try { reader.close(); }
                catch (IOException ignored) {}
            }
        }

        Game newGame = new Game();
        newGame.setupGame(newGame);


    }
}