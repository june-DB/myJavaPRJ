import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i<=3; i++) {
            System.out.print("number : ");
            numAry[i] = sc.nextInt();
        }

       for (int i =0; i<= numAry.length; i++) {
            hap = hap + numAry[i];
       }
        System.out.println(hap);
    }
}