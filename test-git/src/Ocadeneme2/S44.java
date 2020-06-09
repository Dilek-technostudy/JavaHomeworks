
public class S44 {

	public static void main(String[] args) {
		String stuff="TV";
		String res=null;
		
		//res = stuff.equals("TV") ? "Walter":stuff.equals("Movie") ? "White":"No Result";
		//res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No Result";
		//res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No result";
		res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No result";

System.out.println(res);
	}

}

