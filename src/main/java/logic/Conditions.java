package logic;

import java.util.Scanner;

public class Conditions {
    private static final int MIN_NUM = 100;
    private static final int MAX_NUM = 200;

    Scanner reader = new Scanner(System.in);

    public void checkNumber() {
        int number;
        do {
            System.out.println("Podaj liczbę:");
            number = reader.nextInt();
        } while (!isCorrect(number));
        System.out.println("Podana liczba jest ok.");
    }

    private boolean isCorrect(int number) {

        if (number > MAX_NUM) {
            System.out.println("Podana liczba jest za duża.");
            return false;
        }

        if (number < MIN_NUM) {
            System.out.println("Podana liczba jest za mała.");
            return false;
        }

        if (number % 3 != 0) {
            System.out.println("Podana liczba nie jest podzielna przez 3.");
            return false;
        }
        return true;
    }
}
