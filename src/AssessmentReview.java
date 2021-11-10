import java.util.Arrays;

public class AssessmentReview {
    public static int cubed(int arg){
        return arg * arg * arg;
    }

    public static  double difference(double first, double second){
        return first - second;
    }

    public static double median(int[] arr){
        Arrays.sort(arr);
        double median;
        if(arr.length % 2 == 0){
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        } else {
            median = (double) arr[arr.length/2];
        }
        return median;
    }

    public static void main(String[] args) {
        System.out.println(cubed(3));
        System.out.println(difference(10,5));
        System.out.println(difference(10.5, 5.7));
        System.out.println(median(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
//    1. In the AssessmentReview class inside the java directory.
//
//        Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
//        Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
//        Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
//        (Hint: there are examples of how to find median of an array in Java all over the internet)
//        (Hint: the sort method on the Arrays class may be very helpful here)
//        (Hint: make sure the median of [1, 3, 4, 2, 6, 5, 8, 7] is 4.5)

//        Create a class named Cat inside of java that inherits from Pet.
//
//        Add a private field named color that is a String. This field represents the color of each instance of Cat.
//        Write the constructor on Cat that has 4 parameters: the age of the cat, a boolean indicating whether the cat is a rescue, what the cat's name is, and the color of the cat. The corresponding fields of the object should be set based on the arguments passed to the constructor. (Hint: use of the super constructor may be useful here)
//        Write a getter and setter on the Cat class for the color field.
//        Create a class named Dog inside of java that also inherits from Pet.
//
//        Add a private field named breed that is a String. This field represents the breed of each instance of Dog.
//        Write the constructor on Dog that has 4 parameters: the age of the dog, a boolean indicating whether the dog is a rescue, what the dog's name is, and the breed of the dog. The corresponding fields of the object should be set based on the arguments passed to the constructor. (Hint: use of the super constructor may be useful here)
//        Write a getter and setter on the Dog class for the breed property.
//        Create an interface named Meowable inside of java.
//
//        The Meowable interface should specify a public abstract method named meow that accepts no arguments and returns nothing.
//        Change your Cat class so that it implements the Meowable interface.
//        The implementation of the meow method on Cat class should print the following message:
//        This is a meow!
//        Create an interface named Barkable inside of java.
//
//        The Barkable interface should specify a public abstract method named bark that accepts no arguments and returns nothing.
//        Change your Dog class so that it implements the Barkable interface.
//        The implementation of the bark method on the Dog class should print the following message:
//        Bork bork!
//        On your AssessmentReview class create a static method named uppercaseCatColor.
//
//        This method should:
//
//        Receive an ArrayList of Cat objects as a parameter.
//        The method should return an ArrayList of Cat objects, where each Cat object's color field is in uppercase.
//        Sample Input
//
//        a Cat object with a color of "black"
//        a Cat object with a color of "orange"
//        a Cat object with a color of "white"
//        Sample Output
//
//        a Cat object with a color of "BLACK"
//        a Cat object with a color of "ORANGE"
//        a Cat object with a color of "WHITE"
//        Hints
//
//        Check to make sure that each Cat's color field is already uppercase
//        If the color field is not already uppercase, USE THE SETTER to change the color field to uppercase.