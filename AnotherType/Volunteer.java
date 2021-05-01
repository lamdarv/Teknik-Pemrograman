package AnotherType;
//merepresentasikan staff member yang bekerja sebagai volunteer
public class Volunteer extends StaffMember{
	//Mengatur volunteer menggunakan informasi spesifik
	public Volunteer(String eName, String eAddress, String ePhone){
		super(eName, eAddress, ePhone);
	}
	
	//Mengembalikan pembayaran dengan nilai 0 untuk volunteer ini
	public double pay(){
		return 0.0;
	}	
}
