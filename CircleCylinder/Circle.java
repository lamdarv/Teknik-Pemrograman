package CircleCylinder;
/** model class Circle dengan radius dan color*/

public class Circle {
	//variable instance private, tidak bisa diakses oleh luar class ini
	private double radius;
	private String color;
	
	/** Constructors overloaded = mekanisme dimana kita dapat membuat Konstruktor 
	 * lebih dari satu dalam satu Class, tapi dengan ketentuan setiap Konstruktor 
	 * memiliki Parameter yang berbeda, bisa berbeda jumlah Parameternya ataupun 
	 * berbeda Type Data parameternya.
	 */
	
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}

	 /** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}
	 
	/**Soal No. 2 Nambahin constructor Circle(radius : double, color : string) */
	public Circle(double r, String c){
		radius = r;
		color = c;
	}
	 
	//setter Radius
	public void setRadius(double r){
		this.radius = r;
	}
	/** Returns the radius */
	public double getRadius() {
		return radius; //getter
	}
	
	/**Metode setter color */
	public void setColor(String c){
		this.color = c;
	}
	
	/**Metode getter color */
	public String getColor(){
		return color;
	}
	
	/** Returns the area of this Circle instance */ 
	public double getArea() {
		return radius*radius*Math.PI; //getter 
	}
	 
	/** Return a self-descriptive string of this instance in the form of
	Circle[radius=?,color=?] */
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]"; //getter
	}
	
}
