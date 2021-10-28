public class Student {
    public String name;
    public String cohort;
    private double grade;
    private String studentDisclosure;

//    public double shareGrade(){return = grade};

    //Now, lets add a constructor - what is it? A METHOD OF OBJECT CREATION

    public Student(String studentName){
//        this.name = studentName;
//        this.cohort = "Unassigned";
//    }
    //System.out.println("Student constructor one complete");

    //Calling constructor inside of a constructor
    this(studentName, "Unassigned");

    };

    public Student(String studentName, String studentCohort){
        this.name = studentName;
        this.cohort = studentCohort;
    }
    //System.out.println("Student constructor two complete");

    public static void main (String[] args){
        //Before constructors: [similar feel to JS?]
//        Student mcStudent = new Student;
//        mcStudent.name = "Ronald";
//        mcStudent.cohort = "Golden Arches";
//
//        System.out.println(mcStudent.name = " is in the " + mcStudent.cohort + "cohort");

    //First constructor experiment:
    Student shanshan = new Student("Shanshan S.");

    System.out.println("shanshan.name = " + shanshan.name + "shanshan.cohort =" + shanshan.cohort);

    //Second constructor experiement:
        Student bernie = new Student("Bernie E.", "Quasar");

        System.out.printf("%s is the student name and %s is their assigned cohort", bernie.name, bernie.cohort);

    }
}
