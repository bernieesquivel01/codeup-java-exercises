//Inside of src, create a directory named movies. Create all of the classes described below in this directory.

//Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).

package movies;

public class Movie {
    private String name;
    private String category;

    public Movie (String name, String category){ //constructor that sets both;
        this.name = name;
        this.category = category;
    }

    //create methods:
    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
