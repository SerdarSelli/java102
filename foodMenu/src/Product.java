import java.security.PublicKey;

public class Product {// product ata sınıfını yazdık diğer sınıflar bu sınıfı extend edecek
    private int id;
    private int price;
    private String name;

    public Product(int id, int price, String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }
    public Product(){//no args constructor
        //no args constructor
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
