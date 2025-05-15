interface Rabbit05 {
    abstract void sleep();
}

class HouseRabbit05 implements Rabbit05 {
    public void sleep() {
        System.out.println("집토끼가 자고있습니다");
    }
}

class MountainRabbit05 implements Rabbit05 {
    public void sleep() {
        System.out.println("산토끼가 굴 속에서 잠자고 있습니다.");
    }
}

public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit05 hRabbit = new HouseRabbit05();
        MountainRabbit05 mRabbit = new MountainRabbit05();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}