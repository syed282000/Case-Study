package Bank.Application;

import Bank.framework.CurrentAcc;

	public class MMCurrentAcc extends CurrentAcc
{
	private int accNo;
	private String accNm;
	private float accBal;

	public MMCurrentAcc(int accNo, String accNm, float accBal)
	{
		super(accNo,accNm,accBal);
		//Lazi initilization//
		boolean creditlimit;
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}

	private int getAccNo() {
		return accNo;
	}

	private void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	private String getAccNm() {
		return accNm;
	}

	private void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	private float getAccBal() {
		return accBal;
	}

	private void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public void withdraw(float withdrawamount) {
		
		System.out.println("withrawn amount is:" +accBal);
		
	}
	
}
