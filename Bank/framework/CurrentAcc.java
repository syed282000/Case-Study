package Bank.framework;

public class CurrentAcc extends BankAcc{

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		final float creditlimit;
	}
	@Override
	public void withdraw(float withdrawamount) {
	

}
	@Override
	public String toString() {
		return "CurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}