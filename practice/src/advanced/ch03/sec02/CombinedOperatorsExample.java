package advanced.ch03.sec02;

public class CombinedOperatorsExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // (x > 7) → true (10 > 7)
        // (y <= 5) → true (5 <= 5)
        // true && true → true
        System.out.println((x > 7) && (y <= 5)); // 출력: true

        // (x % 3 == 2) → 10 % 3 = 1 → false
        // (y % 2 != 1) → 5 % 2 = 1 → (1 != 1) → false
        // false || false → false
        System.out.println((x % 3 == 2) || (y % 2 != 1)); // 출력: false
    }
}

/*
📌 [비교 연산자 + 논리 연산자 복합 연산식]

✅ 비교 연산자: 두 값을 비교하여 true / false 결과 반환
	• >, <, >=, <=, ==, !=

✅ 논리 연산자: 여러 조건을 연결하여 논리값 계산
	•	&& : AND → 모두 true일 때만 true
	•	|| : OR → 하나라도 true면 true
	•	!  : NOT → 반대로 뒤집음 (true → false, false → true)

✅ 예시 분석:
	•	(x > 7) && (y <= 5) → true && true → true
	•	(x % 3 == 2) || (y % 2 != 1) → false || false → false

🧠 팁:
	•	괄호를 잘 써서 우선순위와 가독성을 높이기!
	•	중첩된 조건문을 만들 때 꼭 필요한 기초 문법임
*/