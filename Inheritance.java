package first;

class shape{
	double area;
	double perimeter;
	
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
	double radius;
	
	void input(double r) {
		this.radius = r;
		
	}
	@Override
	void area() {
		  area = 3.14*radius*radius;
		//System.out.println("Area of Circle = " + area);
		
	}
	@Override
	void perimeter() {
		 perimeter = 2*3.14*radius;
		//System.out.println("Perimeter of Circle = " +perimeter);
	}
	@Override
	void display() {
		System.out.println("For Radius " +radius+ " Perimeter is " + perimeter+ " and Area is " +area);
	}
	
}
class square extends shape{
	int side;
	
	void input(int s) {
		this.side=s;
	}
	@Override
	void area() {
		area = side*side;
		
	}
	@Override
	void perimeter() {
		perimeter = 4*side;
		
	}
	@Override
	void display() {
		System.out.println("For Side "+side+ " Perimeter is "+perimeter+" and Area is "+area);
	}
}
class rectangle extends shape{
	int lenght;
	int width;
	void input(int l,int w) {
		this.lenght=l;
		this.width=w;
	}
	@Override
	void area() {
		area=lenght*width;
	}
	@Override
	void perimeter() {
		perimeter = 2*(lenght+width);
	}
	@Override
	void display() {
		System.out.println("For lenght "+lenght+" and Width "+width+" Perimeter is "+perimeter+" and Area is "+area);
	}
}
class triangle extends shape{
	int base;
	int sides[] = new int[2];
	double height;
	void input(int b,int s1) {
		this.base = b;
		this.sides[0]=s1;
		this.sides[1]=s1;
	//	this.height = h;
	}
	void height() {
		height = Math.sqrt((sides[0]*sides[0])-(0.5*base*0.5*base));
	}
	@Override
	void area() {
		area = 0.5*base*height;
	}
	@Override
	void perimeter() {
		perimeter = base+sides[0]+sides[1];
	}
	@Override
	void display() {
		System.out.println("For Sides "+base+" "+sides[0]+" "+sides[1]+ " and Height "+height+" Perimeter is "+perimeter+" and Area is "+area);
	}
	
}
class Drawing{
	void call(shape sh) {
		//sh.perimeter();
		//sh.area();
		//sh.display();
		if(sh instanceof circle) {
			circle c = (circle) sh;
			c.input(4.5);
		}
		else if(sh instanceof square) {
			square s = (square) sh;
			s.input(8);
		}
		else if (sh instanceof rectangle) {
			((rectangle)sh).input(4, 5);
		}
		else if (sh instanceof triangle) {
			((triangle)sh).input(8, 5);
			((triangle)sh).height();
		}
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
