import java.math.BigDecimal;
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = new BigDecimal(sc.next()), B = new BigDecimal(sc.next());
        sc.close();

        if (B.compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal res = A.divide(B, 1, BigDecimal.ROUND_HALF_UP);
            System.out.print(A + "/" + B + "=" + res.toPlainString());
        } else {
            System.out.print("Undefined");
        }
    }
}