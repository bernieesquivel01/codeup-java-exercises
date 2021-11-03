//1. Create an input validation class
//Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.

package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    //The class should have the following methods, all of which return command line input from the user:
    public String getString(){
        return this.sc.nextLine();
    }


    public boolean yesNo(String s){
        System.out.println(s);
        System.out.println("Enter yes or no");
        String input = sc.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
    public int getInt(){
        System.out.println("Please enter a number.");
        return this.sc.nextInt();
    }

    public int getInt(int min, int max){
        int input;
        do{
            System.out.printf("Please enter a number between %d and %d%n", min, max);
            input = this.sc.nextInt();
        }while (input < min || input > max);

            return input;

    }


    //The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble(){
        System.out.println("Please double your number.");
        return this.sc.nextDouble();
    }

    public double getDouble(double min, double max){
        double input;
        do{
            System.out.printf("Please enter double number between %.2f and %.2f\n", min, max);
            input = this.sc.nextDouble();
        }while(input < min || input > max);

            return input;
        }
    }



