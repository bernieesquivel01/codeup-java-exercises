//Java WarmUp
//
//Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//The first would be ‘name’ and the second will be ‘size’.
//The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//BONUS:
//Write a method for your Candy class - this method should print out a message saying:
//“Ahhh, a [name]! I see that you got the [size] of it. Sounds good! :)”


public class Candy {//should always be capitalized.
    public String name;
    public String size;

    public void talkaboutCandy() {
        System.out.printf("Ahh, a %s! I see you also got a %s size of it. Looks good! :) %n", this.name, this.size);
    }

    public Candy(String name, String size) {//constructor has to have same name as class'Candy'
        this.name = name;
        this.size = "unknown";

    }

    public static void main(String[] args) {

        Candy unknownCandy = new Candy("funky candy");

        System.out.println("unknownCandy.name = " + unknownCandy.name);
        System.out.println("unknownCandy.size = " + unknownCandy.size);
        unknownCandy.talkaboutCandy();

        Candy funsizeSnickers = new Candy("Snickers", "fun-size");//second constructor

        System.out.println("unknownCandy.funsizeSnickers = " + funsizeSnickers.name);
        System.out.println("unknownCandy.funsizeSnickers = " + funsizeSnickers.size);
        funsizeSnickers.talkaboutCandy();


    }


}
