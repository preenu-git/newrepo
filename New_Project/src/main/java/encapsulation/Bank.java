
package encapsulation;

public class Bank {

	    private int pin;   

	   
	 // Method to set pin from User class
	    public void setPin(int pin)
	    {
	        this.pin = pin;
	    }

	public int getPin()
	    {
	    	return pin;
	    }

	    // Withdraw money if pin is valid
	    public void withdraw(int amount)
	    {
	        if (pin == 1001 || pin == 1234 || pin == 1212)
	        {
	            System.out.println("Pin validated successfully.");
	            System.out.println("Withdrawal of Rs. " + amount + " successful.");
	        } 
	        else
	        {
	            System.out.println("Invalid Pin. Withdrawal failed.");
	        }
	    }
	
	}


