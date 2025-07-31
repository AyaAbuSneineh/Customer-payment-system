package project;
import java.util.Date;
public  class CreditCard extends CustomerPayment implements Payable {
	private double chargingFee;
	private Date expiryDate;
	
	public CreditCard()
	{
		this("Fname",0,0,0,new Date());
	}
	public CreditCard(String customerName,int customerld,double amount,double chargingFee,Date expiryDate)
	{
		super(customerName,customerld,amount);
		this.chargingFee=chargingFee;
		this.expiryDate=expiryDate;
	}
	public double getChargingFee() {
		return chargingFee;
	}
	public void setChargingFee(double chargingFee) {
		this.chargingFee = chargingFee;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [chargingFee=" + chargingFee + ", expiryDate= " + expiryDate + "" +super.toString();
	}
	@Override
	public double calculatePayment()  // in class CreditCard payment = amount + chargingFee
	{
		return amount+this.chargingFee;
	}
	@Override
	public boolean isAuthorized()
	{
			if(this.expiryDate.compareTo(new Date())== 0 || this.expiryDate.compareTo(new Date())==1)
			return true;
			//CreditCard payment is authorized if expiryDate==current date or expiryDate>current date
		else
			return false;
	}

}
