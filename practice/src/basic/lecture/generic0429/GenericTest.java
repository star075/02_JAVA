package basic.lecture.generic0429;

public class GenericTest<T> {
    /*
     * 제네릭 설정은 클래스 선언부 마지막 부분에 꺽쇠(다이아몬드 연산자)를 이용해 작성
     * 관례상 대문자 사용
     * */
    private T value;
    //    private T2 value2;


    /* getter setter 구현시에도 구체적인 타입 대신 T 사용 가능 */
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}