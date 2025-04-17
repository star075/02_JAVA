package basic.ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A'; // 문자 'A'의 유니코드는 정수값 65
//        int charCode = 'a'; // 'a'는 97
        // int charCode = '5'; // '5'는 53

        // 📌 '&' : 논리 AND 연산자 (양쪽 모두 참이어야 true)
        // 문자 코드가 65 이상이고 90 이하이면 → 대문자
        if( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자군요."
            );
        }
        // 📌 '&&'는 short-circuit 연산: 앞이 false면 뒤를 검사 안 함
        // 'a'(97) 이상, 'z'(122) 이하이면 → 소문자
        if( (97<=charCode) && (charCode<=122) ) {
            System.out.println("소문자군요."
            );
        }
        // '0'(48) 이상, '9'(57) 이하이면 → 숫자 문자
        if( (48<=charCode) && (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");
        }
        //------------------------------------------------------

        int value = 6;
//        int value = 7;

        // '|' : 논리 OR 연산자 → 둘 중 하나만 참이어도 true
        if( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수군요");
        }
        // '||' : short-circuit OR → 앞이 true면 뒤는 검사 안 함
        boolean result = (value%2==0) || (value%3==0);
        // '!' : NOT 연산자 → true → false, false → true
        if( !result ) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
}

/*
📚 [LogicalOperatorExample에서 배워야 할 개념 정리]

✅ 1. 문자 → 정수로 인식됨
	•	문자 리터럴 'A', 'a', '5'는 각각 정수로 변환됨 (유니코드 값)
	•	예: ‘A’ = 65, ‘a’ = 97, ‘5’ = 53

✅ 2. 논리 연산자 종류
	•	& : AND (양쪽 모두 true → true)
	•	&& : short-circuit AND (앞이 false면 뒤는 검사 안 함 → 효율적)
	•	| : OR (양쪽 중 하나만 true → true)
	•	|| : short-circuit OR (앞이 true면 뒤는 검사 안 함)
	•	! : NOT (true → false / false → true)

✅ 3. 문자 범위로 조건 분기
	•	대문자: 65(A)~90
	•	소문자: 97(a)~122
	•	숫자문자: 48~57

✅ 4. 조건문에 논리 연산자를 적용하는 실전 예제
	•	if문에서 값의 범위를 판단할 때 자주 사용됨
	•	조건에 맞게 메시지를 출력하는 연습

💡 요약:
문자는 내부적으로 정수로 처리되고,
논리 연산자를 통해 조건을 정교하게 제어할 수 있다.
*/