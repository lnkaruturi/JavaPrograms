package encaspulation;

public class Example3 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(123);
		System.out.println(s1.getSid());

	}

}
class Student
{
	private int sid;
		public void setSid(int sid)
	{
		this.sid=sid;
	}
	public int getSid()
	{
		return sid;
	}
}
