
public class Reverseastring {

	public static void main(String[] args) {
       /* String s1 = "Narayana";
        for(int i=s1.length()-1;i>=0;i--)
            {
                System.out.print(s1.charAt(i));
            }
            */
		 StringBuffer buffer = new StringBuffer("123456");
		   buffer.reverse();
		   System.out.println(buffer);
    }

}
