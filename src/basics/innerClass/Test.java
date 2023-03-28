package basics.innerClass;

public class Test {

	public static void main(String[] args) {
		Outer obj =new Outer();
		Outer.Inner in =obj.new Inner();
		in.msg();

	}

}
