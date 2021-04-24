package CircleCylinder;

public class Cylinder extends Circle {
	private double height; 
	
	//Constructor dengan default color, radius, and height
	public Cylinder(){
		super();	//memanggil superclass tanpa arguments constructor Circle()
		height = 1.0;
	}
	
	//Constructor dengan default radius, color tapi diberikan height
	public Cylinder(double height){
		super();//memanggil superclass tanpa arguments constructor Circle()
		this.height = height;
	}
	//Constructor dengan default color, tapi diberikan radius, height
	public Cylinder(double radius, double height){
		super(radius); //memanggil superclass constructor Circle(r)
		this.height = height;
	}
	
	//A public method untuk mengembalikan height
	public double getHeight(){
		return height;
	}
	
	//A public method untuk menghitung volume dari cylinder
	//menggunakan metode superclass getArea() untuk mendapatkan base area
	public double getVolume(){
		return super.getArea()*height; //diubah dari getArea() menjadi super.getArea()
	}
	
	@Override
	public double getArea(){
		//Luas permukaan = (2phi * r * h) + (2 * Luas Alas)
		return 2*Math.PI*getRadius()*height + 2*super.getArea();
	}
	
	@Override
	public String toString(){
		return "Cylinder: subclass of " + super.toString() //menggunakan Circle's toString
			+ " height=" + height;
	}
}
