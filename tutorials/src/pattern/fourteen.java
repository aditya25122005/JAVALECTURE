package pattern;

public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("New approach");
		int n=5;
		for(int i=1;i<2*n;i++) {
			int c=i>n? i-n:n-i;
			for(int k=1;k<=c;k++) {
				System.out.print("  ");
			}
			int C=i>n?2*n-i :i;
			for(int j=1;j<=C;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		int n=5;
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=n-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=1;
//			while(k<=i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;	
//		}
//		
//		int a=4;
//		while(a>0) {
//			int b=1;
//			while(b<=n-a) {
//				System.out.print(" ");
//				b++;
//			}
//			int k=1;
//			while(k<=a) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			a--;
//		}

	}

}
