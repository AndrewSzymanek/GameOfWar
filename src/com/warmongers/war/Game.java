package com.warmongers.war;

public class Game {
    private static final int HIGH_LEVEL = 1;
    private static final int LOW_LEVEL = 3;

    public boolean setupGame(char selection)
    {
        try
        {
            int mySelection = Integer.parseInt(String.valueOf(selection));
            if (mySelection >= HIGH_LEVEL && mySelection <= LOW_LEVEL)
            {
              //  TODO: call method to pass in mySelection for amount of cards
                return true;
            }
            else
            {
                System.out.print("\nSelection out of Range " +
                        "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
                return false;
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.print("\nYou have selected a non-number " +
                    "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
            return false;
        }
    }
}