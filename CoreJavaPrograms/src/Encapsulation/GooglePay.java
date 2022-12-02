package Encapsulation;

import java.util.Scanner;

public class GooglePay {
	
	void withdraw(float amount,Account acc) {
		float avlBal=acc.getBalance();
		if(avlBal>amount) {
			avlBal=avlBal-amount;
			acc.setBalance(avlBal);
		}
		else {
			System.out.println("Low Balance !!! Try after some time");
		}
		
		
	}
	
	void deposite(float depoamount,Account a) {
		float bal=a.getBalance();
		bal=bal + depoamount;
		a.setBalance(bal);
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Account a1=new Account();
		a1.setId(101);
		a1.setAccnum(25786);
		a1.setBalance(50000);
		
		GooglePay g=new GooglePay();
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		g.withdraw(amt, a1);
		
		System.out.println("\n "+amt+" Ammount Withdrawn successfully.... \n Available balance is : "+a1.getBalance());
		
		System.out.println("\n-------------------**************----------------------\n");
		
		Account ac=new Account();
		ac.setId(102);
		ac.setAccnum(2578698);
		ac.setBalance(50000);
		GooglePay gp=new GooglePay();
		System.out.println("enter amount to deposite");
		int depo=sc.nextInt();
		gp.deposite(depo, ac);
		System.out.println("\n "+depo+" Ammount deposite successfully..!!!!! \n Available balance is "+ac.getBalance());
	}
	
	
}
