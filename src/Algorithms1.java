import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {
            public static String randomBoyName(){
                String[] liste = new Data().getRandomDrengeNavne();
                String boyname = liste[(int)(Math.random() * 44)];
                return boyname;
            }
            public static String randomGirlName(){
                String[] liste2 = new Data().getRandomPigeNavne();
                String girlname = liste2[(int)(Math.random() * liste2.length)];
                return girlname;
    }
    public static String randomName(){
                int enten = (int)(Math.random() * 2) + 1;
        String[] listepiger = new Data().getRandomPigeNavne();
        String[] listedreange = new Data().getRandomDrengeNavne();
        String name = "1";
        if (enten == 1){
            name = listedreange[(int)(Math.random() * listedreange.length)];
        }else if(enten == 2){
            name = listepiger[(int)(Math.random() * listepiger.length)];
        }
        return name;
    }
    public static char letterTime(){
                Random rand = new Random();
                char[] alpha = new char[26];

                for(char ch = 'a'; ch <= 'z'; ++ch){
                    alpha[ch- 'a']=ch;
                }

                return alpha[rand.nextInt(alpha.length)];
    }

    public static void either(){
                Random random = new Random();
                int answer = random.nextInt(2);
                if (answer == 1){
                    System.out.println("Heads");

                }else{
                    System.out.println("Tails");

                }
    }


    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomPigeNavne property OBS: randomPigeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {
        exampleOfPredictableRandomNumber();
        System.out.println(randomBoyName());
        System.out.println(randomGirlName());
        System.out.println(randomName());
        System.out.println(letterTime());
        either();
    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

}
