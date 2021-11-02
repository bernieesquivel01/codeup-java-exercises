package shapes;
//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width.
public class Rectangle {
    protected double length;
    protected double width;

//Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

//Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//perimeter = 2 x length + 2 x width
//area = length x width

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
