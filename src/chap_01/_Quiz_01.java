package chap_01;

/**
 * 버스 도착 정보를 출력하는 프로그램을 작성하시오
 * 각정보는 적절한 자료형의 변수에 정의합니다.
 * 1. 버스 번호는 "1234" "상암08" 과 같은 형태
 * 2. 남은 시간은 분단위 (예 3분 5분)
 * 3. 남은 거리는 KM 단위 (예 1.5km, 0.8km)
 */


/**
 * 실행 결과
 * 상암 08번 버스
 * 약 3분 후 도착
 * 남은 거리 1.2km
 */
public class _Quiz_01 {
    public static void main(String[] args) {
        //버스 번호 1234 상암 08

        String busNo = "상암08";

        //남은 시간
        int minute = 3;

        //남은 거리
        double distance = 1.2;

        //결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 "+minute+" 분 후 도착");
        System.out.println("남은 거리"+ distance + "km");
    }

}
