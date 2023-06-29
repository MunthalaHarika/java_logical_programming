
//program to find volume of sphere
import java.util.Scanner;

public class Volumesphere {
  public static void main(String [] args)
    {
      int r;
      double vol;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the radius");
      r = sc.nextInt();
      vol = (1.33)*(3.14)*(r)*(r)*(r);
      System.out.println("the volume of sphere is "+vol);
      
      
        
    }
}