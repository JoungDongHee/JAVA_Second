package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25; // 전체거리는 25 m
        int move = 0;
        while (move<distance){ // 현제 이동 거리가 전체거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : "+move);
            move+=3;
        }
        System.out.println("도착 하였습니다.");

        // 무한 루프
        move = 0;
        while (move<distance){ // 현제 이동 거리가 전체거리보다 작다는 조건이 참인 동안 반복수행
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : "+move);
        }
        System.out.println("도착 하였습니다.");
    }
}
