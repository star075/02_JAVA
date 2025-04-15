package basic.ch01.sec11.lecture;

public class Type {
    // class명(Type)은 꼭 대문자로!

    public static void main(String[] args) {
        /*
        * ctrl + shift + / 누르면 여러 줄 주석
        *
        * 1. 변수 선언
        * 2. 변수 초기화
        * 3. 변수 쓰기
        *
        * 선언 방법
        * 자료형 변수명;
        *
        * 자료형
        * -> 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지
        * 미리 Compiler와 약속하는 키워드
        * */

        // 정수형
        // 1byte = 8bit
        // 0000 0000
        byte bnum; // 1byte = 8bit
        short snum; // 2byte
        int inum; // 4bye // 정수의 대표 자료형
        long lnum; // 8byte

        // 실수형
        float fnum; // 4byte
        double dnum; // 8byte // 실수의 대표 자료형

        // 문자형
        char ch; // 2byte

        // 논리형
        boolean isTrue; // 1byte

        // 문자열
        // 얘는 주소값을 저장하는 거... String은 4byte
        // cpu에서 계산할 때 4byte로 해야 가장 효율적, 그래서 자꾸 4byte...
        String str;

        inum = 123;
        // = 대입연산자
        // 대입연산자의 왼편은 공간 이름. 오른쪽은 값
        // 값을 왼쪽 변수에 대입
    }
}
