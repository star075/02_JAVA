package practice.ch12.sec03.exam02;

public class Student {
    // private으로 멤버 필드 캡슐화
    private int no;
    private String name;

    // 매개변수를 통해 멤버 필드를 초기화하는 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // Getter / Setter
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

/*
* ## ✅ Student 클래스 구현 정리

---

### 📌 문제 조건

- 멤버 필드를 초기화하는 생성자 만들기
- 멤버 필드에 대한 Getter / Setter 메서드 정의하기

---

### 📦 클래스 목적

> 학생의 정보(학번, 이름)를 담고,
필드 값을 외부에서 안전하게 **설정하거나 읽을 수 있도록** 하는 DTO 성격의 클래스

---

### 🧾 클래스 코드

```java
package practice.ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    // 생성자: 객체 생성 시 초기화
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // Getter: no
    public int getNo() {
        return no;
    }

    // Setter: no
    public void setNo(int no) {
        this.no = no;
    }

    // Getter: name
    public String getName() {
        return name;
    }

    // Setter: name
    public void setName(String name) {
        this.name = name;
    }
}
```

---

### 🔍 구성 요소 설명

| 항목 | 설명 |
|------|------|
| `private` 필드 | 외부에서 직접 접근하지 못하도록 보호 (캡슐화) |
| 생성자 | 객체 생성 시 `no`, `name`을 전달받아 초기화 |
| Getter | 외부에서 `no`, `name` 값을 읽을 수 있도록 |
| Setter | 외부에서 값을 수정할 수 있도록 |

---

### 💡 참고: 롬복으로 간결하게 쓰기

```java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private int no;
    private String name;
}
```

- `@Getter` → get 메서드 자동 생성
- `@Setter` → set 메서드 자동 생성
- `@AllArgsConstructor` → 모든 필드 초기화 생성자 자동 생성

---

✅ 이 구조는 **기본적인 DTO 클래스 구성의 전형적인 예시**이자,
**MVC 구조나 계층 설계에서 자주 사용하는 패턴**이야!
* */