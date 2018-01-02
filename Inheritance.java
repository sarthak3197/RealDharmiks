package first;

import java.util.Scanner;

class shape{
	double area;
	double perimeter;
	Scanner scan = new Scanner(System.in);
	void shapes() {
		System.out.println("shapes");
	}
	 void area() {
		 System.out.println("area is ");
		
	}
	 void perimeter() {
		 System.out.println("perimeter is ");
		
	}
	 void display() {
		 System.out.println("output");
	 }
	
}
class circle extends shape{
	double r;
	/*circle(double r) {
		this.radius = r;
	}*/
	void input() {
		System.out.println("enter Radius");
		 r = scan.nextInt();
	}
	
	@Override
	void shapes() {
		System.out.println("Circle");
	}
	@Override
	void area() {
		  area = 3.14*r*r;
		//System.out.println("Area of Circle = " + area);	
	}
	@Override
	void perimeter() {
		 perimeter = 2*3.14*r;
		//System.out.println("Perimeter of Circle = " +perimeter);
	}
	@Override
	void display() {
		System.out.println("For Radius " +r+ " Perimeter is " + perimeter+ " and Area is " +area);
	}
	
}
class square extends shape{
	int s;
	
	/*square(int s) {
		this.side=s;
	}*/
	void input() {
		System.out.println("Enter Side ");
		 s = scan.nextInt();
	}
	@Override
	void shapes() {
		System.out.println("Square");
	}
	@Override
	void area() {
		area = s*s;
		
	}
	@Override
	void perimeter() {
		perimeter = 4*s;
		
	}
	@Override
	void display() {
		System.out.println("For Side "+s+ " Perimeter is "+perimeter+" and Area is "+area);
	}
}
class rectangle extends shape{
	int l;
	int w;
	/*rectangle(int l,int w) {
		this.lenght=l;
		this.width=w;
	}*/
	void input() {
		System.out.println("Enter Lenght and Width");
	 l = scan.nextInt();
	 w = scan.nextInt();
	}
	@Override
	public void shapes() {
		System.out.println("Rectangle");
	}
	@Override
	void area() {
		area=l*w;
	}
	@Override
	void perimeter() {
		perimeter = 2*(l+w);
	}
	@Override
	void display() {
		System.out.println("For lenght "+l+" and Width "+w+" Perimeter is "+perimeter+" and Area is "+area);
	}
}
class triangle extends shape{
	int a,b,c;
	//int base;
	//int sides[] = new int[2];
	//double height;
	/*triangle(int b,int s1,int s2) {
		this.base = b;
		this.sides[0]=s1;
		this.sides[1]=s2;
	//	this.height = h;
	}*/
	void input() {
		System.out.println("Enter sides of triangle");
		 a =scan.nextInt();
		 b =scan.nextInt();
		 c = scan.nextInt();
		
	}
	//void height() {
	//	height = Math.sqrt((sides[0]*sides[0])-(0.5*base*0.5*base));
	//}
	@Override
	void shapes() {
		System.out.println("Triangle");
	}
	@Override
	void area() {
		 double s = (a + b + c) / 2;
		 area =     Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
	}
	@Override
	void perimeter() {
		perimeter = a+b+c;
	}
	@Override
	void display() {
		System.out.println("For Sides "+a+" "+b+" "+c+ " Perimeter is "+perimeter+" and Area is "+area);
	}
	
}
class Drawing{
	void call(shape sh) {
		if(sh instanceof circle) {
			circle c = (circle) sh;
			c.input();
		}
		else if(sh instanceof square) {
			square s = (square) sh;
			s.input();
		}
		else if (sh instanceof rectangle) {
			((rectangle)sh).input();
		}
		else if (sh instanceof triangle) {
			((triangle)sh).input();
			//((triangle)sh).height();
		}
		sh.shapes();
		sh.perimeter();
		sh.area();
		sh.display();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing drawing = new Drawing();
		drawing.call(new circle());
		drawing.call(new square());
		drawing.call(new rectangle());
		drawing.call(new triangle());
		
		

	}

}
