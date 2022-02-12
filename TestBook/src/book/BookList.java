package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:01
 */
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;
    public BookList() {
        books[0] = new Book("西游记", "罗贯中", 18, "四大名著");
    }
}
