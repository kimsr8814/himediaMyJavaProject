package otherpackage;

import mypackage.MyClass;

public class OtherClass {
	
	public static void main(String[] args) {
		
		//MyClass의 인스턴스를 생성한 후 
		//필드와 메서드에 접근
		MyClass mc = new MyClass();
		
		//private 접근 불가
		//mc.privateInt = 10;
		mc.packageInt = 10;
		
		//mc.privateMethod() ;
		mc.packageMethod();
		
	}

}
