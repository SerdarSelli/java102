public class CellPhone extends Product{
private int batteryMah;
private String color;

    public CellPhone(String productName, double price, double discountRate, int stock, String brandName, int storage, double screenSizeInch, int ram,int batteryMah,String color) {
        super(productName, price, discountRate, stock, brandName, storage, screenSizeInch, ram);
        this.batteryMah=batteryMah;
        this.color=color;
    }

    public int getBatteryMah(){
        return this.batteryMah;
    }

    public void setBatteryMah(int batteryMah){
        this.batteryMah=batteryMah;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
