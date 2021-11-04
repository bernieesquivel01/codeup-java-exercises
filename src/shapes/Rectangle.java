package shapes;
//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width.
public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }
    //Change your existing Square class to extend Quadrilateral.
    //Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.


    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    //protected double length;
    //protected double width;

//Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    //public Rectangle(double length, double width){
        //this.length = length;
        //this.width = width;
    //}

//Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//perimeter = 2 x length + 2 x width
//area = length x width

    //public double getArea(){
        //return length * width;
    //}

    //public double getPerimeter(){
        //return 2 * length + 2 * width;
    //}

}
