package advanced.ch15.sec02.exam01;

import lombok.*;

@Getter // Getter 메서드 자동 생성
@Setter // Setter 메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor // 모든 필드를 초기화하는 생성자 자동 생성
@ToString // toString() 메서드 자동 생성

public class Board {
    private String subject; // 게시글 제목
    private String content; // 게시글 내용
    private String writer; // 작성자
}

/*
 * 📌 Lombok 어노테이션 설명
 *
 * @Getter         → 모든 필드의 Getter 메서드를 자동 생성
 * @Setter         → 모든 필드의 Setter 메서드를 자동 생성
 * @NoArgsConstructor → 매개변수 없는 기본 생성자 생성
 * @AllArgsConstructor → 모든 필드를 매개변수로 받는 생성자 생성
 * @ToString       → 객체를 문자열로 표현할 수 있도록 toString() 메서드 생성
 *
 * 💡 Lombok은 반복되는 코드를 줄여주고, 유지보수성을 높여줍니다.
 *    단, 프로젝트에 Lombok 라이브러리가 설정되어 있어야 합니다!
 */