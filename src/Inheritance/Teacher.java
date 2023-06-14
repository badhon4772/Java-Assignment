package Inheritance;

public class Teacher {
	
	String designation = "Lecturer";
	String uniName = "DIU";
	public void job()
	
	{
		System.out.println("Teaching");
	}
}

class CseTeacher extends Teacher {
	String mainSubject = "CSE";
	
	public static void main(String[] args) {
		CseTeacher obj = new CseTeacher();
		System.out.println(obj.uniName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.job();
	}
}
