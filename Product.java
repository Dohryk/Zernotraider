package Shop;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Product {

    private String name;
    private double count;
    private double price;
    private Category category;

    Product(String name){
        this.name = name;
        this.price = 0;
        this.count = 0;
        this.category = Category.OTHER;
    }

    Product(String name, Category category, double price){
        this.name = name;
        this.price = price;
        this.category = category;
        this.count = 0;
    }

    Product(String name, Category category, double price, double count){
        this.name = name;
        this.category = category;
        this.price = price;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public Category getCategory() {
        return category;
    }
}
