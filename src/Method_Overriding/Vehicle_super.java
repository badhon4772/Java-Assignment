package Method_Overriding;

public class Vehicle_super {
	int speed = 50;
	
	public Vehicle_super(String color) {
		System.out.println("Vehicle is created with color");
	}
	
	public void display() {
		System.out.println("The vehicle Speed is: "+speed);
	}
}

class Car extends Vehicle_super {
	int speed = 100;
	public Car()
	{
		super("Red");
		System.out.println("Car is Created\n");
	}
	
	public void display()
	{
		super.display();
		System.out.println("Vehicle Speed is: "+super.speed);
		System.out.println("Car Speed is" +speed);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.display();
	}
}