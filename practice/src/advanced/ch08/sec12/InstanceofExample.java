package advanced.ch08.sec12;

public class InstanceofExample {
    // ✅ 다형성 + instanceof + 다운캐스팅
    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
}

/*
* ---

## ✅ 개념 정리: 인터페이스 타입 + instanceof + 다운캐스팅

### ✔️ 1. 다형성 (Polymorphism)
- `Vehicle vehicle = new Taxi();`
- `Vehicle`는 인터페이스, `Taxi`와 `Bus`는 이를 구현
- **하나의 인터페이스 타입(부모 타입)**으로 여러 구현 객체를 받을 수 있음

---

### ✔️ 2. `instanceof`
- 객체가 특정 클래스의 인스턴스인지 검사하는 연산자
- `vehicle instanceof Bus` → vehicle이 실제로 `Bus` 타입인지 확인
- 안전한 다운캐스팅을 위해 사용

---

### ✔️ 3. 다운캐스팅
- `Bus bus = (Bus) vehicle;`
- `Vehicle` 타입에는 없는 메서드 (`checkFare`) 를 쓰기 위해
  **자식 타입으로 형변환(캐스팅)** 해야 함

---

### ✅ 메서드 사용 의도

```java
public static void ride(Vehicle vehicle) {
    vehicle.run(); // 공통 메서드

    if (vehicle instanceof Bus) {
        // Bus만의 고유 기능 사용
        ((Bus) vehicle).checkFare();
    }
}
```

- 인터페이스에 정의된 메서드는 바로 사용
- 자식 클래스만의 메서드는 `instanceof + 형변환` 후 사용

---

## ✅ 결론

> **공통 기능은 인터페이스 타입으로 바로 호출**,
> **구현 클래스의 고유 기능은 `instanceof + 다운캐스팅`으로 호출!**

---
* */