
public class StudentBatch {
	Student[] students;
	//Course[] courses;
	public StudentBatch() {
		students=new Student[5];
	//	courses=new Course[3];
		
	}
	public void printResult() {
		//for loop  print (roll no - isPass)
		
		for(int j=0; j<students.length;j++) {
//			for(int i=0;i<=courses.length;i++) {
//				if(courses[i].marks>=40) {
//					students[i].isPass=true;
//				}
//				else
//					students[i].isPass=false;
//			}
			System.out.println(students[j].rollno+"-"+students[j].isPass);
		}
		
		
	}

}
