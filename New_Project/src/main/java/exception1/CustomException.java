package exception1;

public class CustomException {

	public static void main(String[] args) throws VoteException {
		// TODO Auto-generated method stub
		int age=15;
		if (age>18)
			System.out.println("Eligible for vote");
		else
		{
			throw new VoteException("not eligible for voting");
		
	}

}
}