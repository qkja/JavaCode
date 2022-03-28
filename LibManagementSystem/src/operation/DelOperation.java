package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 17:51
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("删除书籍");
    }
}