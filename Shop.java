package Shop;

import java.util.Date;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Shop {
    Clients clients[] = new Clients[5];
    Product goodses[] = new Product[5];
    Transaction transactions[] = new Transaction[10];

    public Shop(){
        initialize();
    }

    private void initialize(){
        clients[0] = new Clients("Volkov Denis");
        clients[1] = new Clients("Shevchenko Andrey");
        clients[2] = new Clients("Rebrov Sergey");
        clients[3] = new Clients("Blokhin Oleg");
        clients[4] = new Clients("Fomenko Mikhail");

        goodses[0] = new Product("Corn", Category.CORN, 2030.00, 50.0);
        goodses[1] = new Product("Rape", Category.RAPE, 3740.50, 170.0);
        goodses[2] = new Product("Barley", Category.BARLEY, 2650.50, 20.0);
        goodses[3] = new Product("Wheat", Category.WHEAT, 1900.00, 350.16);
        goodses[4] = new Product("Sunflower", Category.SUNFLOWER, 890.00, 500.10);

        Date currentTime = new Date();
        currentTime = new Date();
        Long time = currentTime.getTime();

        transactions[0] = new Transaction(clients[0],goodses[0],10.0, new Date(time-(24 * 60 * 60 * 1000 * 20)));
        transactions[1] = new Transaction(clients[0],goodses[4],100.0, new Date(time-(24 * 60 * 60 * 1000 * 10)));
        transactions[2] = new Transaction(clients[1],goodses[1],100.7, new Date(time-(24 * 60 * 60 * 1000 * 13)));
        transactions[3] = new Transaction(clients[1],goodses[1],105.0, new Date(time-(24 * 60 * 60 * 1000 * 1)));
        transactions[4] = new Transaction(clients[1],goodses[2],170.0, new Date(time-(24 * 60 * 60 * 1000 * 2)));
        transactions[5] = new Transaction(clients[2],goodses[3],1.0, new Date(time-(24 * 60 * 60 * 1000 * 6)));
        transactions[6] = new Transaction(clients[3],goodses[0],2.0, new Date(time-(24 * 60 * 60 * 1000 * 5)));
        transactions[7] = new Transaction(clients[3],goodses[1],10.0, new Date(time-(24 * 60 * 60 * 1000 )));
        transactions[8] = new Transaction(clients[4],goodses[4],10.0, new Date(time-(24 * 60 * 60 * 1000 * 3)));
        transactions[9] = new Transaction(clients[4],goodses[3],10.0, new Date(time-(24 * 60 * 60 * 1000 * 9)));
    }
}
