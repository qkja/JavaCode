package main;
import book.BookList;
import user.OrdinaryUser;
import user.RootUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-03-28
 * Time: 18:00
 */
public class Main {
    public static User longin() {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        System.out.println("=========图书管理系统=========");
        System.out.println("请输入你的姓名: ");
        name = scanner.nextLine();
        System.out.println("你好" + name + "!!!");
        System.out.println("请输入你的权限 1-》管理员 0-》学生");
        int choice  = scanner.nextInt();
        //scanner.close();
        if(1 == choice) {
            return new RootUser(name);
        } else {
            return new OrdinaryUser(name);
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        User user = longin();
        while (true) {

            int choice = user.menu();
            user.doWork(choice, bookList);
        }
    }
}
