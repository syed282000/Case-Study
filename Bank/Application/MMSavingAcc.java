package Bank.Application;

import Bank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final int MINBAL=500;
	public MMSavingAcc(int accNo, String accNm, float accBal)
	{
		super(accNo,accNm,accBal);
		boolean isSalary;
		float MINBAL;
		
	}
	@Override
	public void withdraw(float withdrawamount)
	{
		int withdawnamount=1000000;
		if(MINBAL<500)
		{
			System.out.println("cannot withdraw,your balance is less than min balance");
		}
		else if(MINBAL>500)
		{
			return;
		}
		else if(withdawnamount>500000)
		{
			System.out.println("cannot overdraw an account");
			
	}
		else
		{
			return;
		}
		
	}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
