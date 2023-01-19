package project_one.markManagement;

import java.util.Comparator;

public class SortByMathsComparator implements Comparator<Student> {

	@Override
	public int compare(Student firstStudent,Student secondStudent){

		//sort all the student object by the mark in asc order
		if(firstStudent.getMathsMarks() > secondStudent.getMathsMarks()){
			return -1;
		}
		if(firstStudent.getMathsMarks() < secondStudent.getMathsMarks()){
			return +1;
			}
		return 0;
	}

}
