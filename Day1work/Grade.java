//program to find sum,average and grade of a student
import java.util.Scanner;
public class Grade
  {
    public static void main(String [] args)
    {
      int a,b,c,sum;
      float avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter marks of maths");
      a = sc.nextInt();
      System.out.println("enter marks of science");
      b = sc.nextInt();
      System.out.println("enter marks of social");
      c = sc.nextInt();
      sum = (a+b+c);
      System.out.println("total marks = "+sum);
      avg = sum/3.0F;
      System.out.println("average marks = "+avg);
      if(a>35 && b>35 && c>35)
      {
        System.out.println("student passed");
         if(avg<50)
      {
        System.out.println("student got grade c");
      }
      else if(avg>50 && avg>=70)
      {
        System.out.println("student got grade b");
      }
      else if(avg>70 && avg<=80)
      {
        System.out.println("student got grade a");
      }
      else if(avg>80)
      {
        System.out.println("student got distinction");
      }
      }
      else 
      {
        System.out.println("student failed");
      }
    }
  }