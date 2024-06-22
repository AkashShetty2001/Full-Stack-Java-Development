package oopsConcepts.Encapsulation;

/*
 * we can have common setter in java  but common getter
 * is not allowed due to change in return type of instance variables.
 */
public class CommonSetter {
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.setData("sheru", 2000, "husky"); // common setters
		
		System.out.println(d1.getName());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
	}
}

class Dog{
	private String name;
	private int cost;
	private String breed;
	
//	//setters
//	public void setName(String name) {
//		this.name=name;
//		
//	}
//	
//	public void setCost(int cost) {
//		this.cost=cost;
//	}
//	
//	public void setBreed(String breed) {
//		this.breed=breed;
//		
//	}
	
	//common setters
	public void setData(String name,int cost,String breed) {
		this.name=name;
		this.cost=cost;
		this.breed=breed;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public String getBreed() {
		return breed;
	}
	
	
	
}
