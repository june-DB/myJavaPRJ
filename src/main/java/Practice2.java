import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N > 0 && N < 101) {
            for (int i = 4; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("1이상 100 이하의 숫자 입력");
        }
    }
}
