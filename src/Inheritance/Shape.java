package Inheritance;

public class Shape {
 // int sides;
  int length;
  int breadth;
  Shape(int length,int breadth ){
	  this.length=length;
	  this.breadth=breadth;
  }
  
  public int FindArea() {
	  return length*breadth;
  }
  
}
class Triangle extends Shape{
	//int length;
	
	Triangle(int length,int breadth){
		super(length,breadth);
		System.out.println(length+","+breadth);
	}
	public void use() {
		
	}
     @Override   
	 public int FindArea() {
	 return super.FindArea()/2;
	 }
}