/*program to check maximum of 3 numbers*/
import java.util.Scanner;

class Maximum {
  int a, b, c;

  void max() {
    if (a > b && a > c)
    {
      System.out.println("value of a is maximum");
    } 
    else 
    {
      if(b>a && b>c)
      {
      System.out.println("value of b is maximum");
      }
      else
      {
        System.out.println("value of c is maximum");
      }
    }
  }

}

public class Max3 
{
  public static void main(String[] args) {
    int a, b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
    System.out.println("enter the value of b");
    b = sc.nextInt();
    System.out.println("enter the value of c");
    c = sc.nextInt();
    Maximum m = new Maximum();
    m.max();

  }
}