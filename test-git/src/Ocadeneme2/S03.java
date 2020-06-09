
public class S03 {
	String name;
	int age;
	
	public S03(){} 
	
	public S03(String name) {
		this();//bos constructor koyarsak this() kullanabiliyoruz
		setName(name);
	}



	public S03(String name, int age){
		this(name);// this(name) olursa hata kalkiyor
		setAge(age);
		
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String show() {
		return name+" "+age+ " ";
	}
	public static void main(String[] args) {
		S03 p1=new S03("Jesse");
		S03 p2=new S03("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());

	}

}
