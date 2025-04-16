package basic.lecture.day0416.book;

public class Application {
    public static void main(String[] args) {
        // instance를 만듦 = class에서 쓸 수 있도록 메모리상에 올림
        // new는 heap에 공간을 만듦, myBook은 stack에, 그 주소로 heap 연결
        // Book은 우리가 만든 Type이라 생각하면 편함

        // Book의 객체 myBook을 만듦
        Book myBook = new Book();
        myBook.title = "해리포터와 마법사의 돌";
        myBook.author = "조앤 K 롤링";
        myBook.coverType = "하드커버";
        myBook.pageCount = 320;

        // 제목을 해리포터와 혼혈왕자
        Book myBook2 = new Book();
        myBook2.title = "해리포터와 혼혈왕자";
        myBook2.author = "조앤 K 롤링";
        myBook2.coverType = "소프트커버";
        myBook2.pageCount = 320;

        myBook.getTitle();
        myBook2.getTitle();

        System.out.println(myBook.toString());

        // String author, String title, String coverType, int pageCount
        // 생성자... 값들을 넣어서 초기화
        Book myBook3 = new Book("bear", "자바가 좋아요", "하드타입", 50);
        System.out.println(myBook3);

        Book myBook4 = new Book("bear2", "자바 최고");

    }
}
