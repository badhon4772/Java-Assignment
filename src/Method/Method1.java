package Method;

public class Method1 {
	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		int c = max(a,b);
		System.out.println("Maximum Value = "+c);
	}
	
	public static int max(int n1,  int n2) {
		int max_value;
		if(n1>n2)
			max_value =n1;
		else
			max_value =n2;
		
		return max_value;
	}
}
