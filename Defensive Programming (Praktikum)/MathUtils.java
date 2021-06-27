package Praktikum;

//MathUtils.java

public class MathUtils {   // fungsi untuk mendapatkah faktorial dalam bilangan positif <= 16
	public static int factorial (int n){
		if(n < 0) throw new IllegalArgumentException("Negative no not allowed") ;     // throwing exception in case of 0
		if(n>16) throw new IllegalArgumentException("argument over 16 not allowed") ; // throwing exception in case of value>16
		
		int fac = 1;
		for (int i=n; i>0; i--)    // menghitung faktorial
			fac *= i;
          	return fac;
   }
}