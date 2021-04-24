package CircleCylinder;

public class TestCylinder {
	public static void main(String[] args){
		//Mendeklarasikan dan mengalokasikan instansi baru dari silinder
		//dengan default color, radius, height
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder:"
				+ " radius=" + c1.getRadius()
				+ " height=" + c1.getHeight()
				+ " base area=" + c1.getArea()
				+ " volume=" + c1.getVolume()
				//Task 1.3
				+ "\n catatan = " + c1.toString());
		
		// Declare and allocate a new instance of cylinder
		// specifying height, with default color and radius
		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder:"
		+ " radius=" + c2.getRadius()
		+ " height=" + c2.getHeight()
		+ " base area=" + c2.getArea()
		+ " volume=" + c2.getVolume()
		//Task 1.3
		+ "\n catatan = " + c2.toString());

		// Declare and allocate a new instance of cylinder
		// specifying radius and height, with default color
		Cylinder c3 = new Cylinder(2.0, 10.0);
		System.out.println("Cylinder:"
		+ " radius=" + c3.getRadius()
		+ " height=" + c3.getHeight()
		+ " base area=" + c3.getArea()
		+ " volume=" + c3.getVolume()
		//Task 1.3
		+ "\n catatan = " + c3.toString());
		}
	}

