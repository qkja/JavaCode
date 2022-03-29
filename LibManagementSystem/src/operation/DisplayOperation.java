package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 17:51
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        if(bookList == null) {
            System.out.println("空");
            return;
        }
        int sz = bookList.getUseSize();
        //System.out.println("打印书籍");
        for (int i = 0; i < sz; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
