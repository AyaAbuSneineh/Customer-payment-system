package project;

public class Check extends CustomerPayment implements Payable{
	private int accountNumber;
	private double accountBalance;
	private int type;
     public static  final int CASHIER = 1;   //constant
	 public static final int CERTIFIED = 2;  //constant
	 public static final int PERSONAL = 3;  //constant
	
	public Check()
	{
		this("Fname",0,0,0,0,1);
	}
	public Check(String customerName,int customerld,double amount,int accountNumber,int accountBalance,int type)
	{
		super(customerName,customerld,amount);
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		this.type=type;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Cheak [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", type=" + type + ""+super.toString();
	}
	@Override
	public double calculatePayment()   // in class check payment = amount
	{
		return amount;
	}
	public void deductAmountFromBalance() { 
		if(type==PERSONAL || type==CERTIFIED) // if type=CERTIFIED and type=PERSONAL  
			this.accountBalance-=this.amount; 
	}
	@Override
	public boolean isAuthorized()
	{
		if(type==CASHIER)   //Check payment is authorized  if type = CASHIER
			return true ;
			else if (amount<=accountBalance) { //Check payment is authorized means amount<=accountBalance
				deductAmountFromBalance(); //call deductAmountFromBalance
				return true ;
			}
			else 
				return false;
	}
	
	

}
