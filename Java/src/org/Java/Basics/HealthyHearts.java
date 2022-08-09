package org.Java.Basics;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age? ");
        int maxHeartBeat = 220 - scan.nextInt();

        System.out.println("Your maximum heart rate should be " + maxHeartBeat + " beats per minute");
        System.out.println("Your target HR Zone is " + (int) Math.round((0.5 * maxHeartBeat)) + " - " + (int) Math.round((0.85 * maxHeartBeat)) + " beats per minute");

    }
}
