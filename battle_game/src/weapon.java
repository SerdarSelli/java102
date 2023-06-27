public class weapon {
   private String name;
    private int id;
    private int damage;
    private int price;

    public weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static weapon[] weapons(){
        weapon[] weaponList=new weapon[3];
        weaponList[0]= new weapon("pistol", 1,2,15);
        weaponList[1]= new weapon("sword", 2, 3,35);
        weaponList[2]= new weapon("rifle",3,7,45);
        return weaponList;
    }

    public static weapon getWeaponByID(int id){
        for (weapon w : weapon.weapons()) {
    if (w.getId() == id){
        return w;
    }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
