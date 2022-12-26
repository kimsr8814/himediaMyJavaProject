package test;

public class Printer {
	
	// println 메서드를 정의하시오.
	static void println(int value1) {
		System.out.println(value1);
	}
	static void println(boolean value1) {
		System.out.println(value1);
	}
	static void println(double value1) {
		System.out.println(value1);
	}
	static void println(String value1) {
		System.out.println(value1);
	}
	public static void main(String[] args) {
		
		//Printer printer = new Printer();
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
