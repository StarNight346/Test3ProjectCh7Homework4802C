import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Die test = new Die();
        // System.out.println(test.GetRoll());

        System.out.println("Welcome to Guess, this game is simple. Choose a number if your number matches the dice total you win. Otherwise you lose.");
        System.out.println("Please enter a number 2-12");

        Die firstDie = new Die(); //Create one die
        Die secondDie = new Die(); //Create a second die
        Scanner scnr = new Scanner(System.in); //New Scanner
        int playersGuess = 0; //Variable to store the players guess
        int diceTotal; //Variable to store dice total
        boolean winCondition = false; //Set win condition
        boolean exit = false;

        while (exit == false) {

            playersGuess = scnr.nextInt();

            if (playersGuess == -1) {
                exit = true;
                break;
            }

            while ((playersGuess < 2 || playersGuess > 12)) {
                System.out.println("This is not a valid guess, please enter a number 2-12.");
                playersGuess = scnr.nextInt();
            } //Checks to see if the players guess is in the correct range

            for (int i = 0; i < 3; ++i) //Roll three dice
            {
                System.out.println(firstDie.GetRoll() + " " + secondDie.GetRoll() + " ");
                diceTotal = firstDie.GetRoll() + secondDie.GetRoll();
                firstDie.Roll();
                secondDie.Roll();
                System.out.println(diceTotal);

                if (playersGuess == diceTotal) {
                    System.out.println("You win!");
                    winCondition = true;
                    break;
                } // End of if statements checks if you won
            } //End of for loop

            if (winCondition != true) {
                System.out.print("You lose!"); //if not you lose
            }

            if (exit == false) {
                winCondition = false;
            }
        }
        scnr.close();
    }
}








//
//
//public class DiceGame {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        // Die test = new Die();
//        // System.out.println(test.GetRoll());
//
//        System.out.println("Welcome to Guess, this game is simple. Choose a number if your number matches the dice total you win. Otherwise you lose.");
//        System.out.println("Please enter a number 1-6");
//
//        Die firstDie = new Die(); //Create one die
//        Scanner scnr = new Scanner(System.in); //New Scanner
//        int playersGuess = scnr.nextInt(); //Variable to store the players guess
//        int firstRoll; //variable for the computers roll
//        boolean winCondition = false; //Set win condition
//
//
//        while (playersGuess != -1) {
//
//            while ((playersGuess < 0 || playersGuess > 6)) {
//                System.out.println("This is not a valid guess, please enter a number 1-6.");
//                playersGuess = scnr.nextInt();
//            } //Checks to see if the players guess is in the correct range
//
//            for (int i = 0; i < 2; ++i) //Roll two dice
//            {
//                firstDie.Roll();
//                firstRoll = firstDie.GetRoll();
//                System.out.println(firstRoll);
//
//                if (playersGuess == firstRoll) {
//                    System.out.println("You win!");
//                    winCondition = true;
//                    playersGuess = scnr.nextInt();
//                    break;
//                } // End of if statements checks if you won
//            } //End of for loop
//
//            if (winCondition != true) {
//                System.out.print("You lose!"); //if not you lose
//                playersGuess = scnr.nextInt();
//            }
//        }
//        scnr.close();
//    }
//}
