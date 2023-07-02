import java.util.Scanner;
class Add
  {
  int a,b,c,d,e,f,g;
  Scanner sc =new Scanner(System.in);
    
  int add()
    {
    System.out.println("enter a , b  values");
    a = sc.nextInt();
    b= sc.nextInt();
    
    c= a+b;
    return c;
      
    }
    int sub()
    {
  
    d= a-b;
      
  return d;
      
    }
int mul()
    {
  
    e= a*b;
      
  return e;
      
    }
int div()
    {
  
    f= a/b;
      
  return f;
      
    }
int mod()
    {
  
    g= a%b;
      
  return g;
      
    }
    
  
 
  }
public class Allreturn
  {
    public static void main(String [] args)
    {
      int x,y,z,m,n;
      Add a = new Add();
      x= a.add();
      System.out.println("the addition of two numbers is "+x);
      y= a.add();
      System.out.println("the subtraction of two numbers is "+y);
      
    }
  }