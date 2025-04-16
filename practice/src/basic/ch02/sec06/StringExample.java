package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {

        // 이스케이프문
        
        String name = "홍길동";
        String job = "프로그래머";

        // \": 큰따옴표 출력
        String str = "나는 \"자바를\" 배웁니다.";
        System.out.println(str);

        // \t: 탭
        str = "번호\t이름\t직업";
        System.out.println(str);

        // \n: 줄바꿈
        str = "나는 \n자바\n를 배웁니다.";
        System.out.println(str);
    }
}
