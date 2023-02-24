package week5.day2;

public class IciciBank extends BankInfo{
	public void gold() {
		System.out.println("Gold Loan");
	}
	public static void main(String[] args) {
		IciciBank bank=new IciciBank();
		bank.gold();
		bank.ifsc();
		bank.account();
	}

}
