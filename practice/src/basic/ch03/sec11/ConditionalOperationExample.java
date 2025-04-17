package basic.ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        // 📌 삼항 연산자 (조건 ? 참일 때 값 : 거짓일 때 값)
        // 첫 번째 조건: score > 90 → false
        // 두 번째 조건: score > 80 → true → 결과는 'B'
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다."); // 출력: 85점은 B등급입니다.
    }
}

/*
📌 [ConditionalOperationExample 핵심 개념]

✅ 1. 삼항 연산자
	•	형태: 조건 ? 참일 때 값 : 거짓일 때 값
	•	중첩도 가능: 조건 ? 값1 : (조건2 ? 값2 : 값3)

✅ 2. char 자료형
	•	내부적으로 **정수값(유니코드)**으로 저장됨
	•	문자 비교, 계산 가능

✅ 3. boolean 자료형
	•	true / false 두 값만 가짐
	•	정수로 자동 변환 불가 (Java만의 특징)
*/