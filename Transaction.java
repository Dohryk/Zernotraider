package Shop;

import java.util.Date;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Transaction {

    private Clients client;
    private Product product;
    private double count;
    private double summ;
    private Date date;

    Transaction(Clients client, Product product, Double count){

        this.client = client;
        this.product = product;
        this.count = count;
        this.summ = product.getPrice() * count;
    }

    Transaction(Clients client, Product product, Double count, Date date){
        this.date = date;
        this.client = client;
        this.product = product;
        this.count = count;
        this.summ = product.getPrice() * count;
    }

    public static String printCheck(Transaction transaction){
        return "|client: " + transaction.client.getName() + "| product: " + transaction.product.getName() + "| count: " + transaction.count + "| summ: " + transaction.summ;
    }

    public Date getDate() {
        return date;
    }
}
