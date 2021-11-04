package shapes;
//Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
public abstract class Quadrilateral extends Shape implements Measurable{

    //protected properties for length and width.
    protected double length;
    protected double width;

    //a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;

    }

    //methods for getting the length and width.(getters)
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    //abstract methods for setting the length and width.(setters)
    public abstract void setLength(double length);

    public abstract void setWidth(double width);


}
