package AnotherType;

public class Commission extends Hourly {
	private double salesTotal;
	private double commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate=commissionRate;
	}
	
	public void addSales(double salesTotal){
		this.salesTotal += salesTotal;
	}
	
	public double pay(){
		double payment = super.pay()+commissionRate*salesTotal;
        salesTotal = 0;
        return payment;

	}
	
	public String toString(){
		String result = super.toString();
		result += "\nSales Total: " + salesTotal;
		return result;
	}
	
	
	

}
