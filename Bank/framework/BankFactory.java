package Bank.framework;

public interface BankFactory {
	
	public static SavingAcc getNewSavingAcc(int accno, String aaccnm, Long accbal, boolean issalary) {
		return null;
	}
	public static CurrentAcc getNewCurrentAcc(int accno, String accnm, Long accbal, float creditlimit) {
		return null;
	}
	
}
