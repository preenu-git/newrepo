package superKeyword;

public class SuperMethodChild extends SuperMethod{
	public void show()
	{ 
		this.diff();
		//System.out.println(super.sum(2, 5));
		super.display();
		System.out.println("hi");
		System.out.println(super.sum(2, 5));
	}
	public void diff()
	{
     
		System.out.println("star");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.show();
		//obj.display();
		
	
	}

}
