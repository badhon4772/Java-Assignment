package Method;

public class Student {
	private String id;
	private String name;
	private double cgpa;
	
	public void insert_Record(String id, String name, double cgpa)
	{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void display_Record()
	{
		System.out.println("Name: "+name);
		System.out.println("ID:"+id);
		System.out.println("CGPA:"+cgpa);
	}
	
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.insert_Record("221-15-4772", "Badhon", 3.8);
		st1.display_Record();
	}
}
