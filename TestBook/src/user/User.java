package user;

import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:28
 */
public abstract class User {

    protected String name;
    protected IOperation[] iOperation;
    public User(String name) {

        this.name = name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList,int choice) {
        this.iOperation[choice].work(bookList);
    }
}


