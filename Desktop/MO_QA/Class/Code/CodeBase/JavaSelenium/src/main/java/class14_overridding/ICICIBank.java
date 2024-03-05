package class14_overridding;

public class ICICIBank implements RBI{

	public static void main(String[] args) {
		
	
		
	 RBI bank1=new ICICIBank();
	 
	 bank1.kyc();
	 
	 bank1.depo();
	 
	 bank1.with();
		
	}

	public void educationLoan()
	{
		System.out.println("Students can take education loan");
	}
	
	
	public void depo()
	{
		System.out.println("Cuctomer can deposit online,offline");
	}
	
	public void with()
	{
		System.out.println("Cuctomer can deposit online,offline,UPI");
	}
	
	public void kyc()
	{
		System.out.println("Customer can complete KYC using aadhar card");
	}

}
