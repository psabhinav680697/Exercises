package Inheritance.Interface;

public interface Shape {
		
//public void Use() {
//	                                            cannot do this.
//}
	public int FindArea();
}
interface color{
	
}

class Triangle implements Shape,color{

	int length;
	int breadth;
	
	Triangle(int length ,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public int FindArea() {
		// TODO Auto-generated method stub
		return length*breadth/2;
	}
	
}