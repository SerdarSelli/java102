import java.util.*;

public class Main extends Exception{
    public static void addInsurance(String type, AccountManager accountManager){
        Scanner input = new Scanner(System.in);
        Insurance [] ins = {new ResidencelInsurance(),new CarInsurance(),new HealthInsurance(),new TravelInsurance()};
        for(Insurance i : ins){
            System.out.println("ID: "+i.getId()+"Type: " +i.getName()+"Start Date: "+i.getStartDate()
                    +"End Date: "+i.getEndDate());
            i.calculate(i.getType());
        }
        System.out.println("Please Select ID to Buy Insurance: ");
        int insValue = input.nextInt();
        ArrayList<Insurance> insurances = accountManager.getInsurances();
        switch (insValue){
            case 1:
                insurances.add(new ResidencelInsurance());
                break;
            case 2:
                insurances.add(new CarInsurance());
                break;
            case 3:
                insurances.add(new HealthInsurance());
                break;
            case 4:
                insurances.add(new TravelInsurance());
                break;
            default:
                System.out.println("Please Select Valid ID");
                break;
        }
        accountManager.setInsurances(insurances);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        User user = new User();
        ArrayList<String> InsurancesName = new ArrayList<>();
        AccountManager accountManager = new AccountManager();
        System.out.println("Welcome ");
        System.out.println("=======================");
        System.out.println("Email Address: ");
        String email = input.next();
        System.out.println("Password: ");
        String pass = input.next();

        try {
            if(accountManager.login(email,pass)){
                System.out.println("Login Successful");
            } else{
                throw new Main();
            }

        } catch (Main e) {
            System.out.println("Error!");
        }
        if(accountManager.getStatus().equals(Account.AuthenticationStatus.Success));
        boolean log = true;
        while (log){
            System.out.println("1- Individual Insurance");
            System.out.println("2- Enterprise Insurance");
            System.out.println("3- List Your Insurances");
            System.out.println("4- Add Address");
            System.out.println("5- Delete Address");
            System.out.println("6- List Addresses");
            System.out.println("0- Log Out");
            int selectOpt = input.nextInt();
            String type;

            switch (selectOpt){
                case 1:
                    type = "Individual";
                    addInsurance(type,accountManager);
                    InsurancesName.add(type);
                    break;
                case 2:
                    type = "Enterprise";
                    addInsurance(type,accountManager);
                    InsurancesName.add(type);
                    break;
                case 3:
                    ArrayList<Insurance> buyedIns = accountManager.getInsurances();
                    System.out.println("Your Insurance(s)");
                    int id=1;
                    int i =0;
                    for(Insurance a : buyedIns){
                        System.out.println(InsurancesName.get(i)+"Insurance ID: "+id+"\nName: "+a.getName()+
                                "\nStart Date: "+a.getStartDate()+"\nEnd Date: "+a.getEndDate());
                        a.calculate(InsurancesName.get(i));
                        i++;
                    }
                    break;
                case 4:
                    AdressManager.addAdress(user);
                    break;
                case 5:
                    AdressManager.selectAdress(user);
                    break;
                case 6:
                    ArrayList<Address> addressArrayList = user.getAdressList();
                    int adr=0;
                    for(Address a: addressArrayList){
                        a.showAdressInfo(adr);
                        adr++;
                    }
                    break;
                case 0:
                    log = false;
                    System.out.println("Have A Nice Day!");
                    break;
                default:
                    System.out.println("Please Select Valid Number!");
                    break;





            }
        }
    }



}
