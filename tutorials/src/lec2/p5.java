package lec2;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=5;
		while(row>0) {
			int space=1;
			while(space<=n-row) {
				System.out.print("  ");
				space++;
			}
			int star=1;
			
			while(star<=row) {
				System.out.print("* ");
				star++;
			}
			row--;
			System.out.println();
		}
		

	}

}
