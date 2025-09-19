package interfaceExample;

public interface InterfaceParent1 {
	public static final int a=3;//static final....value cannot be changed
	int b=7;//static final
	public abstract void sum();
	default void show()
	{
	System.out.println("this is interface");
	}
	public static void display()
	{
		System.out.println("this is static method");
	}

}
