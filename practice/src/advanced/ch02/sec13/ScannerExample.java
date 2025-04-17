package advanced.ch02.sec13;

// Scanner: 사용자로부터 입력을 받는 클래스
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        while(true) {
            System.out.print("x값 입력 : ");
            String str1 = sc.nextLine(); // 문자열로 입력받기
//            int x = sc.nextInt(); // 정수를 입력받음
            // q 입력시 종료
            if(str1.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.println("출력 문자열: " + str1);

            System.out.print("y값 입력: ");
            String str2 = sc.nextLine();
            // q 입력시 종료
            if(str2.equals("q")) {
                System.out.println("종료");
                break;
            }
            System.out.println("출력 문자열: " + str2);

            // 문자열 → 정수로 변환하여 더하기
            int sum = Integer.parseInt(str1) + Integer.parseInt(str2);

            System.out.println("x + y: " + sum);
        }
        sc.close(); // 입력 스트림 Scanner 닫기 (자원 정리. 메모리 누수 방지)
    }
}

/*
📌 [ScannerExample 개념 정리]

✅ Scanner란?
- 사용자로부터 입력을 받을 수 있게 도와주는 자바 클래스
- `new Scanner(System.in)`으로 생성

✅ 입력 받기
- `nextLine()` : 한 줄 전체 입력 (문자열로 저장됨)
- `nextInt()` : 정수 입력 받을 때 사용

✅ 문자열을 숫자로 바꾸려면?
- `Integer.parseInt("10")` → 10 (정수)

✅ 프로그램 종료 조건
- 사용자가 'q' 또는 'Q' 입력하면 `equalsIgnoreCase("q")`로 감지해 종료

✅ while(true)
- 무한 반복. 사용자가 종료 조건 입력 시 `break`로 빠져나감
*/