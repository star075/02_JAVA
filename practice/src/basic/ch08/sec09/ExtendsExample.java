package basic.ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}

/*
* ---

## ✅ 왜 InterfaceA, InterfaceB, InterfaceC 타입으로 나눠서 선언할까?

- 인터페이스를 구현한 클래스 객체를 사용할 때,
  **필요한 역할(기능)에 따라 변수 타입을 가장 추상적인 인터페이스로 선언**하는 것이 좋다.

---

## ✅ 선언 방식에 따른 의미

- `InterfaceA ia = impl;`
  - `methodA()`만 필요할 때
  - InterfaceA는 `methodA()`만 정의된 인터페이스이므로, 그 역할에 딱 맞는 타입

- `InterfaceB ib = impl;`
  - `methodB()`만 사용하고 싶을 때
  - 필요한 기능만 노출하는 방식으로, 코드의 목적이 명확해짐

- `InterfaceC ic = impl;`
  - `methodA()`, `methodB()`, `methodC()` 전부 필요할 때
  - InterfaceC는 A와 B를 상속하므로 모든 기능을 사용할 수 있음

---

## ✅ 핵심 개념 요약

| 변수 타입       | 접근 가능한 메서드       | 사용 목적                           |
|----------------|--------------------------|------------------------------------|
| `InterfaceA`    | `methodA()`만 가능         | 기능 A만 필요할 때                |
| `InterfaceB`    | `methodB()`만 가능         | 기능 B만 필요할 때                |
| `InterfaceC`    | `methodA()`, `methodB()`, `methodC()` | 전체 기능이 다 필요할 때         |
| `InterfaceCImpl`| 클래스의 모든 기능 사용 가능 | 구체적인 기능까지 모두 활용할 때 |

---

## ✅ 한 줄 정리

> **필요한 기능만 사용할 수 있게 변수 타입을 최소한의 인터페이스로 선언하는 것**
> → 유지보수에 유리하고, 코드 목적도 더 명확해짐! 💡

---
* */

