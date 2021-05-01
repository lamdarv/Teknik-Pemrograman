package AnotherType;

//mewakili seorang karyawan yang dibayar per jam
public class Hourly extends Employee {
	private int hoursWorked;
	
	//mengatur hourly employee dengan informasi spesifik
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}
	
	//Tambahkan Jumlah jam yang ditentukan ke jam akumulasi karyawan ini
	public void addHours(int moreHours){
		hoursWorked += moreHours;
	}
	
	//Menghitung dan mengembalikan gaji untuk karyawan perjam
	public double pay(){
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	
	//Mengembalikan informasi tentang karyawan perjam sebagai string
	public String toString(){
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	}
}
