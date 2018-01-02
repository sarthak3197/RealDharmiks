package kanika;

import java.util.Scanner;

class Shape {
	double area;
	double perimeter;
	Scanner scanner = new Scanner(System.in);
	void display() {
		System.out.println("WE HAVE A DEFAULT SHAPE");
	}
}

class Circle extends Shape{
	double radius;
	
	void input() {
		System.out.println("Enter Radius");
		radius = scanner.nextDouble();
	}
	void area() {
		area = 3.1*radius*radius;
	}
	void perimeter() {
		perimeter = 2*3.14*radius;
	}
	void display() {
		System.out.println("Area is = " +area);
		System.out.println("Perimeter is = " +perimeter);
	}
}

class Square extends Shape{
	double side;
	
	void input() {
		System.out.println("Enter side");
		side = scanner.nextDouble();
	}
	void area() {
		area = side*side;
	}
	void perimeter() {
		perimeter = 4*side;
	}
	void display() {
		System.out.println("Area is = " +area);
		System.out.println("Perimeter is = " +perimeter);
	}
}

class Triangle extends Shape{
	int a,b,c;
	double s;
	void input() {
		System.out.println("Enter sides of triangles");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
	}
	void area() {
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	void perimeter() {
		perimeter = a+b+c;
	}
	void display() {
		System.out.println("Area is = " +area);
		System.out.println("Perimeter is = " +perimeter);
	}
}

class Rectangle extends Shape{
	int l,b;
	void input() {
		System.out.println("Enter length and breadth");
		l = scanner.nextInt();
		b = scanner.nextInt();
	}
	void area() {
		area = l*b;
	}
	void perimeter() {
		perimeter = 2*(l+b);
	}
	void display() {
		System.out.println("Area is = " +area);
		System.out.println("Perimeter is = " +perimeter);
	}
}

class Drawing{
	void call(Shape sh) {
		
		if(sh instanceof Circle) {
			Circle c = (Circle)sh;
			c.input();
			c.area();
			c.perimeter();
			c.display();
		}
		else if(sh instanceof Square) {
			Square s = (Square)sh;
			s.input();
			s.area();
			s.perimeter();
			s.display();
		}
		else if(sh instanceof Triangle) {
			Triangle t = (Triangle)sh;
			t.input();
			t.area();
			t.perimeter();
			t.display();
		}
		else if(sh instanceof Rectangle) {
			Rectangle r = (Rectangle)sh;
			r.input();
			r.area();
			r.perimeter();
			r.display();
		}
	}
}

	
public class ShapeArea {
	public static void main(String args[]) {
		Drawing d = new Drawing();
		d.call(new Circle());
		d.call(new Square());
		d.call(new Triangle());
		d.call(new Rectangle());
	}

}
