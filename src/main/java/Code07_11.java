class Rabbit02 {

    String shape = "";

    Rabbit02(String value) {
        this.shape = value;
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit02 rabbit1 = new Rabbit02("원");
        Rabbit02 rabbit2 = new Rabbit02("triangle");
        Rabbit02 rabbit3 = new Rabbit02("rabbit");

        System.out.printf("object shape of rabbit1 is [%s]. \n", rabbit1.shape);
        System.out.printf("object shape of rabbit2 is [%s]. \n", rabbit2.shape);
        System.out.printf("object shape of rabbit3 is [%s]. \n", rabbit3.shape);
    }
}
