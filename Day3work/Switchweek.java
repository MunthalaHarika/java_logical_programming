/*program to input week number and print week day using switch case*/
import java.util.Scanner;
class Method
  {
    int num;
    void day(int num)
    {
       switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
  }
public class Switchweek
  {
    public static void main(String [] args)
    {
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of num");
      num = sc.nextInt();
      Method m = new Method();
      m.day(num);
    }
  }