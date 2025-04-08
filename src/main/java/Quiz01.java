import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.close();

        if (L % 2 == 1) {
            for (int i = 1; i <= L; i++) {
                int mid = (L + 1) / 2 - Math.abs((L + 1) / 2 - i);
                for (int j = 1; j <= mid; j++) {
                    System.out.print("*");
                } System.out.println();
            }
        }
    }
}