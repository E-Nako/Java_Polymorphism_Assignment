class Shape{
	private String color;
	
	Shape(String color){
		this.color = color;
	}
	
	public double getArea() {
		return 0;
	}
	
	public String toString() {
		return "Color: " + color;
	}
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	Rectangle(String color, int length, int width){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		int result = length * width;
		return "This is a rectangle of area: " + result + " and " + super.toString();
	}
	
	
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	Triangle(String color, int base, int height){
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return 0.5 * base * height;
	}
	
	public String toString() {
		double result = 0.5 * base * height;
		return "This is a triangle of area: " + result + " and " + super.toString();
	}
	
	
}

public class Q1 {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle("Red", 3, 4);
		System.out.println(R1.getArea());
		System.out.println(R1.toString());
		
		System.out.println(" ");
		
		Triangle T1 = new Triangle("Blue", 4, 5);
		System.out.println(T1.getArea());
		System.out.println(T1.toString());

	}

}
