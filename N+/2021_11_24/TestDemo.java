import java.util.Arrays;





class  Person {

    private String name;
    private int age = 18;

    public void sleep() {

        System.out.println("我叫" + name + ", 今年" + age + "岁了。");
    }

    public static void eat() {

        System.out.println("eat");
    }

    private void printName(String name) {

        this.name = name;
    }

    public void setName(String name) {

        printName(name);
    }


}

public class TestDemo {
	
	public static void main(String[] args) {
			
		for(int i = 0;i < args.length;i++) {
			
			System.out.print(args[i] + " ");
		}
	}
}

// public class TestDemo {

    // public static void main(String[] args) {

        // Person per = new Person();
        // per.setName("张三");
        // per.sleep();
    // }
// }






// class  Person {

    // public String name;
    // public int age;

    // public  void sleep() {

        // System.out.println("我叫" + name + ", 今年" + age + "岁了。");
    // }
	// public static void eat() {
		
		 // System.out.println("eat");
	// }

// }

// public class TestDemo {

    // public static void main(String[] args) {

        // Person per = new Person();
        // per.age = 18;
        // per.name = "张三";
        // per.sleep();
    // }
// }
















// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// int i = 0;
		// while(i < 10) {
			
			// System.out.print((i+1) + " ");
			// i++;
		// }
		// for(;;) {
			
			// System.out.println("hehe");
		// }
		// for(int i = 0;i < 10; i++) {
			
			// System.out.print((i + 1) + " ");
		// }
	// }
// }






// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// int a = 1;
		// int b = 2;
        // switch(a) {
			
			// case 1:
			
			     // System.out.println("YES");
			     //break;
				 
			// case 0:
			
			    // System.out.println("NO");
			    //break;
			
			// default :
			
			    // System.out.println("选择错误");
			    // break;
			
			
		// }		
	// }
// }

// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// int a = 10;
		// int b = 20;
		
		
		
		
		// if(10==a) {
			
			// System.out.println("hehehe");
		// } else if(10==11) {
			
			// System.out.println("hahaha");
		// } else {
			
			// System.out.println("  ");
		// }
		
	// }
// }  



















// public class TestDemo {
	
	
	// public static void main(String[] args) {
		
		// int a = 10;
		// int b = 20;
		// System.out.println(sum(a,b));
		
		// double c = 10.0;
		// double d = 20.0;
		// System.out.println(sum(c,d));
	// }
	
	// public static int sum(int x,int y) {
		
		// return x + y;
	// }
	
	// public static double sum(double x,double y) {
		
		// return x + y;
	// }
	
// }

// public class TestDemo {
	
	// public static void my_Print() {
		
		// System.out.println("Hello World");
	// }
	
	// public static void main(String[] args) {
		
		
		// my_Print();
		
	// }
//}






// public class TestDemo {
	
	// public static void main(String[] args) {
		
		
		
		// int[] arr = {};  //错误做法 已经分配了内存
		// int[] arr = null;//正确做法
		// int n = (int)null;
		// System.out.println(n);
	// }
// }

// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// int[] arr = new int[]{1,2,4,5,6,7};
		
		// String ret = Arrays.toString(arr);//以数组的形式输出
		
		// System.out.println(ret);
	// }
// }

// public class TestDemo {
	
	// public static void main(String[] args) {
		
		// int[] arr1 = {1,2,3,4,5,6};               // []内不能加数字
	    // int[] arr2 = new int[]{1，2，3，4，5，7}; // 同样[]内不能加数字
	    // int[] arr3 = new int[5];                  //数组内元素默认初始化为0
	// }
// }









/*public class TestDemo {
	
	public static void main(String[] args) {
		
		
		// int[] arr1 = {1,2,3,4,5,6};
		// int[] arr2 = new int[5];
		
		
		// int[] arr = new int[]{1,2,4,5,6,7};
		
		
		// String ret = Arrays.toString(arr);//以数组的形式输出
		
		// System.out.println(ret);
		// for(int i=0;i<arr.length;i++) {
			
			// System.out.print(arr[i] + " ");
		// }
		
		// for(int val : arr) {
			
			// System.out.print(val + " ");
		// }
		// boolean flg = false;
		// if(flg) {
			
			// System.out.println("haha");
		// }
		
		// if(true) {
			
			// System.out.println("hehe");
		// }
		// for(int i = 0;i < args.length;i++) {
			
			// System.out.print(args[i] + " ");
		// }
	}

}*/