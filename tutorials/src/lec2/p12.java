package lec2;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int star=1;
			
			while(star<=2*i-1) {
				if(star%2==0) {
					System.out.print("!");
				}
				else {
					System.out.print("*");
				}
				star++;
			}
			System.out.println();
			i++;
			
		}
	}

}
