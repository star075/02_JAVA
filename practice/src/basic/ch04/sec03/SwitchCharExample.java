package basic.ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}

/*
📌 switch문에서 여러 case를 하나로 묶는 방법

✅ case를 나란히 써서 같은 결과 처리 가능

예:
case 'A':
case 'a':
    → 'A' 또는 'a'가 들어오면 아래 코드 실행

✅ break 사용 이유
- 해당 case 실행 후 switch문을 종료하기 위함

✅ default
- 위의 어떤 case에도 해당하지 않을 경우 실행됨

🧠 주의!
- case를 ,(콤마) 없이 연속해서 써야 함
- case 'A', 'a': 처럼 한 줄에 쓰면 에러 발생!
*/