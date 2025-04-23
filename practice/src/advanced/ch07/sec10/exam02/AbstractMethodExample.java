package advanced.ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}

/*
* # ✅ 추상 클래스 & 오버라이딩 & 다형성 개념 정리 (Animal, Dog, Cat 예제)

---

## 📘 추상 클래스란?

- `abstract` 키워드로 선언된 클래스
- **직접 객체 생성이 불가능**
- **공통 기능은 구현하고**, 자식 클래스가 **구체적 동작은 오버라이딩하도록 강제**함

```java
public abstract class Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound(); // 자식 클래스가 반드시 구현해야 함
}
```

---

## 🐶 Dog 클래스 (Animal 상속 & sound() 구현)

```java
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
```

---

## 🐱 Cat 클래스 (Animal 상속 & sound() 구현)

```java
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
```

---

## 🚗 실행 클래스 – 다형성 활용

```java
public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();           // 멍멍

        Cat cat = new Cat();
        cat.sound();           // 야옹

        animalSound(new Dog()); // 멍멍
        animalSound(new Cat()); // 야옹
    }

    public static void animalSound(Animal animal) {
        animal.sound(); // 자식 객체에 따라 동작이 달라짐 → 다형성!
    }
}
```

---

## 🎯 개념 정리 요약

| 개념 | 설명 |
|------|------|
| `abstract` 클래스 | 객체 생성 불가. 자식에게 "강제 구현할 기능"을 선언 |
| 오버라이딩 | 부모 메서드를 자식이 "재정의" |
| 다형성 | 부모 타입 변수로 자식 객체를 참조 → 실행 시 실제 자식 메서드가 실행됨 |
| 동적 바인딩 | 오버라이딩된 메서드는 실행 시점에 실제 객체를 따라감 (`animal.sound()`가 Dog or Cat에 따라 달라짐) |

---

## ✅ 실행 결과

```
멍멍
야옹
멍멍
야옹
```

> 자식 클래스에서 오버라이딩한 `sound()` 메서드가 실행됨
> → 이것이 바로 **다형성 + 추상 클래스 활용의 핵심**

---

## 💡 한 줄 정리

> 추상 클래스는 공통 동작을 미리 정의하고,
> 구체적인 동작은 자식이 직접 구현하게 함.
> 이 구조는 **오버라이딩과 다형성을 통해 유연한 코드 확장**이 가능하게 한다.
* */