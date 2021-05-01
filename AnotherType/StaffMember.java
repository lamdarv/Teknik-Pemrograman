package AnotherType;

public abstract class StaffMember {
	//merepresentasikan staff member yang umum
	protected String name;
	protected String address;
	protected String phone;
	
	//Mengatur staff member menggunakan informasi spesifik
	public StaffMember(String eName, String eAddress, String ePhone){
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	//Mengembalikan sebuah String termasuk informasi dasar dari employee
	public String toString(){
		String result = "Name: " + name + "\n";
		
		result+= "Address: " + address + "\n";
		result+= "Phone: " + phone;
		
		return result;
	}
	
	//kelas turunan harus menentukan gaji untuk setiap jenis karyawan
	public abstract double pay();
}
