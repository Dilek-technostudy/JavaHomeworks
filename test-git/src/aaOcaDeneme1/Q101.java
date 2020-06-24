package aaOcaDeneme1;

public class Q101 {

	public static void main(String[] args) {
		float var1=(12_345.01 >=123_45.00)? 12_456 : 12_345.01f;
		//if underscores near . or at the end, compilation fails
		//if there is no f at the end, compilation fails
		float var2=var1+1024;
		System.out.println(var2);

	}

}
