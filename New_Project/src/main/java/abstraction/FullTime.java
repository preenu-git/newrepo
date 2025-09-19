package abstraction;

public class FullTime extends Employee {
	double paymentPerHour;

    FullTime(double rate) {
        paymentPerHour = rate;
    }

	public static void main(String[] args) {
		FullTime f = new FullTime(700); 
        System.out.println("Full Time Salary: " + f.calculateSalary());
        Employee obj=new Contractor(500,7);
        System.out.println("Contractor Salary: " + obj.calculateSalary());
        
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*8;
	}

}
