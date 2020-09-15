package labProjectDay2_Eshan;

import java.util.Scanner;

class Account {
	protected String memberName;
	protected String accountNo;
	protected double balance;
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	void withdraw(double wd) {
	}
}

class SavingsAcc extends Account{
	public SavingsAcc(String name, String accountNo, double deposit, double ml) {
		this.memberName = name;
		this.accountNo = accountNo;
		this.balance = deposit;
		this.maxWithdraw = ml;
	}
	public void withdraw(double amt) {
		if(balance-amt<500) {
			System.out.println("Min balance should be 500");
		}
		else if(amt>maxWithdraw) {
			System.out.println("Withdraw limit more than maxlimit");
		}
		else {
			double temp = balance;
			balance = balance - amt;
			System.out.println("Amount withdrawn!");
			System.out.println("Prev balance: "+temp);
			System.out.println("Current balance: "+ balance);
		}
	}
	public double getBalance() {
		return balance;
	}
	private int interest = 5;
	private double maxWithdraw;
}

class CurrentAcc extends Account{
	private double tradeLicenseNumber;
	public CurrentAcc(String name, String accountNo, double deposit, int tln) {
		this.memberName = name;
		this.accountNo = accountNo;
		this.balance = deposit;
		this.tradeLicenseNumber = tln;
	}
	public void withdraw(double amt) {
		if(balance-amt<0) {
			System.out.println("Balance insufficient!");
		}
		else {
			balance-=amt;
			System.out.println("Amount withdrawn!");
		}
	}
	public double getBalance() {
		return balance;
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		Account acc = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Account formation : Enter 1 for savings account, 2 for current account:");
		int choice = scan.nextInt();
		System.out.println("Enter customer name & deposit money:");
		String name = scan.next();
		double deposit = scan.nextDouble();
		String accountNo = 10000 + (int)(Math.random()*89999)+"";
		if(choice==1) {
			//savings
			System.out.println("Enter max limit");
			double ml = scan.nextInt();
			acc = new SavingsAcc(name,accountNo,deposit,ml);
		}
		else {
			//current
			System.out.println("Enter trade license no:");
			int tln = scan.nextInt();
			acc = new CurrentAcc(name,accountNo,deposit,tln);
		}
		System.out.println("Enter 1 for deposit, 2 for withdrawal, 3 for balance, 0 for exit");
		int resp = scan.nextInt();
		while(resp!=0) {
			if(resp==1) {
				System.out.println("Enter the amount to deposit");
				double dep = scan.nextInt();
				acc.deposit(dep);
				System.out.println("Balance:"+acc.getBalance());
			}
			else if(resp==2) {
				System.out.println("Enter the amount to withdraw");
				double wd = scan.nextDouble();
				if(wd==0)
					break;
				acc.withdraw(wd);
			}
			else {
				acc.getBalance();
			}
		}
		scan.close();
	}

}
