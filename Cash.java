package project;

public class Cash extends CustomerPayment {
	private double discountRate ; 
	
	public Cash() //constructor without arguments
	{
		this("FName",0,0,0);
	}
	public Cash(String customerName,int customerld,double amount,double discountRate) //constructor with arguments
	{
		super(customerName,customerld,amount);
		this.discountRate=discountRate;
	}
	public double getDiscount() {  
		return discountRate;
	}
	public void setDiscount(double discount) {
		this.discountRate = discount;
	}
	@Override
	public String toString() {
		return "Cash [discountRate=" + discountRate + ""+super.toString();
	}
	@Override
	public double calculatePayment()
	{
		return amount-(amount*discountRate/100);   //amount deducted = discountRate/100*amount
	} // in class cash payment= amount- amount deducted
	
	}
