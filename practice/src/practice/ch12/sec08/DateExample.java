package practice.ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        System.out.println(formattedDate);
    }
}

/*
* ## ✅ 현재 날짜와 시간을 "yyyy.MM.dd HH:mm:ss" 형식으로 출력하기

---

### 📦 사용 클래스

| 클래스 | 역할 |
|--------|------|
| `LocalDateTime.now()` | 현재 날짜와 시간 가져오기 |
| `DateTimeFormatter.ofPattern()` | 원하는 포맷 정의 |
| `format()` | 날짜를 포맷 문자열로 변환 |

---

### ✅ 예시 코드

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        System.out.println(formattedDate);
    }
}
```

---

### ✅ 출력 예시

```
2025.04.23 23:15:42
```

---

💡 날짜/시간 포맷은 대소문자 주의:
- `MM` = 월, `mm` = 분
- `HH` = 24시간, `hh` = 12시간

---

✅ 이건 콘솔 로그 출력, 파일명 생성, 타임스탬프 저장 등에 아주 자주 쓰이는 패턴이야!
* */