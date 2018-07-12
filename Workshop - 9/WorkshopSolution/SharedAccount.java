public class SharedAccount {

	private double balance;
	private String currency;
	
	/* *
	 * Constructor
	 * */
	SharedAccount(double balance, String currency) {
		this.balance = balance;
		this.currency = currency;
	}
	
	/* *
	 * Getters
	 * */
	public double getBalance() {
		return balance;
	}
	public String getCurrency() {
		return currency;
	}
	
	/* *
	 * Setters
	 * */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	/* *
	 * Function which is used to add balance to the account
	 * */
	public void depositBalance(double balance) {
		this.balance = this.balance + balance;
	}
	
	/* *
	 * Function which is used to minus balance from account
	 * */
	public void withdrawBalance(double balance) {
		this.balance = this.balance - balance;
	}
	
	/* *
	 * toString to display the account details
	 * */
	@Override
	public String toString() {
		return "Account -----> balance is " + getBalance() + " and Currency is " + getCurrency();
	}
}

