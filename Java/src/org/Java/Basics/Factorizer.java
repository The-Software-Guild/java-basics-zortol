package org.Java.Basics;

import java.util.Scanner;

public class Factorizer {


    public static void main(String[] args) {
        // User input
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to factor ");
        int number = scan.nextInt();
        int counter = 0;
        int perfectNumber = 0;
        System.out.println("This is a factors of " + number);
        for (int i = 1; i <= number; i++) {
            // if number mod i = 0 means its divisible meaning a factor
            if (number % i == 0 && i != number) {
                System.out.print(i + " ");
                counter++;
                perfectNumber += i;
            } else if (number % i == 0 && i == number) {    // this is the number itself condition
                System.out.print(i + " ");
                counter++;
            }
        }

        System.out.println("The length of factors are " + counter);

        if (perfectNumber == number) {
            System.out.println("\nAddition of the numbers is: " + perfectNumber);

        } else {
            System.out.println("\n" + number + " is not a perfect number");

        }

        int primeCounter = 0;

        for(int i =1; i <= number;i++){
            if(number % i == 0){
                primeCounter++;
            }
        }

        if(primeCounter > 2){
            System.out.println(number + " is not a prime number.");
        }else{
            System.out.println(number + " is a prime number.");
        }

    }
}
