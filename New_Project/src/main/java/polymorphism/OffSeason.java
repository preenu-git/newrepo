package polymorphism;

public class OffSeason {
	public void discount(double amount) {
        double discount = (amount * 15) / 100;
        double finalPrice = amount - discount;

        System.out.println("Purchase Amount : " + amount);
        System.out.println("Offseason Discount (15%) : " + discount);
        System.out.println("Final Price after discount : " + finalPrice);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnSeason on = new OnSeason();
        OffSeason off = new OffSeason();

        // Example: Purchase clothes worth Rs. 5000
        System.out.println("--- Onseason Purchase ---");
        on.discount(5000);

        System.out.println("\n--- Offseason Purchase ---");
        off.discount(5000);
    }

	}


