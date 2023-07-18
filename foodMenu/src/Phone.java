public class Phone extends Product{// phone sınıfı product sınıfını extend ediyor
private String phoneNumber;

    public Phone(int id, int price, String name,String phoneNumber){
        super(id, price, name);
        this.phoneNumber=phoneNumber;
    }
    public Phone(){//no args constructor
        //no args constructor
    }
}
