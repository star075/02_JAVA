// 문자열을 기본형으로, 기본형을 문자열로 변환하는 코드
package advanced.ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        // 문자열 → 기본형 변환
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1); // value1: 10
        System.out.println("value2: " + value2); // value2: 3.14
        System.out.println("value3: " + value3); // value3: true

        // 기본형 → 문자열 변환
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1); // str1: 10
        System.out.println("str2: " + str2); // str2: 3.14
        System.out.println("str3: " + str3); // str3: true
    }
}

/*
📚 [기본형 <-> 문자열 변환 정리]

✅ 문자열 → 기본형
- int: Integer.parseInt("10")
- double: Double.parseDouble("3.14")
- boolean: Boolean.parseBoolean("true")

✅ 기본형 → 문자열
- String.valueOf(10) → "10"
- String.valueOf(3.14) → "3.14"
- String.valueOf(true) → "true"

🧠 주의!
- `parseInt` 등은 문자열을 숫자로 변환할 때만 사용
- 숫자가 아닌 문자열을 넣으면 오류 발생 (예: "ten" → NumberFormatException)
*/