class Method
  {
    int a = 2004;
    void even()
    {
      if(a%2 == 0)
      {
        System.out.println("entered value is even");
      }
      else
      {
        System.out.println("enterd value is odd");
      }
    }
  }
public class Evenmethod
  {
    public static void main(String args[])
    {
      Method m = new Method();
      m.even();
    }
  }