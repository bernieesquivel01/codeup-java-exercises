public class ControlStmtLoopLec {

    public static void main(String [] args) {
//        boolean trueBool = true;
//        boolean otherTrueBool = true;
//        boolean falseBool = false;
//
//        System.out.println("trueBool & otherTrueBool = " + (trueBool & falseBool));
//
//        String myName = "Kenneth";

        //DO NOT DO THIS:
//        System.out.println("myName == \"Kenneth\" = " + myName.equals("Kenneth"));


        //Weather IFs

//        boolean isSunny = false;
//        boolean hasUmbrella = false;
//
//        if (isSunny) {
//            System.out.println("Enjoy the sunshine - don't forget to wear sunscreen!");
//        } else if (!isSunny && hasUmbrella) {
//            System.out.println("Cool man - you're prepared and ready to go! Watch out for any rain");
//        } else {
//            System.out.println("Go check the weather - who knows what it looks like out there!");
       // }

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default Case");
//                break;
//        }

        for(int i = 1; i < 100; i++){

            if (i % 2 == 0){//will print out all even numbers from 1-100, if we switch from (!=) to (==) it will print out all odd numbers.
                continue;
            }
            System.out.println(i);
        }
    }
}
