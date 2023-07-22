import java.util.Scanner;

public abstract class Product {

    private String productName;
    private int id;//çift sayılar
    private double price;
    private double discountRate;
    private int stock;
    private String brandName;
    private int storage;
    private double screenSizeInch;
    private int ram;
    private Brand brandd;

    private static int counter = 1;
    Scanner scanner = new Scanner(System.in);

    public Product(String productName, double price, double discountRate, int stock, String brandName, int storage, double screenSizeInch, int ram){
        this.productName = productName;
        this.id=counter*2; counter++;//idler benzersiz otomatik çift sayı
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brandName=setBrandName(brandName);//burası Brand sınıfıyla bağlantılı
        this.storage=storage;
        this.screenSizeInch=screenSizeInch;
        this.ram=ram;
        this.brandd =Brand.getBrandByName(brandName);
    }

    public Brand getBrandd() {
        return brandd;
    }

    public void setBrandd(Brand brandd) {
        this.brandd = brandd;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String setBrandName(String brandName) {

        while (Brand.getIdByName(brandName)==null){
            System.out.println("this brand have not been added to Patika Store! Please chose brand name in the list below");
            Brand.listBrandByAlphabet();
            System.out.println("write brand name");
            brandName = scanner.nextLine();
        }
       return this.brandName = brandName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSizeInch() {
        return screenSizeInch;
    }

    public void setScreenSizeInch(double screenSizeInch) {
        this.screenSizeInch = screenSizeInch;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
