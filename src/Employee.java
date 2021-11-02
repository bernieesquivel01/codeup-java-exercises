public class Employee extends Person{


    public Employee(String employeeName) {
        super(employeeName);

    }

    public int getAge(){
        return this.age;

    }

    public void sayHello(){
        System.out.println("Welcome to MegaCorp; how may I help you?");
    }

    public void doWork(){
        System.out.println("Work, work ....");
    }

    public static void main(String[] args) {

        Person unemployedBernie = new Person("Bern");
        System.out.println(unemployedBernie.getName());
        unemployedBernie.sayHello();
        System.out.println();

        Employee bernie = new Employee("Bernie");
        bernie.sayHello();
        System.out.println("bernie.name = " + bernie.getName());//.getName() is a getter.

        //Let's try to doWork with our Person and then our Employee...
        bernie.doWork();
        //unemployedBernie.doWork();//won't work

    }
}

