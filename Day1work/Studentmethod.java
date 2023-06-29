class Method_example
  {
    int sno=101,s1=55,s2=79,s3=88,sum;
    String sname="harika";
    float avg;
    void sum()
    {
      sum = (s1+s2+s3);
      
    }
    void average()
    {
      avg = (float)(sum)/3;
      
    }
    void display()
    {
      System.out.println("the student number is"+sno);
      System.out.println("the student name is"+sname);
      System.out.println("The total marks "+sum);
      System.out.println("the average of 3 subject marks is "+avg);
    }
     
    
    
  }
public class Studentmethod
  {
    public static void main(String [] args)
    {
      Method_example m1 = new Method_example();
      m1.sum();
      m1.average();
      m1.display();
      
    }
  }