//program to swapp numbers without using temporary varia
import java.util.Scanner;
  public class Swappout
    {
      public static void main(String [] args)
      {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("details of numbers");
        System.out.println("enter the first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
      }
    }