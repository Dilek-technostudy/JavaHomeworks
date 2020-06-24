package Wednesdaypackage;
interface Exportable {
        void export();          //interface de access modifier vermesek te implicitly olarak "public" tir.
}


class Tool implements Exportable {
// protected void export() {                      //line nl //soruda bu sekilde
public void export() {
    System.out.println("Tool::export");
    }
}
class Q7 extends Tool implements Exportable {
       public void export() {                      // line n2
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new Q7();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex) {
        ex.export();


    }}
