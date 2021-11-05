package grades;
//Create a class named GradesApplication with a main method.
 //Be creative! Make up GitHub usernames and grades for your student objects.

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        //Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects.
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        //Create at least 4 Student objects with at least 3 grades each, and add them to the map.
        Student mikey = new Student("Michelangelo");//example using Input input = new Input();
        mikey.addGrade(90);
        mikey.addGrade(99);
        mikey.addGrade(98);

        //System.out.println(mikey.getGradeAverage());//gets the average for given student "Michelangelo"

        Student raph = new Student("Raphael");
        raph.addGrade(93);
        raph.addGrade(90);
        raph.addGrade(90);

        Student donnie = new Student("Donatello");
        donnie.addGrade(100);
        donnie.addGrade(90);
        donnie.addGrade(90);

        Student leo = new Student("Leonardo");
        leo.addGrade(90);
        leo.addGrade(93);
        leo.addGrade(90);

        //System.out.println(donnie.getName() + "'s grade average is " + donnie.getGradeAverage());//gets the average for given student "Donatello"

        students.put("Michelangelo", mikey);
        students.put("Donatello", donnie);
        students.put("Leonardo", leo);
        students.put("Raphael", raph);

        //System.out.println(students);

        System.out.println("Welcome!\n");
        System.out.println("Here are the github names for our users:");
        //System.out.println(students);
        for (String username: students.keySet()){
            System.out.print("|" + username + "|");
        }
        System.out.println();
        System.out.println("\nWhat student would you like to see more information on?");




    }

}
