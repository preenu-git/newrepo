package methodOverriding;

public class Child extends Parent {
	public void sum()
	{
		super.sum();
		System.out.println("This is child class");
	}
	public void diff()
	{
		super.diff();
		System.out.println("helloooo");
	}

	public static void main(String[] args) {
	Child obj=new Child();
	obj.sum();
	obj.diff();

	}

}
