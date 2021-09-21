
public class Student {
	String name;
	Integer rollno;
	Boolean isPass;
	Course[] courses;
	
	public Student() {
		name="";
		rollno =null;
		courses=new Course[3];
	}

	public Student(String name, Integer rollno) {
		this.name = name;
		this.rollno = rollno;
		courses=new Course[3];
	}

}
