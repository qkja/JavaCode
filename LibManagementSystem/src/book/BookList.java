package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 13:23
 */
public class BookList {
    private Book[] books = null;
    private int useSize;
    public BookList() {
        books = new Book[100];

        books[0] = new Book("三国演义", "罗贯中", 100, "小说");
        books[1] = new Book("水浒传", "施耐庵", 100, "小说");
        books[2] = new Book("西游记", "吴承恩", 100, "小说");
        this.useSize = 3;

    }

    public void setBooks(int pos,Book book) {
        if(this.books.length == this.useSize) {
            //this.books = this.books.c
        }
        this.books[pos] = book;

    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }

    public BookList(int cap) {
        books = new Book[cap];
        this.useSize = cap;
    }
}
