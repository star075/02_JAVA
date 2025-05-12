package advanced.ch17.sec06.exam01;

public class Student {
    private String name; // 학생 이름
    private int score; // 학생 점수

    // 생성자: 이름과 점수를 받아서 초기화
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    // 이름 & 점수 반환 메서드
    public String getName() { return name; }
    public int getScore() { return score; }
}
