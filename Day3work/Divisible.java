/*program to check wheter the given numbe is divisible by 5 and 11*/
import java.util.Scanner;

class Method {
  int a;

  void div() {
    if (a % 5 == 0 && a%11 ==0) {

        System.out.println("entered number is divisible by 5 and 11");
      } else {
        System.out.println("entered number is not divisible by 5 and 11");
      }

    }
  }



public class Divisible {
  public static void main(String[] args) {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
    Method m = new Method();
    m.div();
  }
}