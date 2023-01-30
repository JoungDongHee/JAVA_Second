package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자 이스케이프 문자
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // 줄 바꿈
        System.out.println("자바가\n너무\n잼있어요");

        // \t : 탭
        // 해물 파전이 9000
        // 김치전  8000
        // 부추천 8000
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000");
        System.out.println("부추천\t\t8000");

        // \\ 역슬레이 그대로 표현
        System.out.println("C:\\Program File\\Java");

        // \" 역슬레이 그대로 표현
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \' 역슬레이 그대로 표현
        System.out.println("단비가 \'냐옹\'이라고 했어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
