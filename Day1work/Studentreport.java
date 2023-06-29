//program for student report
import java.util.Scanner;
public class Studentreport
  {
    public static void main(String [] args)
    {
      int sno,m1,m2,m3,sum;
      String sname;
      float avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the student number");
      sno = sc.nextInt();
      System.out.println("enter the student name");
      sname = sc.next();
      System.out.println("enter the marks of maths");
      m1 = sc.nextInt();
      System.out.println("enter the marks of science");
      m2 = sc.nextInt();
      System.out.println("enter the marks of social");
      m3 = sc.nextInt();
      sum = (m1+m2+m3);
      avg = (float)(sum)/3;
      System.out.println("report of student");
      System.out.println("student number is ="+sno);
      System.out.println("student name is = "+sname);
      System.out.println("marks of maths =" +m1);
      System.out.println("marks of science  = "+m2);
      System.out.println("marks of social = "+m3);
      System.out.println("sum of 3 subject marks = "+sum);
      System.out.println("average of marks = "+avg);
    }
  }