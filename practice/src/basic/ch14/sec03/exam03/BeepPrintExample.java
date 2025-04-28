package basic.ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {

        // ✅ Thread 클래스를 상속한 익명 클래스(익명 객체)
        // ✅ Thread 상속 + 익명 클래스 + run() 오버라이드 세 가지를 한 거!! ︎⭐️⭐️⭐️⭐️⭐️
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 삑 소리 출력
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // 만든 쓰레드 객체를 start()로 실행
        thread.start(); // ✅ 작업 쓰레드 시작

        // ✅ 메인 쓰레드에서 "띵" 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500); // 0.5초 대기
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
* # 🧠 Thread와 Runnable 완전 정리 (노션용)

---

## ✅ 1. run()만 호출하면 어떻게 되는지

> **run()**만 호출하면 **"새로운 쓰레드가 만들어지지 않는다"** ❗

### 📦 예시

```java
Thread thread = new Thread() {
    @Override
    public void run() {
        System.out.println("run 실행!");
    }
};

thread.run(); // ❌ 새로운 쓰레드 생성 X, 그냥 main 쓰레드에서 실행
```

✅ 이건 **그냥 메서드를 호출하는 것**이야.
**새로운 실행 흐름이 생기지 않고**,
**현재(main) 쓰레드가 run() 메서드를 바로 실행해버림**.

### 📢 진짜 새로운 쓰레드를 만들고 싶으면
```java
thread.start();
```
- `start()`를 호출해야만
- **새로운 쓰레드**가 만들어지고
- 그 쓰레드가 `run()`을 자동으로 실행함!

---

## ✅ 2. Runnable 사용 버전과 비교

### 📦 Runnable 버전

```java
Runnable task = new Runnable() {
    @Override
    public void run() {
        System.out.println("Runnable 작업 실행");
    }
};

Thread thread = new Thread(task);
thread.start();
```

- `Runnable`은 **할 일 목록(run 메서드)**만 작성.
- **Thread 객체**를 만들어서 그 안에 넣고 `.start()`로 실행.
- Runnable은 단독 실행 불가 → 항상 Thread가 필요함!

---

### 📦 Thread 상속 버전

```java
Thread thread = new Thread() {
    @Override
    public void run() {
        System.out.println("Thread 상속 작업 실행");
    }
};

thread.start();
```

- `Thread`를 **상속**받아서 `run()`을 오버라이드.
- 객체를 만들고 `.start()` 호출해서 바로 실행.

---

## ✅ 3. Thread 상속 vs Runnable 구현 비교표

| 구분 | Thread 상속 | Runnable 구현 |
|------|-------------|---------------|
| 방식 | Thread 클래스를 **상속** | Runnable 인터페이스를 **구현** |
| 다중 상속 가능성 | ❌ 다른 클래스 상속 불가 (자바는 다중 상속 X) | ✅ 다른 클래스를 자유롭게 상속 가능 |
| 코드 구조 | 상대적으로 간단 | 약간 더 코드 추가 필요 (Thread 따로 생성) |
| 유연성 | 낮음 (Thread에 종속) | 높음 (다른 일과 Thread 실행 분리 가능) |
| 실행 방법 | `new Thread() { run() }` → `.start()` | `new Thread(new Runnable() { run() })` → `.start()` |

---

## ✅ 4. 핵심 기억 포인트

| 구분 | Thread | Runnable |
|------|--------|----------|
| 타입 | 클래스 | 인터페이스 |
| 사용법 | 상속 (extends) | 구현 (implements) |
| 특징 | run() 오버라이드 | run() 구현 후 Thread에 넘겨야 실행 가능 |

---

## ✅ 최종 요약

> **Thread는 클래스라 상속(extends), Runnable은 인터페이스라 구현(implements)한다!**
> **start()를 호출해야만 진짜 새로운 쓰레드가 생성된다.**
> **run()만 호출하면 그냥 현재 쓰레드(main)에서 메서드 실행하는 것뿐이다.**
* */