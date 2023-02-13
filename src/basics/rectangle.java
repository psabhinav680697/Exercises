 package basics;

public class rectangle {
	int len;
	int wid;
	void insert(int l, int w) {
		len=l;
		wid=w;
	}
	void area() {
		System.out.println("area:"+(len*wid));
	} 
}
