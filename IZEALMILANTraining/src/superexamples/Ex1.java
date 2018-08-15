package superexamples;
class BC
{
  int a=10;
  void disp(){
    System.out.println("BC disp()");
  }
}
class DC extends BC{
  int b;
  int a=100;
  void show()
  {
    System.out.println("DC show() ==>" +super.a);
  }
  
}
public class Ex1{
  public static void main(String[] args) {
    DC obj = new DC();
    System.out.println(obj.a);
    obj.show();
 
   
    
  }
}