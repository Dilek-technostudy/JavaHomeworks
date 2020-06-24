package OcaModifiedNew;
class S1{
    protected void display(int x){
        System.out.println("parent"+ x);
    }
}
class s2 extends S1{
    public void display(int x,int y){
        this.display(x);
        display(y);
        super.display(y);
    }
    public  void  display(int x){
        System.out.println("Child"+x);
    }
}
public class Q186 {
    public static void main(String[] args) {
        s2 sobj =new s2();
        sobj.display(10,100);
    }
}
