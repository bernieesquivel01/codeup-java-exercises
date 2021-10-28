public class ObjectOrientedProgrammingLecture {
    //a class: This is the template or a blueprint for a "person"

    //instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat(){
        return lastName + ", " + firstName + " has joined the chat";
    }

    //make a static property - representing the world population
    public static long worldPopulation = 7_900_000_000L;

    public static void main (String[] args){
        ObjectOrientedProgrammingLecture bernie = new ObjectOrientedProgrammingLecture();

        bernie.firstName = "Bernie";
        bernie.lastName = "Esquivel";

        System.out.println("bernie = " + bernie);
        System.out.println(bernie.firstName + " " + bernie.lastName + " is my name!");
        //Formatted String:
        System.out.printf("%s %s is my name!", bernie.firstName, bernie.lastName);
        System.out.println();//new line for spacing.
        System.out.println(bernie.joinChat());

        System.out.println("worldPop = " + worldPopulation);

        ObjectOrientedProgrammingLecture douglas = new ObjectOrientedProgrammingLecture();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //Douglas didn't get counted in the worldPop, how would I add him into the count?

        //Would I; access the variable alone?
        //Maybe instead; access through the class name. . and dot notation

        ObjectOrientedProgrammingLecture.worldPopulation += 1;

        System.out.println("worldPop with Douglas " + worldPopulation);
        System.out.println(douglas.worldPopulation);//Agian, this will work, but is not proper code, and NOT best practice.

    }
}
