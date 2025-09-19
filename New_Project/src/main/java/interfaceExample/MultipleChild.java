package interfaceExample;

public class MultipleChild implements Parent1,Parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MultipleChild obj=new MultipleChild();
      obj.display();
      obj.sum();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
