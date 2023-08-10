package week4.day3;

public class IndianBank extends RBIBank{

	@Override
	public void deposit() {
	System.out.println("Indian Bank Deposit");
	}
	public static void main(String[] args) {
		IndianBank bank=new IndianBank();
		bank.deposit();
		bank.saving();
	}
}
