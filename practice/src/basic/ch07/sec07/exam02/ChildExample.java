package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 타입 객체 생성
        Child child = new Child();

        // 부모 타입 -> Child를 업캐스팅 (부모한테 자식을 덮어씌운다 생각)
        Parent parent = child; // 다형성

        parent.method1(); // Parent-method1() - 부모에 정의된 메서드
        parent.method2(); // Child-method2() - 오버라이딩된 자식 메서드 (동적 바인딩)
//        parent.method3(); // ❌ 오류 발생: method3()는 Parent 타입에는 정의되어 있지 않음
        // 자식 타입에만 있는 메서드는 부모 타입 변수로 호출할 수 없음

        if (parent instanceof Child) {
            ((Child) parent).method3(); // ✅ 가능: Child-method3() 출력
        }
    }
}

/*
* # ❗ 잘못된 코드 분석 – ChildExample

---

## ✅ 클래스 구조 요약

```java
class Parent {
    void method1() { ... }
    void method2() { ... }
}

class Child extends Parent {
    @Override
    void method2() { ... }
    void method3() { ... } // 부모에는 없음
}
```

---

## ✅ 문제 코드 분석

```java
Parent parent = new Child();

parent.method1(); // ✅ OK → 부모의 method1()
parent.method2(); // ✅ OK → 자식에서 오버라이딩한 method2() 실행됨 (동적 바인딩)
parent.method3(); // ❌ 컴파일 에러!
```

---

## ❌ 오류 설명

- `parent`는 **Parent 타입 변수**
- 자식 클래스(`Child`)의 객체를 참조하고 있지만,
- **부모 타입에는 `method3()`이 없기 때문에 호출 불가**
- 자바는 **변수 타입 기준으로 사용할 수 있는 멤버를 결정**함
- 따라서 `method3()`은 **보이지 않음**

---

## ✅ 해결 방법: 형변환 (다운캐스팅)

```java
if (parent instanceof Child) {
    ((Child) parent).method3(); // ✅ OK
}
```

> `instanceof`를 이용해 안전하게 다운캐스팅 후 호출하면 자식의 고유 메서드도 사용 가능

---

## ✅ 한 줄 요약

> **부모 타입 참조 변수**로는 **자식이 새로 정의한 메서드**를 직접 사용할 수 없다.
> 사용할 경우 **형변환(casting)** 필요하며, **`instanceof`로 안전성 확인하는 것이 좋다.
* */
