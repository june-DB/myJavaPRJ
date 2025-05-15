public class Exam03 {
    public static void main(String[] efgh) {
        int sum = 0;

        for(int i = 100; i <= 300; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        } System.out.print(sum);
    }
}
