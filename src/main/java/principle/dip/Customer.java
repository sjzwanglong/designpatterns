package principle.dip;

public class Customer {

    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}
