/*program to check the given number is odd or even*/
import java.util.Scanner;
class Method
  {
    int a;
    void even()
    {
      if(a%2 == 0)
      {
        System.out.println("entered value is even");
      }
      else
      {
        System.out.println("enterd value is odd");
      }
    }
  }
public class Evenodd
  {
    public static void main(String args[])
    {
      int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
      Method m = new Method();
      m.even();
    }
  }