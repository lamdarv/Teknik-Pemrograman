package AnotherType;

//Merepresentasikan seseorang(executive staff member) yang bisa memperoleh bonus
public class Executive extends Employee {
	private double bonus;
	
	//Mengatur executive dengan informasi spesifik
	public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		bonus = 0; //belum diberikan bonus
	}
	
	//Bonus untuk executive
	public void awardBonus(double execBonus){
		bonus = execBonus;
	}
	
	/*menghitung dan mengembalikan gaji eksekutif, yang merupakan 
	 * pembayaran karyawan reguler ditambah bonus satu kali
	 */
	public double pay(){
		double payment = super.pay() + bonus;
		
		bonus = 0;
		
		return payment;
	}
}
