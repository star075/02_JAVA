package basic.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {

        // K : Tv, M : String
        // Product<Tv, String> 타입 객체 생성
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv()); // kind = Tv 객체
        product1.setModel("스마트TV"); // model = "스마트TV"

        // Getter의 리턴값이 Tv 타입
        Tv tv = product1.getKind(); // kind 값을 가져와서 tv에 저장
        String tvModel = product1.getModel(); // model 값을 가져와서 tvModel에 저장

        // K : Car, M : String
        // Product<Car, String> 타입 객체 생성
        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car()); // kind = Car 객체
        product2.setModel("SUV자동차"); // model = "SUV자동차"

        Car car = product2.getKind(); // kind 값을 가져와서 car에 저장
        String carModel = product2.getModel(); // model 값을 가져와서 carModel에 저장

        car.toString(); // ❓❓❓❓❓⭐️⭐️⭐️⭐️⭐️
    }
}

// 💡 <T, M> 타입을 사용할 때:
// - T에 실제 클래스 타입 (Tv, Car 등)을 넣고,
// - M에 설명이나 이름으로 사용할 타입 (보통 String)을 넣음
//
// 예:
// - Product<Tv, String> → kind는 Tv 객체, model은 문자열
// - Product<Car, String> → kind는 Car 객체, model은 문자열

