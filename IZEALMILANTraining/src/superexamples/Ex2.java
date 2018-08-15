package superexamples;
class BCC
{
	BCC()
	{
		System.out.println("BC()");
	}
	BCC(int x)
	{
		System.out.println("BC(int)");
	}
	
}
class IBC extends BCC
{
	IBC()
	{
		System.out.println("IBC()");
	}
	IBC(int x)
	{
		super(10);
		System.out.println("IBC(int)");
	}
}
class DC1 extends IBC
{
	
	DC1()
	{
		//super();
		System.out.println("DC()");
	}
	DC1(int x)
	{
		super(10);
		System.out.println("DCC(int)");
	}
}
public class Ex2 {

	public static void main(String[] args) {
		DC1 obj=new DC1(10);

	}

}
