package chap_04;

/** 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
 *
 * 주차요금은 시간당 4000 원
 * 경차 또는 장애인 차량은 최종요금에서 50% 할인
 */
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisablePerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000 원 곱하기

        // 3만원 초과시 일일 최대 요금으로 수정
        if(fee > 30000){
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSmallCar || withDisablePerson){
            fee/=2; // 50% 할인 적요
        }
        System.out.println("주차요금은 "+fee+" 원 입니다.");

    }
}
