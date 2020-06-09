package JHomeworks.day35;
//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
public class city {

    public static  String name;
    public static int population;
    public static boolean safety;

    public  city(String name, int population, boolean safety) {
        this.name = name;
        this.population = population;
        this.safety = safety;


    }

    public city(boolean t) {
        this("LosAngeles ", 5000000, true);
        name=name;
    }

    public static String getAttributes() {
        return "city  name: " + name + "\n" +
                "How many people live: " + population + "\n" +
                "Is it safe   " + safety;
    }


}