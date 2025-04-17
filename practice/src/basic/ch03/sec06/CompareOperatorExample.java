package basic.ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        // 숫자 비교 (정수 == 정수)
        boolean result1 = (num1 == num2); // true
        boolean result2 = (num1 != num2); // false
        boolean result3 = (num1 <= num2); // true
        System.out.println("result1: " + result1); // result1: true
        System.out.println("result2: " + result2); // result2: false
        System.out.println("result3: " + result3); // result3: true

        // 문자 비교 (유니코드 값 비교: 'A' = 65, 'B' = 66)
        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // true (65 < 66)
        System.out.println("result4: " + result4); // result4: true

        // 정수 vs 실수 비교 → 타입 자동 변환 후 비교됨 ⭐⭐️⭐⭐️⭐
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); // false? 🙅🏻‍♀️❌ // true (자동 형변환 후 값 같음!)
        System.out.println("result5: " + result5); // result5: false❌ true🅾️

        // float vs double 비교 → 정확도 차이 때문에 다르게 나올 수 있음
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6); // false?🅾️ // false (0.1f ≠ 0.1 정확도 다름)
        boolean result7 = (num5 == (float)num6); // true (둘 다 float로 비교)
        System.out.println("result6: " + result6); // result6: false
        System.out.println("result7: " + result7); // result7: true

        // 문자열 비교: .equals() 메서드 사용
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2)); // false
        boolean result9 = (! str1.equals(str2)); // true
        System.out.println("result8: " + result8); // result8: false
        System.out.println("result9: " + result9); // result9: true
    }
}

/*
📚 [CompareOperatorExample 개념 정리]

✅ 1. 비교 연산자
	•	==, !=, <, >, <=, >= 등으로 값을 비교함
	•	결과는 모두 boolean (true / false)

✅ 2. 문자 비교
	•	문자는 내부적으로 **정수(유니코드)**로 처리됨
	•	‘A’ = 65, ‘B’ = 66 → 문자끼리도 크기 비교 가능

✅ 3. 정수 vs 실수 비교
	•	int와 double을 비교하면 자동 형변환 후 비교됨
	•	1 == 1.0 → true

✅ 4. float vs double 비교
	•	정밀도 차이 때문에 0.1f == 0.1은 false
	•	비교 전에 타입을 맞춰주면 true ((float)0.1 == 0.1f)

✅ 5. 문자열 비교
	•	==을 쓰면 주소 비교 (X)
	•	.equals() 메서드로 내용 비교해야 함
	•	!str.equals(...)로 내용 불일치 검사 가능

🧠 요약:
비교 연산자 사용 시 데이터 타입과 정밀도, 문자열 비교 방식을 반드시 고려해야 한다!
*/
