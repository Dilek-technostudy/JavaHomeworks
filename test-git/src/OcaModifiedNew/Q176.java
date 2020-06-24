package OcaModifiedNew;
abstract class robot implements Speakable {
  public abstract void process();           //abstract ekleyince duzeliyor ve Helping done basiyor cevap c

}

class Humanoid extends robot {
    public void speak(String s){
        System.out.println(s); }
        public void process(){
            System.out.println("Helping .....");
        }
}
interface Speakable{
    public void speak(String s);
}
public class Q176 {
    public static void main(String[] args) {
        robot r = new Humanoid();
        r.process();
        r.speak("Done");
    }

}
