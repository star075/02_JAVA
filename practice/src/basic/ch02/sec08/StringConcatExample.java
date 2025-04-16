package basic.ch02.sec08;

public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        // 숫자끼리의 덧셈 → 10 + 2 = 12, 12 + 8 = 20
        System.out.println("result1: " + result1); // result1: 20

        String result2 = 10 + 2 + "8";
        // 왼쪽부터 계산됨 → 10 + 2 = 12 (숫자끼리 덧셈)
        // 이후 문자열 "8"을 만나면서 문자열 결합 → "12" + "8" = "128"
        System.out.println("result2: " + result2); // result2: 128

        String result3 = 10 + "2" + 8;
        // 먼저 10 + "2" → "102" (문자열 결합)
        // 이후 "102" + 8 → "1028"
        System.out.println("result3: " + result3); // result3: 1028

        String result4 = "10" + 2 + 8;
        // 먼저 "10" + 2 → "102"
        // 이후 "102" + 8 → "1028"
        System.out.println("result4: " + result4); // result4: 1028

        String result5 = "10" + (2 + 8);
        // 괄호 먼저 계산됨 → 2 + 8 = 10
        // 이후 "10" + 10 → "1010"
        System.out.println("result5: " + result5); // result5: 1010

        // 🔹 숫자끼리의 연산 → 덧셈 결과가 숫자로 계산됨
        // 🔹 숫자 + 숫자 + 문자열 → 앞의 숫자끼리 먼저 계산됨
        // 🔹 숫자 + 문자열 + 숫자 → 문자열을 만나면 이후는 모두 문자열 결합
        // 🔹 문자열 + 숫자 + 숫자 → 처음부터 문자열이기 때문에 전부 문자열 결합
        // 🔹 문자열 + (괄호 안 숫자 연산 결과) → 괄호 안 먼저 계산 후 문자열 결합
    }
}
