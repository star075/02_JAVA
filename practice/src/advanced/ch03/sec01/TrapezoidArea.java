package advanced.ch03.sec01;

public class TrapezoidArea {
    public static void main(String[] args) {
        int topBase = 5;         // 윗변
        int bottomBase = 10;     // 밑변
        int height = 7;          // 높이

        // 사다리꼴 넓이: (윗변 + 밑변) * 높이 / 2
        double area = (topBase + bottomBase) * height / 2.0;

        // 결과는 실수형으로 출력 (나눗셈에서 2.0으로 나누기)
        System.out.println("사다리꼴의 넓이: " + area);
    }
}

/*
📌 [정수 나눗셈에 의한 실수 손실 문제]

❗ Java에서 정수 / 정수 → 결과는 정수!
→ 소수점 이하가 버려짐!

예: 105 / 2 = 52 (❌ 52.5 아님)

✅ 해결법:
	•	2를 2.0으로 써서 실수 나눗셈 유도
	•	또는 전체를 괄호로 감싸고 / 2.0을 붙이기
	•	또는 (double) 형변환 사용

👉 실수 결과를 원한다면, 꼭 실수형 연산이 되도록 유도해야 함!
*/
