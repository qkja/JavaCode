package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 13:13
 */
abstract public class User {
    protected String name;
    protected IOperation[] iOperations;
    public User(String name) {
        this.name = name;
    }
    abstract public int menu ();
    abstract public void doWork(int choice, BookList bookList);
}
