package aggregation;

public class Address {
	String city;
    String state;

    // Constructor
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Print details
    public void printDetails(Student s) {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name      : " + s.name);
        System.out.println("Roll No   : " + s.rollNo);
        System.out.println("City      : " + city);
        System.out.println("State     : " + state);
    }

    public static void main(String[] args) {
        // Create student object
        Student st = new Student("preenu", 101);

        // Create address object
        Address ad = new Address("Trivandrum", "Tamil Nadu");

        // Print details
        ad.printDetails(st);
    }
}

