//program to find bigger number
import java.util.Scanner;
public class Bigger
  {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
      System.out.println("enter the details of three numbers");
      System.out.println("enter first number");
      a=sc.nextInt();
      System.out.println("enter second number");
      b=sc.nextInt();
      System.out.println("enter third number");
      c=sc.nextInt();
      if(a>b && a>c)
      {
        System.out.println("the value of a is bigger :"+a);
      }
      else if(b>a && b>c)
      {
        System.out.println("the value of b is bigger :"+b);
      }
      else 
      {
        System.out.println("the value of c is bigger :"+c);
      }
      
    }
  }