package abstraction;

public class Child extends AbstractParent {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.sum();
		obj.diff();
		

	}

	@Override
	public void sum() {
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diff() {
		int a=5;
		int b=8;
		int c=a-b;
		System.out.println(c);
		
	}

}
