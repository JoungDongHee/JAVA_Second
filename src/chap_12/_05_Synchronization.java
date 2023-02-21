package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleanner1 = () -> {
            System.out.println("--직원 1 청소 시작--");
            for (int i = 1; i < 10; i++) {
                //
                room.clean("직원 1");
            }
            System.out.println("--직원1 청소 끝--");
        };

        Runnable cleanner2 = ()->{
            System.out.println("--직원 2 청소 시작--");
            for (int i = 1; i < 10; i++) {
                //
                room.clean("직원 2");
            }
            System.out.println("--직원2 청소 끝--");
        };

        Thread thread1 = new Thread(cleanner1);
        Thread thread2 = new Thread(cleanner2);
        thread1.start();
        thread2.start();
    }
}
