package ShapeCircleRectangle;

public class Circle extends Shape {
	//Inisialisasi
	private double radius;
	
	//1st konstruktor
	public Circle(){
		super();
		radius = 1.0;
	}
	
	//2nd konstruktor
	public Circle(double r){
		super();
		radius = r;
	}
	
	//3rd konstruktor
	public Circle(double r, String color, boolean filled){
		super(color, filled);
		radius = r;
	}
	
	//Getter Radius
	public double getRadius(){
		return radius;
	}
	
	//Setter Radius
	public void setRadius(double r){
		this.radius = r;
	}
	
	//Mengembalikan Luas Lingkaran
	//L = phi*r*r
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//Mengembalikan Keliling Lingkaran
	//K = 2*phi*r
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	@Override
	//Metode override
	public String toString(){
		return "A Circle with radius = " + radius + ", which is subclass of " + super.toString();
	}
}
