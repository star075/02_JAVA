package advanced.ch13.sec03.exam01;

public class GenericExample {
    // boxing 제너릭 메서드 정의
    // 이 메서드 안에서 T라는 타입변수를 사용하겠다.
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);

        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}

/*
* ## ✅ `new Box<>(값)` vs `boxing(값)` 완전 비교 정리

---

### 📌 기본 개념

우리가 만든 `Box<T>` 클래스는 **기본 생성자만 있고, 값을 받는 생성자는 없음**!

```java
public class Box<T> {
    private T t;

    public T get() { return t; }
    public void set(T t) { this.t = t; }
}
```

---

### 💥 잘못된 코드 (컴파일 오류)
```java
Box<Integer> box = new Box<>(100); // ❌ 오류 발생
```

- 이유: `Box` 클래스에는 `Box(T t)` 생성자가 없기 때문
- 값을 넣고 싶다면 `set()` 메서드를 통해 따로 넣어야 함

---

### ✅ 정석적인 방법 1: 생성 후 `set()`으로 값 저장
```java
Box<Integer> box = new Box<>();
box.set(100);
```

- 객체를 먼저 생성한 후 값을 따로 저장하는 방식

---

### ✅ 방법 2: 제네릭 메서드 `boxing()`을 사용한 한 줄 처리
```java
Box<Integer> box = boxing(100);
```

```java
public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<>();
    box.set(t);
    return box;
}
```

- **값을 넣는 과정(set)과 객체 생성 과정을 하나로 묶은 메서드**
- 간단하고 코드가 짧아짐
- 제네릭을 활용해서 **타입도 자동 추론됨**

---

### 🧠 비교 요약

| 구문                          | 설명 |
|-------------------------------|------|
| `new Box<>(100)`              | ❌ 오류: 생성자에서 값을 받도록 되어 있지 않음 |
| `new Box<>()` + `set(값)`     | ✅ 객체 생성 후 값 설정 (기본 방식) |
| `boxing(값)`                  | ✅ 제네릭 메서드를 활용한 깔끔한 한 줄 처리 |

---

### 💡 정리 포인트

- `boxing()`은 자주 쓰이는 **제네릭 헬퍼 메서드 패턴**
- 타입 안전하게, 짧고 직관적으로 객체를 생성할 수 있음
- 꼭 기억할 구조:
    ```java
    public static <T> Box<T> boxing(T t)
    ```

➡ 이 패턴은 제네릭 메서드 개념의 핵심이자 실전에서 많이 쓰이는 형태예요!
* */