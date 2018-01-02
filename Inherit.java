import java.util.Scanner;

class Shape {
	float length;
	double area;
	double perimeter;
	 void display() {
		System.out.println("Over ridden according to the child class");
	}
}
   class Circle extends Shape{
	   Circle(){
		   length = 0;	   
	   }
	  Circle(float radius){
		  this();
		  length = radius;
   }
	  void CalcPerimeter() {
		  perimeter = 2*3.14*length;
	  }
	  void CalcArea() {
		  area = 2*3.14*Math.pow(length, 2);
	  }
	  void display() {
		  System.out.println("The radius of the circle is " +length );
		  System.out.println("The perimeter of the circle is "+perimeter);
		  System.out.println("The area of the circle is  "+area);
	  }
}
   class Triangle extends Shape{
	   int side2;
	   int side3;
	   double s;
	   Triangle(){
		   length = 0;
		   side2 = 0;
		   side3 = 0;
	   }
	   Triangle(float side1, int side2, int side3){
		   this();
		   length = side1;
		   this.side2 = side2;
		   this.side3 = side3;
		   
	   }
	   void CaltPerimeter() {
			  perimeter = length + side2 + side3 ;
		  }
		  void CaltArea() {
			 s = (length + side2 + side3)/2;
			 area = Math.sqrt(s*(s-length)*(s-side2)*(s-side3));
		  }	
		  @Override
		  void display() {
			  System.out.println("The sides of the triangle are " +length +", " +side2 +"and " +side3);
			  System.out.println("The perimeter of the traingle is "+perimeter);
			  System.out.println("The area of the triangle is  "+area);
		  }
   }

   class Square extends Shape{
	   Square(){
		   length = 0;
		  }
	   Square(int side){
		   this();
		   length = side;
	   }
	   void CalsPerimeter() {
			  perimeter = 4*length;
		  }
		  void CalsArea() {
			  area = Math.pow(length, 2);
		  }
		  @Override
		 void display() {
			  System.out.println("The sides of the sqaure are " +length);
			  System.out.println("The perimeter of the square  is "+perimeter);
			  System.out.println("The area of the square is  "+area);
		  }	  
   }
   
   class Rectangle extends Shape{
	   int breadth;
	   Rectangle(){
		   length = 0;
		   breadth = 0;
	   }
	   Rectangle(int length, int breadth){
		   this.length = length;
		   this.breadth = breadth;
	   }
	   void CalrPerimeter() {
			  perimeter = 2*(length+breadth);
		  }
		  void CalrArea() {
			  area = length * breadth;
		  }
		  @Override
		  void display() {
			  System.out.println("The length and the breadth of the rectangle are " +length +"and " +breadth);
			  System.out.println("The perimeter of the rectangle  is "+perimeter);
			  System.out.println("The area of the rectangle is  "+area);
		  }	
   }
   
   class Drawing{
	   void caller( Shape shape) {
		   if( shape instanceof Circle) {
			   ((Circle) shape).CalcPerimeter();
			   ((Circle) shape).CalcArea();
		   }
		   
		   else if(shape instanceof Triangle) {
			   ((Triangle) shape).CaltPerimeter();
			   ((Triangle) shape).CaltArea();
		   }
		   
		   else if(shape instanceof Square) {
			   ((Square) shape).CalsPerimeter();
			   ((Square) shape).CalsArea();
		   }
		   
		   else if(shape instanceof Rectangle) {
			   ((Rectangle) shape).CalrPerimeter();
			   ((Rectangle) shape).CalrArea();
		   }
		   shape.display();
	   }

  public class Inherit {
	  
	   public static void main(String[] args) {
		Drawing drawing = new Drawing();
		   Scanner scanner = new Scanner(System.in);
		   int r;
		   System.out.println("Enter the radius of the circle");
		   r = scanner.nextInt();
		   drawing.caller(new Circle(r));
		   
		   int s1,s2,s3;
		   System.out.println("Enter the sides of the triangle");
		   s1 = scanner.nextInt();
		   s2 = scanner.nextInt();
		   s3 = scanner.nextInt();
		   drawing.caller(new Triangle(s1,s2,s3));
		   
		   int sq1;
		   System.out.println("Enter the side of the square");
		   sq1 = scanner.nextInt();
		   drawing.caller(new Square(sq1));
		   
		   int l,b;
		   System.out.println("Enter the length and breadth of the rectangle");
		   l = scanner.nextInt();
		   b = scanner.nextInt();
		   drawing.caller(new Rectangle(l,b));
		   
		   scanner.close();
	     }
	  }
