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

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }


    public boolean yesNo(String s){
        System.out.println(s);
        System.out.println("Enter yes or no");
        String input = sc.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }


    public int getInt(int min, int max){
        int input;
        do{
            System.out.printf("Please enter a number between %d and %d%n", min, max);
            input = this.sc.nextInt();
        }while (input < min || input > max);

            return input;

    }

    public int getInt(){
        try{
            String s = getString();
        return Integer.valueOf(s);
    } catch (NumberFormatException e){
            System.out.println("Please enter an integer:");
            return getInt();
        }
    }


//    public int getInt(int min, int max){
//        int  num;
//        try{
//            num = Integer.parseInt(getString("Please enter a number between " +min+ " and " +max));
//            System.out.println("You entered: " + num);
//        } catch(NumberFormatException e){
//            return getInt(min, max);
//        }
//
//        if (num < min || num > max){
//            System.out.println("Invalid entry; please try again!");
//            return getInt(min, max);
//        }
//        return num;
//    }
//
//    public int getInt(){
//        try{
//            return Integer.parseInt(getString("Enter another number:"));
//        } catch (NumberFormatException e){
//            return getInt();
//        }
//    }





    //The getDouble method should do the same thing, but with decimal numbers.
//    public double getDouble(){
//        System.out.println("Please double your number.");
//        return this.sc.nextDouble();
//    }
//
//    public double getDouble(double min, double max){
//        double input;
//        do{
//            System.out.printf("Please enter double number between %.2f and %.2f\n", min, max);
//            input = this.sc.nextDouble();
//        }while(input < min || input > max);
//
//            return input;
//        }
//    }

public double getDouble(double min, double max){
    double decimalNum;
    try {
        decimalNum = Double.parseDouble(getString("Please enter a number between " +min+ " and " +max));
    } catch (NumberFormatException e){
        return getDouble(min, max);
    }

    if(decimalNum < min || decimalNum > max){
        System.out.println("Invalid entry: try again!");
        return getDouble(min, max);
    }
    return decimalNum;
    }
    public double getDouble(){
        try{
            return Double.parseDouble(getString("Give me another number!"));
        } catch (NumberFormatException e){
            return getDouble();
        }
    }
}

