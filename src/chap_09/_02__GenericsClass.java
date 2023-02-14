package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02__GenericsClass {
    public static void main(String[] args) {
        // 제너릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();
        System.out.println("======================================");
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();
        System.out.println("======================================");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : "+ c3.name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : "+c4.name);

        //c4Name = (String)c3.name;
        System.out.println("======================================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : "+c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : "+c6Name);

        System.out.println("======================================");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();

        //CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox("서장훈"));
        System.out.println("======================================");
        orderCoffee("김영철");
        orderCoffee("김희철","아메리카노");
        orderCoffee(37,"라떼");
    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피준비 완료 : "+name);
    }

    public static <T,V> void orderCoffee(T name,V coffee){
        System.out.println(coffee+"준비 완료 : "+name);
    }
}

class BlackBox{

    public BlackBox(String 서장훈) {
    }
}