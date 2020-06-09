
package Sorular51;

abstract class Planet{
	protected void revolve() {}
	abstract void rotate();
}
class Earth extends Planet {
	protected void revolve() {}   //protected den daha az visibility kabul etmiyor
						// protected ya da public olursa hata kalkiyor
    protected void rotate(){}
}
  
  //public>protected>default>private


public class S52 {

	public static void main(String[] args) {
		

	}

}
