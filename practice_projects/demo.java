package practice_projects;
public class demo{
	public static void main(String[] args) {
		
		Mechatronics.project_pannrathu();
		
		Mechatronics vishal = new Mechatronics("vishal");

		String all = "kaviya";

		vishal.site_adipom(all);
	}

}


class Mechatronics{
	String name;

	Mechatronics(String name){
	   this.name = name;

	}

	public static void project_pannrathu(){
		System.out.print("nanga ellarum project pannuvom\n");
	}
	public void site_adipom(String all_peru){
		System.out.print("nanga ellarum stie adikirathuke college varuvom da\n");
		System.out.print("enn all peru ");
		System.out.print(all_peru);
		System.out.println(" my name is " + this.name);
	}

}
