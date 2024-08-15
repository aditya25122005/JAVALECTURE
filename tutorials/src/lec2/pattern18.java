
package lec2;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		while(row<=2*n-1) {
			if(row<=n) {
			
			//space for i<=4
			int space=1;
			while(space<=n-row) {
				System.out.print("  ");
				space++;
			}
			//star for row<=4
			int star=1;
			while(star<=2*row-1){
				System.out.print("* ");
			star++;
			}
			}
			else {
				//space for row>4
				int space=1;
				while(space<=row-n) {
					System.out.print("  ");
					space++;
					
				}
				int star=1;
				while(star<=2*(2*n-row)-1) {
					System.out.print("* ");
					star++;
				}
			}
			
			row++;
			System.out.println();
		}

	}

}
