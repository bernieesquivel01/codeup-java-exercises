public class SyntaxLecture {

    public static void main(String[] argus){

        System.out.print(" And \\ Or \\ For \\ Nor \\ But \\ Yet \\ So");

        int SIDES_OF_A_DICE = 6;

        SIDES_OF_A_DICE = 12; //if final is used; can not change variable; without it - CAN change variable.

        //SIDES_OF_A_DICE = SIDES_OF_A_DICE + 6 - would output 12; "if" the [final] was not used.
        System.out.print("\n How many sides are on the dice? " + SIDES_OF_A_DICE);

        int myInteger = 900;
        long morePrecise = myInteger;

        System.out.println("This is a int: "+ (morePrecise + 10000000000L));

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println("This is our version of pi: " + pi);

        System.out.println("This is almostPi: " + almostPi);
    }
}
