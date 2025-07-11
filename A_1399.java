import java.util.Arrays;
import java.util.Scanner;

public class A_1399 {

    /*
     * You are given the array 𝑎
     * consisting of 𝑛
     * positive (greater than zero) integers.
     * 
     * In one move, you can choose two indices 𝑖
     * and 𝑗
     * (𝑖≠𝑗
     * ) such that the absolute difference between 𝑎𝑖
     * and 𝑎𝑗
     * is no more than one (|𝑎𝑖−𝑎𝑗|≤1
     * ) and remove the smallest of these two elements. If two elements are equal,
     * you can remove any of them (but exactly one).
     * 
     * Your task is to find if it is possible to obtain the array consisting of only
     * one element using several (possibly, zero) such moves or not.
     * 
     * You have to answer 𝑡
     * independent test cases.
     * 
     * Input
     * The first line of the input contains one integer 𝑡
     * (1≤𝑡≤1000
     * ) — the number of test cases. Then 𝑡
     * test cases follow.
     * 
     * The first line of the test case contains one integer 𝑛
     * (1≤𝑛≤50
     * ) — the length of 𝑎
     * . The second line of the test case contains 𝑛
     * integers 𝑎1,𝑎2,…,𝑎𝑛
     * (1≤𝑎𝑖≤100
     * ), where 𝑎𝑖
     * is the 𝑖
     * -th element of 𝑎
     * .
     * 
     * Output
     * For each test case, print the answer: "YES" if it is possible to obtain the
     * array consisting of only one element using several (possibly, zero) moves
     * described in the problem statement, or "NO" otherwise.
     * 
     * Example
     * Input
     * 5
     * 3
     * 1 2 2
     * 4
     * 5 5 5 5
     * 3
     * 1 2 4
     * 4
     * 1 3 4 4
     * 1
     * 100
     * Output
     * YES
     * YES
     * NO
     * NO
     * YES
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            boolean possible = true;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
