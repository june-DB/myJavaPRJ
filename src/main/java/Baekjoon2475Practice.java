import java.util.Scanner;

public class Baekjoon2475Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1의 자리 숫자 5개 입력(스페이스로 구분) : ");
        int A = sc.nextInt(), B = sc.nextInt(),  C = sc.nextInt(),
        D = sc.nextInt(), E = sc.nextInt();

        System.out.print((A*A +  B*B + C*C + D*D + E*E) % 10);
    }
}
