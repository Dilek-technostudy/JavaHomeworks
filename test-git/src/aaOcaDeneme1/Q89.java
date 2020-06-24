package aaOcaDeneme1;

public class Q89 {
	public String name;
	public int moons;
	
	public Q89(String name, int moons){
		this.name= name;
		this.moons=moons;
	}
	public static void main(String[] args) {
		Q89[] planets={ new Q89("Mercury", 0), new Q89("Venus", 0),
						new Q89("Earth", 1), new Q89("Mars", 2)};
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		}

	}


