class Method
  {
    int a = 2004;
    void year()
    {
      if(a%4 == 0)
      {
        System.out.println("entered year is a leap year");
      }
      else
      {
        System.out.println("enterd year is not a leap year");
      }
    }
  }
public class Leapmethod
  {
    public static void main(String args[])
    {
      Method m = new Method();
      m.year();
    }
  }