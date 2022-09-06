package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:10
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();

        System.out.println("请输入图书的类型");
        String type  = scanner.next();
        Book book = new Book(name, author, price, type);
        int pos = bookList.getUsedSize();
        bookList.setBooks(pos,book);
        bookList.setUsedSize(pos+1);
        System.out.println("新增成功");
    }
}
