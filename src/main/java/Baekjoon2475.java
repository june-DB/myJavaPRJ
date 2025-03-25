import java.util.Scanner;

public class Baekjoon2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1의 자리 숫자 5개 입력(스페이스로 구분) : ");

        int N = 0;

        for (int i = 0; i < 5; i++) {
            int A = sc.nextInt();
            N += A * A;
        }
        sc.close();
        System.out.print(N % 10);
    }
}
