package Shop;

import java.util.Date;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Service {

    public static void price(Product[] goodses){
        for (int i=0; i < goodses.length; i++){
            System.out.println(goodses[i].getName() + " - "+ goodses[i].getPrice());
        }
    }

    public static void balances(Product[] goodses){
        System.out.println("Balance of goods");
        for (int i=0; i < goodses.length; i++){
            System.out.println(goodses[i].getName() + " - "+ goodses[i].getCount());
        }
    }

    public static void lastWeekTransactions(Transaction[] transaction){
        System.out.println("Sale last 7 days");
        Date currentTime = new Date();
        currentTime = new Date();
        Long time = currentTime.getTime();
        Date lastWeek = new Date(time - (24*60*60*1000*7));
        for (int i=0; i < transaction.length; i++){
            if (transaction[i].getDate().getTime() > lastWeek.getTime()) {
                System.out.println(Transaction.printCheck(transaction[i]));
            }
        }
    }

    public static void transactionsToday(Transaction[] transaction, Date today){
        System.out.println("Sale last 7 days");
        Date currentTime = new Date();
        currentTime = new Date();
        Long time = currentTime.getTime();
        Date lastWeek = new Date(time - (24*60*60*1000*7));
        for (int i=0; i < transaction.length; i++){
            if (transaction[i].getDate().getTime() > today.getTime()) {
                System.out.println(Transaction.printCheck(transaction[i]));
            }
        }
    }

}
