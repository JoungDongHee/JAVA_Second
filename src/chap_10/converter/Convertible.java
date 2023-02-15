package chap_10.converter;

// 함수형 인터페이스 일경우에만 @FunctionalInterface 사용
@FunctionalInterface
public interface Convertible {
    void convert(int USD);
}
