package project_one.markManagement;

public class Student{

	private String name;
	private int english_marks;
	private int maths_marks;
	private int social_marks;
	private int tamil_marks;
	private int science_marks;
	private int average_marks;

	public Student(String name, int english_marks, int maths_marks, int social_marks, int tamil_marks, int science_marks){
	
		this.name = name;
		this.english_marks = english_marks;
		this.maths_marks = maths_marks;
		this.social_marks = social_marks;
		this.tamil_marks = tamil_marks;
		this.science_marks = science_marks;
		this.average_marks = (english_marks + maths_marks + social_marks + tamil_marks + science_marks)/5;

	}

	public String getName(){
		return this.name;	
	}

	public int getEnglishMarks(){
		return this.english_marks;
	}

	public int getMathsMarks(){
		return this.maths_marks;
	}
	public int getSocialMarks(){
		return this.social_marks;
	}
	public int getTamilMarks(){
		return this.tamil_marks;
	}
	public int getScienceMarks(){
		return this.science_marks;
	}
	
	public int getAverageMarks(){
		return this.average_marks;
	}

	@Override
    public String toString(){
		return name + "," + english_marks+ "," + maths_marks+ "," +social_marks+ "," +tamil_marks+ "," +science_marks+ "," +average_marks;	
	}

}
