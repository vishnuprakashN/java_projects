import java.util.Scanner;
import java.util.HashMap;


public class Flames{

	public static int common_letter_count(String name_one, String name_two) {
		
		char[] array_name_one = name_one.toCharArray();
		char[] array_name_two = name_two.toCharArray();

		int temp,count=0;
		int length_one = array_name_one.length;
		int length_two = array_name_two.length;

		for(int i=0;i< length_one;i++){
			for(int j=0;j<length_two;j++){
				if(array_name_one[i] == array_name_two[j]){
					array_name_one[i] = '0';
					array_name_two[j] = '0';
				}

			}
		}
		for (char c : array_name_one) {

			if(c != '0')
				count++;	
		}
		for (char c : array_name_two) {

			if(c != '0')
				count++;
			
		}


		return count;

	}

	public static String flames_map(int status){

		HashMap<Integer,String> map = new HashMap<>();

		map.put(1,"FRIENDS");
		map.put(2,"LOVE");
		map.put(3,"AFFECTION");
		map.put(4,"MARRIAGE");
		map.put(5,"ENEMY");
		map.put(6,"SISTER");

		String matching = map.get(status);	

		return matching;
	}

	public static void print_fancy(){

		final int size = 4  ;  
          
                // nested for loop to print the upper part of Heart  
            for (int m = 0; m < size; m++) {  
                    for (int n = 0; n <= 4 * size; n++) {  
                            double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                            double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                            if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                                    System.out.print('*');  
                            } else {  
                                    System.out.print(' ');  
                            }  
                        }  
                        System.out.print(System.lineSeparator());  
                }  
                // for loop to print the lower part of Heart  
                for (int m = 1; m <= 2 * size; m++)  
                {  
                    for (int n = 0; n < m; n++) {  
                        System.out.print(' ');  
                }  
                for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                        System.out.print("*");  
                    }  
                System.out.print(System.lineSeparator());  
            }  	

	}

	public static int flames_loop(int letter_count){
		char status = '0';
		int count =0;
		int zero_count = 0;
		int status_int = 0;
		
		String flames = "FLAMES";
		char[] flames_array = flames.toCharArray();

		while(zero_count < 5){
		for(int i=0;i<flames_array.length;i++){
			
			if(flames_array[i] != '0'){
				count = count + 1;
			}
		    if(count == letter_count){
				flames_array[i] = '0';	
				count =0;
				zero_count++;
			}	
		}}
		
		for (int i = 0; i < flames_array.length; i++) {
			if(flames_array[i] != '0'){
				status_int= i + 1;	
				status = flames_array[i];
			}	
		}
		

		
	return status_int;
	}


	public static void main(String[] args) {
		String name_one;
		String name_two;
		Scanner scan = new Scanner(System.in);

		System.out.print(" Enter the your name: ");
		name_one = scan.next();
		System.out.print(" Enter the crush name: ");
		name_two = scan.next();
		
		
		int count = common_letter_count(name_one,name_two);
		int selection = flames_loop(count);
		String matching = flames_map(selection);

		if(selection == 2){
			print_fancy();
		}

		System.out.print("      ");
		System.out.print(matching);
	}


}
