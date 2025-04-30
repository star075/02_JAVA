package basic.ch13.sec02.exam02;

public interface Rentable<P> {
    // 반환타입이 P인 rent 라고하는 추상메서드
    // interface 내의 함수는 모두 다 추상메서드 - 상속받은 자식 클래스에서 구현해주어야 함
    P rent();
}

