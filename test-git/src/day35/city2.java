package day35;

public class city2 {
    public static void main(String[] args) {

        city2 LosAngeles = new city2();

        city city = new city(true);
        city.safety = true;
        city.name = "losAngeles";
        city.population = 5000000;
        System.out.println(city.getAttributes());
        System.out.println("------------------------------------");


    }

}



