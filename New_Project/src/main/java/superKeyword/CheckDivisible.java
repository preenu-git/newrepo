package superKeyword;

public class CheckDivisible extends Addition {
	public void checkDivisible(int a, int b) {
       
        int result = super.add(a, b);

        System.out.println("Addition Result = " + result);

        if (result % 10 == 0) {
            System.out.println("The result is divisible by 10 ");
        } else {
            System.out.println("The result is NOT divisible by 10 ");
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CheckDivisible obj = new CheckDivisible();

	        // Example 1
	        obj.checkDivisible(25, 15);

	        System.out.println();

	        // Example 2
	        obj.checkDivisible(12, 5);
	    }

	}


