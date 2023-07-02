/*program to check whether the given charecter is number,special charecter or alphabet*/
import java.util.Scanner;
class Method
  {
    char ch;
    void charecter()
    {
      if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is A DIGIT.");

        } else {

             System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }
  }
public class Number
  {
    public static void main(String [] args)
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the charecter");
      ch = sc.next().charAt(0);
      Method m = new Method();
      m.charecter();
    }
  }