package Inheritance;

public class Demo {

	public static void main(String[] args) {

		Shape shape=new Shape(1,3);
		Triangle triangle=new Triangle(1,2);
	   System.out.println(triangle.FindArea()); 
	   Shape dd=triangle; ///upcasting
	   Triangle s=(Triangle)dd;  //Downcasting
	   s.use();
	//   Triangle t=(Triangle)shape;
	   //t.use();
	   Shape[] shapes=new Shape[2];
	   shapes[0]=triangle;
	   shapes[1]=shape;
	   
	   for(int i=0;i<shapes.length;i++) {
		   shapes[i].FindArea();
	   }
	}

}
