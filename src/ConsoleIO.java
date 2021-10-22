import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Something: ");

        String userInput  = scanner.nextLine();

//        System.out.printf("You entered: --> \"" + userInput + "\" <--");

        System.out.printf("You entered %s", userInput);

        //
        //String name = "Bernie";
        //System.out.printf("Hello there, %s. Nice to see you.\n", name);

        //String greeting = "Howdy";
        //String cohortName = "Quasar";

//        System.out.printf("%s,%s!", cohortName, cohortName);
    }
}
