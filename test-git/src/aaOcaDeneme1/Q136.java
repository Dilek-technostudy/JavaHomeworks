package aaOcaDeneme1;

import javax.lang.model.element.VariableElement;

public class Q136 {
	
	public static void main(String[] args) {
		int ans;
		try {
			int num=10;
			int div=0;
			ans=num/div;
		} catch (ArithmeticException ae) {
			ans=0;
		}
		catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		ans=0;
		System.out.println("Answer = "+ ans );

	}

}
// try blockun icindeki ans, blok disinda gorunmuyor, int ans olarak tanimlanmali