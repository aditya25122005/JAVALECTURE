package pattern;

public class eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print(" *  ");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
