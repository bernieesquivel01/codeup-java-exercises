package shapes;
//Create a class named Square, also inside of shapes, that extends Rectangle.
public class Square extends Rectangle {
    public double side;

//Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public Square (double side){
        super(side, side);
        this.side = side;
    }

//In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//perimeter = 4 x side
//area = side ^ 2

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4 * side;//change re
    }
}
