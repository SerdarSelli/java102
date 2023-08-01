import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String bookName;
    private String writerName;
    private int totalPage;
    private Date publishDate;

    //private SimpleDateFormat publishDatee = new SimpleDateFormat("dd/MM/yy");
public Book(String bookName, String writerName,int totalPage,String stringPublishDate){
    this.bookName=bookName;
    this.writerName=writerName;
    this.totalPage=totalPage;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
    try {
        this.publishDate = dateFormat.parse(stringPublishDate);
    }catch (Exception e){
        System.out.println(e.getMessage());
    e.printStackTrace();
    }
}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
