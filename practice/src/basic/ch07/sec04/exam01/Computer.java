package basic.ch07.sec04.exam01;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        // areaCircle() 메서드 재정의
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
