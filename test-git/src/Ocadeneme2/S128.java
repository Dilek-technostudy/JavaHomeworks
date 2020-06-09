package Sorular101;
class Product{
	double price;
}

public class S128 {
	public void updatePrice(Product product, double price){
		price=price*2;
		product.price= product.price+ price;
		
	}
	public static void main(String[] args) {
		Product prt= new Product();
		prt.price=200;
		double newPrice=100;
		S128 t= new S128();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " " + newPrice);

	}

}
