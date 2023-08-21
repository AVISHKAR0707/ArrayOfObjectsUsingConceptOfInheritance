package Bank;

public class Bank {
	int acc_no;
	String cust_name;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public Bank(int acc_no, String cust_name) {
		super();
		this.acc_no = acc_no;
		this.cust_name = cust_name;
	}
	
	
	

}
