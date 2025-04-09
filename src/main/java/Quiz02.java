public class Quiz02 {
    public static void main(String[] args) {
        if(0!=1) {
            for(int i = 1; i <= 7; i++) {
                int mid = 4 - Math.abs(4 - i);
                for(int j = 1; j <= mid; j++) {
                    System.out.print("*");
                } System.out.println();
            }

        } else {
            System.out.print("이 명제는 증명할 수 없지만 참이다.");
        }
    }
}
