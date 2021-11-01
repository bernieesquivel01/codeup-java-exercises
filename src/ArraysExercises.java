import java.util.Arrays;

public class ArraysExercises {
    //1. Array Basics
    //Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
    //What happens when you run the following code? Why is Arrays.toString necessary

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);//does not give correct output, just a pointer to location in memory(ie [I@4617c264)
        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3];
        people[0] = new Person("Hudson");
        people[1] = new Person("Beckett");
        people[2] = new Person("Gabriel");


        for (Person person : people) { //enhanced for loop
            System.out.println(person.getName());

        }

        Person[] newArray = addPerson(people, new Person("Brianna"));

        for (Person person : newArray){
            System.out.println(person.getName());
        }
    }
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person personAdd){
        Person[] tempArray = Arrays.copyOf(people, people.length+1);
        tempArray[tempArray.length-1] = personAdd;

        return tempArray;
    }
}

