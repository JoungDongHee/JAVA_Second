package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BalckBox b1 = new BalckBox();
        b1.modelName = "까망이";
        b1.price = 20000;
        b1.color = "블랙";

        //할인 행사
        b1.price = -5000;
        System.out.println("가격 :" + b1.price+" 원");
        //고객 문의
        System.out.println("해상도 "+b1.resolution);

        System.out.println("================================");


        BalckBox b2 = new BalckBox();
        b2.setModelName("하양이");
        b2.setPrice(-50000);
        b2.setColor("화이트");

        System.out.println("가격 :" + b2.price+" 원");
        //고객 문의
        System.out.println("해상도 "+b2.getResolution());

    }
}
