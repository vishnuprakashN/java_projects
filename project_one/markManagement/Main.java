import java.util.ArrayList;
import project_one.markManagement.Student;
import project_one.markManagement.StudentReader;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
import project_one.markManagement.SortByEnglishComparator;
import project_one.markManagement.SortByMathsComparator;
import project_one.markManagement.SortByTamilComparator;
import project_one.markManagement.SortBySocialComparator;
import project_one.markManagement.SortByScienceComparator;
import project_one.markManagement.SortByMarkComparator;

class Main{

	public static void main(String[] args)  throws Exception{

		int input = 0;	

		Scanner scanner = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<Student>();

		students = StudentReader.getlist();
	
			
		while(input != 7){
			
			terminalInterface();

			input = scanner.nextInt();
			if(input == 7){
			break;
			}
			
			Student student = selector(input,students);

			System.out.println("------------------------------------");
			System.out.println("|       STUDENTS MARKSmarks        |");
			System.out.println("------------------------------------");
			System.out.println("  "+student);
			System.out.println("------------------------------------");
			System.out.println("|Enter a key to continue....       |");
			System.out.println("------------------------------------");
			scanner.next();

		}

	}


	public static void terminalInterface(){

		System.out.println("----------------------------------------");
		System.out.println("| Select Options/Enter option number   |");
		System.out.println("----------------------------------------");
		System.out.println("|         STUDENT MARK REGISTRY        |");
		System.out.println("----------------------------------------");
		System.out.println("| 1. View Topper of Class              |");
		System.out.println("| 2. View Topper of english            |");
		System.out.println("| 3. View Topper of maths              |");
		System.out.println("| 4. View Topper of social             |");
		System.out.println("| 5. View Topper of tamil              |");
		System.out.println("| 6. View Topper of science            |");
		System.out.println("| 7. Exit                              |");
		System.out.println("----------------------------------------");

	}

	public static Student selector(int input, ArrayList<Student> students){
	
		SortByEnglishComparator englishMarkComparator = new SortByEnglishComparator();
		SortByMathsComparator mathsMarkComparator = new SortByMathsComparator();
		SortBySocialComparator socialMarkComparator = new SortBySocialComparator();
		SortByTamilComparator tamilMarkComparator = new SortByTamilComparator();
		SortByScienceComparator scienceMarkComparator = new SortByScienceComparator();
		SortByMarkComparator averageMarkComparator = new SortByMarkComparator();


		switch (input){
			case 1:
				Collections.sort(students, averageMarkComparator);
				break;
			case 2:
				Collections.sort(students, mathsMarkComparator);
				break;
			case 3:
				Collections.sort(students, socialMarkComparator);
				break;
			case 4:
				Collections.sort(students, tamilMarkComparator);
				break;
			case 5:
				Collections.sort(students, scienceMarkComparator);
				break;
			case 6:
				Collections.sort(students, englishMarkComparator);
				break;
			case 7:
				break;
		}

		return students.get(0);

	}
	
	public static void printStudents(ArrayList<Student> students){
		for(Student student : students){
			System.out.println(student); // we have tostring method defined in the student class
		}
	
	}

}





