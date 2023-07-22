import java.util.*;

public class Store {
    private ArrayList<Product> cellPhonesList =new ArrayList<>();
    private ArrayList<Product> notebooksList =new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    public Store(){
        CellPhone apple = new CellPhone("11 Pro",950,0,50,"Apple",72,5.7,6,2800,"grey");
        CellPhone hp = new CellPhone("12 ghia",1250,0,20,"HP",64,5.2,4,3300,"black");
        CellPhone samsung = new CellPhone("13 basic",1350,0,30,"Samsung",32,5.8,5,3000,"blue");
cellPhonesList.addAll(List.of(new CellPhone[]{apple,hp,samsung}));

        Notebook Matebook = new Notebook("matebook",4500,0,88,"Huawei",55,20,128);
        Notebook V14Igl = new Notebook("tulpar",5500,0,12,"Monster",456,22,24);
        Notebook TufGaming = new Notebook("sevimli hayalet",6390,0,100,"Casper",378,16,55);
        notebooksList.addAll(List.of(new Notebook[]{Matebook,V14Igl,TufGaming}));
        menu();
    }

    public void menu(){
        System.out.println("---------- Welcome to the Patika Store ----------");
        System.out.println("1 - Notebooks \n" +
                "2 - Cellphones \n" +
                "3 - Brands \n" +
                "4 - Filters by Brand \n"+
                "0 - Exit \n " +
                "Please Choose");
int menuNo=scanner.nextInt();

switch (menuNo){
    case 1:
//notebook
        subProduct(notebooksList);
        break;
    case 2:
        //cellphone
        subProduct(cellPhonesList);
        break;
    case 3:
        //brands
        Brand.listBrandByAlphabet();
        break;
    case 4:
        //filter product by brands name
        filterByBrand();

        break;
    case 0:
        System.out.println("See you");
        break;
}
    }

    public void subProduct(ArrayList<Product> cellOrNotebook){//
        System.out.println("1 - List the Products \n" +
                "2 - Add the Product \n" +
                "3 - Remove the Product \n" +
                "4 - Sort List \n" +
                "0 - Back ");
int menuNo = scanner.nextInt();

        switch (menuNo){
            case 1:
                //list product
                listProduct(cellOrNotebook);
                break;
            case 2:
                //addproduct
                addProduct(cellOrNotebook);
                break;
            case 3:
                //remove product
                listProduct(cellOrNotebook);
                deleteProd(cellOrNotebook);
                menu();
                break;
            case 4:
                //sort list
                sortByChoice(cellOrNotebook);
                break;
            case 0:
                menu();
                break;
        }
    }

    public void listProduct(ArrayList<Product> products){
        System.out.println("|\t ID \t|\t      Ürün Adı            \t|\t   Fiyat      \t|\t  Marka       \t|\t  Depolama   \t|\t  Ekran    \t|\t    Ram     \t|");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (Product i:products){
            System.out.println("| "+i.getId() +"\t  |   \t"+i.getBrandName()+"\t  \t"+i.getProductName()+"\t        |    \t"+i.getPrice()+"\t TL   |   \t"
                    +i.getBrandName()+"\t       |   \t"+i.getStorage()+"\t      | \t"+i.getScreenSizeInch()+"\t      | \t"+i.getRam() +"\t    |\t");
        }
    }

    public void addProduct(ArrayList<Product> cellOrNotebook){
        //String productName, double price, double discountRate, int stock, String brandName, int storage, double screenSizeInch, int ram

        System.out.println("enter product name");
        String productName = scanner.nextLine();
        scanner.nextLine();

        System.out.println("enter price");
        double price = scanner.nextInt();

        System.out.println("enter discount rate");
        double discountRate = scanner.nextInt();

        System.out.println("enter stock ");
        int stock=scanner.nextInt();
scanner.nextLine();
        System.out.println("enter brand name");
        String brandname = scanner.nextLine();

        System.out.println("enter storage capacity");
        int storage= scanner.nextInt();

        System.out.println("enter screen size (inch)");
        double screenSizeInch= scanner.nextDouble();

        System.out.println("enter ram");
        int ram= scanner.nextInt();

//        System.out.println("enter battery capacity (mah)");
//        int battery = scanner.nextInt();
//scanner.nextLine();
//        System.out.println("enter color");
//        String color = scanner.nextLine();

        if (cellOrNotebook.get(0) instanceof Notebook){
            cellOrNotebook.add( new Notebook(productName,price,discountRate,stock,brandname,storage,screenSizeInch,ram) );
            System.out.println("product added");
        } else if (cellOrNotebook.get(0) instanceof CellPhone) {
            System.out.println("enter battery capacity (mah)");
            int battery = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter color");
            String color = scanner.nextLine();

            cellOrNotebook.add( new CellPhone(productName,price,discountRate,stock,brandname,storage,screenSizeInch,ram,battery,color) );
            System.out.println("product added");
        }
        subProduct(cellOrNotebook);
    }

    public void filterByBrand(){
        Brand.listBrandByAlphabet();
        System.out.println("enter id no for filtering brands");
        int id=scanner.nextInt();
        for (Product i:cellPhonesList) {

            if (i.getBrandd().getId()==id){
                System.out.println("|\t ID \t|\t      Product Name            \t|\t   Price      \t|\t  Brand       \t|\t  Storage   \t|\t  Screen Size (inch)    \t|\t    Ram     \t|");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("| "+i.getId() +"\t  |   \t"+i.getBrandName()+"\t  \t"+i.getProductName()+"\t        |    \t"+i.getPrice()+"\t TL   |   \t"
                        +i.getBrandName()+"\t       |   \t"+i.getStorage()+"\t      | \t"+i.getScreenSizeInch()+"\t      | \t"+i.getRam());
            }
        }
        for (Product i:notebooksList) {
            if (i.getBrandd().getId()==id){
                System.out.println("|\t ID \t|\t      Product Name            \t|\t   Price      \t|\t  Brand       \t|\t  Storage   \t|\t  Screen Size (inch)    \t|\t    Ram     \t|");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("| "+i.getId() +"\t  |   \t"+i.getBrandName()+"\t  \t"+i.getProductName()+"\t        |    \t"+i.getPrice()+"\t TL   |   \t"
                        +i.getBrandName()+"\t       |   \t"+i.getStorage()+"\t      | \t"+i.getScreenSizeInch()+"\t      | \t"+i.getRam() +"\t    |\t");
            }
        }
    }
    public ArrayList<Product> sortByChoice(ArrayList<Product> cellOrNotebook){
        //az-za  price low high
        System.out.println("1- A-z\n" +
                "2-  z-a\n" +
                "3- low - high\n" +
                "4- high low");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                cellOrNotebook.sort(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return  o1.getProductName().compareTo(o2.getProductName());
                    }
                });
                listProduct(cellOrNotebook);
                break;
            case 2:
                cellOrNotebook.sort(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getProductName().compareTo(o1.getProductName());
                    }
                });
                listProduct(cellOrNotebook);
                break;
            case 3:
                cellOrNotebook.sort(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return (int) (o1.getPrice() - o2.getPrice());
                    }
                });
                listProduct(cellOrNotebook);
                break;
            case 4:
                cellOrNotebook.sort(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return (int) (o2.getPrice() - o1.getPrice());
                    }

                });
                listProduct(cellOrNotebook);
                break;
            default:
                return null;
        }

        return null;
    }

    public void deleteProd(ArrayList<Product> cellOrNotebook){
        System.out.println("enter product id");
        int productId=scanner.nextInt();
        for (Product i:cellOrNotebook) {
            if (i.getId()==productId){
                cellOrNotebook.remove(i);
                break;//bu break benim 2 saatimi aldı
            }else {
                System.out.println("id no cant found! please try again");
            }
        }
    }

//son braket
}
