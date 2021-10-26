import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {

        //1. String Basics.

        //Create a class named StringExercise with a main method.

        //For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.

            String Output1 = "We don't need no education \nWe don't need no thought control";
                System.out.println(Output1);

            //Output 1:
            //We don't need no education
            //We don't need no thought control

            String Output2 = "\nCheck \"this\" out!, \"s inside of \"s!";
                System.out.println(Output2);

            //Output 2:
            //Check "this" out!, "s inside of "s!

            String Output3 = "\nIn windows, the main drive is usually C:\\";
                System.out.println(Output3);

            //Output 3:
            //In windows, the main drive is usually C:\

            String Output4 = "\nI can do backslashes \\, double backslashes \\\\, and triple backslashes \\\\\\!";
                System.out.println(Output4);

            //Output 4:
            //I can do backslashes \, double backslashes \\,
            //and the amazing triple backslash \\\!

            //TA Example:

            //String myString;

            //myString = "We don't need no education \nWe don't need no thought control";
                //System.out.println(myString);

            //myString = "\nCheck \"this\" out!, \"s inside of \"s!";
                //System.out.println(myString);

            //myString = "\nIn windows, the main drive is usually C:\\";
                //System.out.println(myString);

            //myString = "\nI can do backslashes \\, double backslashes \\\\, and triple backslashes \\\\\\!";
                //System.out.println(myString);



        //2. Create a class named Bob with a main method for the following exercise.

        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.

            //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
            //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            //He answers 'Whatever.' to anything else.
            //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

                Scanner sc = new Scanner (System.in);
                boolean keepTalking;

            do {
                System.out.println("\nBOB: \"You wanted to talk to me?!\"");
                String userInput = sc.nextLine();
//                System.out.println(userInput);

                if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Fine, Be that way!");
                } else {
                    System.out.println("Whatever.");
                }



                System.out.println("Would you like to keep talking to me?(y/n)");//line 87 - 89, along with do while loop, and boolean at line 68; allows the user to have an option to continue talking, ie y/n.
                keepTalking = sc.nextLine().equalsIgnoreCase("y");
            } while (keepTalking);
    }
}
