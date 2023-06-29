//program to swapp numbers using temporary variable
import java.util.Scanner;
public class Swapp
  {
    public static void main(String [] args)
    {
      int a,b,temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("details of 2 numbers");
      System.out.println("enter the value of a");
      a = sc.nextInt();
      System.out.println("enter the value of b");
      b = sc.nextInt();
      temp = a;
      a = b;
      b = temp;
      System.out.println("a="+a);
      System.out.println("b="+b);
      
    }
  }