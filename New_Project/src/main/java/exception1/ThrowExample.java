package exception1;

public class ThrowExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age=15;
		if (age>18)
			System.out.println("Eligible for vote");
		else
		{
			throw new Exception("not eligible for voting");
		}
		

	}

}
