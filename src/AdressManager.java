import java.util.ArrayList;
import java.util.Scanner;

public class AdressManager {
    private int id =1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static void addAdress(User user){
        Scanner input = new Scanner(System.in);
        ArrayList<Address> addressList = user.getAdressList();
        Address insert;
        int a;


        do {
            System.out.println("Please Chose Adress Type:\n1- Home Adress\n2- Business Adress");
            a = input.nextInt();
        }while (a < 1 || a > 2);
        System.out.println("Province: ");
        String province = input.next();
        System.out.println("District: ");
        String district= input.next();
        System.out.println("Street: ");
        String street = input.next();
        System.out.println("No: ");
        int no = input.nextInt();
        if(a ==1){
            insert = new BusinessAddress(province,district,street,no);
        }else{
            insert = new HomeAddress(province,district,street,no);
        }
        addressList.add(insert);
        user.setAdressList(addressList);


    }
    static void selectAdress(User user){
        Scanner input = new Scanner(System.in);
        ArrayList<Address> addressArrayList = user.getAdressList();

        int id=1;
        for(Address a: addressArrayList){
            a.showAdressInfo(id);
            id++;
        }
        System.out.println("Please Select Related ID to Delete: ");
        int selectedId = input.nextInt();
        if(addressArrayList.size()<selectedId|| selectedId<0){
            System.out.println("Invalid ID!");
        }else{
            addressArrayList.remove(selectedId-1);
        }
        user.setAdressList(addressArrayList);




    }
}
