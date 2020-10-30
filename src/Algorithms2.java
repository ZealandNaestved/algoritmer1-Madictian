import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    public static void searchThousand(){

        System.out.println("what number are you looking for?");
        Scanner scanner = new Scanner(System.in);

        int lookingFor = scanner.nextInt();
        int[] numre = new Data().getRandomNumbers1000();

        for (int i = 0; i <= numre.length; ++i){
            if (numre[i] == lookingFor){
                System.out.println("position of " + lookingFor + " is " + i);

                break;
            }else if (i == numre.length && i != lookingFor){
                System.out.println("the number you're looking for is gone boy");

            }
        }

    }
    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH
    public static void main(String[] args) {
        searchThousand();
    }

}
