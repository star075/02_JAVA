/*
📌 Math.random()
	•	0.0 이상 1.0 미만의 실수 반환
	•	정수로 바꾸려면 (int)(Math.random() * 범위) + 시작값

📌 Random 클래스
	•	new Random()으로 객체 생성
	•	nextInt(n) → 0부터 n-1까지 정수 중 랜덤 선택
	•	+1 하면 1부터 시작 가능

📌 import 차이
	•	Math: java.lang 패키지 → import 안 해도 됨
	•	Random: java.util 패키지 → 반드시 import 필요
*/

/*
📌 Math.random() vs Random 차이점 정리

✅ Math.random()
- 정적 메서드 (static) → 객체 생성 없이 사용 가능
- 반환 타입: double (0.0 이상 1.0 미만)
- 단순한 무작위 실수가 필요할 때 사용
- 예: (int)(Math.random() * 6) + 1 → 1~6 중 하나

✅ new Random()
- 객체 생성 필요: Random rand = new Random();
- 다양한 메서드 제공: nextInt(), nextDouble(), nextBoolean() 등
- 범위를 명확히 제어 가능
- 예: rand.nextInt(6) + 1 → 1~6 중 하나

✅ import 차이
- Math: java.lang 패키지에 포함 → import 필요 없음
- Random: java.util 패키지 → import 필요함

🧠 결론:
- 단순한 랜덤 숫자 → Math.random()으로 충분
- 여러 타입의 랜덤값 또는 제어가 필요할 땐 → Random 클래스 사용
*/

package basic.ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {

        // 1 ~ 6 사이의 값을 랜덤
        // Math.random: 0.0 ~ 1.0 미만 난수 반환 (double)

        int num = (int)(Math.random() * 6) + 1;

        Random rand = new Random();
        // new keyword를 이용해 heap에 올려놓고 사용함
        // 0~인자로 준 값 (bound)
        // 인수(bound)로 준 값의 미만까지 랜덤으로 출력
        num = rand.nextInt(6) + 1;

        if(num == 1) {
            System.out.println("1이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2가 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4가 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5가 나왔습니다.");
        } else {
            System.out.println("6이 나왔습니다.");
        }

        // Random은 import를 하는 반면, Math는 import를 하지 않음
        // Java는 java.lang 안에 있는 패키지 값들을 다 가져옴 (enum, integer 등이 다 지정되어있음)
        // Math도 이 java.lang에 들어있는 것
        // => package java.lang 안에 있는 것들은 메모리에 다 올라가 있어서 바로바로 가져다 쓸 수 있음
    }
}

//import java.util.Random;
//
//public class IfDiceExample {
//    public static void main(String[] args) {
//        // 1 ~ 6 사이의 랜덤 정수 만들기
//        int num = (int)(Math.random() * 5) + 1;
////        Math math = new Math.Random();
//
//        // 다중 if문으로 출력
//        if (num == 1) {
//            System.out.println("1번이 나왔습니다.");
//        } else if (num == 2) {
//            System.out.println("2번이 나왔습니다.");
//        } else if (num == 3) {
//            System.out.println("3번이 나왔습니다.");
//        } else if (num == 4) {
//            System.out.println("4번이 나왔습니다.");
//        } else if (num == 5) {
//            System.out.println("5번이 나왔습니다.");
//        } else {
//            System.out.println("6번이 나왔습니다.");
//        }
//
//    }
//}
