package callbyvalueandcallbyref;

public class Example {

	public static void main(String[] args) {
		int x=4;
		int y=7;
		int addition= add(x,y);
		System.out.println("x:"+ x + "y:" + y + "result:" +addition);
		
		
	}

	static int add(int a, int b) {
		System.out.println("a"+a + "b"+b);
		int result= a+b;
		a++;
		b++;
		System.out.println("a:" +a+ "b:"+b);
		return result;
	}

}
