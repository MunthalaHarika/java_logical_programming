import java.util.Scanner;
class Method
  {
    char ch;
    void charecter()
    {
      if(ch>='a' && ch<='z')
		{
			System.out.println("This is a Lowercase Alphabet");
		}
		else
		{
      if(ch>='A' && ch<='Z'){
			System.out.println("This is a Uppercase Alphabet");
      }
      else{
        System.out.println("invalid entery");
      }
		}
    }
  }
public class Upper
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