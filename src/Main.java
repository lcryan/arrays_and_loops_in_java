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
            }
        }
    }
}





