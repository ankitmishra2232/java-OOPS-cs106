
public class Client {

	public static void main(String[] args) {
		StudentBatch batch =new StudentBatch();
		
		Course[] list1 = {new Course("150", "Ds & Algo", 5, 45.64),new Course("164", "oop", 4, 42.64),new Course("170", "Linux", 6, 45.64)};  
		Course[] list2 = {new Course("150", "Ds & Algo", 5, 42.1),new Course("164", "oop", 4, 55.0),new Course("170", "Linux", 6, 40.5)};
		Course[] list3 = {new Course("150", "Ds & Algo", 5, 52.41),new Course("164", "oop", 4, 73.01),new Course("170", "Linux", 6, 65.5)};
		Course[] list4 = {new Course("150", "Ds & Algo", 5, 49.14),new Course("164", "oop", 4, 45.22),new Course("170", "Linux", 6, 25.85)};
		Course[] list5 = {new Course("150", "Ds & Algo", 5, 84.33),new Course("164", "oop", 4, 25.4),new Course("170", "Linux", 6, 42.58)};
		
		Student s1=null, s2=null, s3=null, s4=null, s5=null;
		
		s1=new Student("Max",1225);
		s1.courses=list1;
		s2=new Student("Muhan",1226);
		s2.courses=list2;
		s3=new Student("bob",1227);
		s3.courses=list3;
		s4=new Student("nid",1228);
		s4.courses=list4;
		s5=new Student("Ram",1229);
		s5.courses=list5;
		
		
		
		
		
		Student[] studentList = {s1, s2, s3, s4, s5};
		batch.students = studentList;
		
		//RuleEngine.generateresult(batch);
		
		batch.printResult();

	}

}
