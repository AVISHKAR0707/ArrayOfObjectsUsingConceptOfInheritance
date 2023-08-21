package Bank;

public class BOB extends Bank {
	int bob_Balance;

	public int getBob_Balance() {
		return bob_Balance;
	}

	public void setBob_Balance(int bob_Balance) {
		this.bob_Balance = bob_Balance;
	}

	public BOB(int acc_no, String cust_name, int bob_Balance) {
		super(acc_no, cust_name);
		this.bob_Balance = bob_Balance;
	}
	void deposite(int num) throws BankException {
		if(num==0) {
			System.out.println("Error Occured");
		}
		
	}
	

}
