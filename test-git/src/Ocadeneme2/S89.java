package Sorular51;

public class S89 {
	public String name;
	public int moons;
	
	public S89(String name, int moons){
		this.name= name;
		this.moons=moons;
	}
	public static void main(String[] args) {
		S89[] planets={ new S89("Mercury", 0), new S89("Venus", 0),
						new S89("Earth", 1), new S89("Mars", 2)};
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		}

	}


