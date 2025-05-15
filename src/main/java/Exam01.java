public class Exam01 {
    public static void main(String[] args) {

        int L = 4;
        int cL = 1;

        while (cL <= L) {
            for(int i = 1; i <= L - cL; i++) {
                System.out.print(" ");
            }
            for(int i = 1; i <= 2 * cL - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            cL++;
        }
    }
}
