package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增书籍");
        System.out.println("图书名字");
        String name = scanner.nextLine();
        System.out.println("作者");
        String author = scanner.nextLine();
        System.out.println("类型");
        String type = scanner.nextLine();
        System.out.println("价格");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);
        int pos = bookList.getUseSize();
        bookList.setBooks(pos,book);
        bookList.setUseSize(pos+1);
        System.out.println("新增成功");
    }
}
