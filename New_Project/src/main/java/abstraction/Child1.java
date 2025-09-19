package abstraction;

public class Child1 extends Parent {

	public static void main(String[] args) {
		Parent obj=new Child1();
		obj.display();
		obj.diff();
	//	obj.show();we cannot access child class properties by creating abstract class reference.
		Child1 obj1=new Child1();
		obj1.diff();
		obj1.display();
		obj1.show();
	}

	@Override
	public void display() {
	   System.out.println("hello");
		
	}
public void show()
{
	System.out.println("hi");
}
}
