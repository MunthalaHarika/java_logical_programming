//program to calculate area of circle
import java.util.Scanner;
public class Area
  {
    public static void main(String [] args)
    {
      int r;
      float area;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the value of radius ");
      r = sc.nextInt();
      System.out.println("the radius of a circle = " +r);
      area = 3.14F*r*r;
      System.out.println("the area of a circle is "+area);
    }
  }