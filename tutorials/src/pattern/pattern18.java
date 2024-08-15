package pattern;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=2*n-1;i++) {
			int spaces=i<=n? n-i: i-n;
			for(int s=1;s<=spaces;s++) {
				System.out.print("  ");
			}
			int stars=i<=n? 2*i-1: 2*(2*n-i)-1;
			for(int j=1;j<=stars;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
