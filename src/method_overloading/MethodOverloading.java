package method_overloading;

public class MethodOverloading {
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(20, 20);
		obj.sum(10,20,30);
	}
}
