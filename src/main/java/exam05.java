import java.util.Arrays;

public class exam05 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.stream(num).reduce(Integer::max).getAsInt() + "입니다.");
    }
}
