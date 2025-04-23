package basic.ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            // super.fly()는 부모 클래스(Airplane)의 fly() 메서드를 호출하는 것!
            // 즉, 오버라이딩 된 자식 메서드가 아닌 "부모의 원래 fly()"를 실행함
            super.fly();
        }
    }
}
