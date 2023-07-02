import java.util.Scanner;
class Add
  {
  int a,b,c;
  Scanner sc =new Scanner(System.in);
  int add()
    {
    System.out.println("enter a , b , c values");
    a = sc.nextInt();
    b= sc.nextInt();
    c= a+b;
  return c;
    }
 
  }
public class Addreturn
  {
    public static void main(String [] args)
    {
      int z;
      Add a = new Add();
      z= a.add();
      System.out.println("the addition of two numbers is "+z);
      
    }
  }