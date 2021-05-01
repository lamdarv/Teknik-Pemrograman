package AnotherType;

//merepresentasikan gaji umum dari EMployee
public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	//Mengatur employee dengan informasi spesifik
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		super(eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	//Mengembalikan informasi tentang employee sebagai string
	public String toString(){
		String result = super.toString();
		result += "\nSocial Securituy Number: " + socialSecurityNumber;
		return result;
	}
	
	//Mengembalikan payRate employee
	public double pay(){
		return payRate;
	}
}
