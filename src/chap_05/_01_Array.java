package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 같은 자료 형의 값 여러 개 를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRechel = "카메모카";
        String coffeeChandler = "라떼";
        String cofeeMonica = "카푸치노";

        System.out.println(coffeeRoss+"하나");
        System.out.println(coffeeRechel+"하나");
        System.out.println(coffeeChandler+"하나");
        System.out.println(cofeeMonica+"하나");
        System.out.println("주세요");

        //배열 선언 첫번째 방법
        //String[] coffees = new String[4];

        // 두번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카메모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        //세번째 방법
        // String[] coffess = new String[]{"아메리카노","카메모카" ,"라떼","카푸치노"};

        // 네번째 방법
        String[] coffess = {"아메리카노","카메모카" ,"라떼","카푸치노"};
        System.out.println("===========================================");

        System.out.println(coffess[0]+" 하나");
        System.out.println(coffess[1]+" 하나");
        coffess[2] = "에스프레소"; // 값 변경
        System.out.println(coffess[2]+" 하나");
        System.out.println(coffess[3]+" 하나");
        System.out.println("주세요");

        // 다른 자료형
        int[] i = new int[3];
        double[] d = new double[]{10.0,11.2,13.5};
        boolean[] b = new boolean[]{true,false};
    }
}
