package basic.ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff(); // 이륙합니다.
        sa.fly(); // 일반 비행합니다.
        /*
        * public void fly() {
                System.out.println("일반 비행합니다.");
          }
        * */
        sa.flyMode = SupersonicAirplane.SUPERSONIC; // 2
        sa.fly(); // 초음속 비행합니다.
        /*
        * @Override
          public void fly() {
                if(flyMode == SUPERSONIC) {
                     System.out.println("초음속 비행합니다.");
                } else {
                super.fly();
                }
          }
        * */
        sa.flyMode = SupersonicAirplane.NORMAL; // 1
        sa.fly(); // 일반 비행합니다.
        sa.land(); // 착륙합니다.
    }
}