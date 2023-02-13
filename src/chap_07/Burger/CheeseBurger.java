package chap_07.Burger;

public class CheeseBurger extends HamBurger {

    public CheeseBurger(){
        super("치즈버거");
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("+ 치즈");
    }
}
