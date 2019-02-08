package exceptionproj;


public class saving  {

	int accountno;
	private float balance;
	String branch;
	private int pin;
	String status;
	
	static final float interest = 2.25f;
	
	public saving() {
		// TODO Auto-generated constructor stub
	}
	
	
	public float getBalance() {
		return balance;
	}
	
	public boolean ispinvalid(int pin) {
		if(this.pin == pin){
			return true;
		}
		return false;
	}
	/**
	 * @param accountno
	 * @param balance
	 * @param branch
	 * @param pin
	 * @param status
	 */
	public saving(int accountno, float balance, String branch, int pin, String status) {
		super();
		this.accountno = accountno;
		this.balance = balance;
		this.branch = branch;
		this.pin = pin;
		this.status = status;
	}


	public void deposit(int depositamount) 
	{
		if(depositamount > 0) {
			balance = balance+depositamount;
			
		}else {
			System.err.println("invalis deposit");
		}	
	}
	
	public void withdraw(int withdraw)  {
		
		if(withdraw <=balance) {
			balance = balance - withdraw;
			System.out.println(balance);
		}else {
			System.err.println("invalid withdrawl");
		}
	
	}
	
	public void withdraw(int withdraw, int pin) {
		
		if(ispinvalid(pin)) {
			if(withdraw <=40000) {
				
				withdraw(withdraw); 
			}else {
				System.err.println("Withdrawal limit exceeded");
			}
		}else {
			System.err.println("invalid pin");
		}
	}

	@Override
	public String toString() {
		return "saving [accountno=" + accountno + ", balance=" + balance + ", branch=" + branch + ", pin=" + pin
				+ ", status=" + status +  "]";
	}
	
	
}
