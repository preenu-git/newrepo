package access1;

import accessSpecifier.AccessSpecifierClass;

public class Child extends AccessSpecifierClass {

	public static void main(String[] args) {
		
		Child obj3=new Child();
		obj3.pubMethod();
		obj3.protectedMethod();
		//obj3.primethod();private method and default method cannot be called outside the package
		//obj3.DefaultMethod();
		AccessSpecifierClass obj4=new AccessSpecifierClass();
		obj4.pubMethod();
		//protected cannot be called outside the package
	}

}
