package pattern;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<=n) {
			int s=1;
			while(s<=n-i) {
				System.out.print("   ");
				s++;
			}
			int j=1;
			while(j<=2*i-1) {
				System.out.print(" 1 ");
				j++;
			}
			System.out.println();			
			
			i++;
		}

	}

}
