package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 Wrapper 클래스
        // int double float char

        Integer i = 123; // int i = 123
        Double d = 1.0; // double = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("==================");
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 인트로 변환
        System.out.println(c.charValue());

        System.out.println("==================");
        String s = i.toString(); // 문자열 형태의 123
        System.out.println(s);
    }
}
