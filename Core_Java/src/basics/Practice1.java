package basics;

public class Practice1 {
	public static void main(String[] args) {
//		int a=11;
//		int b=10;//single assignment
//		
//		int c,d;
//		c=d=20;//chained assignment
//		
//		System.out.println(a==b);
//		
//		int m=10;
//		int n= m+=20;
//		n= m+=20;//compound 
//		System.out.println(m+" "+n);
//		
//		System.out.println(m >= n?"equal":"notEqual");
		
//				int a=5;
//				System.out.println(a);
//				a++;
//				++a;
//				System.out.println(a);
				
				
//				

//		
//		int number=1;
//		switch(number) {
//		case 1: System.out.println("1stcase");
//		case 2: System.out.println("1stcase");
//		case 104: System.out.println("1stcase");
//		default:System.out.println("default");
//		break;
//		case 106: System.out.println("1stcase");
//		case 105: System.out.println("1stcase");
//		}
		
//		
//		int a=100;
//		System.out.println(-++a);
		
		
//		Car c= new Car();
//		c.display();
//		c.display1(c);
		
		
//		int n=15;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int a=10;
		int b=20;
		byte c=(10>20)?30:40;
		System.out.println(c);
		
		
	}

}
class Car{
	int cost;
	String name;
	
	public void display() {
		System.out.println(cost);
		System.out.println(name);//direct access
		System.out.println("----------------");
		
		cost=20000;
		name="sheru";
	}
	
	public static void display1(Car c) {
		System.out.println(c.cost);
		System.out.println(c.name);
	}
}