
public class Star{

	public static void main(String args[]){
		int n = 674;
		for(int i =0 ;i < n;i++){

			for(int j=0;j < i;j++){
				
				System.out.print(" ");

			}

			for(int m=n;m > i ;m--){
				
				System.out.print("*");
				System.out.print(" ");

			}
			System.out.print("\n");

		}

	}

}
