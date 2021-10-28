import java.util.Enumeration;
import java.util.Scanner;

public class MethodsExercises {

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > max || input < min) {
            System.out.printf("Invalid input! Enter a number between %s and %s: ", min, max);
            return getInteger(min, max);
        }
        System.out.printf("You entered %s!", input);
        return input;
    }

    public static void main (String[]args){
                System.out.println(add(3.3, 9.6));
                System.out.println(subtract(6, 3));
                System.out.println(multiply(5, 4));
                System.out.println(divide(8, 4));
                System.out.println(modulus(5, 36));


    }

    //Solution 1:
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
        return num1/num2;
    }
//            //d. Add a modulus method that finds the modulus of two numbers.
//
//    //Solution 1d:
    public static double modulus(double num1, double num2){
        return num1%num2;
    }

            //Food for thought: What happens if we try to divide by zero? What should happen?
        //Bonus
            //a. Create your multiplication method without the * operator (Hint: a loop might be helpful).

//            public static double bonusMultiply(double num1, double num2){
//                double total = 0;
//                for (int i = 0, i > num2, i += 1){;
//                    total += num1;
//                }
//                return total;
//                System.out.println(double bonusMultiply);
//            }


            //b. Do the above with recursion.

            //public static double recursionMultiply(double num1, double num2, double total){
                //if (num2>0) {
                    //return recursionMultiply(num1, num2 -1, total + num1);
                //} else {
                    //return total;
                //}
            //}




   //2. Create a method that validates that user input is in a certain range

        //The method signature should look like this:
        //public static int getInteger(int min, int max);
        //and is used like this:
            //System.out.print("Enter a number between 1 and 10: ");
            //int userInput = getInteger(1, 10);
        //If the input is invalid, prompt the user again.

        //Hint: recursion might be helpful here!

        //Solution 2:





}
