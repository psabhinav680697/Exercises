package basics.wrapperClass;

public class Wrapperclass {
	public static void main(String args[]) {
	int a=100;
	Integer i=Integer.valueOf(a);  //autoboxing
	Integer j=a;
	int c=j.intValue();//unboxing
	}
}
