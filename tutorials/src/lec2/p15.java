package lec2;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<2*n) {
			//space
			if(i<=n) {
				int space=2;
				while(space<=i) {
					System.out.print("  ");
					space++;
				}
				int star=n;
				while(star>=i) {
					System.out.print("*");
					star--;
				}
			}
			else {
				int space=2*n-i-1;
				while(space>0) {
					System.out.print("  ");
					space--;
				}
				int star=1;
				while(star<=i-n+1) {
					System.out.print("*");
					star++;
				}
			}
			
			
			i++;
			System.out.println();
		}

	}

}
