package interfaces;

public class Mammal implements Animal{
	public void eat()
	{
		System.out.println("Mammal eats");
		
	}
	public void travel()
	{
		System.out.println("Mammel travels");
		
	}
	public int nooflegs()
	{
		return 0;
	}
	

	public static void main(String[] args) {
		Mammal obj=new Mammal();
		obj.eat();
		obj.travel();
		obj.nooflegs();

	}
	

}
