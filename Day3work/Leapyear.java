/*program to check wheter the given year is leapyear or not*/
import java.util.Scanner;
class Method
  {
    int a;
    void year()
    {
      if(a%4 == 0)
      {
        System.out.println("entered year is a leap year");
      }
      else
      {
        System.out.println("enterd year is not a leap year");
      }
    }
  }
public class Leapyear
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the year");
      a = sc.nextInt();
      Method m = new Method();
      m.year();
    }
  }