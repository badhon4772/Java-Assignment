package Encapsulation;

public class EncapsulationExample {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Asha");
		p1.setAge(20);
		System.out.println("Name: "+p1.getName());
		System.out.println("Age "+p1.getAge());
	}
}
