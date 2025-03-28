import java.util.Scanner;

public class Baekjoon2558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        sc.close();
        
        System.out.print(A > 0 && B < 10? A + B: "A는 0보다 크고 B는 10보다 작다");
    }
}
