package shapes;
//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a private radius field that is set through the constructor, and various methods for getting information about the circle, detailed below.
//public Circle(double radius)
//public double getArea()
//public double getCircumference()

public class Circle {

    private double radius;
    private static int circleCount = 0;//part of BONUS

    public Circle(double radius){
        this.radius = radius;
        circleCount ++;//part of BONUS
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * radius * 2;
    }

    //part of BONUS
    public static int getCircleCount(){
        return circleCount;
    }


}
