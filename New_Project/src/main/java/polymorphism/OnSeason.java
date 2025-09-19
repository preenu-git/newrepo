package polymorphism;

public class OnSeason {
	public void discount(double amount) {
        double discount = (amount * 40) / 100;
        double finalPrice = amount - discount;

        System.out.println("Purchase Amount : " + amount);
        System.out.println("Onseason Discount (40%) : " + discount);
        System.out.println("Final Price after discount : " + finalPrice);
    }
}
