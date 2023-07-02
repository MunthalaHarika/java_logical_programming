/*program to check wheter the given charecter is a Vowel or consonant*/
import java.util.Scanner;
class Method
  {
    char ch;
    void con()
    {
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
  }
public class Consonant
  {
    public static void main(String args [])
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the character");
      ch = sc.next().charAt(0);
      Method m = new Method();
      m.con();
    }
  }