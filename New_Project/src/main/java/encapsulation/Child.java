package encapsulation;

public class Child {

	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.setAge(27);
		System.out.println(obj.getAge());
		//int a= obj.getAge();
		//System.out.println(a);
		obj.setName("preenu");
		System.out.println(obj.getName());
		//String b=obj.getName();
		//System.out.println(b);
	}

}
