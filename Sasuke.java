package Naruto;

public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";

	public void printDojutsu() { //add public
		super.printDojutsu(); //add super.printDojutsu()
		System.out.println(this.Dojutsu);


	}
}