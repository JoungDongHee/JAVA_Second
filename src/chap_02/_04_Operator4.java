package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean a = true;
        boolean b = true;
        boolean c = true;

        System.out.println(a || b || c); // 3개 중 하나라도 true 면 true
        System.out.println(a && b && c); // 3개 모두 true 면 트루
        System.out.println("=========================");
        // And 연산
        System.out.println((5>3)&&(3>1));
        System.out.println((5>3)&&(3<1));
        System.out.println("=========================");
        // OR 연산
        System.out.println((5>3)||(3>1));
        System.out.println((5>3)||(3<1));
        System.out.println((5<3)||(3<1));
        System.out.println("=========================");
        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
    }
}
