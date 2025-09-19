package interfaceExample;

public class Child1 implements InterfaceParent1 {
	

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.sum();
		obj.show();
		InterfaceParent1.display();//for static method classname.methodname();
		

	}

	@Override
	public void sum() {
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
