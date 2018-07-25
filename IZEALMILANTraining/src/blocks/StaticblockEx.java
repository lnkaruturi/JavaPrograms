package blocks;

public class StaticblockEx {

	static 
	{
		System.out.println("Flag1");
	}
	public static void main(String[] args) {
		System.out.println("Flag3");
	}
	static
	{
		System.out.println("Flag2");
	}

}
