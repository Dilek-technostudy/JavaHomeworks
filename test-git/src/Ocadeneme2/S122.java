public class S122 {

	public static void main(String[] args) {
		String[] strs= new String[2];
		int idx=0;
//		for(String s: strs){
//			strs[idx].concat(" element " +idx);
//			idx++;
//		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}

	}
	//Anlamadim, sonunda anladim:)
	// Null bir objeye metod uygulayinca NullPointerException veriyor
	// Metod uygulamadan yazdirsak null null verecek
	//concat yerine + kullansak hata vermez
	

}
