class Rabbit04 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : 200 yPos : 200");
    }

}

class HouseRabbit extends Rabbit04 {
    String Owner;
    void eatFeed() {
        System.out.println("HouseRabbit eats feed.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("its remodified function");
    }
}

class MountainRabbit extends Rabbit04 {
    String mountain;
    void eatWildgress() {
        System.out.println("MountainRabbit eats wildgress.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.shape = "triangle";
        hRabbit.Owner = "nanseni";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "square";
        mRabbit.mountain = "mt.salok";
        mRabbit.move(200, 200);
        mRabbit.eatWildgress();;
    }
}
