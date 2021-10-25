import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        //1. Copy this code into your main method:
        double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.

        //System.out.printf("The value of pi is approximately %s", pi);
        //solution 1: gives an output of 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);
        //solution 1a: 2f kept it at 2 digits past the decimal; gave an output of 3.14 instead of 3.14159.

        //Scanner Class//
        Scanner scanner = new Scanner(System.in);//this has to be done in connection with import java.util.Scanner; at top of file.

        //1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //What happens if you input something that is not an integer?

        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        //2.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter Three Words: ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();

        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?

        //System.out.println("Enter three words: ");
        //This option worked, changed the format to ask after each input.

//        System.out.println("Your first word: ");
//        String word1 = scanner.nextLine();
//        System.out.println("Your second word: ");
//        String word2 = scanner.nextLine();
//        System.out.println("Your third word: ");
//        String word3 = scanner.nextLine();

        System.out.printf("Your three words are: \n %s \n %s \n %s \n", word1, word2, word3);
        scanner.nextLine();

        //3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //do you capture all the words?

//        System.out.println("Give me a sentence?");
//
//        String newSentence = scanner.next();//using .next will only give the next "word", so output would be the first word of the sentence only.
//
//        System.out.printf("%s? That's a weird thing to say!", newSentence);

        //4.Rewrite the above example using the nextLine method.
        System.out.println("Give a sentence please");

        String newSentence = scanner.nextLine();

        System.out.printf("%s? Thanks, was that so hard!", newSentence);

        //Calculate the perimeter and area of Codeup classroom//

        //1.Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
            //Assume that the rooms are perfect rectangles.
            //Assume that the user will enter valid numeric data for length and width.

        System.out.print("Please enter the length of the room");
        String  lString = scanner.nextLine();
        int l = Integer.parseInt(lString);

        System.out.print("Please enter the width of the room");
        String  wString = scanner.nextLine();
        int w = Integer.parseInt(wString);

        //2.Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        int area = l * w;
        int perimeter = (2*l) + (2*w);

        System.out.printf("The area of the room is: %d\n", area);
        System.out.printf("The perimeter of the room is: %d\n", perimeter);
    }

}
