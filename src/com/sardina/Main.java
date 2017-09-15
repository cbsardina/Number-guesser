package com.sardina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double theNumber = Math.ceil(Math.random() * 100);
        int guess;
        int guesses = 1;
        System.out.println(theNumber);

        System.out.println("Guess a number between 1-100!");
        guess = scanner.nextInt();

        if (theNumber == guess) {
            System.out.println("You got it!! The number was " + theNumber + ". It only took you " + guesses + " guess.");
        } else {
            while (theNumber != guess) {
                if (theNumber > guess) {
                    System.out.println("You guessed too low. Guess again.");
                    guess = scanner.nextInt();
                    guesses++;
                }
                else {
                    System.out.println("You guessed too high. Guess again");
                    guess = scanner.nextInt();
                    guesses++;
                }
            }
        }

        System.out.println("You guessed it! The number was " + guess + ". It took you " + guesses + " guesses.");


    }


}
