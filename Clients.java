package Shop;

/**
 * Created by vdohryk on 11.05.2016.
 */
public class Clients {

    private String name;
    private String phone;
    private boolean sex;
    private int age;

    Clients(String name, String phone, boolean sex, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
    }

    Clients(String name){
        this.name = name;
    }

    Clients(String name, boolean sex, int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
