
interface Readable{
	public void readBook();
	public void setBookMark();
	}

abstract class Book implements Readable{ //if no abstract we have to implement all methods
	public void readBook(){}
	//public abstract void setBookMark();
}

class EBook extends Book {   // if we add abstract here we cannot create object
	public void readBook(){}
	public void setBookMark() {} //this class has to implement all abstract methods
}
public class S47 {

	public static void main(String[] args) {
		Book book1=new EBook();
		book1.readBook();
	}

}
