package shapes;
//Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Quadrilateral {
    public Square(double side) {//since we know that all sides are the same.
        super(side, side);
    }
    //Change your existing Square class to extend Quadrilateral.
    //Because the length of all sides of a square are the same, the methods for setting the length and the width should set both protected properties.

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    //public double side;

//Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    //public Square (double side){
        //super(side, side);
        //this.side = side;
    //}

//In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//perimeter = 4 x side
//area = side ^ 2

    //public double getArea(){
        //return side * side;
    //}

    //public double getPerimeter(){
        //return 4 * side;//change re
    //}
}
