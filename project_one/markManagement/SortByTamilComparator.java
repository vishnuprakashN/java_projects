package project_one.markManagement;

import java.util.Comparator;

public class SortByTamilComparator implements Comparator<Student> {

	@Override
	public int compare(Student firstStudent,Student secondStudent){

		//sort all the student object by the mark in asc order
		if(firstStudent.getTamilMarks() > secondStudent.getTamilMarks()){
			return -1;
		}
		if(firstStudent.getTamilMarks() < secondStudent.getTamilMarks()){
			return +1;
			}
		return 0;
	}

}



