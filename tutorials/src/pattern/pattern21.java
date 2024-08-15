package pattern;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 *               *
//		 * *           * *
//		 * * *       * * *
//		 * * * *   * * * *
//		 * * * * * * * * *
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			
			for(int s=1;s<=2*i-3;s++) {
				System.out.print("  ");
				
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
