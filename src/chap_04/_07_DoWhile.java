package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체거리는 25 m
        int move = 0;
        int height = 2; // 키 2m
        while (move+height < distance){
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리:"+move);
            move+=3;
        }
        System.out.println("도착했습니다.");
        System.out.println("============반복문 #1");

        //키가 엄청나게 큰사람
        move = 0;
        height = 25;

        while (move+height < distance){
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리:"+move);
            move+=3;
        }
        System.out.println("도착했습니다.");
        System.out.println("============반복문 #2");

        // Do while 반복문
        // 무조건 한번은 실행
        do{
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리:"+move);
            move+=3;
        }while (move+height < distance);
        System.out.println("도착했습니다.");
    }
}
