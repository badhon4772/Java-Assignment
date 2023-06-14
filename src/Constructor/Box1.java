package Constructor;

public class Box1 {
	int height;
	int width;
	
	public Box1()
	{
		System.out.println("Box Created");
		this.height = 10;
		this.width = 20;
	}
	
	public static void main(String[] args) {
		
		Box1  box1 = new Box1();
		System.out.println("The height of box1 = "+box1.height);
		System.out.println("The width of box1 = "+box1.width);

		Box1  box2 = new Box1();
		System.out.println("The height of box2 = "+box2.height);
		System.out.println("The width of box2 = "+box2.width);

	}
}
