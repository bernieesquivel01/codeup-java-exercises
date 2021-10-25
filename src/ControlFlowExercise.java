import java.util.Scanner;

public class ControlFlowExercise {

    public static void main(String[] args) {

        //1. Loop Basics

        //a. While

        // Create an integer variable i with a value of 5.
        // Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:

        // 5 6 7 8 9 10 11 12 13 14 15

        //Solution 1a:
        // int i = 5;

        // while (i <= 15) {
        // System.out.println(i + " ");//empty quotes gives a space between numbers.
        // i++;
        // }

        //b. Do While

        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        //Solution 1b:
        // int i = 0;

        // do {
        // System.out.println(i);
        // i += 2;
        // } while (i <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.

        //Solution:
        // int num = 100;

        // do {
        // System.out.println(num);
        // num -= 5;
        // } while (num >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

        // 2
        // 4
        // 16
        // 256
        // 65536

        //Solution:
        // long a = 2;

        // do {
        // System.out.println(a);
        // a *= a;
        // } while (a < 1_000_000);

        //c. For

        // Refactor the previous two exercises to use a for loop instead.

        //Solution 1c:
        // for(int i = 5; i <= 15; i++) {
        // System.out.println(i);
        // }

        // for(int i = 0; i <= 100; i+=2) {
        // System.out.println(i);
        // }

        // for(int i = 100; i >= -10; i -= 5) {
        // System.out.println(i);

        //2. Fizzbuzz

        // One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three: print “Fizz” instead of the number.
        // For the multiples of five: print “Buzz”.
        // For numbers which are multiples of both three and five: print “FizzBuzz”.

        //Solution 2:
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz, ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz, ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz, ");
            } else {
                System.out.println(i + ", ");
            }
        }


        //TA Example:

//        for(int i = 1; i < 100; i++) {
//            boolean divBy3 = (i % 3) == 0;
//            boolean divBy5 = (i % 5) == 0;
//
//            if (divBy3 && divBy5) {
//                System.out.println("FizzBuzz, ");
//            } else if (divBy5) {
//                System.out.println("Buzz, ");
//            } else if (divBy3) {
//                System.out.println("Fizz, ");
//            } else {
//                System.out.println(i);
//            }
//        }

        //3. Display a table of powers.

        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.

        // Example Output

        // What number would you like to go up to? 5

        // Here is your table!

        // number | squared | cubed
        // ------ | ------- | -----
        // 1      | 1       | 1
        // 2      | 4       | 8
        // 3      | 9       | 27
        // 4      | 16      | 64
        // 5      | 25      | 125

        //Solution 3:

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do {
            System.out.println("Enter an Integer: ");
            int userInput = sc.nextInt();

            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | ------");

            String row = " ";
            for (int i = 1; i <= userInput; i++) {
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);

                row = i + "        " + numberSquared + "        " + numberCubed;
                System.out.println(row);
            }

            System.out.print("Do you want to try again?");
            choice = sc.next();
            System.out.println();

        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
        // if user types "n" or "no" will not loop again; if user types "y" or "yes" loop will run again.

        //TA Example:

//        boolean confirm;
//
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter an Integer: ");
//            int userInput = sc.nextInt();
//
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf("%-7d|%-9d|%-6d\n", i, i * i, i * i * i);
//
//            }
//
//            System.out.print("Do you want to continue? (Y/N)");
//            confirm = sc.next().equalsIgnoreCase("y");
//        } while(confirm);

            //4. Convert given number grades into letter grades.

        // Prompt the user for a numerical grade from 0 to 100.
        // Display the corresponding letter grade.
        // Prompt the user to continue.
        // Assume that the user will enter valid integers for the grades.
        // The application should only continue if the user agrees to.
        // Grade Ranges:

        // A : 100 - 88
        // B : 87 - 80
        // C : 79 - 67
        // D : 66 - 60
        // F : 59 - 0

        //Solution 4:

        String showGrade = "y";

        do {
            System.out.print("Please, enter a numerical grade from 0 to 100.");
            int userGrade = sc.nextInt();



            String finalGrade;

            if (userGrade >= 88) {
                finalGrade = "A";
            } else if (userGrade >= 80) {
                finalGrade = "B";
            } else if (userGrade >= 67) {
                finalGrade = "C";
            } else if (userGrade >= 60) {
                finalGrade = "D";
            } else {
                finalGrade = "F";
            }


            System.out.print("Are you sure you want to see your letter grade? (Y/N)");
            showGrade = sc.next();
            System.out.println(finalGrade);

        } while (showGrade.equalsIgnoreCase("y") || showGrade.equalsIgnoreCase("yes"));

        //TA Example:

//        boolean confirm;
//
//        do {
//
//            System.out.print("Enter numerical grade: ");
//            int grade = sc.nextInt();
//
//            if (grade < 60) {
//                System.out.println("F");
//            } else if (grade < 67) {
//                System.out.println("D");
//            } else if (grade < 80) {
//                System.out.println("C");
//            } else if (grade < 88) {
//                System.out.println("B");
//            } else {
//                System.out.println("A");
//            }
//
//            System.out.print("Do you want to continue? (Y/N)");
//                confirm = sc.next().equalsIgnoreCase("y");
//            } while(confirm);
//
        }
    }



