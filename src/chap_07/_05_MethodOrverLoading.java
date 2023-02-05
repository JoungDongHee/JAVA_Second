package chap_07;

public class _05_MethodOrverLoading {
    public static void main(String[] args) {
        BalckBox b1 = new BalckBox();
        b1.modelName = "까망이";

        b1.record(false,false,10);
        System.out.println("============================");
        b1.record(true,false,3);
        System.out.println("============================");
        b1.record(true,true,5);
        System.out.println("============================");
        b1.record();
    }
}
