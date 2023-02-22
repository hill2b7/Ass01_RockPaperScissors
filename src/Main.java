import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ContinueGame = "";
        String PA = "";
        String PB = "";
        String trash = "";
        boolean PAdone = false;
        boolean PBdone = false;
        boolean done = false;
        boolean endGame = false;


        do
        {

            do
            {
                System.out.println("Player A Enter your move (R,P,S) : ");
                PA = in.nextLine();
                if (PA.equalsIgnoreCase("R") || PA.equalsIgnoreCase("P") || PA.equalsIgnoreCase("S")) {
                    PAdone = true;
                }
                else
                {
                    trash = PA;
                    System.out.println("Input received is invalid " + trash);
                    System.out.println("Please try again : ");
                }
            }
            while (!PAdone);
            do {
                System.out.println("Player B Enter your move (R,P,S) : ");
                PB = in.nextLine();
                if (PB.equalsIgnoreCase("R") || PB.equalsIgnoreCase("P") || PB.equalsIgnoreCase("S"))
                {
                    PBdone = true;
                }
                else
                {
                    trash = PB;
                    System.out.println("Input received is invalid " + trash);
                    System.out.println("Please try again : ");

                }
            }
            while (!PBdone);
            if (PA.equalsIgnoreCase("R"))
            {
                if (PB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock. It's a tie!");
                }
                if (PB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper Covers Rock. Player B wins!");
                }
                if (PB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock Smashes Scissors. Player A wins!");
                }
            }
            if (PA.equalsIgnoreCase("P"))
            {
                if (PB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper Covers Rock. Player A wins!");
                }
                if (PB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper. It's a tie!");
                }
                if (PB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors Cuts Paper. Player B wins!");
                }
            }
            if (PA.equalsIgnoreCase("S"))
            {
                if (PB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock Breaks Scissors. Player B wins!");
                }
                if (PB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors Cuts Paper. Player A wins!");
                }
                if (PB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors. It's a tie!");
                }
            }

            System.out.println("Do you want to play again Y/N :");
            ContinueGame = in.nextLine();
            if (ContinueGame.equalsIgnoreCase("N"))
            {
                endGame = true;
            }

        }while (!endGame) ;
    }
}