package basic.ch16.sec04;

/*
* 파일 구조
* - Calculable: 람다식으로 전달할 함수 틀(인터페이스) 정의
* - Person: 전달받은 함수(람다식 or 메서드 참조)를 실행함
* - LambdaExample: 실제 람다식/메서드 참조를 전달해서 실행함
* */

@FunctionalInterface
public interface Calculable {
    double calc(double x, double y);
}

/*
* 람다식이나 메서드를 전달받기 위한 함수 규칙 정의
* */

