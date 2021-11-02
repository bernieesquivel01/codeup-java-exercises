import java.awt.*;

public class PolymorphismDemo {

    //my application [PolymorphismDemo] has a method calling on the employee.work()
    public static void doWork(Worker w){
        System.out.println(w.work());
    }

    public static void main(String[] args) {
        Worker one = new Worker();
        Worker two = new Manager();

        //Static path: [calling within the class]
        doWork(one);
        doWork(two);

        //Instance path:
        PolymorphismDemo newObj = new PolymorphismDemo();

        //newObj.doWork();
    }


}
