package aaOcaDeneme1;

interface Exportable{
 void export();	
}

class Tool implements Exportable{
	 public void export(){  //public olmasi lazim, soruda protected
		System.out.println("Tool::export");
	}
}

class S12 extends Tool implements Exportable {
	 public void export() {
		 System.out.println("RTool::export");
	 }

	public static void main(String[] args) {
		Tool aTool= new S12();
		Tool bTool= new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable ex) {
		ex.export();
	}

} 
