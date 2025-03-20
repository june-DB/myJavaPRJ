import java.util.Scanner;

public class Baekjoon1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(n/m);
        System.out.println(n % m);
        sc.close();
    }
}
