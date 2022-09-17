package Bank.framework;

public class SavingAcc extends BankAcc{

	private static final int MINBAL = 500;
	public SavingAcc(int accNo, String accNm, float accBal)
	{
		super(accNo, accNm, accBal);
	    boolean isSalary;
	    float MINBAL;
			
	}
	@Override
	public void withdraw(float withdrawamount)
	{
	if(MINBAL<500)
	{
		System.out.println("cannot withdraw,your balance is less then minmum balance");
		
	}
	
	int amount = 100000000;
	
	if (amount>10000)
	{
		System.out.println("Cannot Overdraw an account");
	}
	int withdrawamount1=amount-MINBAL;
	
	int balance = withdrawamount1-amount;
	}
	@Override
	public String toString() {
		return "SavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	private static int getMinbal() {
		return MINBAL;
	}
}

