package superKeyword;

public class SuperConstructorChild extends SuperConstrucror {
	public SuperConstructorChild()
	{
		super(2);
		System.out.println("hello");
	}
	public SuperConstructorChild(float c)
	{
		super();
		System.out.println(c);
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();//first see this object,there is super(2),go to parent class 
		//and see there is any parameterised constructor,execute it,after it print that statement
		SuperConstructorChild obj1=new SuperConstructorChild(9.3f);
		
		}

}
