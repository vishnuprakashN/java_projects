package practice_projects;

import java.util.ArrayList;

public class Arraylist{

	public static void main(String args[]){
		
		NamesClass classA = new NamesClass();	
		classA.setNames("vishnu");
		classA.setNames("victor");
		classA.setNames("vishal");

		NamesClass ClassB = new NamesClass();
		ClassB.setNames("ashvika");
		ClassB.setNames("saranya");
		ClassB.setNames("deepika");

		ArrayList<String> classA_students = new ArrayList<String>();
		
		ArrayList<String> classb_students = new ArrayList<String>();
		
		System.out.println("The names of class A students are");

		System.out.println("-----------------------------------");
		
		classA_students = classA.getNames();

		System.out.println("The names of class B students are");
		
		System.out.println("-----------------------------------");

		classb_students = ClassB.getNames();

		System.out.println("-----------------------------------");

		

	}

}

class NamesClass{

	private ArrayList<String> names = new ArrayList<String>();

	public void setNames(String newName){
		this.names.add(newName);	
	}
	
	public ArrayList<String> getNames(){
		for(String name : this.names){
			System.out.println(name);	
		}
		return this.names;
	}

}



