//program to calculate area of triangle
import java.util.Scanner;
public class Areatri
  {
    public static void main(String [] args)
    {
      int l,b,area;
      Scanner sc = new Scanner(System.in);
      System.out.println("details of triangle");
      System.out.println("enter the length of triangle");
      l = sc.nextInt();
      System.out.println("enter the breadth of triangle");
      b = sc.nextInt();
      area = l*b;
      System.out.println("area of the triangle is :"+area);
    }
  }