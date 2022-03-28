package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 17:50
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {

        System.out.println("新增书籍");
    }
}
