import java.lang.reflect.Array;
import java.util.Arrays;
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

        for (int i = 0; i <= numre.length - 1; ++i){
            if (numre[i] == lookingFor){
                System.out.println("position of " + lookingFor + " is " + i);

                break;
            }else if (i == numre.length - 1 && numre[i] != lookingFor){
                System.out.println("the number you're looking for is gone boy");
                break;
            }
        }
    }

    public static void searchForHim() {

        System.out.println("what number are you looking for?");
        Scanner scanner = new Scanner(System.in);

        String lookingForU = scanner.next();
        String[] names = new Data().getRandomDrengeNavne();

        for (int i = 0; i <= names.length - 1; ++i) {
            if (names[i].equals(lookingForU)) {
                System.out.println("position of " + lookingForU + " is number  " + i + " the damn rascal");

                break;
            } else if (i == names.length - 1 && (!names[1].equals(lookingForU))){
                System.out.println("the boy you're looking for is gone man");

            }
        }
    }

    public static void sortNumbers(){
        int[] numreSort = new Data().getRandomNumbers1000();
        int temp = 0;
        for (int n = 0; n <= numreSort.length - 1; n++) {
            for (int i = 0; i <= numreSort.length - 1; i++) {
                if (i >= 1) {
                    if (numreSort[i - 1] < numreSort[i]) {
                        temp = numreSort[i];
                        numreSort[i] = numreSort[i - 1];
                        numreSort[i - 1] = temp;
                    }
                }
            }
        }
        System.out.print("{");
        for (int m = 0;m <= numreSort.length - 1; m++ ) {
            System.out.print(numreSort[m] + ", ");
        }
        System.out.print("}");
    }

    public static String[] sortNames(){
        String[] navneSort = new Data().getRandomDrengeNavne();
        Arrays.sort(navneSort);
        return navneSort;

    }
    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH
    public static void main(String[] args) {

    }
}
