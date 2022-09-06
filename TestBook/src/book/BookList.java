package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:01
 */
public class BookList {
    protected Book[] books = new Book[100];
    protected int usedSize = 0;
    public BookList() {
        books[0] = new Book("西游记", "罗贯中", 18, "四大名著");
        usedSize = 1;
    }


    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBooks(int pos, Book book) {
       this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
