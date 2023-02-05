package chap_07;

/**
 * 생성자 : 객체가 생성될때 무조건 실행되는 함수
 */
public class _08_Constructor {
    public static void main(String[] args) {
        BalckBox b1 = new BalckBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);
        System.out.println("======================");

        BalckBox b2 = new BalckBox("하양이","UHD",30000,"화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);
    }
}
