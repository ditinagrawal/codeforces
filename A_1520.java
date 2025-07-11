import java.util.HashSet;
import java.util.Scanner;

public class A_1520 {
    /*
     * Polycarp has 26
     * tasks. Each task is designated by a capital letter of the Latin alphabet.
     * 
     * The teacher asked Polycarp to solve tasks in the following way: if Polycarp
     * began to solve some task, then he must solve it to the end, without being
     * distracted by another task. After switching to another task, Polycarp cannot
     * return to the previous task.
     * 
     * Polycarp can only solve one task during the day. Every day he wrote down what
     * task he solved. Now the teacher wants to know if Polycarp followed his
     * advice.
     * 
     * For example, if Polycarp solved tasks in the following order: "DDBBCCCBBEZ",
     * then the teacher will see that on the third day Polycarp began to solve the
     * task 'B', then on the fifth day he got distracted and began to solve the task
     * 'C', on the eighth day Polycarp returned to the task 'B'. Other examples of
     * when the teacher is suspicious: "BAB", "AABBCCDDEEBZZ" and "AAAAZAAAAA".
     * 
     * If Polycarp solved the tasks as follows: "FFGZZZY", then the teacher cannot
     * have any suspicions. Please note that Polycarp is not obligated to solve all
     * tasks. Other examples of when the teacher doesn't have any suspicious: "BA",
     * "AFFFCC" and "YYYYY".
     * 
     * Help Polycarp find out if his teacher might be suspicious.
     * 
     * Input
     * The first line contains an integer 𝑡
     * (1≤𝑡≤1000
     * ). Then 𝑡
     * test cases follow.
     * 
     * The first line of each test case contains one integer 𝑛
     * (1≤𝑛≤50
     * ) — the number of days during which Polycarp solved tasks.
     * 
     * The second line contains a string of length 𝑛
     * , consisting of uppercase Latin letters, which is the order in which Polycarp
     * solved the tasks.
     * 
     * Output
     * For each test case output:
     * 
     * "YES", if the teacher cannot be suspicious;
     * "NO", otherwise.
     * You may print every letter in any case you want (so, for example, the strings
     * yEs, yes, Yes and YES are all recognized as positive answer).
     * 
     * Example
     * Input
     * 5
     * 3
     * ABA
     * 11
     * DDBBCCCBBEZ
     * 7
     * FFGZZZY
     * 1
     * Z
     * 2
     * AB
     * Output
     * NO
     * NO
     * YES
     * YES
     * YES
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String str = scan.next();
            HashSet<Character> set = new HashSet<>();
            boolean suspicious = false;
            set.add(str.charAt(0));
            for (int i = 1; i < n; i++) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    if (set.contains(str.charAt(i))) {
                        suspicious = true;
                        break;
                    }
                    set.add(str.charAt(i));
                }
            }
            System.out.println(suspicious ? "NO" : "YES");
        }
        scan.close();
    }
}
