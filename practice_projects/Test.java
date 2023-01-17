import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);	
		System.out.print("enter string one: ");	
		String string_one = scan.next();
		System.out.print("enter String two: ");
		String string_two = scan.next();

		char[] letters_one = string_one.toCharArray();	
		char[] letters_two = string_two.toCharArray();

		for(char c : letters_one){
			System.out.println(c);
		}
		System.out.println(" ");
		for(char c : letters_two){
			System.out.println(c);
		} 
	}
}


