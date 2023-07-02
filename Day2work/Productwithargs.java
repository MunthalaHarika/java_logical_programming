import java.util.Scanner;
class Method_example
  {
    
    float bill;
  
    void tbill(float pcost ,int pquant, int pno, String pname)
    {
      bill = (pcost)*pquant;
      System.out.println("the bill = "+bill);
      
    }
    void display(int pno,String pname,float pcost, int pquant)
    {
      System.out.println("the product number is"+pno);
      System.out.println("the product name is"+pname);
      System.out.println("The product cost "+pcost);
      System.out.println("the  product quantity "+pquant);
      
      
    }
     
    
    
  }
public class Productwithargs
  {
    public static void main(String [] args)
    {
      int pno , pquant;
      String pname;
      float pcost;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the details of product");
      System.out.println("enter the product number");
      pno = sc.nextInt();
      System.out.println("enter the product name");
      pname = sc.next();
      System.out.println("enter the product cost");
      pcost = sc.nextFloat();
      System.out.println("enter the product quantity");
      pquant = sc.nextInt();
      
      Method_example m1 = new Method_example();
      m1.tbill(pcost ,pquant,pno,pname);
      m1.display(pno,pname,pcost,pquant);
      
    }
  }