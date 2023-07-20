public class PhoneApp {

    // 5 tane smarthpho nesnesi oluşturduk
    private static SmartPhone smartPhone1 = new SmartPhone(1,100,"nokia","+90 542 235 48 77",64,1,1);
    private static SmartPhone smartPhone2 = new SmartPhone(2,200,"samsung","+80 888888",32,2,2);
    private static SmartPhone smartPhone3 = new SmartPhone(3,300,"lg","+55 24587",128,3,2);
    private static SmartPhone smartPhone4 = new SmartPhone(4,150,"ck","+84 888888",32,2,2);
    private static SmartPhone smartPhone5 = new SmartPhone(5,400,"iphone","+45 888888",32,2,3);

    //oluşturulan smartphone ları array içine attık,
    public static SmartPhone[] smartPhones()  {
        SmartPhone[] smrtphoList = new SmartPhone[]{
                smartPhone1,smartPhone2,smartPhone3,smartPhone4,smartPhone5
        };
       return smrtphoList;

    }

    // bu arraydeki telefonların fiyatlarını toplayan metodu yazdık
    public static void calculateTotalPricee(){
        double total = 0;
        for (int i = 0; i< smartPhones().length;i++){
            total += smartPhones()[i].getPrice();
        }
        System.out.println("total : "+total);
    }






}
