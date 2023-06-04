import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean play = true;
        String invalid = "invalid input";

        int[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        Translator translator = new Translator(numeric, alphabetic);
        Scanner scanner = new Scanner(System.in);
        while (play) {
            System.out.println("Type in 'x' to stop \nType in 'v' to translate");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type in a number between 0 and 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("The translation of " + number + "is " + result + ".");
                } else {
                    System.out.println("invalid input");
                }

                {

                }
            }
        }
    }
}

        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */


    /*
     Deze methode is voor de bonus opdracht.
     */
 /*       public static void feedback (String stringnumber){
            Scanner scanner = new Scanner(System.in);
            StringBuilder feedback = new StringBuilder();
            System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
            System.out.println("Doe een gok, Let op vul 4 getallen in.");
            String guess = scanner.nextLine();
            if (Objects.equals(guess, stringnumber)) {
                System.out.println("gefeliciteerd je hebt het goed");
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("0");
                    } else {
                        feedback.append("X");
                    }
                }
            }
            System.out.println(feedback.toString());
        }
    }}*/

//Maak in de body van de while-loop een if/else if/else statement.
//if: Als de input "x" is, dan zet je play naar false.
//else if: Als de input "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9", vervolgens sla je het resultaat van scanner.nextInt() op in een variabele int number, voeg nog een scanner.nextLine(); toe op de volgende regel (scanner.nextInt doet dit namelijk niet van zichzelf) en als laatste check je met een if-statement of
//if: number kleiner is dan 10, dan sla je de waarde van translator.translate(number) op in String result en print je "De vertaling van " + number + " is " + result.
//else: anders dan print je ongeldig
//else: Als de input dus iets anders dan "x" of "v" is, dan print je ongeldig

