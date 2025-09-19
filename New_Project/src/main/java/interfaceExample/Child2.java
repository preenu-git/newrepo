package interfaceExample;

public class Child2 implements InterfaceParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceParent2 obj=new Child2();
		obj.sum();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

}
