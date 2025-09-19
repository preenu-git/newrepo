package inheritance;

public class HierrachicalChildB extends HierrachicalParent {
	public void diff(String c)
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierrachicalChildB obj=new HierrachicalChildB();
		obj.diff("hi");
		obj.sum(2);
		System.out.println(obj.a);
		

	}

}
