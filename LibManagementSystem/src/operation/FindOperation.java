package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 17:51
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("查找书籍");
    }
}