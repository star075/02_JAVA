package practice.ch06.sec08.exam04;

public class CalculatorExample2 {
    public static void main(String[] args) {

        double pi = Calculator2.PI;
        // PI를 static으로 선언했기 때문에
        // 객체를 만들지 않고도 값을 가져와서 확인 가능

        System.out.println("pi = " + pi);

        Calculator2 cal1 = new Calculator2(); // 기본 생성자 호출 (JVM 안에 있는 컴파일러가 만듦)
        cal1.z = 10;
        System.out.println(cal1.z);
//        cal1.PI = 15;

        Calculator2 cal2 = new Calculator2();
        cal2.z = 20;
        System.out.println(cal2.z);

        System.out.println("cal2.PI: " + cal2.PI);
        // cal1.PI의 값을 15로 변경했지만, PI는 static 변수이기 때문에
        // 모든 인스턴스가 공유하는 static 영역에 저장됨
        // 따라서 cal2.PI 등 다른 인스턴스에서도 값이 함께 변경됨

//        // 인스턴스를 만들지 않아도 클래스이름.""으로 참조할 수 있음
//        System.out.println(Calculator2.plus((int) pi, 5));
    }
}