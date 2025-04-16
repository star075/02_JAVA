package basic.lecture.day0416.book;

public class Book {
    // 통상적으로 상단에는 필드, 그다음 생성자, 맨아래에 메소드를 씀

    // author, title, pageCount, coverType
    // 필드
    String author;
    String title;
    String coverType;
    int pageCount;

    // 생성자

    // 기본생성자 (매개변수가 없는 생성자)
    // 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다 (대/소문자까지)
    // -> 매개변수가 있는 생성자가 하나라도 있으면 Compiler가 자동으로 기본생성자를 만들어주지 않는다.
    // // 생성자 메소드는 반환형을 작성하지 않는다 (작성하게 되면 일반 메소드로 인식한다)
    // // *** 생성자의 이름은 Class명과 동일해야 함!!! & 반환타입 없음 ***
    // // 형태: public 클래스명() {}
    // // Book이라는 class로 객체를 만들 때 항상 동작 -> 값들을 초기화할 수 있음
    // // 생성자를 호출함과 동시에 변수를 초기화 가능
    public Book() {
        System.out.println("기본 생성자 호출함 .....");
    }

    // Constructor (매개변수 받음)
    // // 생성자를 하나라도 만들 경우 기본생성자는 만들어지지 않음
    // // 그래서 만약 기본생성자가 필요하다면 따로 만들어줘야 함!
    // 모든 필드를 매개변수로 받는 생성자
    public Book(String author, String title, String coverType, int pageCount) {
        // this. = heap 메모리에 할당된 공간의 author
        System.out.println("모든 필드를 매개변수로 받는 생성자");
        this.author = author;
        this.title = title;
        this.coverType = coverType;
        this.pageCount = pageCount;
    }

    // 매개변수를 author랑 title만 받는 생성자

    // 오버로딩
    // -> 같은 이름의 메소드나 생성자를 매개변수의 개수나 타입에 따라 여러 개 선언하는 것
    public Book(String author, String title) {
        // this() 생성자 이렇게 호출할 수 있음: 메소드 영역 최상단에 와야함
        this(author, title, "soft cover", 4);

        System.out.println("매개변수를 author랑 title만 받는 생성자");
        this.author = author;
        this.title = title;
    }

    // 메소드
    // 단축키 cmd + n

    public String getTitle() {

        System.out.println(title + " 책의 작가는 " + author + "입니다.");
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
