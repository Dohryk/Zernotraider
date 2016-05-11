package Shop;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Demo {

    public static void main(String args[]){

        Shop shop = new Shop();
        //Service.balances(shop.goodses);
        //Service.price(shop.goodses);
        Service.lastWeekTransactions(shop.transactions);

    }

}
