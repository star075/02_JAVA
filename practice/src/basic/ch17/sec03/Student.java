package basic.ch17.sec03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// Lombok을 사용해서 작성
@Getter // getName(), getScore() 자동 생성됨
@AllArgsConstructor // 모든 필드를 초기화하는 생성자 자동 생성됨 -> new Student("홍길동", 10) 가능
@ToString // System.out.println(student) 시 자동으로 "Student(name=홍길동, score=10)" 형태로 출력됨
public class Student {
    private String name;
    private int score;

    // 아래 코드는 Lombok 덕분에 생략 가능
    // 생성자
//    public Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
    // getter 메서드
//    public String getName() { return name; }
//    public int getScore() { return score; }

}