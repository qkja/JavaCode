package operation;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:12
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("打印图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
        System.out.println("打印成功");
    }
}
