package methodOverriding;

public class Child1 extends Parent1 {
	

	@Override
	public void prod(int a, int b) {
		// TODO Auto-generated method stub
		super.prod(a, b);
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.prod(2, 4);

	}

}
