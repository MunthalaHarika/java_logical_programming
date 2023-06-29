//program to know the details of an employee using scanner class
import java.util.Scanner;
public class Employeescan
  {
    public static void main(String [] args)
    {
      Scanner sc =new Scanner(System.in);
      int eno,esal;
      String ename;
      System.out.println("details of employee");
      System.out.println("enter employee number");
       eno = sc.nextInt() ;
      System.out.println("enter employee name");
      ename = sc.next();
      System.out.println("enter employee salary");
      esal = sc.nextInt();
      System.out.println("the employee numner is :"+eno);
      System.out.println("the employee name is :"+ename);
      System.out.println("the employee salary is :"+esal);
      
      
    }
  }