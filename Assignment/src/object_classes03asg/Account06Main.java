package object_classes03asg;

import java.util.Scanner;

public class Account06Main {
	
	
	void insert(int id,int acno,float balance,Account06 a) {
		
		a.setId(id);
		a.setAcno(acno);
		a.setBalance(balance);
	}
	void dispay(Account06 a) {
		System.out.println(a.getId()+" "+a.getAcno()+" "+a.getBalance());
		
	}
	
	
	void deposite(float depo,Account06 a) {
		float bal=a.getBalance();
		bal=bal+depo;
		a.setBalance(bal);
	}
	
	void withdraw(float amount,Account06 a) {
		
		float avlbal=a.getBalance();
		
		if(avlbal>0) {
		avlbal=avlbal-amount;
		a.setBalance(avlbal);
		}
		else {
			System.out.println("Low Balance !!! Try after some time");
		}
	}
	
	void check_balance(Account06 a) {
		System.out.println("Your Account Balance is : "+a.getBalance()+"Rs.");
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account06 a=new Account06();
		
		Account06Main m=new Account06Main();
		m.insert(101, 76701811, 50000,a);
		m.dispay(a);
		
		System.out.println("Enter ammoun to deposite");
		float depo=sc.nextFloat();
		m.deposite(depo, a);
		System.out.println("\n"+depo+" amount deposited successfully...");
		m.check_balance(a);
		
		System.out.println("Enter amount to withdraw");
		float amount=sc.nextFloat();
		m.withdraw(amount, a);
		m.check_balance(a);
		


	}

}
