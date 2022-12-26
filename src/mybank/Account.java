package mybank;

public class Account {

	private String accountNo;
	private String name;
	private int balance;
	
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%d\n", this.accountNo,  )
	}

}
;