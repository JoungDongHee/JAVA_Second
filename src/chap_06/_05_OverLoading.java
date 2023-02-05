package chap_06;

public class _05_OverLoading {

    public static int getPower(int number){ // "4"
        return number * number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number , int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입이 다르거나 전달값이 다르거나 또는 갯수가 다를때
        // 같은 이름의 메소드를 여러개 생성 가능
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
    }
}
