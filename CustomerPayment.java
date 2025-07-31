package project;

public abstract class CustomerPayment implements Comparable<CustomerPayment>{
	
	protected String customerName;
	protected int customerld;
	protected double amount;
	
	public CustomerPayment()
	{
		this("Fname",0,0);
	}
	public CustomerPayment(String customerName,int customerld,double amount)
	{
		this.customerName=customerName;
		this.customerld=customerld;
		this.amount=amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerld() {
		return customerld;
	}
	public void setCustomerld(int customerld) {
		this.customerld = customerld;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return " customerName=" + customerName + ", customerld=" + customerld + ", amount=" + amount
				+ "]";
	}
	protected abstract double calculatePayment(); 
	
	  void printPaymentInfo() //this method prints the properties and the calculated payment 
	  {
		  System.out.println(this.toString()+" payment = "+ this.calculatePayment());
	  }
	
	public int compareTo(CustomerPayment obj) {   //Compare objects according to calculatePayment method in descending order
		if(this.calculatePayment()>obj.calculatePayment())
        return -1;
		else if (this.calculatePayment()<obj.calculatePayment())
			return 1;
		else 
			return 0 ;
    }

}
