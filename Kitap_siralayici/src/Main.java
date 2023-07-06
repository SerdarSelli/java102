import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<book> bookList = new TreeSet<>();

        bookList.add(new book("denizler altında yirmibin fersah","jul verne",250,1905));
        bookList.add(new book("saatleri ayarlama enstitüsü","bilmiyorum",350,1950));
        bookList.add(new book("kavgam","adolf hitler",660,1930));
        bookList.add(new book("das kapital","karl marks",1000,1800));
        bookList.add(new book("huckleberry finn","mark twain",450,1884));


        // kitap isim sırasına göre sıralama yapıyor
        for (book i: bookList){
            System.out.println("sayfa sayısı >"+i.getPage() + "        kitap adı > "+ i.getBookName() );
        }


        // kitap sayfa sayısına göre sıralama yapıyor
        TreeSet<book> booklist2 = new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                return o1.getPage() - o2.getPage();
            }
        });

        booklist2.addAll(bookList);
        System.out.println("#############################################################");

        for (book i: booklist2){
            System.out.println("sayfa sayısı >"+i.getPage() + "        kitap adı > "+ i.getBookName() );
        }

    }
}