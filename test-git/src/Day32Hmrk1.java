public class Day32Hmrk1 {

    // write java program with method buyItem
// that accepts argument
// which lets you buy items from store
// prints items bought in store
// ex: I go to store and bought a milk
// ex: I go to store and bought a water
// ex: I go to store and bought a sugar
    public static void main(String[] args) {
        printbuyItem();
    }

    public static void printbuyItem() {
        boolean dontHaveMilk = true;
        if (dontHaveMilk) {
            System.out.println("I go to store and bought a milk");

            boolean dontHaveSugar = true;
            if (dontHaveMilk) {
                System.out.println("I go to store and bought sugar");

                boolean dontHaveWater = true;
                if (dontHaveMilk) {
                    System.out.println("I go to store and bought water");
                }
            }
        }
    }
}
//another friend's solution
//    public static void main(String[] args) {
//
//        buyItem("milk");
//        buyItem("water");
//        buyItem("sugar");
//        buyItem("tea");
//
//    }
//
//    public static String  buyItem (String a) {
//        System.out.println("I go to store and bought a " + a);
//        return "I go to store and bought a " + a;