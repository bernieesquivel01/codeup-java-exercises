package grades;

import java.util.ArrayList;

public class Student {
    //Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.
    private String name;
    private ArrayList<Integer>  grades = new ArrayList<>();

    //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //The Student class should have the following methods:
    // returns the student's name
    public String getName() {
        return this.name;

    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for(double grade: grades) {
            total += grade;
        }
        return total/grades.size();
    }


//    Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    public static void main(String[] args) {
        //creates 'student' object
        Student student1 = new Student("Bernie");
        Student student2 = new Student("Hudson");

        //adds grade to object
        student1.addGrade(75);
        student1.addGrade(75);
        student1.addGrade(80);
        student1.addGrade(100);

        student2.addGrade(90);
        student2.addGrade(90);
        student2.addGrade(100);
        student2.addGrade(100);

        System.out.println(student1.name + "'s Grade average is: " + student1.getGradeAverage());
        System.out.println(student2.name + "'s Grade average is: " + student2.getGradeAverage());

    }

}
