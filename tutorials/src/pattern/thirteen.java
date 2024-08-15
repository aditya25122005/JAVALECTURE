package pattern;

public class thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		System.out.println("new approach");
		int n=5;
		for(int i=1;i<2*n;i++) {
			int c= i>n? 2*n-i:i;
			for(int j=1;j<=c;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//		int n=5;
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print("* ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		int a=n-1;
//		while(a>0) {
//			int b=1;
//			while(b<=a) {
//				System.out.print("* ");
//				b++;
//			}
//			System.out.println();
//			a--;
//			
//		}

	}

}
