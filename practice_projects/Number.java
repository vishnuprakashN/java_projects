public class Number{
	
	public static void main(String args[]){
	
		int n =7;
		int m = 8;
		int count =0;
		for(int j =1 ;j<=n;j++){
			
			for(int i = 1;i<=j;i++){
				System.out.print(i);
			}
			System.out.print("\n");
			
		}
		

		for(int i = 1;i<m;i++){
			for(int j = m;j>i;j--){

				System.out.print(count);	
				count++;
			}
			System.out.print("\n");
			count = 1;
		}
	}

}
