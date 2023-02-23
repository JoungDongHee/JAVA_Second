package chap_13;

public class _02_OutPut {
    public static void main(String[] args) {
        System.out.println("===========정수=============");
        System.out.printf("%d%n" , 1234);
        System.out.printf("%s%n" , "나나나나");
        System.out.printf("%d %d %d %n",1,2,3);
        System.out.printf("%6d%n",1234); // 6 만큼의 공백을 생성후 출력
        System.out.printf("%06d%n",1234); // 빈 공간 만큼 0 을 채움
        System.out.printf("%6d%n",-1234);
        System.out.printf("%+6d%n",1234); // + 표현시 추가
        System.out.printf("%,15d%n",1000000000); // 3자리 마다 , 를 붙여서 표현
        System.out.printf("%-6d%n",1234); // 6자리 공간 확호후 왼쪽 정렬

        System.out.println("===========실수=============");
        System.out.printf("%f%n",Math.PI);
        System.out.printf("%.2f%n",Math.PI); // 소숫점 2자리 까지 출력
        System.out.printf("%6.2f%n",Math.PI);
        System.out.printf("%-6.2f%n",Math.PI);
        System.out.printf("%+.2f%n",Math.PI);
        System.out.printf("%06.2f%n",Math.PI);

        System.out.println("===========문자열=============");
        System.out.printf("%s%n","JAVA");
        System.out.printf("%6s%n","JAVA");
        System.out.printf("%-6s%n","JAVA");
        System.out.printf("%6.2s%n","JAVA"); //6자리 확보후 문자열 2번째 까지만 출력
        System.out.printf("%-6.2s%n","JAVA"); //6자리 확보후 문자열 2번째 까지만 출력

        System.out.println("===========응용=============");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호"+90+" "+80+" "+85.0);
        System.out.println("서태웅"+100+" "+100+" "+100.0);
        System.out.println("채치수"+95+" "+100+" "+97.5);

        System.out.println("===========응용2=============");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","서태웅",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","채치수",95,100,97.5);

        System.out.println("===========참고=============");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");

    }
}
