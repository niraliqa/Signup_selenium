package class14_overridding;

public class DBSBank implements RBI{

	public final static int miniBalance=2000;
	
	public static void main(String[] args) {
		
		RBI bank1=new DBSBank();
		
		System.out.println(RBI.miniBalance);
		
		bank1.kyc();
		
		bank1.depo();
		
		bank1.with();
	
	}

	public void depo() 
	{
	
		System.out.println(DBSBank.miniBalance);
		
		System.out.println(RBI.miniBalance);
		
		System.out.println("Customer can depo via online");
		
	}

	
	public void with() {
		System.out.println("Customer can with through ATM");
		
	}

	
	public void kyc() {
		
		System.out.println("Customer can complete KYC using otp");
	}

}
