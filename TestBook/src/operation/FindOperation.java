package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:12
 */
public class FindOperation implements  IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
    }
}
