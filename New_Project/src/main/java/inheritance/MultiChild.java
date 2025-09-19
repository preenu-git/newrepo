package inheritance;

public class MultiChild extends MultiInter {
	public void diff(String f)
	{
		System.out.println(f);
	}

	public static void main(String[] args) {
		MultiChild obj=new MultiChild();
		obj.diff("hi");
		obj.display(3);
		obj.sum(2, 4);

	}

}
