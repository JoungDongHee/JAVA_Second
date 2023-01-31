package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // for
        int max = 20; // 최대 치킨 판매수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 손님이 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+"번 손님 치킨이 나왓습니다.");
            if(i == noShow){
                System.out.println("노쇼 손님입니다.");
                continue;
            }

            sold++;

            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("==============================");
        sold = 0;
        int index = 0; // 손님 번호
        while (true){
            index++;
            System.out.println(index+"번 손님이 주문하신 치킨이 나왔습니다.");
            if(index == noShow){
                System.out.println("노쇼 손님입니다.");
                continue;
            }
            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

    }
}
