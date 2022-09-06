import java.util.Arrays;


public static void main(String[] args) {
	
	
}




// class Person {
	
	// public String name = "曲康杰";
	// public int age = 18;
	// public static int size = 101;
	
	// public void eat() {
		// sleep();
		// System.out.println("eat()!");
	// }
	
	// public static void sleep() {
		
		//eat();
		// System.out.println("sleep()!");
	// }
	
	// public void show() {
		
		// System.out.println("我叫" + name + ",今年" + age + "岁了");
	// }
// }

// class Test {
	
	// int a = 10;
	// public static int count;
	// Person per = new Person();
	// System.out.println(per.name.length());
// }




//静态方法内部不能访问非静态成员
// public static void showTest() {
	
	//Test tes = new Test();
	// System.out.println(Test.count);
// }
// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// Person per = new Person();
		// per.eat();
		
		
		
		//showTest();

		// Person per = new Person();
		// Test tes = new Test();
		// System.out.println(tes.a);
		// tes.a = 20;
		// System.out.println(tes.a);
		// per.show();
		// per.name = "zhansan";
		// per.age = 20;
		// per.show();
		

        // Person per = new Person();
	    //System.out.println(per.name.length());
		
		// Person per1 = new Person();
		// Person per2 = new Person();
		// System.out.println(Person.size);
		// Person.size = 10;
		//Person.size = 10;
		// System.out.println(Person.size);
		// System.out.println(Person.size);
		// per.eat();
		// Person.sleep();
		// System.out.println(per.name);
		// System.out.println(per.age);	
		
		
		// String[] str = {"hello","bit","i am kitkit"};
		// for(String x : str) {
			
			// System.out.print(x + " ");
		// }
	// }
// }

//访问修饰限定符 public 共有的 private 私有的 
//               ptotected受保护的 
//               什么都不写  默认权限-》包访问权限

//定义一个类，原则上一个文件定义一个类
//类名采用大驼峰形式
//类的组成 
 
/*class Person {
	
	//类的组成  
	//字段 ----》 成员变量  不在方法里面是成员变量  
	
	//实例成员变量在对象里面  在堆上
	//实例成员未初始化 默认为零值 引用类型默认为null 简单类型 0
	//char --> '\u0000' 空字符    boolean  --> false
	
	public String name;
	public int age;
	public char ch;
	boolean bool;
	
	//静态成员变量 
	public static int size;//不初始化默认0
	//如何访问静态的数据成员
	
	//方法 ----》 行为
	public void eat() {
		
		System.out.println("eat()!");
	}
	
	public void sleep() {
		
		int a;
		System.out.println("sleep()!");
	}
	public static void fun() {
		
		int a;
		System.out.println("fun()!");
	}
}

//一个类可以产生多个对象
	// Person person1 = new Person();
	// Person person2 = new Person();
	// Person person3 = new Person();
	// Person person4= new Person();

public class TestDemo {
	
	public static void main(String[] args) {
		
		
		
		
		//Person.fun();
		//实例化一个对象
		//int a;
		//System.out.println(a);
		// Person per = new Person();
		// per.eat();
		// per.sleep();
		// System.out.println(Person.size);  //会报警告 
		//不属于对象属于类 存在方法区  类名.成员变量
		
		
		// per.name = "zhansan";
		// System.out.println(per.name);
		// System.out.println(per.age);
		// System.out.println(per.ch);
		// System.out.println(per.bool);
		// System.out.println(11);
	}
}*/
