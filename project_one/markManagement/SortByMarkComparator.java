package project_one.markManagement;

import java.util.Comparator;

public class SortByMarkComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student firstStudent,Student secondStudent){

		//sort all the student object by the mark in asc order
		if(firstStudent.getAverageMarks() > secondStudent.getAverageMarks()){
			return -1;
		}
		if(firstStudent.getAverageMarks() < secondStudent.getAverageMarks()){
			return +1;
			}
		return 0;
	}

}


