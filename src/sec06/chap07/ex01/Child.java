package sec06.chap07.ex01;

// ⭐️  레코드로 작성
public record Child(
        String name, // private final이 기본으로 설정
        int birthYear,
        Gender gender
) {}