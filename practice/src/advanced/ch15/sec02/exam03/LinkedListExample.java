package advanced.ch15.sec02.exam03;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Board 객체를 저장할 LinkedList 생성
        List<Board> list = new LinkedList<>();

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

        // 일반 for문으로 전체 출력
        System.out.println("\n[일반 for문 출력]");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 인덱스 2 요소 삭제
        list.remove(2);
        // 다시 인덱스 2 요소 삭제
        list.remove(2);

        // 향상된 for문으로 출력
        System.out.println("\n[향상된 for문 출력]");
        for (Board board : list) {
            System.out.println(board);
        }
    }
}

/*
 * ✅ LinkedList 관련 개념 정리
 *
 * 📌 LinkedList
 * - 노드(Node)로 연결된 자료구조 기반의 리스트 컬렉션
 * - 중간 삽입/삭제에 효율적 (ArrayList보다 유리)
 * - 순차 접근은 느릴 수 있음 (인덱스로 접근할 때 속도 느림)
 *
 * 📌 List 인터페이스 기반으로 사용
 * - List<Board> list = new LinkedList<>();
 *   → 다형성을 활용하면 ArrayList ↔ LinkedList 교체가 쉬움
 *
 * 📌 메서드 사용은 ArrayList와 동일
 * - add(), get(), size(), remove() 등 전부 동일하게 사용 가능
 *
 * 💡 차이점 정리
 * - ArrayList: 검색 빠름, 중간 삽입/삭제 느림
 * - LinkedList: 검색 느림, 중간 삽입/삭제 빠름
 */