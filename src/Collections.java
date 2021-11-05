import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        //old way: Array initializer .. not as easy to work with.
        //String[] nameOfVar = {"thing1", "thing2", "thing3"};

        //System.out.println(nameOfVar[3]);

        ArrayList<String> students = new ArrayList<>();

        students.add("Bernie");
        students.add("Brianna");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(12);
        myFavoriteNums.add(24);
        myFavoriteNums.add(0, 7); //adds number at specified index[0]
        myFavoriteNums.add(myFavoriteNums.size(), 6);//puts number 6 at the end of the array; doing just myFavoriteNums.add(6) would do the same thing
        myFavoriteNums.add(1, 6);//add 6 in the array, to have two sixes.

        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums " + myFavoriteNums.size());//size of the array.

        System.out.println("myFavoriteNums.indexOf(24) = " + myFavoriteNums.indexOf(24));//tells you the index of number in the array, ie [2]
        System.out.println("myFavoriteNums.get(2) = " + myFavoriteNums.get(2));//tells you number in the array of the specified index (2) = 24.

        System.out.println(myFavoriteNums);//shows 6 twice
        System.out.println("myFavoriteNums.lastIndexOf(6) = " + myFavoriteNums.lastIndexOf(6));//.lastIndex of 6 would be [4], even though there's a six at [1], because it's the "last"
        System.out.println("myFavoriteNums.indexOf(6) = " + myFavoriteNums.indexOf(6));//.indexOf 6 would be [1], even though there's a six at [4], because it's the .indexOf(starts from beginning of array)

        System.out.println("myFavoriteNums.isEmpty() = " + myFavoriteNums.isEmpty());//would return false; because myFavoriteNums array is not empty.

        //myFavoriteNums.remove(1);//removes the number at specified index (1);
        //myFavoriteNums.remove((Integer)6);//does the same as above, but removes the FIRST actual number, not index.
        //myFavoriteNums.remove(myFavoriteNums.indexOf(6));//would remove first 6, since used indexOf(from beginning of array)
        System.out.println(myFavoriteNums);

        //removing multiple integers:
        //have to create a new list.
        //a. ArrayList<Integer> removalList = new ArrayList<>();
        //b. removalList.add(6);//would remove all 6's

        //c. myFavoriteNums.removeAll(removalList);
        //d.System.out.println(myFavoriteNums);

        System.out.println("---- Hash Maps ----\n");

        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();

        HashMap<String, String> usernames = new HashMap<>();

        //inserting key : value pairs into HashMap
        usernames.put("Bernie", "BEasy");
        usernames.put("Brianna", "Brisus");

        System.out.println("usernames.get(\"Bernie\") = " + usernames.get("Bernie"));
        System.out.println("usernames.get(\"Beckett\") = " + usernames.get("Beckett"));//return null because we did not establish the "key" 'Becket"

        //providing a default might be better than 'null':

        System.out.println("usernames.get(\"Beckett\", \"noUserFound\") = " + usernames.getOrDefault("Beckett", "noUserFound"));


        //usernames.putIfAbsent("Bernie", "BernieMac");//no change to "Bernie" because it was NOT absent.
        usernames.putIfAbsent("Beckett", "Bucket");//adds Beckett to the HashMap usernames, since it was absent from original 'list'
        usernames.putIfAbsent("Hudson", "Helicopter");

        System.out.println(usernames);

        usernames.remove("Beckett");//removes Beckett.
        System.out.println(usernames);

        usernames.replace("Bernie", "BMac");//replaces 'BEasy' with 'BMac'
        System.out.println(usernames);
    }
}
