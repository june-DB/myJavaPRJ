import java.util.Scanner;

public class Baekjoon2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        System.out.println(Math.abs(N-M));
    }
}
