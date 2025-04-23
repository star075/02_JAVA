package basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Computer();

        System.out.println(calc1.areaCircle(5));
        System.out.println(calc2.areaCircle(5));
    }
}
