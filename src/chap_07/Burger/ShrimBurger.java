package chap_07.Burger;

public class ShrimBurger extends HamBurger {

    public ShrimBurger(){
        super("새우버거");
    }
    @Override
    public void cook(){
        super.cook();
        System.out.println("+ 새우");
    }
}
