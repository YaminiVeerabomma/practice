package oops;
class BankAcc{
	String accountholdername;
	double balnc;
	public BankAcc(String name,double intialblc) {
	this.accountholdername=name;
	this.balnc=intialblc;
	}
	public void deposit(double amount) {
		balnc=balnc+amount;
		System.out.println(amount);
	}
	public void showBalnc()
	{
		System.out.println(balnc);
	}
	
}
class SavingsAcc extends BankAcc {
    double interestRate;

    public SavingsAcc(String name, double initialblc, double interestRate) {
        super(name, initialblc);  // Call parent class constructor
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balnc * interestRate / 100;
        balnc += interest;
        System.out.println( interest);
    }
}

public class Singleex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc sv=new SavingsAcc("yamini",500.0,5.0);
       sv.showBalnc();       // From parent class
        sv.deposit(500);        // From parent class
        sv.addInterest();       // From child class
        sv.showBalnc();       // Updated balance


	}

}
