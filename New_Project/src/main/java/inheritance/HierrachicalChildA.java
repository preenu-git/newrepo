package inheritance;

public class HierrachicalChildA extends HierrachicalParent{
	public void product(float b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierrachicalChildA obj=new HierrachicalChildA();
		obj.product(2.4f);
		obj.sum(2);
	    System.out.println(obj.a);
	}

}
