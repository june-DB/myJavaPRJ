import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        sc.close();

        System.out.print
                (B != 0? A + "/" + B + " = " + (double) A / B : "undefined");
    }
}
