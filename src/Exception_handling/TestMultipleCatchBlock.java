package Exception_handling;

public class TestMultipleCatchBlock {
	public static void main(String args[]) {
		int a[] = new int [2];
		try {
			System.out.println("Access element three :" +a[3]);
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		}
		
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
	}
}
