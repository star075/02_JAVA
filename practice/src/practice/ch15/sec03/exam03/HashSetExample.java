package practice.ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("[Iterator] " + element);
        }

        // 향상된 for문으로 순회하며 각 요소를 출력
        for (String element : set) {
            System.out.println("[For-each] " + element);
        }
    }
}
