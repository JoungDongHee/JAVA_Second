package chap_07;

public class _03_ClassVariavles {
    public static void main(String[] args) {
        BalckBox b1 = new BalckBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BalckBox b2 = new BalckBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 감지 시 자동 신고기능 개발 여부
        System.out.println("- 개발전 -");
        System.out.println(b1.modelName + "자동 신고 기능 : "+BalckBox.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능 : "+BalckBox.canAutoReport);
        
        // 기능 개발
        BalckBox.canAutoReport = true;
        System.out.println("- 개발후 -");
        System.out.println(b1.modelName + "자동 신고 기능 : "+BalckBox.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능 : "+BalckBox.canAutoReport);
        
    }
}
