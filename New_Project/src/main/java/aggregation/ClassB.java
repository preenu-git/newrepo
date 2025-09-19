package aggregation;

public class ClassB {
	String Subject;
	int age;
	ClassA ref;
	public ClassB(String Subject,int age,ClassA ref)
	{
		this.Subject=Subject;
		this.age=age;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("the subject is "+Subject);
		System.out.println("the age is "+age);
		System.out.println(ref.name + ref.mark);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj1=new ClassA("preenu",97);
		ClassB obj=new ClassB("maths",23,obj1);
		obj.display();
	
		

	}

}
