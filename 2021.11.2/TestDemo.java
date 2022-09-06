public class TestDemo {
	
	public static void main(String [] args) {
		
		Person per = new Person();
		per.name = "ans";
		per.age = 10;
		System.out.println(per.name);
		System.out.println(per.age);
		//per.sleep();
		//System.out.println(per.id);
		//System.out.println(10);
	}
}

class Person {
	
	
	
	
	// public String name;
	// public int age;
    // private  int id;
	//不提供构造方法时，编译器会自动提供一个，不带参数的构造方法
	// public void Person() { //IDEA 种void好像不用带也行
		
	    // System.out.println("sleep()!!");
	// }
	//构造犯法好象可以不只一个
	
}