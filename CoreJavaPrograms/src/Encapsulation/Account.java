package Encapsulation;

public class Account {
	
	private int id;
	private int  accnum;
	private float balance;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setAccnum(int accnum) {
		this.accnum=accnum;
	}
	public int getAccnum() {
		return accnum;
	}
	
	public void setBalance(float balance) {
		this.balance=balance;
	}
	public float getBalance() {
		return balance;
	}
	

}
