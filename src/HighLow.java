import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in);

    public static int getInteger(int min, int max) {
        int input = sc.nextInt();
        if (input > max || input < min) {
            System.out.printf("Invalid entry! Please enter a number between %s and %s: ", min, max);
            return getInteger(min, max);
        }
        System.out.printf("You entered %s!", input);
        return input;

    }

    public static void highlowGame(int guess, int answer) {
        if (guess > answer) {
            System.out.println("LOWER");
            highlowGame(getInteger(1, 100), answer);
        } else if (guess < answer) {
            System.out.println("HIGHER");
            highlowGame(getInteger(1, 100), answer);
        } else {
            System.out.println("GOOD GUESS!");
        }
    }

    public static void main(String[] args) {
        System.out.println("High Low Game");

        do {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println("Guess a number!");
            highlowGame(getInteger(1, 100), answer);
            System.out.println("Would you like to go again?");
        } while (sc.next().equalsIgnoreCase("yes"));
    }
}
