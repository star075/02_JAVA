package basic.ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // ✅ 1. 클래스 타입으로 선언
        // SmartTelevision 타입 → 모든 메서드 사용 가능
        SmartTelevision rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        /*
         * ✅ 2. 인터페이스 타입으로 선언 (다형성)
         * 인터페이스 Searchable 타입으로 선언 → Searchable 기능만 사용 가능
         * 메서드 접근은 인터페이스에 선언된 것만 가능 (즉, search()만 사용 가능)
         */
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com"); // ✅ OK
        // searchable.turnOn(); // ❌ 불가능: Searchable에는 turnOn() 없음
        // → 다형성을 활용하여 코드 유연성 확보!
        // → 나중에 SmartTelevision 대신 다른 Searchable 구현체가 와도 문제 없음
    }
}
