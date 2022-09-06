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
public class Admin extends User{
    public Admin(String name) {
        super(name);
        this.iOperation = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),

        };
    }

    @Override
    public int menu() {
        System.out.println("===================");
        System.out.println("hello" + this.name + "欢迎使用图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("5.退出系统");
        System.out.println("===================");


        System.out.println("请选择：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;

    }
}
