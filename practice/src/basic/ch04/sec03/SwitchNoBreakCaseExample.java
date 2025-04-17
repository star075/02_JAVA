package basic.ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9; // 10, 11 인 경우
        System.out.println("[현재시간: " + time + " 시]");
        switch(time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
    // 출력:
    //    [현재시간: 9 시]
    //    회의를 합니다.
    //    업무를 봅니다.
    //    외근을 나갑니다.
}

/*
📌 switch 문에서 break가 없을 때 흐름 (fall-through 현상 (떨어져 내린다))

✅ 기본 구조
switch(변수) {
    case 값1:
        코드1;
        break;
    case 값2:
        코드2;
        break;
    ...
    default:
        기본 실행 코드;
}

✅ 이 예제에서는 break가 전혀 없으므로,
해당 case부터 아래 모든 case들이 연달아 실행됨

예: time = 9일 때
→ case 9 실행 → break 없으므로
→ case 10 실행 → break 없으므로
→ default 실행

💡 즉, break가 없으면 "해당 case 이후의 모든 코드"가 다 실행됨!
→ 이를 **fall-through**라고 함

✅ 출력 결과
[현재시간: 9 시]
회의를 합니다.
업무를 봅니다.
외근을 나갑니다.

✅ 정리
- break문이 없으면 아래로 계속 실행됨 (조건 맞는 case부터 아래 모든 코드 실행)
- break문이 있으면 조건 맞는 case 실행 후 즉시 switch문 종료
- case마다 동작이 끝나야 할 때는 반드시 break 넣어야 함!
- => break: 다음 case로 넘어가지 않게 끊어주는 장치
*/