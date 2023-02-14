package Inheritance.Abstract;


public abstract class Shape {
	 int length;
	  int breadth;
	
	  public Shape(int length,int breadth ){
		  this.length=length;
		  this.breadth=breadth;
	  }
	 
	  public abstract void use();
	 
	  
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
	//do something	
	}
	
     @Override   
	 public int FindArea() {
	 return super.FindArea()/2;
	 }
}