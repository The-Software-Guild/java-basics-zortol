package org.Java.Basics;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("What is your dog's name?");
        String dogName = scan.next();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");

        System.out.println(dogName + " is:");

        int[] breedPercent = new int[5];
        int numberToDec = 100;
        for(int i =0; i < breedPercent.length - 1; i++){
            int in = rand.nextInt(numberToDec) + 1;
            breedPercent[i] = in;
            numberToDec -= in;
        }

        breedPercent[4] = numberToDec;
        System.out.println(breedPercent[0] + "% St. Bernard");
        System.out.println(breedPercent[1] + "% Chihuahua");
        System.out.println(breedPercent[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(breedPercent[3] + "% Common Cur");
        System.out.println(breedPercent[4] + "% King Doberman");

        System.out.println("Wow, that's QUITE the dog!");
    }
}
