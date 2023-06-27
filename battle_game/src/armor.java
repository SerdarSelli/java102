public class armor {
   private String name ;
    private int id;
    private int reflectValue;
    private int price;

    public armor(String name ,
    int id,
    int reflectValue,
    int price){
       this.name =  name ;
        this.id =id;
        this.reflectValue = reflectValue;
        this.price =  price;
    }

    public static armor[] armors(){
        armor[] armorList= new armor[3];
        armorList[0] =new armor("light",1,1,15);
        armorList[1] =new armor("medium",2,3,25);
        armorList[2] =new armor("heavy",3,5,40);
        return armorList;
    }

    public static armor getArmorByID(int id){
        for (armor a : armor.armors()) {
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReflectValue() {
        return reflectValue;
    }

    public void setReflectValue(int reflectValue) {
        this.reflectValue = reflectValue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
