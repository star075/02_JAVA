package basic.ch14.sec03.exam02;

import java.awt.*;

public class RunnableClass implements Runnable {
    @Override
    public void run() { // 할 일 작성
        // 스레드한테 시킬 일
        // Toolkit 도구모음 클래스
        // beep()

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리내는 도구
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 삑 소리

            try {
                Thread.sleep(500); // 0.5초 쉬기
            } catch (InterruptedException e) {
                // 예외가 발생한 위치 경로를 알려줌
                e.printStackTrace();
            }
        }
    }
}
