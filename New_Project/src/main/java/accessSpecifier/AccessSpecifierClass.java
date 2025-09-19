package accessSpecifier;

public class AccessSpecifierClass {
	public void pubMethod()
	{
		System.out.println("This is public method");
	}
	private void priMethod()
	{
		System.out.println("This is private method");
		
	}
	void defaultMethod()
	{
		System.out.println("This is default method");
	}
	protected void protectedMethod()
	{
		System.out.println("This is protected method");
	}
	

	public static void main(String[] args) {
		
		AccessSpecifierClass obj= new AccessSpecifierClass();
		obj.pubMethod();
		obj.priMethod();
		obj.defaultMethod();
		obj.protectedMethod();
	}

}
