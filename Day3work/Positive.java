
import java.util.Scanner;
class Method
  {
    int a ;
    void pos()
    {
      if(a> 0)
      {
        System.out.println("entered value is positive");
      }
      else
        if(a<0)
      {
        System.out.println("enterd value is negative");
      }
     
         else
        {
        System.out.println("entered value is zero");
}
      
    }
  }
public class Positive
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a");
      a = sc.nextInt();
      Method m = new Method();
      m.pos();
    }
  }