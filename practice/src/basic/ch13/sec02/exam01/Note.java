package basic.ch13.sec02.exam01;

public class Note {
}

/*
* ## ✅ 실습 예제: Product 클래스 (제네릭 2개 타입) + 사용 예제

### 📌 실습 목표
- kind와 model을 각각 제네릭으로 선언
- Getter / Setter 직접 구현
- 실제 클래스 타입을 넣어 다양한 객체를 생성해 사용
- `toString()` 활용해 객체 정보 출력하기

---

### 📦 Product 클래스

```java
public class Product<K, M> {
    private K kind;    // 제품 종류 (예: Tv, Car 등)
    private M model;   // 제품 모델 (예: "스마트TV", "SUV자동차")

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "kind=" + kind +
                ", model=" + model +
                '}';
    }
}
```

#### 💬 개념 요약 (주석 정리용)
```java
// 💡 제네릭 타입 <K, M>:
// - K: 제품 종류의 타입 (예: Tv, Car 클래스 객체 등)
// - M: 제품 모델명 타입 (예: String 등 문자열)
//
// ✅ 장점:
// - Product<Tv, String>, Product<Car, String> 등 다양한 조합 가능
// - 형변환 없이 타입 안정성 있게 사용 가능
```

---

### 🚗 더미 클래스 정의

```java
public class Tv {
    @Override
    public String toString() {
        return "📺 TV";
    }
}

public class Car {
    @Override
    public String toString() {
        return "🚗 Car";
    }
}
```

---

### 🧪 GenericExample: Product 활용 예제

```java
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

        // toString 출력
        System.out.println(product1);
        System.out.println(product2);
    }
}
```

---

### 🔎 toString() 관련 개념 정리

- 자바에서 `System.out.println(객체)` → 내부적으로 `toString()` 호출됨
- `toString()`을 오버라이딩하지 않으면 기본 형식:
  ```
  클래스명@해시코드
  예: basic.Tv@6d06d69c
  ```
- 주소처럼 보이는 건 **해시코드로 표현된 객체의 참조값(주소)**

#### ✅ 예쁘게 출력하려면?
```java
@Override
public String toString() {
    return "📺 TV";
}
```

#### 🔍 출력 예시
```text
Product{kind=📺 TV, model=스마트TV}
Product{kind=🚗 Car, model=SUV자동차}
```

---

### 🧠 요약

| 항목             | 설명 |
|------------------|------|
| Product<K, M>    | 두 개의 제네릭 타입을 갖는 클래스 |
| kind             | 클래스 객체 타입 (예: Tv, Car) |
| model            | 보통 문자열로 된 제품 설명 (예: "스마트TV") |
| 제네릭 장점      | 타입 안정성 + 코드 재사용성 |
| toString()       | 객체 정보 출력용, 직접 오버라이드하면 가독성 향상 |
* */
