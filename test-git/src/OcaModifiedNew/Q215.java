package OcaModifiedNew;
class LogFileException extends Exception{}
class AccessViolationException extends  RuntimeException{}
public class Q215 {
    public static void main(String[] args) {
        Q215 obj = new Q215();
        try{
            obj.open();
            obj.process();
        }
        catch(Exception e){
            System.out.println("completed");
        }
    }
    public void process() throws LogFileException {
        System.out.println("processed");
        throw new LogFileException();
    }
    public void open(){
        System.out.println("opened");
        throw new AccessViolationException();

}
}