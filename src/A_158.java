import java.util.Arrays;
import java.util.Scanner;

public class A_158 {

    /*
     * "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..."
     * — an excerpt from contest rules.
     * 
     * A total of n participants took part in the contest (n ≥ k), and you already
     * know their scores. Calculate how many participants will advance to the next
     * round.
     * 
     * Input
     * The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50)
     * separated by a single space.
     * 
     * The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤
     * 100), where ai is the score earned by the participant who got the i-th place.
     * The given sequence is non-increasing (that is, for all i from 1 to n - 1 the
     * following condition is fulfilled: ai ≥ ai + 1).
     * 
     * Output
     * Output the number of participants who advance to the next round.
     * 
     * Examples
     * Input
     * 8 5
     * 10 9 8 7 7 7 5 5
     * Output
     * 6
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        Arrays.sort(t);

        int a = n - k;
        int p = t[a];
        int x = 0;

        for (int i = 0; i < n; i++) {
            if (t[i] >= p && t[i] > 0) {
                x++;
            }
        }

        System.out.println(x);
        sc.close();
    }
}