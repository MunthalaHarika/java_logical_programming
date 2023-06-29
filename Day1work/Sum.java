//program to find sum of numbers
import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3, num;
    float avg;
    System.out.println("details of three numbers");
    System.out.println("enter first number");
    num1 = sc.nextInt();
    System.out.println("enter second name");
    num2 = sc.nextInt();
    System.out.println("enter third salary");
    num3 = sc.nextInt();
    num = num1 + num2 + num3;
    avg = (num1 + num + num3) / 3.0F;
    System.out.println("the sum of three numbers is :" + num);
    System.out.println("the average of three numbers is :" + avg);

  }
}
