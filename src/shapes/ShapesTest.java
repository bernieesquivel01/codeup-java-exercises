package shapes;
//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method:
//create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
public class ShapesTest {

    public static void main(String[] args) {

        //Rectangle box1 = new Rectangle(5, 4);

            //System.out.println("Area of rectangle is: " + box1.getArea());
            //System.out.println("Perimeter of rectangle is: " + box1.getPerimeter());

        //Rectangle box2 = new Square(5);

            //System.out.println("Area of square is: " + box2.getArea());
            //System.out.println("Perimeter of square is: " + box2.getPerimeter());


        //Modify your ShapesTest class, use it to:
        //
        //declare a variable of the type Measurable named myShape.
        //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
        Measurable myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable myShape1 = new Rectangle(4, 5);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        //System.out.println(myShape1.getLength());
        //System.out.println(myShape.getWidth());

    }
}
