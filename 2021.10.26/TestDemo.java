
class Person {
	
	private String name;
	private int age;
    private int id;
	
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	
	
	
	
	// public void eat() {
		
		// System.out.println("eat()!");	
	// }
	
	// public void sleep() {
		
		// System.out.println("sleep()!");	
	// } 
	public void showHelp() {
		
		 show();
	}
	private void show() {
		
		System.out.println("我的名字是" + name +",今年" + age+"岁了,"+"id是"+id);	
	} 
	
	
}
public class TestDemo {
	
	public static void main(String[] args) {
		
		Person per = new Person();
		
		per.setAge(18);
		per.setName("qkj");
		per.showHelp();
		
		// String str = per.getName();
		// per.setName("qkj");
		//String str = per.getName();
		// System.out.println(str);	
		// per.name = "qkj";
		// per.age = 18;
		// per.id = 9204115;
		// per.show();
	}
}