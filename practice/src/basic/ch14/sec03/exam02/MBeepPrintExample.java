package basic.ch14.sec03.exam02;

// Toolkit 사용을 위해 import
import java.awt.*;

public class MBeepPrintExample {
    public static void main(String[] args) {

        // 🔔 시스템 소리 출력을 위한 Toolkit 객체 생성
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // ✅ 작업 1: Runnable 인터페이스 익명 클래스 구현
        // - 이 작업은 새로운 작업 쓰레드에서 실행됨
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    // 0.5초 간격으로 삑 소리 5번 출력
                    for (int i = 0; i < 5; i++) {
//                        toolkit.beep(); // 삑!
                        System.out.println("삑");
                        Thread.sleep(500); // 0.5초 대기 (현재 쓰레드 멈춤)
                    }
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
        };

        // ✅ 작업 쓰레드 생성 및 시작
        Thread thread = new Thread(task); // Runnable 구현체 넘김
        thread.start(); // 쓰레드 시작 → 내부적으로 run() 실행됨

        // ✅ 작업 2: 메인 쓰레드에서 "띵" 출력
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("띵"); // ✅ 작업 2: 메인 쓰레드에서 "띵" 출력
                Thread.sleep(500); // 0.5초 대기 (main 쓰레드 멈춤)
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
* ## 📘 개념 요약

### 🧩 Runnable이란?
- 쓰레드가 **어떤 일을 할지 정의하는 인터페이스**
- 메서드는 딱 하나 → `run()`
- `new Runnable() { ... }` 형태로 익명 클래스 구현 가능

---

### 🧵 Thread란?
- 자바에서 코드를 실행하는 **흐름**
- `Thread thread = new Thread(runnable)` → 작업 쓰레드 생성
- `thread.start()` → 쓰레드 시작, 내부적으로 `run()` 실행됨

---

### 💤 Thread.sleep(ms)
- 현재 실행 중인 쓰레드를 **일정 시간 멈춤**
- `Thread.sleep(500)` → 0.5초 대기
- 반복문에서 사용하면 **간격을 두고 작업 수행** 가능

---

### 🧠 메인 쓰레드 vs 작업 쓰레드

| 쓰레드 | 정의 | 이 코드에서 역할 |
|--------|------|------------------|
| 메인 쓰레드 | `main()` 안에서 실행되는 기본 흐름 | "띵" 출력 |
| 작업 쓰레드 | `Runnable`을 구현해 새로 만든 흐름 | "삑!" 소리 출력 |

---

### 💡 익명 클래스란?
- 이름 없는 클래스
- `new 인터페이스() { ... }` 형태로 **즉석에서 구현**
- 한 번만 쓰는 클래스에 적합

---

### ✅ 최종 요약
- 이 코드는 **두 개의 쓰레드를 동시에 실행**시킴
  - 작업 쓰레드: `Runnable` 구현 → "삑!"
  - 메인 쓰레드: `main()` 안에서 → "띵"
- 두 쓰레드는 각각 0.5초 간격으로 작업을 반복함
- `Thread.sleep()`을 통해 간격을 조절함
* */
