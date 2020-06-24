package aaOcaDeneme1;

public class Q139 {
	static double area;
	int p=1, b=2, h=3;
	
	public static void main(String[] args) {
		double p, b, h;
		if (area==0) {
			b=3;
			h=4;
			p=0.5;
			area= p*b*h;
		}
		
//         // area=p*b*h if blok disinda olursa, compilation fails
       System.out.println(area);
	}

}
