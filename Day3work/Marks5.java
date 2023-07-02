/*Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
import java.util.Scanner;
class Method
  {
    int a,b,c,d,e,max=500,t;
    float per;
    void grade(int a, int b,int c,int d,int e)
    {
      t=(a+b+c+d+e);
      System.out.println("total marks = "+t);
      per = ((float)t/max)*100;
      System.out.println("Percentage of a student"+per);
      if(per >= 90)
      {
        System.out.println("student obtained grade a");
      }
      else
        if(per >= 80)
        {
          System.out.println("student obtained grade b");
        }
      else
        if(per >= 70)
        {
          System.out.println("student obtained grade c");
        }
      else
        if(per >= 60)
        {
          System.out.println("student obtained grade d");
        }
      else
        if(per >= 50)
        {
          System.out.println("student obtained grade d");
        }
      else
        if(per >= 40)
        {
          System.out.println("student obtained grade e");
        }
      else
        if(per < 40)
        {
          System.out.println("student failed");
        }
    
        
}
      
    }
  public class Marks5
    {
      public static void main(String []args)
      {
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the physics marks");
        a = sc.nextInt();
        System.out.println("enter the chemistry marks");
        b = sc.nextInt();
        System.out.println("enter the biology marks");
        c = sc.nextInt();
        System.out.println("enter the mathematics marks");
        d = sc.nextInt();
        System.out.println("enter the computer marks");
        e = sc.nextInt();
        Method m = new Method();
        m.grade(a,b,c,d,e);
        
      }
    }