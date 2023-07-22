import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;

    private static int counter=1;

    public Brand(String name){
        this.id = (2*counter)-1 ;// id tek sayılar
        counter++;
        this.name = name;
    }

    //static String[] brandsStatic = new String[]{"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};

    private static Brand samsung = new Brand("Samsung");
    private static Brand Lenovo = new Brand("Lenovo");
    private static Brand Apple = new Brand("Apple");
    private static Brand Huawei = new Brand("Huawei");
    private static Brand Casper = new Brand("Casper");
    private static Brand Asus = new Brand("Asus");
    private static Brand HP = new Brand("HP");
    private static Brand Xiaomi = new Brand("Xiaomi");
    private static Brand Monster = new Brand("Monster");


    public static Brand[] brands (){
    Brand[] brandList =new Brand[]{
            samsung, Lenovo , Apple, Huawei, Casper, Asus , HP , Xiaomi, Monster
    };

return brandList;
    }

    public static Brand getIdByName(String brandName){
        for (Brand i:brands()
             ) {
            if (brandName.equals(i.getName())){

                return i;
            }
        }
        return null;
    }

    public static void listBrandByAlphabet (){
        TreeSet<Brand> brandsses = new TreeSet<>(new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        brandsses.addAll(List.of(brands()));

        for (Brand i: brandsses) {
            System.out.println("ID = "+i.getId()+"\t- \t"+i.getName());
        }

    }

    public static Brand getBrandByName(String brandName){
        for (Brand i:brands()
             ) {
            if (i.getName().equals(brandName)){
                return i;
            }
        }
        System.out.println("brand cant find");
        return null;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
