import java.util.Scanner;

//Create a class named MethodsExercises. Inside of your class, write code to create the specified methods. Test your code by creating a main method and calling each of the methods you've created.
public class MethodsExercises {
    //1.Basic Arithmetic
    //1a. Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //1b. Each function needs to take two parameters/arguments so that the operation can be performed.
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    //1d. Add a modulus method that finds the modulus of two numbers.
    public static double modulus(double num1, double num2){
        return num1%num2;
    }

    //2. Create a method that validates that user input is in a certain range
    //The method signature should look like this: public static int getInteger(int min, int max);

    //and is used like this:

    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);
    //If the input is invalid, prompt the user again.

    //Hint: recursion might be helpful here!

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);//allows user to input info
        int input = sc.nextInt();
        if (input > max || input < min){
            System.out.printf("Invalid entry! Please enter a number between %s and %s: ", min, max);
            return getInteger(min, max);
        }
        System.out.printf("You entered %s!", input);
        return input;

    }

    //3. Calculate the factorial of a number.

    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:

    //1! = 1               = 1
    //2! = 1 x 2           = 2
    //3! = 1 x 2 x 3       = 6
    //4! = 1 x 2 x 3 x 4   = 24


    //4. Create an application that simulates dice rolling.

    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

//    public static int rollDice (int sides){
//
//    }

    public static void main(String[] args) {
        //1c. Test your methods and verify the output.
        System.out.println(add(5, 4));
        System.out.println(subtract(9, 8));
        System.out.println(multiply(3, 2));
        System.out.println(divide(20, 4));
        System.out.println(modulus(8, 4));
        //Food for thought: What happens if we try to divide by zero? What should happen?

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);//sets min and max number!


    }

}