//program to calculate the bill
import java.util.Scanner;
public class Product
  {
    public static void main(String [] args)
    {
      int pno;
      String pname;
      float pcost,pquant,bill;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the product number");
      pno = sc.nextInt();
      System.out.println("enter the product name");
      pname = sc.next();
      System.out.println("enter the product cost");
      pcost = sc.nextFloat();
      System.out.println("enter the quantity of product");
      pquant = sc.nextFloat();
      bill = pcost*pquant;
      System.out.println("total bill = "+bill);
      System.out.println("report of product");
      System.out.println("pno ="+pno);
      System.out.println("pname = "+pname);
      System.out.println("pcost =" +pcost);
      System.out.println("pquant = "+pquant);
    }
  }