package practice.ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
    }
}
