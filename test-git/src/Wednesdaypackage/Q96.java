package Wednesdaypackage;



interface Exportable1 {
         public void export();  //interface yazilmasada method  public abstract export tur.

        }
        class Tool1 implements Exportable1{
        public void export() {
                System.out.println("Tool::export");
                }
}

        class Q96 extends Tool {
               public void export() {                             // line n2
                        System.out.println("RTool::export");
                }

                public static void main(String[] args) {
//                        Tool1 aTool = new Q96();
//                        Tool1 bTool = new Tool1();
//                        callExport(aTool);
//                        callExport(bTool);
                }

                public static void callExport(Exportable ex) {
                        ex.export();
                }
        }
