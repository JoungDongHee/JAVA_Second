package chap_01;

/**
 * 변수
 */
public class _03_Variables {
    public static void main(String[] args) {
        String name = "정동희";

        //정수
        int hour = 15;


        System.out.println(name+" 님, 배송이 시작되었습니다. "+hour+" 시에 방문 예정입니다.");
        System.out.println(name+" 님, 배송이 완료되었습니다.");

        //실수
        double score = 90.5;
        // 문자
        char grade = 'A';
        name = "강백호";
        System.out.println(name+"님의 평균 점수는 "+score+"점 입니다.");
        System.out.println("학점은 "+grade+" 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        //
        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        // 정수형 int 는 -21 억 ~ +21 까지 출력 가능
        // int i  = 1000000000000;

        Long l = 1000000000000L;
        l=1_000_000_000_000L;
        System.out.println(l);
    }
}
