package string_package;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		StringBuilder s1=new StringBuilder("hi");
		System.out.println(s1);
		//append
		System.out.println(s.append("world"));
		System.out.println(s.append(s1));
		System.out.println(s.insert(1, "java"));
		System.out.println(s.replace(5, 6, "java"));
		System.out.println(s.delete(1, 6));
		System.out.println(s.reverse());
	
	}

}
