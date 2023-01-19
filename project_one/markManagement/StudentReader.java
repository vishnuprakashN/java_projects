package project_one.markManagement;
import java.io.*;
import java.util.*;

public class StudentReader{

	private static ArrayList<Student> studentsList = new ArrayList<Student>();
	
	//function to read csv file and creates student object ,adds to arraylist
	public static void readStudents() throws IOException{
		
		File file = new File("marklist.csv");
		Scanner readfile = new Scanner(file);
		StringTokenizer token = null;	

		String name;
		int english_marks;
		int maths_marks;
		int social_marks;
		int tamil_marks;
		int science_marks;

		while(readfile.hasNext()){
			token = new StringTokenizer(readfile.nextLine(),",");

			name = token.nextToken();
			english_marks = Integer.parseInt(token.nextToken());
			maths_marks = Integer.parseInt(token.nextToken());
			social_marks = Integer.parseInt(token.nextToken());
			tamil_marks = Integer.parseInt(token.nextToken());
			science_marks = Integer.parseInt(token.nextToken());

			Student student = new Student(name, english_marks, maths_marks, social_marks, tamil_marks, science_marks);
			
			studentsList.add(student);

		}
	}
	
	public static ArrayList<Student> getlist(){
		try {
			readStudents();	
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentsList;
	}
	/*public static void main(String[] args) throws IOException{

		readStudents();

		for(Student student: studentsList){
			System.out.println(student); // we have tostring method defined in the student class
		}
	}*/

}
