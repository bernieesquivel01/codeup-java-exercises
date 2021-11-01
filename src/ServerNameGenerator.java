//2. Server Name Generator
//We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.

import java.util.Random;

public class ServerNameGenerator {

    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {"lows", "mids", "high-tops", "limited", "retro", "old school", "expensive", "custom", "release", "vintage"};
    public static String[] nouns = {"sneaker", "kicks", "shoe", "foot gear", "tennis shoe", "apparel", "foot wear", "sneaks", "sole", "basketball shoes"};

    //Create a method that will return a random element from an array of strings.
    public static String nameGenerator(String[] words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        System.out.println("Here is your server name: " );
        System.out.println(nameGenerator(adjectives) + "-" + nameGenerator(nouns));
    }

}
