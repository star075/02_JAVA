package practice.ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 0부터 시작하므로 +1
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int amPm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        String[] weeks = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String strWeek = weeks[week];

        String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + " " + strAmPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

/*
* ## ✅ Calendar 클래스를 이용한 날짜/시간 포맷 출력

---

### 📌 목표 출력

```
2024년 6월 18일
화요일 오후
0시 25분 0초
```

---

### ✅ 코드

```java
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // 0부터 시작
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int amPm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        String[] weeks = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String strWeek = weeks[week];

        String strAmPm = (amPm == Calendar.AM) ? "오전" : "오후";

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + " " + strAmPm);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
```

---

### ✅ 개념 요약

| 필드 | 의미 |
|------|------|
| `YEAR` | 연도 |
| `MONTH` | 월 (0부터 시작!) |
| `DAY_OF_WEEK` | 요일 (1 = 일요일 ~ 7 = 토요일) |
| `AM_PM` | 오전/오후 구분 |
| `HOUR` | 12시간제 시간 |
| `MINUTE`, `SECOND` | 분, 초 |

---

✅ 이건 레거시 방식이지만, 시험이나 과제에서 여전히 자주 등장해!
* */