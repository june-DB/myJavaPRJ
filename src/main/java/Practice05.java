import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        sc.close();

        System.out.print((a+b).toLowerCase().replaceAll(" ", ""));
    }
}
