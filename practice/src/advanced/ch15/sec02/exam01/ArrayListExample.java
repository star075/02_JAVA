package advanced.ch15.sec02.exam01;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Board 객체를 저장할 ArrayList 생성
        List<Board> list = new ArrayList<>();

        // Board 인스턴스 5개 추가
        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));
        list.add(new Board("제목4", "내용4", "작성자4"));
        list.add(new Board("제목5", "내용5", "작성자5"));

        // 저장된 요소 개수 출력
        System.out.println("총 객체 수: " + list.size());

        // 3번째(Board 인덱스 2) 요소 출력
        Board third = list.get(2);
        System.out.println("\n[3번째 게시글]");
        System.out.println(third);

        // 일반 for문으로 리스트 전체 출력
        System.out.println("\n[일반 for문 출력]");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 인덱스 2 요소 삭제
        list.remove(2);
        // 인덱스 2 요소 다시 삭제 (원래 인덱스 3이었던 것이 앞으로 당겨짐)
        list.remove(2);

        // 향상된 for문으로 리스트 전체 출력
        System.out.println("\n[향상된 for문 출력]");
        for (Board board : list) {
            System.out.println(board);
        }
    }
}

/*
 * ✅ ArrayList 관련 개념 정리
 *
 * 📌 ArrayList
 * - 순서(index)를 유지하며 객체를 저장할 수 있는 리스트형 컬렉션
 * - 배열과 달리 크기를 자동으로 늘릴 수 있음
 * - 내부적으로 배열 기반으로 동작함 (검색 빠름, 삽입/삭제는 느릴 수 있음)
 *
 * 📌 주요 메서드
 * - list.add(obj)           : 객체 추가
 * - list.get(index)        : 해당 인덱스 위치의 객체 반환
 * - list.size()            : 전체 객체 수 반환
 * - list.remove(index)     : 해당 인덱스 위치의 객체 제거
 *
 * 📌 반복문 순회 방식
 * - 일반 for문 : 인덱스를 이용하여 요소에 직접 접근
 *      for (int i = 0; i < list.size(); i++) {
 *          list.get(i)
 *      }
 *
 * - 향상된 for문 (for-each) : 모든 요소를 처음부터 끝까지 순차적으로 꺼냄
 *      for (Board b : list) {
 *          ...
 *      }
 *
 * 💡 remove(index)를 연속 두 번 하면, 한 번 삭제될 때마다 인덱스가 당겨지므로
 *     삭제 대상이 바뀌는 점에 주의!
 */