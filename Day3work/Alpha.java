/*program to check wheter the given charecter is alphabet or not*/
import java.util.Scanner;
public class Alpha {

    public static void main(String[] args) {

        char c ;
      Scanner sc = new Scanner(System.in);
      System.out.println("enterb the character");
      c = sc.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}