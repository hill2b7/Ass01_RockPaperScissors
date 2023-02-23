import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //import of Java scanner
        String ContinueGame = ""; //declare String variable
        String trash = ""; //declare String variable
        String PA = ""; //declare String variable
        String PB = ""; //declare String variable
        boolean PAdone = false; //declare boolean
        boolean PBdone = false;//declare boolean
        boolean done = false;//declare boolean
        boolean endGame = false;//declare boolean


        do // start of loop anything inside of this will loop until the while condition is met
        {

            do // start of loop anything inside of this will loop until the while condition is met
            {
                PAdone = false; // reset of sentinel value to clear from previous looping session
                System.out.println("Player A Enter your move (R,P,S) : "); // output asking player a for their move
                PA = in.nextLine(); // set's input received to Player A's move
                if (PA.equalsIgnoreCase("R") || PA.equalsIgnoreCase("P") || PA.equalsIgnoreCase("S"))
                {
                    PAdone = true; //ends the data collection for player A
                }
                else // the code block below will run if the if statement is not met
                {
                    trash = PA; // sets bad input from Player A to trash Sting variable
                    System.out.println("Input received is invalid " + trash + ". Please try again"); // lets the user know that the input received was incorrect and they should try again
                }
            }
            while (!PAdone);

            do // start of loop anything inside of this will loop until the while condition is met
            {
                PBdone = false;  //resets sentinel value to clear from previous looping sessions
                System.out.println("Player B Enter your move (R,P,S) : "); //output to ask user for their move
                PB = in.nextLine(); //setting PlayerB variable to whatever input is received
                if (PB.equalsIgnoreCase("R") || PB.equalsIgnoreCase("P") || PB.equalsIgnoreCase("S")) // if these conditions are met, then the code in the block runs
                {
                    PBdone = true; //ends the data collection for playerB
                }
                else //this statement will run if the if statement conditions are not met
                {
                    trash = PB; //sets bad input to the trash variable
                    System.out.println("Input received is invalid " + trash + " Please try again :"); //output that tells the user that the input is not as expected

                }
            }
            while (!PBdone);

            if (PA.equalsIgnoreCase("R")) // if statement that will run if the received input from player a was R or r
            {
                if (PB.equalsIgnoreCase("R")) // if statement that will run if the received input from player b was R or r
                {
                    System.out.println("Rock vs Rock. It's a tie!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("P"))// if statement that will run if the received input from player b was P or p
                {
                    System.out.println("Paper Covers Rock. Player B wins!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("S")) // if statement that will run if the received input from player b was S or s
                {
                    System.out.println("Rock Smashes Scissors. Player A wins!"); //system output letting the user know who won
                }
            }
            if (PA.equalsIgnoreCase("P")) // if statement that will run if the received input from player A was P or p
            {
                if (PB.equalsIgnoreCase("R")) // if statement that will run if the received input from player b was R or r
                {
                    System.out.println("Paper Covers Rock. Player A wins!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("P")) // if statement that will run if the received input from player b was P or p
                {
                    System.out.println("Paper vs Paper. It's a tie!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("S")) // if statement that will run if the received input from player b was S or s
                {
                    System.out.println("Scissors Cuts Paper. Player B wins!"); //system output letting the user know who won
                }
            }
            if (PA.equalsIgnoreCase("S")) // if statement that will run if the received input from player A was S or s
            {
                if (PB.equalsIgnoreCase("R")) // if statement that will run if the received input from player b was R or r
                {
                    System.out.println("Rock Breaks Scissors. Player B wins!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("P")) // if statement that will run if the received input from player b was P or p
                {
                    System.out.println("Scissors Cuts Paper. Player A wins!"); //system output letting the user know who won
                }
                else if (PB.equalsIgnoreCase("S")) // if statement that will run if the received input from player b was S or s
                {
                    System.out.println("Scissors vs Scissors. It's a tie!"); //system output letting the user know who won
                }
            }

            System.out.println("Do you want to play again Y/N :"); //output asking user if they want to play again
            ContinueGame = in.nextLine(); //setting ContinueGame string to whatever input is received by the end user
            if (ContinueGame.equalsIgnoreCase("N")) //if statement that will run if the condition is met

            {
                endGame = true; //sets the endGame String to true if the if statement is met causing the program to end
            }

        }while (!endGame); // Loop will run while the received input is not endGame or true
    }
}