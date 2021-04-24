package ShapeCircleRectangle;

public class Shape {
	//Inisialisasi 2 variabel
	private String color;
	private boolean filled;
	
	//Konstruktor tanpa arguments
	public Shape(){
		color = "green";
		filled = true;
	}
	//Konstruktor dengan argument
	public Shape(String c, boolean f){
		color = c;
		filled = f;
	}
	//setter variabel color
	public void setColor(String c){
		this.color = c;
	}
	//setter variabel filled
	public void setFilled(boolean f){
		this.filled = f;
	}
	//getter variabel color
	public String getColor(){
		return color;
	}
	//getter variabel filled
	public boolean isFilled(){
		if (filled==true){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Metode toString()
	public String toString(){
		String toString="";
		if(filled==true){
			return "A Shape with color of " +color +" and is " +toString +" filled.";
		}
		else{
			toString= "not";
			return "A Shape with color of " +color +" and is " + toString +" filled.";
		}
	}
}
