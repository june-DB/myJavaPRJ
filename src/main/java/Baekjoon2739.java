import java.util.Scanner;

public class Baekjoon2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N > 0 && N < 10) {
            for(int i = 1; i <= 9; i++) {
                System.out.println(N + "*" + i + "=" + N*i);
            }
        } else {
            System.out.print("1이상 9이하의 정수 입력");
        }
    }
}
