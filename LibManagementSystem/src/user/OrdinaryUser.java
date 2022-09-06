package user;

import book.BookList;
import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 17:59
 */
public class OrdinaryUser extends User{
    public OrdinaryUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new DisplayOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========图书管理系统=========");
        System.out.println("hello "+ super.name+"欢迎来到这里");

        System.out.println("1.打印图书");
        System.out.println("2.查找图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("0.退出系统");
        System.out.println("============================");
        System.out.println("请选择 ");
        int choice = scanner.nextInt();
        return choice;
    }
    public void doWork(int choice, BookList bookList) {

        iOperations[choice].work(bookList);
    }
}
