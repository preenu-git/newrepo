package inheritance;

public class SingleChild extends SingleParent{

	public void display(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.display(26, 34);
		obj.sum(2, 4);
		obj.show("hello");
		SingleParent obj1=new SingleParent();
		obj1.show("hi");
		obj1.sum(5, 5);
		
	
			
		

	}

}
