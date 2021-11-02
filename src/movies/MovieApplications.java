package movies;

import util.Input;

public class MovieApplications {

    public static void main(String[] args) {
        moviePrompt();

    }

    public static void moviePrompt(){
        Input userInput = new Input();
        Movie[] movieList = MoviesArray.findAll();
        boolean userContinues = true;


    do{
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");

        int userChoice = userInput.getInt(0, 5);

        if (userChoice == 0){
            System.out.println("Exit");
        } else if (userChoice == 1){
            for (int i = 0; i <= movieList.length - 1; i++){
                System.out.println(movieList[i].getName() + " -- " + movieList[i].getCategory());
            }
        } else if (userChoice == 2){
            for (int i = 0; i <= movieList.length - 1; i++){
                if (movieList[i].getCategory() == "animated"){
                    System.out.println(movieList[i].getName() + " -- " + movieList[i].getCategory());
                }
            }
        } else if (userChoice == 3){
            for (int i = 0; i <= movieList.length - 1; i++){
                if (movieList[i].getCategory() == "drama"){
                    System.out.println(movieList[i].getName() + " -- " + movieList[i].getCategory());
                }
            }
        } else if (userChoice == 4){
            for (int i = 0; i <= movieList.length - 1; i++){
                if (movieList[i].getCategory().equals("horror")){
                    System.out.println(movieList[i].getName() + " -- " + movieList[i].getCategory());
                }
            }
        } else if (userChoice == 5){
            for (int i = 0; i <= movieList.length - 1; i++){
                if (movieList[i].getCategory().equals("sci-fi")){
                    System.out.println(movieList[i].getName() + " -- " + movieList[i].getCategory());
                }
            }
        }

        System.out.println();
//        System.out.println("Would you like to keep talking to me?(y/n)");//line 87 - 89, along with do while loop, and boolean at line 68; allows the user to have an option to continue talking, ie y/n.
//        userContinues = userInput.equals("y");
    } while (userContinues);

    }
}
