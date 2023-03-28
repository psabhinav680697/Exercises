package basics.buffer;

public class BufferClass {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer();
		a.append("ABHINAV");
		a.append(" P S");
		a.insert(0, "06 ");
		System.out.println(a);
		StringBuffer b= new StringBuffer("HELLO WORLD");
		b.replace(0, 5, "HI");
		System.out.println(b);
		b.delete(0, 3);
		System.out.println(b);
		b.reverse();
		System.out.println(b);

		
	}

}
