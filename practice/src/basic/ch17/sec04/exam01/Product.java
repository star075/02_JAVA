package basic.ch17.sec04.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Product 클래스 정의
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Product {
    private int pno;         // 상품 번호
    private String name;     // 상품 이름
    private String company;  // 회사 이름
    private int price;       // 가격
}
