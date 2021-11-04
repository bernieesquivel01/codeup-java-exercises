package Interfaces_Abstract_Lecture;

public class Custodian extends Employee{
   public Custodian(String name, String department){
       super(name, department);
   }



    public String work() {
        return "Maintaining the building, cleaning up messes, and restocking!";
    }


    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department. They schedule meetings accordingly";
    }


    public String lunchTime() {
        return "12:00pm - 1:00pm";
    }


    public int dailyPay() {
        return 150;
    }
}
