package basics;

public class human {
	String name;
	int age;
	int height;
	String eyecolor;
	
	public human() {
		System.out.println("hello my name is"+name);
	}
	
	public void speak() {
		System.out.println("hello my name is"+name);
		System.out.println("i am "+age+"years old");
		System.out.println(eyecolor);
	}
	
	public void eat() {
		System.out.println("eating....");
	}
	
}
