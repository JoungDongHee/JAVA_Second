package chap_07;

import chap_07.Burger.CheeseBurger;
import chap_07.Burger.HamBurger;
import chap_07.Burger.ShrimBurger;

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBugers = new HamBurger[3];
        hamBugers[0] = new HamBurger();
        hamBugers[1] = new CheeseBurger();
        hamBugers[2] = new ShrimBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("===========================");
        for (HamBurger hamBurger : hamBugers
             ) {
            hamBurger.cook();
            System.out.println("==================");
        }
        System.out.println("메뉴 준비가 완료 되었습니다.");
    }
}
