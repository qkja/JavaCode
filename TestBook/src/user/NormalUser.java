package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2022-02-12
 * Time: 23:29
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.iOperation = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new RemoveOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("===================");
        System.out.println("hello" + this.name + "欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.退出系统");
        System.out.println("===================");

        System.out.println("请选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;

    }
}
