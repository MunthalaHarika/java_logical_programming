class Method
  {
    int a = 2004;
    void pos()
    {
      if(a> 0)
      {
        System.out.println("entered value is positive");
      }
      else
      {
        System.out.println("enterd value is negative");
      }
    }
  }
public class Posmethod
  {
    public static void main(String args[])
    {
      Method m = new Method();
      m.pos();
    }
  }