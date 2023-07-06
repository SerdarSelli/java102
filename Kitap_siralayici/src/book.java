import java.util.Comparator;

public class book implements Comparable<book> {
    private String bookName;
    private String author;
    private int page;
    private int publishDate;

    public book(String bookName, String author, int page, int publishDate){
        this.bookName=bookName;
        this.author=author;
        this.page=page;
        this.publishDate=publishDate;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }



    @Override
    public int compareTo(book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
}

