package accessSpecifier;

public class SpecifierClass extends AccessSpecifierClass {

	public static void main(String[] args) {
		SpecifierClass obj1=new SpecifierClass();

		obj1.pubMethod();
		obj1.protectedMethod();
		obj1.defaultMethod();
		//obj1.primethod();private method cannot be called outside the class

	}

}
