import java.math.BigDecimal;
import java.util.Scanner;

public class Baekjoon2420Practice {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            BigDecimal N = new BigDecimal(sc.next());
            BigDecimal M = new BigDecimal(sc.next());

            BigDecimal difference = N.subtract(M);

            if (difference.compareTo(BigDecimal.ZERO) > 0) {
                System.out.println(difference);
            } else if (difference.compareTo(BigDecimal.ZERO) < 0) {
                System.out.println(difference.negate());
            } else {
                System.out.println(0);
            }
        }
        catch(Exception e) {
            System.out.println("숫자 써라.");
        }
    }
}
