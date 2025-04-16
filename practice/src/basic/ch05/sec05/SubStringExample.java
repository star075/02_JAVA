package basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        /*
        * SubString
        * - 원하는 범위만 잘라서 새로운 문자열 반환
        *
        * 인자가 1개일 때
        * - 해당 index값에서 끝까지
        *
        * 인자가 2개일 때 (시작 index, 끝 index)
        * - 시작 index부터 끝 index까지를 반환 (끝 index에 해당하는 값은 반환 X)
        * */
        String ssn = "880815-1234567";
//        String firstNum = ssn.substring(0, 6);
//        System.out.println(firstNum);
//        String secondNum = ssn.substring(7);
//        System.out.println(secondNum);

        /*
        * split
        * 문자열을 특정 구분자를 기준으로 잘라서 문자열 배열로 반환
        * */
        String[] tokens = ssn.split("-");

        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
    }
}
