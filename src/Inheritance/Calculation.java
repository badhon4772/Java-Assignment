package Inheritance;

public class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum: " +z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference:"+z);
	}
}

class MyCalculation extends Calculation {
	public void multiplication(int x, int y) {
		z = x*y;
		System.out.println("The product:"+z);
	}
	public void division(int x, int y) {
		z = x/y;
		System.out.println("The Division: "+z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		MyCalculation demo = new MyCalculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		demo.division(a, b);
	}
}