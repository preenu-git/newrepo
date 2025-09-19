package abstraction;

public class Contractor extends Employee {
	double paymentPerHour;
	double workingHours;

    Contractor(double rate, double hours) {
        paymentPerHour = rate;
        workingHours = hours;
    }

	//public static void main(String[] args) {
		//Contractor c = new Contractor(500, 6); 
       // System.out.println("Contractor Salary: " + c.calculateSalary());


	//}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*workingHours ;
	}

}
