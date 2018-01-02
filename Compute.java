import java.util.Scanner;

class Shape
{
	double length;
	double area;
	double perimeter;
    Scanner scanner=new Scanner(System.in);
    void display()
    {
    	 System.out.println("Area is a quantity that expresses the extent of a shape");
    	 System.out.println("Perimeter is path that surrounds a shape\n");
    }
}

class Circle extends Shape
{
	Circle()
	{
		super.display();
		System.out.println("Enter radius");
		length=scanner.nextInt();
	}
	void area()
	{
		area=3.14*Math.pow(length,2);
	}
    void perimeter()
    {
		perimeter=2*3.14*length;
    }
    @Override
    void display()
    {
		System.out.println("Area=r*r="+area);
		System.out.println("Perimeter=2*pie*r="+perimeter);
    }
}

class Square extends Shape
{
	Square()
	{
		System.out.println("Enter side");
		length=scanner.nextInt();
	}
	void area()
	{
		area=Math.pow(length,2);
	}
    void perimeter()
    {
		perimeter=4*length;
    }
    @Override
    void display()
    {
		System.out.println("Area=s*s="+area);
		System.out.println("Perimeter=4*s="+perimeter);
    }
}
class Triangle extends Shape
{
	
	int b,c;
	double s;
	Triangle()
	{
		System.out.println("Enter sides");
		length=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
	}
	void area()
	{
        s=(length+b+c)/2;
		area=Math.sqrt(s*(s-length)*(s-b)*(s-c));
	}
    void perimeter()
    {
      	perimeter=length+b+c;
    }
    @Override
    void display()
    {
		System.out.println("Area=(s(s-a)*(s-b)*(s-c)^1/2="+area);
      	System.out.println("Perimeter=Sum of all sides="+perimeter);
    }
}

class Rectangle extends Shape 
{
	int breadth;
	Rectangle()
	{
		System.out.println("Enter sides");
		length=scanner.nextInt();
		breadth=scanner.nextInt();
	}
	void area() 
	{
		area=length*breadth;
	}
	void perimeter()
	{
		perimeter=2*(length+breadth);
	}
	@Override
	void display()
    {
    	    System.out.println("Area=Length*Breadth="+area);
    	    System.out.println("Perimeter=2(Length+Breadth)="+perimeter);
    }
}

 class Drawing 
{
	void caller(Shape shape)
	{
	 	if (shape instanceof Circle)
	 	{
	 		Circle circle=(Circle)shape;
	 		circle.area();
	 		circle.perimeter();
	 	}
	 	if (shape instanceof Square)
	 	{
	 		Square square=(Square)shape;
	 		square.area();
	 		square.perimeter();
	 	}
	 	if (shape instanceof Triangle)
	 	{
	 		Triangle triangle=(Triangle)shape;
	 		triangle.area();
	 		triangle.perimeter();
	 	}
	 	if (shape instanceof Rectangle)
	 	{
	 		Rectangle rectangle=(Rectangle)shape;
	 		rectangle.area();
	 		rectangle.perimeter();
	 	}
	 	shape.display();
	}

}

 public class Compute 
{
	public static void main(String[] args)
	{
      Drawing drawing=new Drawing();
      drawing.caller(new Circle());
      drawing.caller(new Square());
      drawing.caller(new Triangle());
      drawing.caller(new Rectangle());
	}

}
