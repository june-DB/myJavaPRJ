import java.math.BigDecimal;
import java.util.Scanner;

public class Baekjoon2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next());
        BigDecimal B = new BigDecimal(sc.next());
        sc.close();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
