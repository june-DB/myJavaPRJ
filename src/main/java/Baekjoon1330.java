import java.util.Scanner;

public class Baekjoon1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 2개 입력(띄어쓰기 구분) : ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (A < B)
            System.out.println("<");
        else if (A > B)
            System.out.println(">");
        else
            System.out.println("==");
    }
}