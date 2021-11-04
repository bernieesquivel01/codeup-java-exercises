package Interfaces_Abstract_Lecture;
import java.util.List;

abstract class Employee implements DailyWork {
    protected String name;
    protected String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;

    }
        //getters and setters;

    public String getName() {
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

//    public abstract String work();


}
