package ShapeCircleRectangle;

public class Rectangle extends Shape{
	//Inisialisasi
	private double width;
	private double length;
	
	//1st konstruktor
	public Rectangle(){
		super();
		width = 1.0;
		length = 1.0;
	}
	
	//2nd konstruktor
	public Rectangle(double w, double l){
		super();
		width = w;
		length = l;
	}
	
	//3rd konstruktor
	public Rectangle(double w, double l, String c, boolean f){
		super(c, f);
		width = w;
		length = l;
	}
	
	//Getter Width
	public double getWidth(){
		return width;
	}
	
	//Setter Width
	public void setWidth(double w){
		this.width = w;
	}
	
	//Getter Length
	public double getLength(){
		return length;
	}
	
	//Setter Length
	public void setLength(double l){
		this.length = l;
	}
	
	//Mengembalikan luas rectangle
	//getArea
	public double getArea(){
		return width*length;
	}
	
	//Mengembalikkan keliling rectangle
	//getPerimeter
	public double getPerimeter(){
		return (2*width)+(2*length);
	}
	
	//Metode Override
	@Override
	public String toString(){
		return "A Rectangle with width= " + width + " and the length= " + length + ", which is subclass of " 
				+ super.toString();
	}
}
