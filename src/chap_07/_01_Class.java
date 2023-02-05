package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍(OOP : Object-Oriented Programming)
        // 유지 보수 용이
        // 높은 재사용성 
        
        
        //차량용 블랙 박스
        // 모델명  , 해상도 , 가격 , 색상

        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price  = 20000;
        String color = "블랙";

        // 우리가 만든 첫번째 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2  = 30000;
        String color2 = "화이트";


        // 또다른 제품을 개발
        BalckBox bbox = new BalckBox();
        // BalckBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BalckBox 클래스의 인스턴스

        BalckBox bbox2 = new BalckBox();
    }
}
