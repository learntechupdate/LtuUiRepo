package javaconcept.oops;

class Bank{
	
	private String BankName="SBI16444";
	private int accNo;
	
	public String getBankName() {
		System.out.println("Bank name feched");
		return BankName;
	}
	
	public int getAccNo() {
		System.out.println("fetched AccNo");
		return accNo;
		
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
		System.out.println("Modified AccNo");
	}
	
}

public class Encapulation {
	
	public static void main(String[] args) {
		
		Bank u1 = new Bank();
		u1.setAccNo(444);
		
		
		System.out.println(u1.getAccNo());
		System.out.println(u1.getBankName());
		
		Bank u2 = new Bank();
		u2.setAccNo(5434);
		
		System.out.println(u2.getAccNo());
		
	}

}
