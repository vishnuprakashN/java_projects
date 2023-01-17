import java.util.Scanner;

public class NumToRomman{

	public static void main(String[] args){

		System.out.print("-------------------------------\n");
		System.out.print("CONVERT NUMBER TO ROMMAN NUMBER\n");
		System.out.print("------------------------------\n");
		System.out.print("\n");
		boolean num = true;
		for (int i = 0; i <= 5 ; i++) {
			System.out.print("\n");
			
			for (int j = i; j <= 5 ; j++) {
				System.out.print("  ");
				}

			for (int j = 0; j <= i ; j++) {
					System.out.print("* ");	
				}
			for (int j = 0; j <= i; j++) {
					System.out.print("* ");	
			}

					
			}
			
		System.out.print("\nEnter the number to convert : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();	
		String[] romman =  {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String romman_number = "";

		for(int i =0;i<values.length; i++){
			while(number >= values[i]){
				number = number - values[i];
				romman_number = romman_number + romman[i];
			}
		}

		System.out.println("The converted romman number is : " + romman_number);


	}

	}
