//1. Object basics
//
//Create Person class inside of src that has a private name property that is a string, and the following methods:
//
 public class Person {
    private String name;

    // The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public Person(String name){
        //sets name
        this.name = name;
    }

    public String getName(){
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hey " + name);
    }

    //Create a `main` method on the class that creates a new `Person` object and
    //tests the above methods.
    public static void main(String[] args) {
        Person personOne = new Person("Bernie");
        personOne.sayHello();
        System.out.println(personOne.getName());

        Person personTwo = personOne;;


        System.out.println(personOne.getName());
        personTwo.setName("Trevor");
        System.out.println(personTwo.getName());


        //1. Understanding references

        //Person person1 = new Person("John");
        //Person person2 = new Person("John");
        //System.out.println(person1.getName().equals(person2.getName()));//output: true
        //System.out.println(person1 == person2);//output: false

        //Person person1 = new Person("John");
        //Person person2 = person1;
        //System.out.println(person1 == person2);//output: true.

        //Person person1 = new Person("John");
        //Person person2 = person1;
        //System.out.println(person1.getName());//output: John
        //System.out.println(person2.getName());//output: John
        //person2.setName("Jane");//if set name was moved to line 62; output would be John instead of Jane for line 61.
        //System.out.println(person1.getName());//Output: Jane
        //System.out.println(person2.getName());//Output: Jane

    }

}
