package jlan.test.jlan;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
	    int num2 = 20;

//	    swap(num1, num2);
	    swapWrap(num1, num2);

	    System.out.println("num1 = " + num1);
	    System.out.println("num2 = " + num2);
	    
	    
	    Student s1 = new Student("小张");
		Student s2 = new Student("小李");
		swap(s1, s2);
		System.out.println("s1:" + s1.getName());
		System.out.println("s2:" + s2.getName());
	}
	
	public static void swap(int a, int b) {
	    int temp = a;
	    a = b;
	    b = temp;

	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	}
	
	public static void swapWrap(Integer a, Integer b) {
		Integer temp = a;
	    a = b;
	    b = temp;

	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	}
	
	public static void swap(Student x, Student y) {
		Student temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x.getName());
		System.out.println("y:" + y.getName());
	}
}

class Student{
	private String name;
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
