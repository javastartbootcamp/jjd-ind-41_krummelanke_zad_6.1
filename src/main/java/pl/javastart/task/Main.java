package pl.javastart.task;

import logic.Conditions;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int userInput;

        System.out.println("Podaj liczbę:");
        userInput = reader.nextInt();

        Conditions checkConditions = new Conditions();
        checkConditions.outOfRange(userInput);

        userInput = checkConditions.numberInRange;
        checkConditions.checkDivisibility(userInput);

        reader.close();
    }
}