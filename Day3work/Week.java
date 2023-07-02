/*program to input week number and print week day*/
import java.util.Scanner;
class Method
  {
    int num;
    void day(int num)
    {
      if(num==1)
      {
			System.out.println("This is a Sunday");
      }
		else if(num==2)
    {
			System.out.println("This is a Monday");
    }
		else if(num==3)
    {
			System.out.println("This is a Tuesday");
    }
		else if(num==4)
    {
			System.out.println("This is a Wednesday");
    }
		else if(num==5)
    {
			System.out.println("This is a Thursday");
    }
		else if(num==6)
    {
			System.out.println("This is a Friday");
    }
		else if(num==7)
    {
			System.out.println("This is a Saturday");
    }
		else
    {
			System.out.println("invaid entry");
    }
    }
  }
public class Week
  {
    public static void main(String [] args)
    {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number between 1 to 7");
      num = sc.nextInt();
      Method m = new Method();
      m.day(num);
      
    }
  } 
  