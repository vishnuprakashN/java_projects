public class Pyramid{
		
	public static void main(String args[]){

		int n=6000;
		for(int i=0;i<n;i++){
			
			for(int j=n;j>i;j--){
				
				System.out.print(" ");

			}

			for(int m=0;m<i;m++){
			    System.out.print("*");			
				System.out.print(" ");
			}

		System.out.print("\n");

		}

	}

}
