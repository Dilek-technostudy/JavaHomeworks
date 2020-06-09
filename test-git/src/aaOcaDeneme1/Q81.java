package aaOcaDeneme1;

public class Q81 {
    public static void main(String[] args) {
        String []arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if(arr[i].equals("C")){
               continue;
              //  break;
            }
            System.out.println("Work Done");
            break;
            //continue;
        }
    }
}
