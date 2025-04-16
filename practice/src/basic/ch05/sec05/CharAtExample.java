package basic.ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        // CharAt(index)
        // 문자열의 지정한 인덱스에 해당하는 문자 하나를 반환
        // (char 타입으로 반환)
        String ssn = "0111171230123";

        char gender = ssn.charAt(5);

        System.out.println(gender);
    }
}
