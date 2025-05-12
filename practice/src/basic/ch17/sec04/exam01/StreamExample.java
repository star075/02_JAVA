package basic.ch17.sec04.exam01;

// 스트림을 이용하여 list에 담긴 Product 출력하기 (toString 이용)

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Product> list = new ArrayList<>();

        // 상품 5개 생성해서 리스트에 추가
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(
                    i,                              // 상품 번호
                    "상품" + i,                     // 상품 이름
                    "멋진회사",                     // 회사 이름
                    (int)(10000*Math.random()) // 상품 가격 랜덤 생성
            );
            list.add(product);
        }

        // ⭐️ Stream으로 리스트의 상품 정보 출력
        list.stream()
                .forEach(p -> System.out.println(p));  // toString() 자동 호출
    }
}

/*
 * ✅ [개념 정리]
 *
 * ■ Stream
 * - Java 8부터 도입된 컬렉션 처리 도구
 * - 리스트나 배열을 반복문 없이 하나씩 꺼내 처리할 수 있게 해줌
 * - 스트림은 '중간 연산'과 '최종 연산'으로 구성됨
 *   예: list.stream().map(...).filter(...).forEach(...)
 *
 * ■ forEach(람다식)
 * - 스트림의 '최종 연산' 중 하나
 * - 요소 하나하나에 대해 주어진 작업을 수행함 (여기선 출력)
 * - 내부 반복 구조라 코드가 간결해짐
 *
 * ■ toString()
 * - 객체를 문자열로 표현해주는 메서드
 * - @ToString 어노테이션을 쓰면 자동으로 생성됨
 * - System.out.println(객체) → 자동으로 toString()이 호출되어 출력됨
 *
 * ■ Math.random()
 * - 0.0 이상 1.0 미만의 실수 난수를 반환
 * - 여기에 10000을 곱해 (int)로 형변환하면 0 ~ 9999 범위의 랜덤 정수 생성
 * - 예: (int)(10000 * Math.random())
 *
 * ■ list.add(객체)
 * - ArrayList에 요소를 추가하는 메서드
 * - 반복문 안에서 객체(Product)를 계속 만들어 리스트에 누적
 *
 * ■ 생성자 사용
 * - new Product(i, "상품"+i, "멋진회사", 가격)
 * - @AllArgsConstructor를 사용했기 때문에 모든 필드를 매개변수로 받는 생성자가 자동 생성됨
 */