package pattern;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* * * * * * * * *
//		* * * *   * * * *
//		* * *       * * *
//		* *           * *
//		*               *
		int n=5;
		for(int i=1;i<=n;i++) {
			
			
			
			
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			
			for(int s=1;s<=2*i-2;s++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			
			
			
			System.out.println();
		}

	}

}
