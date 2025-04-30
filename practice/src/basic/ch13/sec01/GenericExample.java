package basic.ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // Box<String>: 제네릭 타입 T를 String으로 지정
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요."; // content는 String 타입이 됨
        String str = box1.content;
        System.out.println(str);

        // Box<Integer>: 제네릭 타입 T를 Integer로 지정
        Box<Integer> box2 = new Box<>();
        box2.content = 100; // content는 Integer 타입이 됨
        int value = box2.content;
        System.out.println(value);
    }
}

// -------------------- 개념 정리 --------------------
// 💡 제네릭(Generic): 타입을 일반화하여 코드의 재사용성과 타입 안정성을 높이는 문법
// 💡 <T>: 제네릭 타입 변수. 사용할 때 String, Integer 등으로 지정 가능
//
// ✅ 장점:
// - 타입별 클래스를 따로 만들지 않아도 됨 (유지보수 편리)
// - 컴파일 시 타입 체크 가능 → 오류 방지
// - 형변환이 필요 없음 (예: (String) obj 이런 거 안 써도 됨)
//
// ✅ 사용 방법 요약:
// - 클래스 정의: public class Box<T> { public T content; }
// - 사용 시 타입 지정: Box<String>, Box<Integer> 등