public class Aprep1 {

//    public static void main(String[] args) {
//         String opt ="true";          // 5
//        switch(opt){
//            case "true":              //7
//                System.out.print("True");
//                break;              //9
//            default:
//                System.out.print("***");
//        }
//        System.out.println("Done");
public static void main(String[] args) {
//    int num = 5;
//    do {
//        System.out.print(num-- + " ");
//    }while(num == 0);
    String[][] chs = new String[2][];
    chs[0] = new String[2];
    chs[1] = new String[5];
    int i = 97;
    for (int a=0; a<chs.length; a++){
        for (int b = 0; b<chs.length;b++){
            chs[a][b] = " "+ i;
            i++;
        }
    }
    for (String[] ca:chs ) {
        for (String c:ca ) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


}


}





