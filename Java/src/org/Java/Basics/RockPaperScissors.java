package org.Java.Basics;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public void computeResult(int choice) {
//        Random rand = new Random();
//        int wins = 0;
//        int loses = 0;
//        int draws = 0;
//        int compChoice = rand.nextInt(3) + 1; // add 1 because the bound includes 0
//        switch (choice) {
//            case 1: // rock choice. Rock draws against Rock. Rock loses to paper. Rock wins against scissors.
//                if (compChoice == 1) {
//                    // Rock draws against Rock
//                    draws++;
//                } else if (compChoice == 2) {
//                    // Rock loses to paper.
//                    loses++;
//                } else {
//                    // Rock wins against scissors.
//                    wins++;
//                }
//
//                break;
//            case 2:
//                if (compChoice == 1) {
//                    // Paper wins against Rock
//                    wins++;
//                } else if (compChoice == 2) {
//                    // Paper draws against paper.
//                    draws++;
//                } else {
//                    // Paper loses against scissors.
//                    loses++;
//                }
//
//                break;
//            case 3:
//                if (compChoice == 1) {
//                    // Scissors loses against Rock
//                    loses++;
//                } else if (compChoice == 2) {
//                    // Scissors wins against paper.
//                    wins++;
//                } else {
//                    // Scissors draws against scissors.
//                    draws++;
//                }
//
//                break;
    }

    public static void main(String[] args) {
        boolean wideChecker = false;
        while (wideChecker == false) {


            Scanner scan = new Scanner(System.in);
            System.out.println("How many rounds would you like to play?");

            int rounds = 0;
            rounds = scan.nextInt();
            if (rounds <= 10 && rounds >= 1) {
                // plays
                int[] results = new int[3];     // [0] -> wins, [1] -> loses, [2] -> draws
                int wins = 0;
                int loses = 0;
                int draws = 0;
                while (rounds > 0) {
                    rounds--;
                    Random rand = new Random();
                    System.out.println("Please pick a choice\n1 = Rock, 2 = Paper, 3 = Scissors");

                    boolean checker = false;

                    int choice = scan.nextInt();
                    while (checker == false) {
                        if (choice >= 1 && choice <= 3) {
                            checker = true;
                        } else {
                            System.out.println("Please pick a valid choice\n1 = Rock, 2 = Paper, 3 = Scissors");
                            choice = scan.nextInt();
                        }
                    }

                    int compChoice = rand.nextInt(3) + 1; // add 1 because the bound includes 0

                    switch (choice) {
                        case 1: // rock choice. Rock draws against Rock. Rock loses to paper. Rock wins against scissors.
                            if (compChoice == 1) {
                                // Rock draws against Rock
                                System.out.println("Computer choose Rock so Drew");
                                draws++;
                            } else if (compChoice == 2) {
                                // Rock loses to paper.
                                System.out.println("Computer choose Paper so lose");
                                loses++;
                            } else {
                                // Rock wins against scissors.
                                System.out.println("Computer choose Scissors so win");
                                wins++;
                            }

                            break;
                        case 2:
                            if (compChoice == 1) {
                                // Paper wins against Rock
                                System.out.println("Computer choose Rock so win");
                                wins++;
                            } else if (compChoice == 2) {
                                // Paper draws against paper.
                                System.out.println("Computer choose Paper so Drew");
                                draws++;
                            } else {
                                // Paper loses against scissors.
                                System.out.println("Computer choose scissors so lose");
                                loses++;
                            }

                            break;
                        case 3:
                            if (compChoice == 1) {
                                // Scissors loses against Rock
                                System.out.println("Computer choose Rock so lose");
                                loses++;
                            } else if (compChoice == 2) {
                                // Scissors wins against paper.
                                System.out.println("Computer choose paper so win");
                                wins++;
                            } else {
                                // Scissors draws against scissors.
                                System.out.println("Computer choose scissors so Drew");
                                draws++;
                            }

                            break;

                    }

                }

                System.out.println("You won: " + wins);
                System.out.println("You lost: " + loses);
                System.out.println("You drew: " + draws);


            } else {
                System.out.println("Number of rounds must be between 1 and 10");
            }
            System.out.println("Would you like to play again? Yes or No");
            String response = scan.next();
            if (response.equals("No")) {
                wideChecker = true;
            }
        }
        System.out.println("Thanks for playing!");
    }

}
