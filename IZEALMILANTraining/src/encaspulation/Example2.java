package encaspulation;

public class Example2 {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setId(34);
		e1.setEname("Lucky");
		
		Emp e2=new Emp();
		e2.setId(43);
		e2.setEname("vinod");
		
	System.out.println(e1.getId());
	System.out.println(e1.getEname());
	System.out.println(e2.getId());
	System.out.println(e2.getEname());
		
		
		

	}

}
class Emp
{
	private int id;
	private String ename;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
}
