import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("gün olur asra bedel","cengiz aytmatof",289,"11/07/82");
        Book book2 = new Book("bihter behlül","recaizade mahmut ekrem",55,"22/03/05");
        Book book3 = new Book("ne dion?","casdsa asda",134,"23/02/12");
        Book book4 = new Book("yedi uyurlar","dfgfdsd asa",1754,"15/08/32");
        Book book5 = new Book("dice man","mansa musa",754,"18/12/42");
        Book book6 = new Book("emile","kutadgu bilik",432,"09/011/65");
        Book book7 = new Book("peter pan","cem yılmaz",76,"19/05/45");
        Book book8 = new Book("adventures of tom sawyer","fatih terimn",567,"27/07/23");
        Book book9 = new Book("serdar bşkn","mauro emmanuel icardi rivero",22,"13/03/87");
        Book book10 = new Book("fener ağlama","wifred zaha",65,"05/02/56");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        //kitap isminin karşısına yazar ismi gelecek şekilde düzenleme
        String specifier = "%-5s %-27s %-5s %-30s%n";
        bookList.stream().forEach(i -> System.out.format(specifier, "book name: \t",i.getBookName(),"\t  writer name:\t",i.getWriterName()));

        System.out.println("#".repeat(100));

        //sayfa sayısı 100 den fazla olanları listeleme
        bookList.stream().filter(i -> i.getTotalPage() > 100).forEach(i-> System.out.format(specifier,"book name : ",i.getBookName(),"total page:",i.getTotalPage()));











    }
}