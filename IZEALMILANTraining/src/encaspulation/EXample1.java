package encaspulation;

public class EXample1 
{
	
	
	public static void main(String[] args) 
	{
		A obj=new A();
		obj.setI(6);
		System.out.print(obj.getI());

	}
}
class A
{
	private int i;
	public void setI(int j)
	{
		i=j;
	}
	public int getI()
	{
		return i;
	}
	
}
