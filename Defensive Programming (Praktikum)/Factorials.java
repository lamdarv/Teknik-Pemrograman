package Praktikum;

//Factorials.java
import java.util.Scanner;

public class Factorials{
	public static void main(String[] args){
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		while (keepGoing.equals("y") || keepGoing.equals("Y")){
			System.out.print("Enter an integer: ");
			//untuk menghandel exception
			try {         
				int val = scan.nextInt();       
				System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));    
			} catch (IllegalArgumentException ex) {            
				System.err.println(ex);
			}       
			
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
	  }
   }
}