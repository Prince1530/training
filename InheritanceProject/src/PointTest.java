
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D(10, 20);
		System.out.println("p1 ==> " + p1);
		
		// GrandFather g = new GrandFather(10);
		// Father f = new Father(20);
		// Child c = new Child(30);
		
		Point3D p2 = new Point3D(1, 2, 3);
		System.out.println("p2 ==> " + p2);

		ColoredPoint2D p3 = new ColoredPoint2D(1, 2, "red");
		System.out.println("p3 ==> " + p3);

		ColoredPoint3D p4 = new ColoredPoint3D(1, 2, 3, "red");
		System.out.println("p4 ==> " + p4);

	}
}

class Point2D {
	private int x;
	private int y;
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}

class Point3D extends Point2D {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + ", toString()=" + super.toString() + "]";
	}
}

class ColoredPoint2D extends Point2D {
	private String color;
	
	public ColoredPoint2D(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredPoint2D [color=" + color + ", toString()=" + super.toString() + "]";
	}
}

class ColoredPoint3D extends Point3D {
	private String color;
	
	public ColoredPoint3D(int x, int y, int z, String color) {
		super(x, y, z);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredPoint3D [color=" + color + ", toString()=" + super.toString() + "]";
	}
}

class GrandFather {
	GrandFather(int i) {
		System.out.println("grandfather => " + i);
	}
}

class Father extends GrandFather {
	Father(int i) {
		super(i);
		System.out.println("father => " + i);
	}
}

class Child extends Father {
	Child(int i) {
		super(i);
		System.out.println("child => " + i);
	}
}

