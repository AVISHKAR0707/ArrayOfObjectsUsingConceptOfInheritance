package Bank;

public class SBI extends Bank{
	int sbi_Balance;

	public int getSbi_Balance() {
		return sbi_Balance;
	}

	public void setSbi_Balance(int sbi_Balance) {
		this.sbi_Balance = sbi_Balance;
	}

	public SBI(int acc_no, String cust_name, int sbi_Balance) {
		super(acc_no, cust_name);
		this.sbi_Balance = sbi_Balance;
	}
	
	
	
}
