package FirstProgram;

class GeneralBank{
	void getSavingInterestRate() {
		System.out.println("General Savings Interest Rate");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit General Interest Rate");
	}
}
class ICICIBank extends GeneralBank{
	void getSavingInterestRate() {
		System.out.println("Savings Interset Rate: 4% ");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate: 8.5%");
	}
}
class KotMBank extends GeneralBank{
	void getSavingInterestRate() {
		System.out.println("Savings Interset Rate: 6% ");
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest Rate: 9%");
	}
}
public class Bank {

	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		System.out.println("ICICI Bank......");
		i.getFixedDepositInterestRate();
		i.getSavingInterestRate();
		
		KotMBank k=new KotMBank();
		System.out.println("\nKotM Bank......");
		k.getFixedDepositInterestRate();
		k.getSavingInterestRate();
		
		GeneralBank g=new KotMBank();
		System.out.println("\nGenral to KotM Bank......");
		g.getFixedDepositInterestRate();
		g.getSavingInterestRate();
		
		g=new ICICIBank();
		System.out.println("\nGenral to ICICI Bank......");
		g.getFixedDepositInterestRate();
		g.getSavingInterestRate();
	}

}