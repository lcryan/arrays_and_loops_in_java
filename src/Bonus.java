import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        HashSet<Integer> secretNumber = randomNumberGenerator();
        String stringNumber = setToStringConverter(secretNumber);
        System.out.println(stringNumber);
        feedback(stringNumber);
    }

    public static void feedback(String stringnumber) {
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

    public static HashSet<Integer> randomNumberGenerator() {
        Random randomNumber = new Random();
        HashSet<Integer> secretNumber = new HashSet<>();
        while (secretNumber.size() < 4) {
            int rand = randomNumber.nextInt((9) + 1);
            secretNumber.add(rand);
        }
        return secretNumber;
    }

    public static String setToStringConverter(HashSet<Integer> secretNumber) {
        StringBuilder stringNumber = new StringBuilder();
        for (Integer element : secretNumber) {
            stringNumber.append(element.toString());
        }
        return stringNumber.toString();
    }
}


