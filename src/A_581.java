// Vasya the Hipster

import java.util.Scanner;

public class A_581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print(Math.min(a, b) + " " + Math.abs(a - b) / 2);
        scan.close();
    }
}
