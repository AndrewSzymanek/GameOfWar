package com.warmongers.war;

public class Game {
    int HIGH_LEVEL = 1;
    int LOW_LEVEL = 3;

    public boolean setupGame(char selection)
    {
        try
        {
            int mySelection = Integer.parseInt(String.valueOf(selection));
            if (mySelection >= HIGH_LEVEL && mySelection <= LOW_LEVEL)
            {
                Cards gameSelection = new Cards(mySelection);
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