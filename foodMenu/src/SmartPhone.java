import java.util.ArrayList;

public class SmartPhone extends Phone{// phone sınıfını extend ediyor ve boş constructor tanımladık alta
    private int storage;
    private int ram;
    private int camera;




    public SmartPhone(int id, int price, String name,String phoneNumber,int storage,int ram,int camera){
        super(id, price, name, phoneNumber);
        this.storage=storage;
        this.ram=ram;
        this.camera=camera;
    }

    public SmartPhone(){//no args constructor

       //no args constructor

    }

}
