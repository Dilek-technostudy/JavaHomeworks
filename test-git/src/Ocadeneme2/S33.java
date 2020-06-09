import java.util.List;
import java.util.ArrayList;

public class S33 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if(names.remove("Bran")){
			names.remove("Jon");
		}
		System.out.println(names);

	}

}
