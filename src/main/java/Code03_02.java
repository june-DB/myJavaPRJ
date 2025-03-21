import java.util.Scanner;

public class Code03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;
        double res1;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        res = n1 + n2;
        System.out.println(res);
        res = n1 - n2;
        System.out.println(res);
        res = n1 * n2;
        System.out.println(res);
        res1 = (double) n1 / n2;
        System.out.println(res1);
        res = n1 % n2;
        System.out.println(res);
    }
}
