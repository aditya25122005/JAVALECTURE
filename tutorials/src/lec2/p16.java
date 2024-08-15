package lec2;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<2*n) {
			if(i<=n) {
			//space
			int space=n-i;
			while(space>0) {
				System.out.print(" ");
				space--;
			}
			//star
			int star=1;
			while(star<=n-i+1) {
				System.out.print("*");
				star++;
			}
			
			}
			else {
				int space=1;
				while(space<=i-n) {
					System.out.print(" ");
					space++;
				}
				int star=1;
				while(star<=i-n+1) {
					System.out.print("*");
					star++;
				}
				
				
			}
			
			System.out.println();
			i++;
		}
				

	}

}
