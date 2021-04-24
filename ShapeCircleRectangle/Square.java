package ShapeCircleRectangle;

public class Square extends Rectangle{
	//1st konstruktor
	public Square(){
		super();
	}
	
	//2nd konstruktor
	public Square(double s){
		super(s,s); //memanggil superclass Rectangle(d,d)
	}
	
	//3rd konstruktor
	public Square(double s, String c, boolean f){
		super(s,s,c,f);
	}
	
	//getter side (lebar=panjang)
	public double getSide(){
		return super.getWidth();
	}
	
	//setter side
	@Override
	public void setSide(double s){
		super.setWidth(s);
		super.setLength(s);
	}
	
	
	//Luas persegi
	public double getArea(){
		return getSide()*getSide();
	}
	
	
	//Keliling persegi
	public double getPerimeter(){
		return 4*getSide();
	}
	
	//Metode Override
	@Override
	public String toString(){
		return "A Square with a side= " + getSide() + ", which is subclass of " + super.toString();
	}
}
