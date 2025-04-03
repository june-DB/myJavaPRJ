import java.math.BigDecimal;
import java.util.Random;

public class ProbabilityMinimizer {
    public static void main(String[] args) {
        Random rd = new Random();
        int precision = 100;

        StringBuilder sb = new StringBuilder("0.");
        for (int i = 0; i < precision; i++) {
            sb.append(rd.nextInt(10));
        }

        BigDecimal randomN = new BigDecimal(sb.toString());
        System.out.println(randomN);
    }
}

