package chap_06;

/**
 * 개인 정보중 일부를 비공개로 전환하는 프로그램을 작성하시오
 *
 * 개인정보를 비공개로 전환하는 메소드
 * 하나의 메소드에서 모든 동적 처리
 * 각정보는 아래 위치부터 비공개 적용
 * 이름 : 2번째 글짜 (나**)
 * 주민등록 : 9번째 글자  (990130-*********)
 * 전화번호 : 10번째 글자 010-1234-5678
 */
public class _Quiz_06 {
    public static String getHiddenData(String data , int index){
        String result = data.substring(0,index);
        for (int i = 0; i < data.length()-index; i++) {
            result+="*";
        }
        return result;
    }
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-123456789";
        String phone = "010-1234-5678";
        System.out.println("이름 : " +getHiddenData(name , 1));
        System.out.println("주민등록 번호 : " +getHiddenData(id , 8));
        System.out.println("전화번호 : " +getHiddenData(phone , 9));
    }


}
