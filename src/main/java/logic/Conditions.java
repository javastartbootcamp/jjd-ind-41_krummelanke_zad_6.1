package logic;

import java.util.Scanner;

public class Conditions {
    public int numberInRange;

    Scanner reader = new Scanner(System.in);

    public int outOfRange(int number) {

        while (number < 100 || number > 200) {
            if (number > 200) {
                System.out.println("Podana liczba jest za duża. Podaj liczbę:");
                number = reader.nextInt();
            }
            if (number < 100) {
                System.out.println("Podana liczba jest za mała. Podaj liczbę:");
                number = reader.nextInt();
            }
        }
        return numberInRange = number;
    }

    public void checkDivisibility(int number) {

        while (number >= 100 && number <= 200 && (number % 3 != 0)) {

            System.out.println("Podana liczba nie jest podzielna przez 3. Podaj liczbę:");
            number = reader.nextInt();
            outOfRange(number);
          //  number = numberInRange;
        }
        System.out.println("Twoja liczba jest ok");
    }
}
