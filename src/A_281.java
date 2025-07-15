import java.util.Scanner;

public class A_281 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      scan.close();
      if (!s.isEmpty()) {
          s = s.substring(0, 1).toUpperCase() + s.substring(1);
      }
      System.out.println(s);
  }
}
