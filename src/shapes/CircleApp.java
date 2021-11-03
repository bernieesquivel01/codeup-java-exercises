package shapes;
//(Part 1) Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

        //The formulas for the circumference and area:
            //circumference = 2 x pi x radius
            //area = pi x (radius ^ 2)
            //For the value of pi, use the PI constant of the Math class.

//Bonus
//After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.
//Before exiting, the program should output the total number of circles created. Use a private static field, along with a public static method to keep track of and display the total number of circles created.

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();//Input class
        boolean answer = true;//part of Bonus

        System.out.println("What's the radius of the circle?");

        //Bonus
        do{
            int circleRadius = input.getInt();
            Circle circle = new Circle(circleRadius);

            System.out.println("Circumference of your circle is " + circle.getCircumference());
            System.out.println("Area of your circle is " + circle.getArea() + "\n");

            answer = input.yesNo("Would you like to make another circle?");
            System.out.println();

        }while (answer);
        System.out.println("You created " + Circle.getCircleCount() + " circles!");

        //(Part 1)
        //System.out.println("What's the radius of the circle?");
        //int circleRadius = input.getInt();

        //Circle circle = new Circle(circleRadius);
        //System.out.println("Circumference of the circle is " + circle.getCircumference());//getCircumference comes from Circle.java
        //System.out.println("Area of the circle is " + circle.getArea());
    }
}
