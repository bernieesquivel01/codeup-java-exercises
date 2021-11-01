import java.util.Arrays;

public class ArrayLecture {


    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);


        String[] mybag = {"Snickers", "Reese's", "Brussel Sprouts"};

        System.out.println("mybag.length = " + mybag.length);
        //System.out.println("mybag[1] = " + mybag[1]);

//        for (int i = 0; i < mybag.length; i++){//for loop
//            System.out.println(mybag[i]);
//
//        }

//        for (String candy: mybag){//enhanced for loop
//            System.out.printf("%s is the piece of candy you just pulled out of the bag!%n", candy);
//        }

        //OR

        for (String singleElement : mybag) {//enhanced for loop
            System.out.printf("%s is the piece of candy you just pulled out of the bag!%n", singleElement);
            System.out.println();
        }
        String[] anotherbag = new String[12];

        System.out.println("anotherbag[0] = " + anotherbag[0]);
        System.out.println("anotherbag[5] = " + anotherbag[5]);

        Arrays.fill(anotherbag, "reese's peanut butter cups");

        for (String candy : anotherbag) {
            System.out.println(candy);
        }
        System.out.println();//just to create a blank line

        System.out.println("Arrays.equals(anotherbag, anotherbag) = " + Arrays.equals(anotherbag,anotherbag));

        String[] mybagplustwo = Arrays.copyOf(mybag, 5);
        System.out.println("mybag.length = " + mybag.length);
        System.out.println("mybagplustwo.length = " + mybagplustwo.length);

        for (String candy : mybagplustwo){
            System.out.println(candy);
        }

        //Stringify array
        System.out.println(Arrays.toString(mybagplustwo));

        //Sort array
        Arrays.sort(mybagplustwo);
        for (String candy : mybagplustwo) {
            System.out.println(candy);
        }

        //Searching inside of array
        int snickersindex = Arrays.binarySearch(mybagplustwo, "Snickers");

        System.out.println("This should be some snickers for myself : " + mybagplustwo[snickersindex]);


    }
}
