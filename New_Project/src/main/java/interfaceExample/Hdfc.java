package interfaceExample;

public class Hdfc implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc customer = new Hdfc();

        // Example: Deposit Rs. 50,000 for 3 years
        customer.recurringDeposit(50000, 3);
    }
     
	

	@Override
	public void recurringDeposit(double amount, int years) {
		// TODO Auto-generated method stub
		double interest = (amount * interestRate * years) / 100;
        double maturity = amount + interest;
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Duration (Years): " + years);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Amount after " + years + " years = " + maturity);
    }
}

	