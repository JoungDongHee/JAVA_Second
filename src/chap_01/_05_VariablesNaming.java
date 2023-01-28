package chap_01;

/**
 * 변수 명 을 정하는 규칙
 */
public class _05_VariablesNaming {
    public static void main(String[] args) {
        /**
         * 1. 저장할 값에 어울리는 이름
         * 2. 밑줄(_) , 문자(ABC) , 숫자(123) 사용가능 공백 사용 불가
         * 3. 밑줄 또는 문자로 시작 가능
         * 4. 한 단어 또는 2개 단어의 연속
         * 5. 소문자로 시작 , 각 단어의 시작 글자는 대문자(첫 단어 는 제외) -> 카멜 스타일
         * 6. 예약어는 사용 불가(public static void int double float ...)
         */

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2021-12-31"; // 생년 월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광";
        String flightNo = "KE657"; //항공 편명
        String _flightNo = "KE657"; // 밑줄 사용가능
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; // 체류시간

        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐픔을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을때)
        int i  = 0;
        String s = "";

        /**
         * 절대 변하지 않는 상수는 대문자로
         */
        final String CODE = "KR";
    }
}
