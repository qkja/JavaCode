package com.qkj.www;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Qkj
 * Date: 2021-12-25
 * Time: 20:14
 */

class Test{
    int a; //默认权限 -》什么修饰符都没有，叫做包访问权限
}

public class TestDemo2 {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }
}
