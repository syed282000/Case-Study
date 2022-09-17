package Client;

import Bank.Application.MMBankFactory;
import Bank.Application.MMCurrentAcc;
import Bank.Application.MMSavingAcc;
import Bank.framework.BankFactory;
import Bank.framework.CurrentAcc;
import Bank.framework.SavingAcc;


public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(786, "Suhel", 1000);
		sa.withdraw(500);
		CurrentAcc ca=new MMCurrentAcc(123, "prem" ,31);
		ca.withdraw(500);
		System.out.println(sa);
		System.out.println(ca);
}
}