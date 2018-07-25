package inheritance;

public class MyCalculation {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj=new Sub();
		obj.add();
		obj.sub();
	}

}
class Add
{
	int a=10,b=4;
	public void add() {
		int c= a+b;
		System.out.println("Addition is:c="+c);
	}
}
class Sub extends Add
{
	public void sub()
	{
		int c=a-b;
		System.out.println("sub is:"+c);
	}
}
