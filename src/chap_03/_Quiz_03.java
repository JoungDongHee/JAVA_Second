package chap_03;

/**
 * 주민 등록 번호에서 생년월일 및 성별 까지만 출력하는 프로그램 작성
 *
 * 주민 등록 번호는 13 자리의 숫자로 구성
 * 앞 6자리는 생년월일 정보 뒷 7가지중 첫번째 숫자는 성별 정도
 * 입력 데이터는 - 을 포함한 14자리의 문자열 형태
 *
 * 901231-1234567 -> 901231-1
 * 030708-4567890 -> 030708-4
 */
public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 0 위치 부터 - 위치 부터 +2 를 하여 자름

        String id2 = "030708-4567890";
        System.out.println(id2.substring(0,8));
    }
}
