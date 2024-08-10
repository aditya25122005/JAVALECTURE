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
		int n=5;
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		int a=n-1;
		while(a>0) {
			int b=1;
			while(b<=a) {
				System.out.print("* ");
				b++;
			}
			System.out.println();
			a--;
			
		}

	}

}
