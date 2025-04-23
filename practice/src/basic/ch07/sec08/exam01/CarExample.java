package basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Tire 타입의 tire 속성이 정의되지 않음
//        Tire tire = new Tire();
//        Tire tire = new TeslaTire(); // 다형성 - 업캐스팅
//        Tire tire = new KumhoTire(); // 다형성 - 업캐스팅 (자식 타입을 부모 타입으로 형변환)
//        Tire tire = new HankookTire(); // 다형성 - 업캐스팅
        // 적은 노력으로 확장이 가능하다는 것... 부모 타입으로 Car에 정의해놓으니까 자식으로 한국/금호/테슬라 다양하게 넣을 수 있음
        // tire를 상속받은 class를 따로 만들어서 걔로 만들면 됨. 확장 용이
        // 부모 타입이 앞에 있으면 뒤에 자식 타입으로 tire 바꿔끼울 수 있다는 것

        // 부모 타입으로 자식 객체를 참조 (업캐스팅)
        Tire tire1 = new Tire();
        Tire tire2 = new HankookTire();
        Tire tire3 = new KumhoTire();

        // 부모 타입인 tire 필드에 자식 객체들을 끼워넣고 run 실행
        // 자식 클래스에서 오버라이딩된 roll()이 실행됨 (다형성 + 동적 바인딩)

        myCar.tire = tire1;
        myCar.run();
        myCar.tire = tire2;
        myCar.run();
        myCar.tire = tire3;
        myCar.run();
    }
}
