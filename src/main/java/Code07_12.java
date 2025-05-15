class Rabbit03 {
    private String shape;
    private int xPos;
    private int yPos;
    public int number;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
public class Code07_12 {
    public static void main(String[] args) {
        Rabbit03 rabbit = new Rabbit03();
        rabbit.setPosition(100, 200);

        rabbit.number = 1;
    }
}
