import java.util.Scanner;

public class Baekjoon2438Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상 100이하의 숫자 입력 : ");
        int N = sc.nextInt();

        sc.close();

        if (N > 0 && N < 101) {
          for (int i = 2; i <= N; i++) {
              for (int j = 1; j < i; j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
        } else {
            System.out.println("1에서 100 사이의 숫자 입력");
        }
    }
}
