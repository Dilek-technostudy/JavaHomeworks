package aaOcaDeneme1;

public class Q122 {

	public static void main(String[] args) {
		//String[] strs= new String[2];
		String[] strs = {"A", "B"};
		int idx=0;
		for(String s: strs){

			System.out.println(strs[idx].concat(" element " +idx));
			idx++;
		}
	//for (idx = 0; idx < strs.length; idx++) {
		//	System.out.println(strs[idx]);
		}

	}

	// Null bir objeye metod uygulayinca NullPointerException veriyor
	// Metod uygulamadan yazdirsak null null verecek
	//concat yerine + kullansak hata vermez

	//Farklisi sonuc A element 0 Belement 1 cikiyor.
//	String[]strs={"A","B"};
//	int idx=0;
//		for(String s: strs){
//		System.out.println(strs[idx].concat(" element " +idx));
//		idx++;


