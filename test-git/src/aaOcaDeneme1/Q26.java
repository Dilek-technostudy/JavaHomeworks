package aaOcaDeneme1;

public class Q26 {

    static int count=0;
     int i=0;
    public void changeCount(){
        while(i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Q26 check1= new Q26();
        Q26 check2 =new Q26();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count+": "+check2.count);
    }
}
