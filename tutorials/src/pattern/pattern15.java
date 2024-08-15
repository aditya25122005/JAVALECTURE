package pattern;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=1;i<2*n;i++) {
//			int c=i>n? 2*i- 2*n:2*i-2;
//			for(int k=1;k<=c;k++) {
//				System.out.print(" ");
//			}
//			int C=i>n? i-n+1:i;
//			for(int j=5;j>=C;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		int n=5;
		
		for (int i=1 ;i<=2*n-1 ;i++){
		    if (i <=n){
		        for (int k=1; k<=i-1 ;k++){
		            System.out.print("    ");
		            }
		        for (int j=1 ;j<=n+1-i ;j++){
		        System.out.print("* ");
		    }
		    }
		    else{
		        for (int k=1; k<=2*n-i-1 ;k++){
		            System.out.print("    ");
		            }
		        for (int k=1; k<=i-n+1 ;k++){
		        System.out.print("* ");
		        }
		    }
		    System.out.println();
		}
		System.out.println();

	}

}
