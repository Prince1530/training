
public class AbstractClass {
	public static void main(String[] args) {
		GeometricalShape s1 = new Square(10);
		GeometricalShape s2 = new Rectangle(10, 20);
		s1.calculateArea();
		s2.calculateArea();
	}
}

abstract class GeometricalShape {
	abstract void draw();
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends GeometricalShape {
	void draw() {
		System.out.println("draw circle");
	}
	
	void calculateArea() {
		System.out.println("area of circle");
	}
	
	void calculatePerimeter() {
		System.out.println("perimeter of circle");
	}
}

class Square extends GeometricalShape {
	int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	void draw() {
		System.out.println("draw square");
	}
	
	void calculateArea() {
		System.out.println("area of circle ==> " + side * side);
	}
	
	void calculatePerimeter() {
		System.out.println("perimeter of circle ==> " + 4 * side);
	}
}

class Rectangle extends Square {
	int side2;

	public Rectangle(int side, int side2) {
		super(side);
		this.side2 = side2;
	}
	
	void draw() {
		System.out.println("draw rectangle");
	}
	
	void calculateArea() {
		System.out.println("area of rectangle ==> " + side * side2);
	}
	
	void calculatePerimeter() {
		System.out.println("perimeter of rectangle");
	}
}