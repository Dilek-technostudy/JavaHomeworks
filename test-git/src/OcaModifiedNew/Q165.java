package OcaModifiedNew;



public class Q165 {
    String s;
    public boolean equals (Q165 str){
        return  this.s.equalsIgnoreCase(str.toString());
    }
    Q165(String s){
        this.s=s;

    }

    public static void main(String[] args) {
        String s1="moon";
        Q165 s2=new Q165 ("moon");
        if((s1=="moon") && (s2.equals("moon") )) {
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        if (s1.equalsIgnoreCase(s2.s)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
