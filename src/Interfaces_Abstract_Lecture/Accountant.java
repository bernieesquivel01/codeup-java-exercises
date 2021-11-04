package Interfaces_Abstract_Lecture;

public class Accountant extends Employee{

    //sets constructor
    public Accountant(String name, String department){
        super(name, department);
    }

    //implements abstract method
    public String work() {
        return "TPS reports have been drafted!";
    }


    public String morningMeeting() {
        return "Accountants have morning meetings beginning at 8:15 am and running till 8:45am";
    }


    public String lunchTime() {
        return "Accountants take their lunch at their desk as needed.";
    }


    public int dailyPay() {
        return 500;
    }
}
