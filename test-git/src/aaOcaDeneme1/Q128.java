package aaOcaDeneme1;
class Product{
	double price;
}

public class Q128 {
	public void updatePrice(Product product, double price){
		price=price*2;
		product.price= product.price+ price;
		
	}
	public static void main(String[] args) {
		Product prt= new Product();
		prt.price=200;
		double newPrice=100;
		Q128 t= new Q128();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " " + newPrice);

	}

}
