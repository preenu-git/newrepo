package superKeyword;

public class SuperChild extends SuperVariable {
	String color="green";
	public void display()
	{
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild();
		System.out.println(obj.color);
		obj.display();
		

	}

}
