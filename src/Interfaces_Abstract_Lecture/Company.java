package Interfaces_Abstract_Lecture;

public class Company {

    public static void main(String[] args) {
        Accountant accountBot = new Accountant("numberBot", "Accounting Dept.");
        Custodian cleanerBot = new Custodian("cleanerBot", "Maintenance Dept.");

        System.out.println(accountBot.work());
        System.out.println(accountBot.getName());
        System.out.println(accountBot.getDepartment());

        System.out.println(cleanerBot.work());
        System.out.println(cleanerBot.getName());
        System.out.println(cleanerBot.getDepartment());

        //How does our work day go?
        System.out.println(accountBot.getName() + " is reporting for business for the " + accountBot.getDepartment());
        System.out.println(cleanerBot.getName() + " is reporting for business for the " + cleanerBot.getDepartment() + "\n");

        System.out.println("How do the morning meetings go?");
        System.out.println("accountBot's morning: " + accountBot.morningMeeting());
        System.out.println("cleanerBot's morning: " + cleanerBot.morningMeeting() + "\n");

        System.out.println("What happens at lunch time?");
        System.out.println("accountBot's lunch: " + accountBot.lunchTime());
        System.out.println("cleanerBot's lunch: " + cleanerBot.lunchTime() + "\n");

        System.out.println("What kind of work do they do?");
        System.out.println("accountBot's work(): " + accountBot.work());
        System.out.println("cleanerBot's work(): " + cleanerBot.work() + "\n");

        System.out.println("How much did they get paid?");
        System.out.println("accountBot's Daily Pay: " + accountBot.dailyPay());
        System.out.println("cleanerBot's Daily Pay: " + cleanerBot.dailyPay());





    }
}
