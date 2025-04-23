package basic.ch07.sec04.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        // ✅ Parent 타입에 정의된 필드와 메서드는 정상 사용 가능
        parent.field1 = "data1"; // 부모 field1: data 1
        parent.method1(); // 부모 Parent-method1()
        parent.method2(); // 부모 Parent-method2()

        // ❌ 오류: field2는 Parent에 정의되어 있지 않음
        // parent.field2 = "data2";

        // ❌ 오류: method3()도 Parent에는 없음
        // parent.method3();

        // ✅ 해결 방법: 자식 타입으로 다운캐스팅
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.field2 = "data2";   // 자식 필드 사용 가능
            child.method3();          // 자식 메서드 호출 가능
        }

        // ✅ 위의 if문과는 별개로 형변환 후 다시 사용 가능
        Child child = (Child) parent;

        child.field2 = "data2";      // 자식 필드 사용
        child.method3();             // 자식 메서드 실행
    }
}
