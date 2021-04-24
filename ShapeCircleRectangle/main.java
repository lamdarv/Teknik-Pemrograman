package ShapeCircleRectangle;

public class main {
	
	public static void main(String[] args){
		Circle c = new Circle();
		System.out.println("Circle : "
				+ " Perimeter = " + c.getPerimeter()
				+ ", Area= " + c.getArea()
				+ "\nCatatan : " + c.toString() + "\n");
		
		Rectangle r = new Rectangle();
		System.out.println("Rectangle : "
				+ " Perimeter = " + r.getPerimeter()
				+ ", Area = " + r.getArea()
				+ "\nCatatan : " + r.toString() + "\n");
		
		Square s = new Square();
		System.out.println("Square : "
				+ " Perimeter = " + s.getPerimeter()
				+ ", Area = " + s.getArea()
				+ "\nCatatan : " + s.toString());
	}
}
