package advanced.ch14.exam;

// ⭐⭐⭐⭐⭐️
public class MovieThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new MovieThread(); // MovieThread(자기 자신 클래스로) 객체 생성
        thread.start(); // start() 호출로 run() 실행
    }
}

/*
* ## 🧠 MovieThread 클래스 구조 이해

---

### ✨ 구조 설명

- MovieThread는 Thread를 상속한 자식 클래스
- run() 메서드 → 쓰레드가 실행할 작업 정의
- main() 메서드 → 프로그램 시작용 특별 메서드
- main() 안에서 MovieThread 객체를 생성하고 start() 호출 가능

---

### ✨ 핵심 흐름

1. run() → 쓰레드가 실행할 코드
2. main() → 프로그램 시작용, 여기서 new MovieThread().start()
3. start() 호출 → 새로운 쓰레드가 생성되고 run() 자동 실행

---

### ✅ 요약

> Thread를 상속한 클래스 안에서도
> main() 메서드를 만들어
> 자기 자신 클래스를 new로 생성해서 start()할 수 있다!
* */