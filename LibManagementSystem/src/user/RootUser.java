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
public class RootUser extends User{
    public RootUser(String name) {

        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new DisplayOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation()
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========管理员菜单=========");
        System.out.println("hello"+ super.name);
        System.out.println("1.打印图书");
        System.out.println("2.查找图书");
        System.out.println("3.新增图书");
        System.out.println("4.删除图书");
        System.out.println("0.退出系统");
        System.out.println("==========================");
        System.out.println("请选择 ");
        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doWork(int choice, BookList bookList) {

       iOperations[choice].work(bookList);

    }
}
